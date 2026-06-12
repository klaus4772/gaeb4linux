package com.example.gaebviewer.domain.vobb;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AusgleichService {

    /**
     * Netto-Summe basiert auf den Rechnungsbeträgen
     */
    public double berechneAbrechnungSumme(List<PositionAbrechnung> abrechnungen) {

        return abrechnungen.stream()
                .mapToDouble(PositionAbrechnung::getInvoicedAmount)
                .sum();
    }
}
