package com.example.gaebviewer.core.vobb.service;

import com.example.gaebviewer.core.vobb.model.ZuschlagsKonfiguration;
import org.springframework.stereotype.Service;

@Service
public class ZuschlagsService {

    public double berechneZuschlagsAnteilJeEinheit(
            double epEffektiv,
            ZuschlagsKonfiguration config,
            boolean mitLW
    ) {

        double basis = epEffektiv;
        double zuschlag = 0;

        if (config.getVariante() == ZuschlagsKonfiguration.Variante.A) {

            zuschlag += basis * config.getBgk() / 100.0;
            zuschlag += basis * config.getAgk() / 100.0;
            zuschlag += basis * config.getGewinn() / 100.0;

            if (mitLW) {
                zuschlag += basis * config.getLw() / 100.0;
            } else {
                zuschlag += basis * config.getBw() / 100.0;
            }

        } else if (config.getVariante() == ZuschlagsKonfiguration.Variante.B) {

            double faktor = 1
                    + config.getBgk() / 100.0
                    + config.getAgk() / 100.0
                    + config.getGewinn() / 100.0;

            if (mitLW) {
                faktor += config.getLw() / 100.0;
            } else {
                faktor += config.getBw() / 100.0;
            }

            zuschlag = basis * (faktor - 1);
        }

        return zuschlag;
    }
}
