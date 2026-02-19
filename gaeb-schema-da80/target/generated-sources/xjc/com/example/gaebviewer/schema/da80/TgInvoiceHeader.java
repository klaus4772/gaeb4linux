//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v4.0.5 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
//


package com.example.gaebviewer.schema.da80;

import java.math.BigInteger;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java-Klasse für tgInvoiceHeader complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgInvoiceHeader">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="InvoiceNo" type="{}tgNormalizedString80" minOccurs="0"/>
 *         <element name="RefInvoiceNo" type="{}tgNormalizedString" minOccurs="0"/>
 *         <element name="InvoiceDate" type="{}tgDate" minOccurs="0"/>
 *         <element name="InvoiceType" type="{}tgInvoiceType" minOccurs="0"/>
 *         <element name="CreditNote" type="{}tgYes" minOccurs="0"/>
 *         <element name="SettlementType" type="{}tgSettlementType" minOccurs="0"/>
 *         <element name="SequentialNo" type="{}tgInteger" minOccurs="0"/>
 *         <element name="ServiceProvisionStartDate" type="{}tgDate"/>
 *         <element name="ServiceProvisionEndDate" type="{}tgDate"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgInvoiceHeader", namespace = "", propOrder = {
    "invoiceNo",
    "refInvoiceNo",
    "invoiceDate",
    "invoiceType",
    "creditNote",
    "settlementType",
    "sequentialNo",
    "serviceProvisionStartDate",
    "serviceProvisionEndDate"
})
public class TgInvoiceHeader {

    /**
     * Rechnungsnummer
     * 
     */
    @XmlElement(name = "InvoiceNo")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String invoiceNo;
    /**
     * Referenz zu Rechnungsnummer
     * 
     */
    @XmlElement(name = "RefInvoiceNo")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String refInvoiceNo;
    /**
     * Datum der Rechnung
     * 
     */
    @XmlElement(name = "InvoiceDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar invoiceDate;
    /**
     * Rechnungsart
     * 
     */
    @XmlElement(name = "InvoiceType")
    @XmlSchemaType(name = "normalizedString")
    protected TgInvoiceType invoiceType;
    /**
     * Gutschrift
     * 
     */
    @XmlElement(name = "CreditNote")
    @XmlSchemaType(name = "normalizedString")
    protected TgYes creditNote;
    /**
     * Abrechnungsart
     * 
     */
    @XmlElement(name = "SettlementType")
    @XmlSchemaType(name = "normalizedString")
    protected TgSettlementType settlementType;
    /**
     * laufende Nummer der Abrechung z.b. 3.Abschlagsrechnung
     * 
     */
    @XmlElement(name = "SequentialNo")
    protected BigInteger sequentialNo;
    /**
     * Beginn der Leistungserbringung
     * 
     */
    @XmlElement(name = "ServiceProvisionStartDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar serviceProvisionStartDate;
    /**
     * Ende der Leistungserbringung
     * 
     */
    @XmlElement(name = "ServiceProvisionEndDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar serviceProvisionEndDate;

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
     * Referenz zu Rechnungsnummer
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefInvoiceNo() {
        return refInvoiceNo;
    }

    /**
     * Legt den Wert der refInvoiceNo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRefInvoiceNo()
     */
    public void setRefInvoiceNo(String value) {
        this.refInvoiceNo = value;
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
     * Rechnungsart
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
     * Gutschrift
     * 
     * @return
     *     possible object is
     *     {@link TgYes }
     *     
     */
    public TgYes getCreditNote() {
        return creditNote;
    }

    /**
     * Legt den Wert der creditNote-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgYes }
     *     
     * @see #getCreditNote()
     */
    public void setCreditNote(TgYes value) {
        this.creditNote = value;
    }

    /**
     * Abrechnungsart
     * 
     * @return
     *     possible object is
     *     {@link TgSettlementType }
     *     
     */
    public TgSettlementType getSettlementType() {
        return settlementType;
    }

    /**
     * Legt den Wert der settlementType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgSettlementType }
     *     
     * @see #getSettlementType()
     */
    public void setSettlementType(TgSettlementType value) {
        this.settlementType = value;
    }

    /**
     * laufende Nummer der Abrechung z.b. 3.Abschlagsrechnung
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequentialNo() {
        return sequentialNo;
    }

    /**
     * Legt den Wert der sequentialNo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getSequentialNo()
     */
    public void setSequentialNo(BigInteger value) {
        this.sequentialNo = value;
    }

    /**
     * Beginn der Leistungserbringung
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getServiceProvisionStartDate() {
        return serviceProvisionStartDate;
    }

    /**
     * Legt den Wert der serviceProvisionStartDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getServiceProvisionStartDate()
     */
    public void setServiceProvisionStartDate(XMLGregorianCalendar value) {
        this.serviceProvisionStartDate = value;
    }

    /**
     * Ende der Leistungserbringung
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getServiceProvisionEndDate() {
        return serviceProvisionEndDate;
    }

    /**
     * Legt den Wert der serviceProvisionEndDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getServiceProvisionEndDate()
     */
    public void setServiceProvisionEndDate(XMLGregorianCalendar value) {
        this.serviceProvisionEndDate = value;
    }

}
