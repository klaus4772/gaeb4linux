package com.example.gaebviewer.util;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import java.awt.*;
import java.io.File;
import java.util.regex.Pattern;

/**
 * Eigenständiges Java-Programm zum Entfernen von <span> Tags aus GAEB DA85 XML-Dateien.
 * Entfernt alle <span> und </span> Tags (auch verschachtelte) aus <DetailTxt> Elementen.
 */
public class GaebSpanRemover {

    private JFrame frame;
    private JTextArea logArea;
    private JButton selectInputButton;
    private JButton selectOutputButton;
    private JButton processButton;
    private JLabel inputFileLabel;
    private JLabel outputFileLabel;
    
    private File inputFile;
    private File outputFile;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception e) {
                // Fallback to default look and feel
            }
            new GaebSpanRemover().createAndShowGUI();
        });
    }

    private void createAndShowGUI() {
        frame = new JFrame("GAEB Span Tag Remover");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 500);
        frame.setLayout(new BorderLayout(10, 10));

        // Header Panel
        JPanel headerPanel = new JPanel(new BorderLayout());
        headerPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        JLabel titleLabel = new JLabel("GAEB DA85 Span Tag Entferner");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        headerPanel.add(titleLabel, BorderLayout.WEST);
        frame.add(headerPanel, BorderLayout.NORTH);

        // File Selection Panel
        JPanel filePanel = new JPanel(new GridBagLayout());
        filePanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);

        // Input file selection
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 0;
        filePanel.add(new JLabel("Eingabedatei:"), gbc);

        gbc.gridx = 1;
        gbc.weightx = 1.0;
        inputFileLabel = new JLabel("Keine Datei ausgewählt");
        inputFileLabel.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        inputFileLabel.setOpaque(true);
        inputFileLabel.setBackground(Color.WHITE);
        filePanel.add(inputFileLabel, gbc);

        gbc.gridx = 2;
        gbc.weightx = 0;
        selectInputButton = new JButton("Durchsuchen...");
        selectInputButton.addActionListener(e -> selectInputFile());
        filePanel.add(selectInputButton, gbc);

        // Output file selection
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 0;
        filePanel.add(new JLabel("Ausgabedatei:"), gbc);

        gbc.gridx = 1;
        gbc.weightx = 1.0;
        outputFileLabel = new JLabel("Keine Datei ausgewählt");
        outputFileLabel.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        outputFileLabel.setOpaque(true);
        outputFileLabel.setBackground(Color.WHITE);
        filePanel.add(outputFileLabel, gbc);

        gbc.gridx = 2;
        gbc.weightx = 0;
        selectOutputButton = new JButton("Durchsuchen...");
        selectOutputButton.addActionListener(e -> selectOutputFile());
        filePanel.add(selectOutputButton, gbc);

        frame.add(filePanel, BorderLayout.CENTER);

        // Log Area
        JPanel logPanel = new JPanel(new BorderLayout());
        logPanel.setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 10));
        logArea = new JTextArea();
        logArea.setEditable(false);
        logArea.setFont(new Font("Monospaced", Font.PLAIN, 12));
        JScrollPane scrollPane = new JScrollPane(logArea);
        scrollPane.setPreferredSize(new Dimension(680, 200));
        logPanel.add(new JLabel("Protokoll:"), BorderLayout.NORTH);
        logPanel.add(scrollPane, BorderLayout.CENTER);
        frame.add(logPanel, BorderLayout.SOUTH);

        // Process Button
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        processButton = new JButton("Verarbeiten");
        processButton.setFont(new Font("Arial", Font.BOLD, 14));
        processButton.setEnabled(false);
        processButton.addActionListener(e -> processFile());
        buttonPanel.add(processButton);
        filePanel.add(buttonPanel, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 3;
        filePanel.add(buttonPanel, gbc);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
        log("Programm gestartet. Bitte wählen Sie eine GAEB DA85 XML-Datei aus.");
    }

    private void selectInputFile() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("GAEB DA85 Eingabedatei auswählen");
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "GAEB Dateien (*.xml, *.x85)", "xml", "x85", "X85");
        fileChooser.setFileFilter(filter);
        
        if (inputFile != null) {
            fileChooser.setCurrentDirectory(inputFile.getParentFile());
        }

        int result = fileChooser.showOpenDialog(frame);
        if (result == JFileChooser.APPROVE_OPTION) {
            inputFile = fileChooser.getSelectedFile();
            inputFileLabel.setText(inputFile.getAbsolutePath());
            log("Eingabedatei ausgewählt: " + inputFile.getName());
            
            // Auto-suggest output file
            if (outputFile == null) {
                String inputPath = inputFile.getAbsolutePath();
                String outputPath = inputPath.replaceFirst("(\\.[^.]+)$", "_cleaned$1");
                outputFile = new File(outputPath);
                outputFileLabel.setText(outputFile.getAbsolutePath());
                log("Ausgabedatei vorgeschlagen: " + outputFile.getName());
            }
            
            updateProcessButtonState();
        }
    }

    private void selectOutputFile() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("GAEB DA85 Ausgabedatei auswählen");
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "GAEB Dateien (*.xml, *.x85)", "xml", "x85", "X85");
        fileChooser.setFileFilter(filter);
        
        if (outputFile != null) {
            fileChooser.setSelectedFile(outputFile);
        } else if (inputFile != null) {
            fileChooser.setCurrentDirectory(inputFile.getParentFile());
        }

        int result = fileChooser.showSaveDialog(frame);
        if (result == JFileChooser.APPROVE_OPTION) {
            outputFile = fileChooser.getSelectedFile();
            outputFileLabel.setText(outputFile.getAbsolutePath());
            log("Ausgabedatei ausgewählt: " + outputFile.getName());
            updateProcessButtonState();
        }
    }

    private void updateProcessButtonState() {
        processButton.setEnabled(inputFile != null && outputFile != null);
    }

    private void processFile() {
        processButton.setEnabled(false);
        selectInputButton.setEnabled(false);
        selectOutputButton.setEnabled(false);
        
        log("\n=== Verarbeitung gestartet ===");
        log("Eingabe: " + inputFile.getAbsolutePath());
        log("Ausgabe: " + outputFile.getAbsolutePath());

        SwingWorker<Void, String> worker = new SwingWorker<Void, String>() {
            @Override
            protected Void doInBackground() throws Exception {
                try {
                    // XML-Datei einlesen
                    publish("XML-Datei wird geladen...");
                    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
                    factory.setNamespaceAware(true);
                    DocumentBuilder builder = factory.newDocumentBuilder();
                    Document doc = builder.parse(inputFile);
                    
                    publish("XML-Datei erfolgreich geladen.");
                    
                    // Alle <DetailTxt> Elemente finden und verarbeiten
                    NodeList detailTxtNodes = doc.getElementsByTagName("DetailTxt");
                    int detailTxtCount = detailTxtNodes.getLength();
                    int totalSpansRemoved = 0;
                    
                    publish("Gefundene <DetailTxt> Elemente: " + detailTxtCount);
                    
                    for (int i = 0; i < detailTxtCount; i++) {
                        Element detailTxt = (Element) detailTxtNodes.item(i);
                        int spansRemoved = removeSpanTags(detailTxt);
                        totalSpansRemoved += spansRemoved;
                    }
                    
                    publish("Insgesamt " + totalSpansRemoved + " <span> Tags entfernt.");
                    
                    // XML-Datei speichern
                    publish("Speichere modifizierte XML-Datei...");
                    TransformerFactory transformerFactory = TransformerFactory.newInstance();
                    Transformer transformer = transformerFactory.newTransformer();
                    transformer.setOutputProperty(OutputKeys.INDENT, "yes");
                    transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
                    transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
                    
                    DOMSource source = new DOMSource(doc);
                    StreamResult result = new StreamResult(outputFile);
                    transformer.transform(source, result);
                    
                    publish("✓ Datei erfolgreich gespeichert: " + outputFile.getName());
                    publish("=== Verarbeitung abgeschlossen ===\n");
                    
                } catch (Exception e) {
                    publish("✗ FEHLER: " + e.getMessage());
                    e.printStackTrace();
                    throw e;
                }
                return null;
            }

            @Override
            protected void process(java.util.List<String> chunks) {
                for (String message : chunks) {
                    log(message);
                }
            }

            @Override
            protected void done() {
                processButton.setEnabled(true);
                selectInputButton.setEnabled(true);
                selectOutputButton.setEnabled(true);
                
                try {
                    get(); // Check for exceptions
                    JOptionPane.showMessageDialog(frame, 
                        "Verarbeitung erfolgreich abgeschlossen!\n\nAusgabedatei: " + outputFile.getName(),
                        "Erfolg", 
                        JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(frame, 
                        "Fehler bei der Verarbeitung:\n" + e.getMessage(),
                        "Fehler", 
                        JOptionPane.ERROR_MESSAGE);
                }
            }
        };
        
        worker.execute();
    }

    /**
     * Entfernt alle <span> Tags aus einem Element und seinen Kindelementen.
     * Behält den Textinhalt bei, entfernt nur die Tags.
     */
    private int removeSpanTags(Element element) {
        int spansRemoved = 0;
        
        // Textinhalt des Elements holen
        String textContent = getTextContent(element);
        
        if (textContent != null && textContent.contains("<span")) {
            // Alle <span> Tags entfernen (auch verschachtelte)
            // Pattern entfernt <span...> und </span> Tags
            String cleaned = textContent;
            int beforeLength = cleaned.length();
            
            // Entferne alle <span> Tags (mit beliebigen Attributen)
            cleaned = cleaned.replaceAll("<span[^>]*>", "");
            // Entferne alle </span> Tags
            cleaned = cleaned.replaceAll("</span>", "");
            
            int afterLength = cleaned.length();
            
            // Zähle entfernte Tags (grobe Schätzung)
            int removedChars = beforeLength - afterLength;
            if (removedChars > 0) {
                spansRemoved = (removedChars / 7); // Durchschnittliche Tag-Länge
                
                // Setze den bereinigten Text zurück
                setTextContent(element, cleaned);
            }
        }
        
        return spansRemoved;
    }

    /**
     * Holt den Textinhalt eines Elements (inklusive CDATA).
     */
    private String getTextContent(Element element) {
        StringBuilder content = new StringBuilder();
        NodeList children = element.getChildNodes();
        
        for (int i = 0; i < children.getLength(); i++) {
            Node child = children.item(i);
            if (child.getNodeType() == Node.TEXT_NODE || 
                child.getNodeType() == Node.CDATA_SECTION_NODE) {
                content.append(child.getNodeValue());
            }
        }
        
        return content.toString();
    }

    /**
     * Setzt den Textinhalt eines Elements.
     */
    private void setTextContent(Element element, String content) {
        // Entferne alle Kindknoten
        while (element.hasChildNodes()) {
            element.removeChild(element.getFirstChild());
        }
        
        // Füge neuen Textinhalt hinzu (als CDATA wenn HTML-ähnlich)
        if (content.contains("<") || content.contains(">")) {
            element.appendChild(element.getOwnerDocument().createCDATASection(content));
        } else {
            element.appendChild(element.getOwnerDocument().createTextNode(content));
        }
    }

    private void log(String message) {
        logArea.append(message + "\n");
        logArea.setCaretPosition(logArea.getDocument().getLength());
    }
}
