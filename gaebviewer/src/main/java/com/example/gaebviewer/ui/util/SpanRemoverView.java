package com.example.gaebviewer.ui.util;

import com.example.gaebviewer.application.util.SpanRemoverService;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.NotificationVariant;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.upload.receivers.MemoryBuffer;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.StreamResource;

import java.io.ByteArrayInputStream;

@Route("span-remover")
public class SpanRemoverView extends VerticalLayout {

    private final SpanRemoverService spanRemoverService;
    private byte[] processedFileData;
    private String originalFileName;
    private Anchor downloadLink;

    public SpanRemoverView(SpanRemoverService spanRemoverService) {
        this.spanRemoverService = spanRemoverService;

        setSizeFull();
        setPadding(true);
        setSpacing(true);
        setAlignItems(Alignment.CENTER);

        // Titel
        H2 title = new H2("GAEB Span Tag Remover");
        title.getStyle().set("margin-top", "20px");

        // Beschreibung
        Paragraph description = new Paragraph(
                "Laden Sie eine GAEB DA85 XML-Datei hoch. " +
                "Alle <span> Tags innerhalb von <DetailTxt> Elementen werden entfernt, " +
                "während der Textinhalt erhalten bleibt."
        );
        description.getStyle()
                .set("text-align", "center")
                .set("max-width", "600px")
                .set("color", "var(--lumo-secondary-text-color)");

        // Upload-Komponente mit Drag & Drop
        MemoryBuffer buffer = new MemoryBuffer();
        Upload upload = new Upload(buffer);
        upload.setMaxWidth("600px");
        upload.setDropAllowed(true);
        upload.setAcceptedFileTypes(".xml", ".x85");
        upload.setMaxFiles(1);

        // Upload-Text anpassen
        upload.setDropLabel(
                new Paragraph("Ziehen Sie eine GAEB XML-Datei hierher oder klicken Sie zum Auswählen")
        );

        // Upload-Listener
        upload.addSucceededListener(event -> {
            try {
                originalFileName = event.getFileName();
                
                // Datei verarbeiten
                byte[] processedData = spanRemoverService.removeSpanTags(buffer.getInputStream());
                processedFileData = processedData;

                // Download-Link erstellen
                createDownloadLink();

                // Erfolgs-Benachrichtigung
                Notification notification = Notification.show(
                        "Datei erfolgreich verarbeitet! Klicken Sie auf 'Download', um die bereinigte Datei herunterzuladen.",
                        5000,
                        Notification.Position.MIDDLE
                );
                notification.addThemeVariants(NotificationVariant.LUMO_SUCCESS);

                // Upload zurücksetzen
                upload.getElement().executeJs("this.files = []");

            } catch (Exception e) {
                Notification notification = Notification.show(
                        "Fehler beim Verarbeiten der Datei: " + e.getMessage(),
                        5000,
                        Notification.Position.MIDDLE
                );
                notification.addThemeVariants(NotificationVariant.LUMO_ERROR);
                e.printStackTrace();
            }
        });

        upload.addFileRejectedListener(event -> {
            Notification notification = Notification.show(
                    "Datei abgelehnt: " + event.getErrorMessage(),
                    3000,
                    Notification.Position.MIDDLE
            );
            notification.addThemeVariants(NotificationVariant.LUMO_ERROR);
        });

        // Download-Link (initial versteckt)
        downloadLink = new Anchor();
        downloadLink.setVisible(false);
        
        Button downloadButton = new Button("Download bereinigte Datei");
        downloadButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY, ButtonVariant.LUMO_LARGE);
        downloadButton.getStyle().set("margin-top", "20px");
        
        downloadLink.add(downloadButton);

        // Layout zusammenstellen
        add(title, description, upload, downloadLink);
    }

    /**
     * Erstellt einen Download-Link für die verarbeitete Datei.
     */
    private void createDownloadLink() {
        if (processedFileData == null || originalFileName == null) {
            return;
        }

        // Dateinamen für Download generieren
        String downloadFileName = generateDownloadFileName(originalFileName);

        // StreamResource für Download erstellen
        StreamResource resource = new StreamResource(
                downloadFileName,
                () -> new ByteArrayInputStream(processedFileData)
        );
        resource.setContentType("application/xml");

        // Download-Link konfigurieren
        downloadLink.setHref(resource);
        downloadLink.getElement().setAttribute("download", true);
        downloadLink.setVisible(true);
    }

    /**
     * Generiert einen Dateinamen für die verarbeitete Datei.
     *
     * @param originalFileName Original-Dateiname
     * @return Neuer Dateiname mit "_cleaned" Suffix
     */
    private String generateDownloadFileName(String originalFileName) {
        int lastDotIndex = originalFileName.lastIndexOf('.');
        
        if (lastDotIndex > 0) {
            String nameWithoutExtension = originalFileName.substring(0, lastDotIndex);
            String extension = originalFileName.substring(lastDotIndex);
            return nameWithoutExtension + "_cleaned" + extension;
        } else {
            return originalFileName + "_cleaned";
        }
    }
}
