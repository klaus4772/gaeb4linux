//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v4.0.5 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
//


package com.example.gaebviewer.schema.da80;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Informationen zur Rechnung
 * 
 * Im Kontext der Rechnung Pflicht
 * 
 * <p>Java-Klasse für tgInvoiceInfo complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgInvoiceInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="InvoiceNo" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString"/>
 *         <element name="InvoiceDate" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDate"/>
 *         <sequence>
 *           <element name="Cur" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgISOCur"/>
 *           <element name="CurLbl" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgCurLbl" minOccurs="0"/>
 *         </sequence>
 *         <element name="StandardText" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString" minOccurs="0"/>
 *         <element name="ValutaDate" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDate" minOccurs="0"/>
 *         <element name="AddText" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgAddText" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Totals" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgOrderTotals" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="InvoiceTotalsGross" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDecimal_13_2"/>
 *         <element name="CashDiscount" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgCashDiscount" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgInvoiceInfo", propOrder = {
    "invoiceNo",
    "invoiceDate",
    "cur",
    "curLbl",
    "standardText",
    "valutaDate",
    "addText",
    "totals",
    "invoiceTotalsGross",
    "cashDiscount"
})
public class TgInvoiceInfo2 {

    /**
     * Rechnungsnummer des Lieferaten
     * 
     */
    @XmlElement(name = "InvoiceNo", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String invoiceNo;
    /**
     * Rechnungsdatum
     * 
     */
    @XmlElement(name = "InvoiceDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar invoiceDate;
    /**
     * Waehrung
     * 
     */
    @XmlElement(name = "Cur", required = true)
    protected TgISOCur2 cur;
    /**
     * Bezeichnung der Waehrung
     * 
     */
    @XmlElement(name = "CurLbl")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String curLbl;
    /**
     * Standardtexte aufgrund gesetzlicher AnforderungenDiese Texte können vom Empfänger überlesen werden und führen nicht zu einer manuellen Bearbeitung der Rechnung beim Empfänger.
     * 
     */
    @XmlElement(name = "StandardText")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String standardText;
    /**
     * Valuta Datum
     * 
     */
    @XmlElement(name = "ValutaDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar valutaDate;
    /**
     * Zusätzlicher Text zum Vorgang
     * 
     */
    @XmlElement(name = "AddText")
    protected List<TgAddText2> addText;
    /**
     * Infomrationen zur Summe je MwSt-Satz
     * 
     */
    @XmlElement(name = "Totals")
    protected List<TgOrderTotals2> totals;
    /**
     * Rechnungsbetrag
     * 
     */
    @XmlElement(name = "InvoiceTotalsGross", required = true)
    protected BigDecimal invoiceTotalsGross;
    /**
     * Skonto Angaben
     * 
     */
    @XmlElement(name = "CashDiscount")
    protected List<TgCashDiscount2> cashDiscount;

    /**
     * Rechnungsnummer des Lieferaten
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
     * Rechnungsdatum
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
     * Waehrung
     * 
     * @return
     *     possible object is
     *     {@link TgISOCur2 }
     *     
     */
    public TgISOCur2 getCur() {
        return cur;
    }

    /**
     * Legt den Wert der cur-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgISOCur2 }
     *     
     * @see #getCur()
     */
    public void setCur(TgISOCur2 value) {
        this.cur = value;
    }

    /**
     * Bezeichnung der Waehrung
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurLbl() {
        return curLbl;
    }

    /**
     * Legt den Wert der curLbl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCurLbl()
     */
    public void setCurLbl(String value) {
        this.curLbl = value;
    }

    /**
     * Standardtexte aufgrund gesetzlicher AnforderungenDiese Texte können vom Empfänger überlesen werden und führen nicht zu einer manuellen Bearbeitung der Rechnung beim Empfänger.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandardText() {
        return standardText;
    }

    /**
     * Legt den Wert der standardText-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getStandardText()
     */
    public void setStandardText(String value) {
        this.standardText = value;
    }

    /**
     * Valuta Datum
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValutaDate() {
        return valutaDate;
    }

    /**
     * Legt den Wert der valutaDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getValutaDate()
     */
    public void setValutaDate(XMLGregorianCalendar value) {
        this.valutaDate = value;
    }

    /**
     * Zusätzlicher Text zum Vorgang
     * 
     * Gets the value of the addText property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addText property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAddText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TgAddText2 }
     * </p>
     * 
     * 
     * @return
     *     The value of the addText property.
     */
    public List<TgAddText2> getAddText() {
        if (addText == null) {
            addText = new ArrayList<>();
        }
        return this.addText;
    }

    /**
     * Infomrationen zur Summe je MwSt-Satz
     * 
     * Gets the value of the totals property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the totals property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTotals().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TgOrderTotals2 }
     * </p>
     * 
     * 
     * @return
     *     The value of the totals property.
     */
    public List<TgOrderTotals2> getTotals() {
        if (totals == null) {
            totals = new ArrayList<>();
        }
        return this.totals;
    }

    /**
     * Rechnungsbetrag
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInvoiceTotalsGross() {
        return invoiceTotalsGross;
    }

    /**
     * Legt den Wert der invoiceTotalsGross-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getInvoiceTotalsGross()
     */
    public void setInvoiceTotalsGross(BigDecimal value) {
        this.invoiceTotalsGross = value;
    }

    /**
     * Skonto Angaben
     * 
     * Gets the value of the cashDiscount property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cashDiscount property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCashDiscount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TgCashDiscount2 }
     * </p>
     * 
     * 
     * @return
     *     The value of the cashDiscount property.
     */
    public List<TgCashDiscount2> getCashDiscount() {
        if (cashDiscount == null) {
            cashDiscount = new ArrayList<>();
        }
        return this.cashDiscount;
    }

}
