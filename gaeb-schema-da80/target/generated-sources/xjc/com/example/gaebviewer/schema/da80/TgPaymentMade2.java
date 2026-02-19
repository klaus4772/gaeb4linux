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
 * <p>Java-Klasse für tgPaymentMade complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgPaymentMade">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TotalVAT" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDecimal_13_2"/>
 *         <element name="DiscountAmt" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDecimal_13_2" minOccurs="0"/>
 *         <element name="DiscountVATAmt" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDecimal_13_2" minOccurs="0"/>
 *         <element name="Total" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDecimal_13_2"/>
 *         <element name="PaymentDate" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDate"/>
 *         <element name="InvoiceType" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgInvoiceType" minOccurs="0"/>
 *         <element name="InvoiceNo" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString"/>
 *         <element name="PaymentNo" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString" minOccurs="0"/>
 *         <element name="PaymentNote" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgPaymentMade", propOrder = {
    "totalVAT",
    "discountAmt",
    "discountVATAmt",
    "total",
    "paymentDate",
    "invoiceType",
    "invoiceNo",
    "paymentNo",
    "paymentNote"
})
public class TgPaymentMade2 {

    /**
     * Summe der MwSt
     * 
     */
    @XmlElement(name = "TotalVAT", required = true)
    protected BigDecimal totalVAT;
    /**
     * Skontosumme
     * 
     */
    @XmlElement(name = "DiscountAmt")
    protected BigDecimal discountAmt;
    /**
     * Summe der MwSt der Skontosumme
     * 
     */
    @XmlElement(name = "DiscountVATAmt")
    protected BigDecimal discountVATAmt;
    /**
     * Zahlungssumme Netto
     * 
     */
    @XmlElement(name = "Total", required = true)
    protected BigDecimal total;
    /**
     * Zahlungsdatum
     * 
     */
    @XmlElement(name = "PaymentDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar paymentDate;
    /**
     * Art der betroffenen Rechnung
     * 
     */
    @XmlElement(name = "InvoiceType")
    @XmlSchemaType(name = "normalizedString")
    protected TgInvoiceType2 invoiceType;
    /**
     * Rechnungsnummer
     * 
     */
    @XmlElement(name = "InvoiceNo", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String invoiceNo;
    /**
     * Nummer der Zahlung
     * 
     */
    @XmlElement(name = "PaymentNo")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String paymentNo;
    /**
     * Zusatzbeschreibung zur Zahlung
     * 
     */
    @XmlElement(name = "PaymentNote")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String paymentNote;

    /**
     * Summe der MwSt
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
     * Skontosumme
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountAmt() {
        return discountAmt;
    }

    /**
     * Legt den Wert der discountAmt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getDiscountAmt()
     */
    public void setDiscountAmt(BigDecimal value) {
        this.discountAmt = value;
    }

    /**
     * Summe der MwSt der Skontosumme
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountVATAmt() {
        return discountVATAmt;
    }

    /**
     * Legt den Wert der discountVATAmt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getDiscountVATAmt()
     */
    public void setDiscountVATAmt(BigDecimal value) {
        this.discountVATAmt = value;
    }

    /**
     * Zahlungssumme Netto
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
     * Zahlungsdatum
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPaymentDate() {
        return paymentDate;
    }

    /**
     * Legt den Wert der paymentDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getPaymentDate()
     */
    public void setPaymentDate(XMLGregorianCalendar value) {
        this.paymentDate = value;
    }

    /**
     * Art der betroffenen Rechnung
     * 
     * @return
     *     possible object is
     *     {@link TgInvoiceType2 }
     *     
     */
    public TgInvoiceType2 getInvoiceType() {
        return invoiceType;
    }

    /**
     * Legt den Wert der invoiceType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgInvoiceType2 }
     *     
     * @see #getInvoiceType()
     */
    public void setInvoiceType(TgInvoiceType2 value) {
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

    /**
     * Nummer der Zahlung
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentNo() {
        return paymentNo;
    }

    /**
     * Legt den Wert der paymentNo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPaymentNo()
     */
    public void setPaymentNo(String value) {
        this.paymentNo = value;
    }

    /**
     * Zusatzbeschreibung zur Zahlung
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentNote() {
        return paymentNote;
    }

    /**
     * Legt den Wert der paymentNote-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPaymentNote()
     */
    public void setPaymentNote(String value) {
        this.paymentNote = value;
    }

}
