package com.example.gaebviewer.core.model;

public class PriceBreakdown {

    private double material;
    private double labor;
    private double equipment;
    private double bgk;
    private double agk;
    private double wg;

    public double getMaterial() { return material; }
    public void setMaterial(double material) { this.material = material; }

    public double getLabor() { return labor; }
    public void setLabor(double labor) { this.labor = labor; }

    public double getEquipment() { return equipment; }
    public void setEquipment(double equipment) { this.equipment = equipment; }

    public double getBgk() { return bgk; }
    public void setBgk(double bgk) { this.bgk = bgk; }

    public double getAgk() { return agk; }
    public void setAgk(double agk) { this.agk = agk; }

    public double getWg() { return wg; }
    public void setWg(double wg) { this.wg = wg; }

    public double getTotal() {
        return material + labor + equipment + bgk + agk + wg;
    }
}
