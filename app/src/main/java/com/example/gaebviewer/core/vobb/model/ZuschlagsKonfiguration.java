package com.example.gaebviewer.core.vobb.model;

public class ZuschlagsKonfiguration {

    private double bgk;
    private double agk;
    private double gewinn;
    private double lw;
    private double bw;

    private Variante variante;

    public enum Variante {
        A,
        B
    }

    public ZuschlagsKonfiguration(double bgk,
                                  double agk,
                                  double gewinn,
                                  double lw,
                                  double bw,
                                  Variante variante) {
        this.bgk = bgk;
        this.agk = agk;
        this.gewinn = gewinn;
        this.lw = lw;
        this.bw = bw;
        this.variante = variante;
    }

    public double getBgk() {
        return bgk;
    }

    public double getAgk() {
        return agk;
    }

    public double getGewinn() {
        return gewinn;
    }

    public double getLw() {
        return lw;
    }

    public double getBw() {
        return bw;
    }

    public Variante getVariante() {
        return variante;
    }
}
