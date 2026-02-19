//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v4.0.5 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
//


package com.example.gaebviewer.schema.da80;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java-Klasse für tgInvoiceMadeOut complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgInvoiceMadeOut">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TotalVAT" type="{}tgDecimal_13_2"/>
 *         <element name="Total" type="{}tgDecimal_13_2"/>
 *         <element name="InvoiceDate" type="{}tgDate"/>
 *         <element name="InvoiceType" type="{}tgInvoiceType"/>
 *         <element name="InvoiceNo" type="{}tgNormalizedString"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgInvoiceMadeOut", namespace = "", propOrder = {
    "totalVAT",
    "total",
    "invoiceDate",
    "invoiceType",
    "invoiceNo"
})
public class TgInvoiceMadeOut {

    /**
     * Summe der MwSt.
     * 
     */
    @XmlElement(name = "TotalVAT", required = true)
    protected BigDecimal totalVAT;
    /**
     * Rechnungssumme Netto
     * 
     */
    @XmlElement(name = "Total", required = true)
    protected BigDecimal total;
    /**
     * Datum der Rechnung
     * 
     */
    @XmlElement(name = "InvoiceDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar invoiceDate;
    /**
     * Art der Rechnung
     * 
     */
    @XmlElement(name = "InvoiceType", required = true)
    @XmlSchemaType(name = "normalizedString")
    protected TgInvoiceType invoiceType;
    /**
     * Rechnungsnummer
     * 
     */
    @XmlElement(name = "InvoiceNo", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String invoiceNo;

    /**
     * Summe der MwSt.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalVAT() {
        return totalVAT;
    }

    /**
     * Legt den Wert der totalVAT-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getTotalVAT()
     */
    public void setTotalVAT(BigDecimal value) {
        this.totalVAT = value;
    }

    /**
     * Rechnungssumme Netto
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotal() {
        return total;
    }

    /**
     * Legt den Wert der total-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getTotal()
     */
    public void setTotal(BigDecimal value) {
        this.total = value;
    }

    /**
     * Datum der Rechnung
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInvoiceDate() {
        return invoiceDate;
    }

    /**
     * Legt den Wert der invoiceDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getInvoiceDate()
     */
    public void setInvoiceDate(XMLGregorianCalendar value) {
        this.invoiceDate = value;
    }

    /**
     * Art der Rechnung
     * 
     * @return
     *     possible object is
     *     {@link TgInvoiceType }
     *     
     */
    public TgInvoiceType getInvoiceType() {
        return invoiceType;
    }

    /**
     * Legt den Wert der invoiceType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgInvoiceType }
     *     
     * @see #getInvoiceType()
     */
    public void setInvoiceType(TgInvoiceType value) {
        this.invoiceType = value;
    }

    /**
     * Rechnungsnummer
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceNo() {
        return invoiceNo;
    }

    /**
     * Legt den Wert der invoiceNo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getInvoiceNo()
     */
    public void setInvoiceNo(String value) {
        this.invoiceNo = value;
    }

}
