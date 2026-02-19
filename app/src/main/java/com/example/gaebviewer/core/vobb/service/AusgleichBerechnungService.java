package com.example.gaebviewer.core.vobb.service;

import com.example.gaebviewer.core.model.Position;
import com.example.gaebviewer.core.vobb.model.AusgleichZeile;
import com.example.gaebviewer.core.vobb.model.PositionAbrechnung;
import com.example.gaebviewer.core.vobb.model.ZuschlagsKonfiguration;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AusgleichBerechnungService {

    private final ZuschlagsService zuschlagsService;

    public AusgleichBerechnungService(ZuschlagsService zuschlagsService) {
        this.zuschlagsService = zuschlagsService;
    }

    public AusgleichZeile berechne(
            PositionAbrechnung abrechnung,
            ZuschlagsKonfiguration config
    ) {

        Position position = abrechnung.getPosition();

        AusgleichZeile zeile = new AusgleichZeile(abrechnung);

        double auf = position.getContractQuantity();
        double rech = abrechnung.getInvoicedQuantity();

        BigDecimal epEff;

        if (rech > 0) {
            epEff = BigDecimal.valueOf(abrechnung.getInvoicedAmount())
                    .divide(BigDecimal.valueOf(rech), 6, RoundingMode.HALF_UP);
        } else {
            epEff = BigDecimal.valueOf(position.getUnitPrice());
        }

        zeile.setEpEffektiv(epEff.doubleValue());

        double diff;
        boolean mitLW = false;

        if (rech == 0) {
            diff = -auf;
        }
        else if (rech > 1.10 * auf) {
            diff = rech - (1.10 * auf);
            mitLW = true;
        }
        else if (rech < 0.90 * auf) {
            diff = rech - (0.90 * auf);
        }
        else {
            diff = 0;
        }

        zeile.setAusgleichMenge(diff);

        if (diff != 0) {

            BigDecimal zuschlagJeEinheit =
                    BigDecimal.valueOf(
                            zuschlagsService.berechneZuschlagsAnteilJeEinheit(
                                    epEff.doubleValue(),
                                    config,
                                    mitLW
                            )
                    ).setScale(6, RoundingMode.HALF_UP);

            zeile.setZuschlagsAnteilJeEinheit(zuschlagJeEinheit.doubleValue());

            BigDecimal ausgleich =
                    BigDecimal.valueOf(diff)
                            .multiply(zuschlagJeEinheit)
                            .setScale(2, RoundingMode.HALF_UP);

            zeile.setAusgleichBetrag(ausgleich.doubleValue());

        } else {
            zeile.setZuschlagsAnteilJeEinheit(0);
            zeile.setAusgleichBetrag(0);
        }

        return zeile;
    }

    public List<AusgleichZeile> berechneAlle(
            List<PositionAbrechnung> abrechnungen,
            ZuschlagsKonfiguration config
    ) {
        return abrechnungen.stream()
                .map(a -> berechne(a, config))
                .collect(Collectors.toList());
    }

    public double berechneGesamtAusgleich(List<AusgleichZeile> zeilen) {
        return zeilen.stream()
                .mapToDouble(AusgleichZeile::getAusgleichBetrag)
                .sum();
    }
}
