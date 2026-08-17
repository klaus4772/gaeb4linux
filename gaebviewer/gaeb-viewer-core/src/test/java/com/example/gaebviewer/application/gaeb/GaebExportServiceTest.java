package com.example.gaebviewer.application.gaeb;

import com.example.gaebviewer.domain.GaebPosition;
import com.example.gaebviewer.domain.GaebTextComplement;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class GaebExportServiceTest {

    @Test
    void writesBidderTextComplementBodyBackToXml() {
        GaebExportService service = new GaebExportService(new GaebFormatConverter());

        GaebPosition position = new GaebPosition();
        position.setNumber("1");
        position.setQuantity(BigDecimal.ONE);
        position.setUnitPrice(new BigDecimal("12.50"));

        GaebTextComplement textComplement = new GaebTextComplement();
        textComplement.setMarkLabel("52");
        textComplement.setRequired(true);
        textComplement.setBody("Produkt B");
        position.setBidderTextComplements(List.of(textComplement));

        String xml = """
                <GAEB>
                  <Item RNoPart="1">
                    <Qty>1.000</Qty>
                    <UP>10.00</UP>
                    <TP>10.00</TP>
                    <Description>
                      <CompleteText>
                        <ComplTSB>Yes</ComplTSB>
                        <DetailTxt>
                          <TextComplement MarkLbl="52" Kind="Bidder">
                            <ComplBody>Alt</ComplBody>
                          </TextComplement>
                        </DetailTxt>
                      </CompleteText>
                    </Description>
                  </Item>
                </GAEB>
                """;

        byte[] exported = service.exportWithPrices(xml.getBytes(StandardCharsets.UTF_8), List.of(position));
        String exportedXml = new String(exported, StandardCharsets.UTF_8);

        assertTrue(exportedXml.contains("<ComplBody>Produkt B</ComplBody>"));
        assertTrue(exportedXml.contains("<UP>12.50</UP>"));
    }
}
