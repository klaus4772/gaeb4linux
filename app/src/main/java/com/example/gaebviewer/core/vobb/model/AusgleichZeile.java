package com.example.gaebviewer.core.vobb.model;

import com.example.gaebviewer.core.model.Position;

public class AusgleichZeile {

    private PositionAbrechnung abrechnung;

    private double epEffektiv;
    private double ausgleichMenge;
    private double zuschlagsAnteilJeEinheit;
    private double ausgleichBetrag;

    public AusgleichZeile(PositionAbrechnung abrechnung) {
        this.abrechnung = abrechnung;
    }

    public PositionAbrechnung getAbrechnung() {
        return abrechnung;
    }

    public Position getPosition() {
        return abrechnung == null ? null : abrechnung.getPosition();
    }

    public String getOz() {
        return abrechnung == null ? "" : abrechnung.getPosition().getNumber();
    }

    public String getKurztext() {
        return abrechnung == null ? "" : abrechnung.getPosition().getShortText();
    }

    public String getEinheit() {
        return abrechnung == null ? "" : abrechnung.getPosition().getUnit();
    }

    public double getAufMenge() {
        return abrechnung == null ? 0 : abrechnung.getPosition().getContractQuantity();
    }

    public double getRechMenge() {
        return abrechnung == null ? 0 : abrechnung.getInvoicedQuantity();
    }

    public double getRechBetrag() {
        return abrechnung == null ? 0 : abrechnung.getInvoicedAmount();
    }

    public double getEpEffektiv() {
        return epEffektiv;
    }

    public void setEpEffektiv(double epEffektiv) {
        this.epEffektiv = epEffektiv;
    }

    public double getAusgleichMenge() {
        return ausgleichMenge;
    }

    public void setAusgleichMenge(double ausgleichMenge) {
        this.ausgleichMenge = ausgleichMenge;
    }

    public double getZuschlagsAnteilJeEinheit() {
        return zuschlagsAnteilJeEinheit;
    }

    public void setZuschlagsAnteilJeEinheit(double zuschlagsAnteilJeEinheit) {
        this.zuschlagsAnteilJeEinheit = zuschlagsAnteilJeEinheit;
    }

    public double getAusgleichBetrag() {
        return ausgleichBetrag;
    }

    public void setAusgleichBetrag(double ausgleichBetrag) {
        this.ausgleichBetrag = ausgleichBetrag;
    }
}
