package com.example.gaebviewer.core.vobb.csv;

public class CsvRow {

    private String lv;
    private boolean nachtrag;
    private String oz;
    private double invoicedQuantity;
    private double invoicedAmount;

    private double contractQuantity;
    private double unitPrice;

    public CsvRow(String lv,
                  boolean nachtrag,
                  String oz,
                  double unitPrice,
                  double contractQuantity,
                  double invoicedQuantity,
                  double invoicedAmount) {
        this.lv = lv;
        this.nachtrag = nachtrag;
        this.oz = oz;
        this.unitPrice = unitPrice;
        this.contractQuantity = contractQuantity;
        this.invoicedQuantity = invoicedQuantity;
        this.invoicedAmount = invoicedAmount;
    }

    public String getOz() { return oz; }
    public boolean isNachtrag() { return nachtrag; }
    public double getInvoicedQuantity() { return invoicedQuantity; }
    public double getInvoicedAmount() { return invoicedAmount; }
    public double getContractQuantity() { return contractQuantity; }
    public double getUnitPrice() { return unitPrice; }
}
