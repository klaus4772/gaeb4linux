package com.example.gaebviewer.domain.vobb;

import com.example.gaebviewer.domain.Position;

public class PositionAbrechnung {

    private Position position;

    private double invoicedQuantity;
    private double invoicedAmount;

    public PositionAbrechnung(Position position) {
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    public double getInvoicedQuantity() {
        return invoicedQuantity;
    }

    public void setInvoicedQuantity(double invoicedQuantity) {
        this.invoicedQuantity = invoicedQuantity;
    }

    public double getInvoicedAmount() {
        return invoicedAmount;
    }

    public void setInvoicedAmount(double invoicedAmount) {
        this.invoicedAmount = invoicedAmount;
    }
}
