//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v4.0.5 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
//


package com.example.gaebviewer.schema.da80;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java-Klasse für tgInvoice complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgInvoice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DP" type="{}tgDP"/>
 *         <element name="OWN" type="{}tgOWN" minOccurs="0"/>
 *         <element name="Requester" type="{}tgRequester" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CTR" type="{}tgCTR" minOccurs="0"/>
 *         <sequence maxOccurs="unbounded" minOccurs="0">
 *           <element name="CnstSite" type="{}tgCnstSite"/>
 *           <element name="NotifSite" type="{}tgNotifSite" minOccurs="0"/>
 *         </sequence>
 *         <element name="AddText" type="{}tgAddText" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="BoQ" type="{}tgBoQ" minOccurs="0"/>
 *         <element name="InvoiceHeader" type="{}tgInvoiceHeader" minOccurs="0"/>
 *         <element name="InvoiceCreator" type="{}tgInvoiceCreator" minOccurs="0"/>
 *         <element name="InvoiceRecipient" type="{}tgInvoiceRecipient" minOccurs="0"/>
 *         <element name="CheckNote" type="{}tgCheckNote" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="BudgetDept" type="{}tgNormalizedString" minOccurs="0"/>
 *         <element name="BookingNo" type="{}tgNormalizedString" minOccurs="0"/>
 *         <element name="QuantityDeterminationRemark" type="{}tgNormalizedString" minOccurs="0"/>
 *         <element name="InvoiceShare" type="{}tgInvoiceShare" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Terms" type="{}tgCashDiscount" maxOccurs="3" minOccurs="0"/>
 *         <element name="PaymentMade" type="{}tgPaymentMade" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="InvoiceMadeOut" type="{}tgInvoiceMadeOut" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TotalGross" type="{}tgDecimal_13_2" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgInvoice", namespace = "", propOrder = {
    "dp",
    "own",
    "requester",
    "ctr",
    "cnstSiteAndNotifSite",
    "addText",
    "boQ",
    "invoiceHeader",
    "invoiceCreator",
    "invoiceRecipient",
    "checkNote",
    "budgetDept",
    "bookingNo",
    "quantityDeterminationRemark",
    "invoiceShare",
    "terms",
    "paymentMade",
    "invoiceMadeOut",
    "totalGross"
})
public class TgInvoice {

    /**
     * GAEB-Datenaustauschphase
     * 
     */
    @XmlElement(name = "DP", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String dp;
    /**
     * Informationen zum Auftraggeber
     * 
     */
    @XmlElement(name = "OWN")
    protected TgOWN own;
    /**
     * Informationen zum Bedarfstraeger
     * 
     */
    @XmlElement(name = "Requester")
    protected List<TgRequester> requester;
    /**
     * Informationen zum Auftragnehmer
     * 
     */
    @XmlElement(name = "CTR")
    protected TgCTR ctr;
    @XmlElements({
        @XmlElement(name = "CnstSite", type = TgCnstSite.class),
        @XmlElement(name = "NotifSite", type = TgNotifSite.class)
    })
    protected List<Object> cnstSiteAndNotifSite;
    /**
     * Zusaetzlicher Text; Zusätzliche Textinformation können hier abgelegt werden.
     * 
     */
    @XmlElement(name = "AddText")
    protected List<TgAddText> addText;
    /**
     * Leistungsverzeichnis
     * 
     */
    @XmlElement(name = "BoQ")
    protected TgBoQ boQ;
    /**
     * Rechnungskopf
     * 
     */
    @XmlElement(name = "InvoiceHeader")
    protected TgInvoiceHeader invoiceHeader;
    /**
     * Rechnungsersteller
     * 
     */
    @XmlElement(name = "InvoiceCreator")
    protected TgInvoiceCreator invoiceCreator;
    /**
     * Rechnungsempfänger
     * 
     */
    @XmlElement(name = "InvoiceRecipient")
    protected TgInvoiceRecipient invoiceRecipient;
    /**
     * Prüfvermerk
     * 
     */
    @XmlElement(name = "CheckNote")
    protected List<TgCheckNote> checkNote;
    /**
     * Haushaltsstelle
     * 
     */
    @XmlElement(name = "BudgetDept")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String budgetDept;
    /**
     * Buchungsnummer
     * 
     */
    @XmlElement(name = "BookingNo")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String bookingNo;
    /**
     * Hinweis zu beiliegender Mengenermittlung als freier Text
     * 
     */
    @XmlElement(name = "QuantityDeterminationRemark")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String quantityDeterminationRemark;
    /**
     * Rechnungsanteil
     * 
     */
    @XmlElement(name = "InvoiceShare")
    protected List<TgInvoiceShare> invoiceShare;
    /**
     * Zahlungsbedingung
     * 
     */
    @XmlElement(name = "Terms")
    protected List<TgCashDiscount> terms;
    /**
     * geleistete Zahlung
     * 
     */
    @XmlElement(name = "PaymentMade")
    protected List<TgPaymentMade> paymentMade;
    /**
     * gestellte Rechnung
     * 
     */
    @XmlElement(name = "InvoiceMadeOut")
    protected List<TgInvoiceMadeOut> invoiceMadeOut;
    /**
     * Rechnungssumme Brutto
     * 
     */
    @XmlElement(name = "TotalGross")
    protected BigDecimal totalGross;

    /**
     * GAEB-Datenaustauschphase
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDP() {
        return dp;
    }

    /**
     * Legt den Wert der dp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDP()
     */
    public void setDP(String value) {
        this.dp = value;
    }

    /**
     * Informationen zum Auftraggeber
     * 
     * @return
     *     possible object is
     *     {@link TgOWN }
     *     
     */
    public TgOWN getOWN() {
        return own;
    }

    /**
     * Legt den Wert der own-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgOWN }
     *     
     * @see #getOWN()
     */
    public void setOWN(TgOWN value) {
        this.own = value;
    }

    /**
     * Informationen zum Bedarfstraeger
     * 
     * Gets the value of the requester property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requester property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRequester().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TgRequester }
     * </p>
     * 
     * 
     * @return
     *     The value of the requester property.
     */
    public List<TgRequester> getRequester() {
        if (requester == null) {
            requester = new ArrayList<>();
        }
        return this.requester;
    }

    /**
     * Informationen zum Auftragnehmer
     * 
     * @return
     *     possible object is
     *     {@link TgCTR }
     *     
     */
    public TgCTR getCTR() {
        return ctr;
    }

    /**
     * Legt den Wert der ctr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgCTR }
     *     
     * @see #getCTR()
     */
    public void setCTR(TgCTR value) {
        this.ctr = value;
    }

    /**
     * Gets the value of the cnstSiteAndNotifSite property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cnstSiteAndNotifSite property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCnstSiteAndNotifSite().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TgCnstSite }
     * {@link TgNotifSite }
     * </p>
     * 
     * 
     * @return
     *     The value of the cnstSiteAndNotifSite property.
     */
    public List<Object> getCnstSiteAndNotifSite() {
        if (cnstSiteAndNotifSite == null) {
            cnstSiteAndNotifSite = new ArrayList<>();
        }
        return this.cnstSiteAndNotifSite;
    }

    /**
     * Zusaetzlicher Text; Zusätzliche Textinformation können hier abgelegt werden.
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
     * {@link TgAddText }
     * </p>
     * 
     * 
     * @return
     *     The value of the addText property.
     */
    public List<TgAddText> getAddText() {
        if (addText == null) {
            addText = new ArrayList<>();
        }
        return this.addText;
    }

    /**
     * Leistungsverzeichnis
     * 
     * @return
     *     possible object is
     *     {@link TgBoQ }
     *     
     */
    public TgBoQ getBoQ() {
        return boQ;
    }

    /**
     * Legt den Wert der boQ-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgBoQ }
     *     
     * @see #getBoQ()
     */
    public void setBoQ(TgBoQ value) {
        this.boQ = value;
    }

    /**
     * Rechnungskopf
     * 
     * @return
     *     possible object is
     *     {@link TgInvoiceHeader }
     *     
     */
    public TgInvoiceHeader getInvoiceHeader() {
        return invoiceHeader;
    }

    /**
     * Legt den Wert der invoiceHeader-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgInvoiceHeader }
     *     
     * @see #getInvoiceHeader()
     */
    public void setInvoiceHeader(TgInvoiceHeader value) {
        this.invoiceHeader = value;
    }

    /**
     * Rechnungsersteller
     * 
     * @return
     *     possible object is
     *     {@link TgInvoiceCreator }
     *     
     */
    public TgInvoiceCreator getInvoiceCreator() {
        return invoiceCreator;
    }

    /**
     * Legt den Wert der invoiceCreator-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgInvoiceCreator }
     *     
     * @see #getInvoiceCreator()
     */
    public void setInvoiceCreator(TgInvoiceCreator value) {
        this.invoiceCreator = value;
    }

    /**
     * Rechnungsempfänger
     * 
     * @return
     *     possible object is
     *     {@link TgInvoiceRecipient }
     *     
     */
    public TgInvoiceRecipient getInvoiceRecipient() {
        return invoiceRecipient;
    }

    /**
     * Legt den Wert der invoiceRecipient-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgInvoiceRecipient }
     *     
     * @see #getInvoiceRecipient()
     */
    public void setInvoiceRecipient(TgInvoiceRecipient value) {
        this.invoiceRecipient = value;
    }

    /**
     * Prüfvermerk
     * 
     * Gets the value of the checkNote property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the checkNote property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCheckNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TgCheckNote }
     * </p>
     * 
     * 
     * @return
     *     The value of the checkNote property.
     */
    public List<TgCheckNote> getCheckNote() {
        if (checkNote == null) {
            checkNote = new ArrayList<>();
        }
        return this.checkNote;
    }

    /**
     * Haushaltsstelle
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBudgetDept() {
        return budgetDept;
    }

    /**
     * Legt den Wert der budgetDept-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getBudgetDept()
     */
    public void setBudgetDept(String value) {
        this.budgetDept = value;
    }

    /**
     * Buchungsnummer
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingNo() {
        return bookingNo;
    }

    /**
     * Legt den Wert der bookingNo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getBookingNo()
     */
    public void setBookingNo(String value) {
        this.bookingNo = value;
    }

    /**
     * Hinweis zu beiliegender Mengenermittlung als freier Text
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantityDeterminationRemark() {
        return quantityDeterminationRemark;
    }

    /**
     * Legt den Wert der quantityDeterminationRemark-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getQuantityDeterminationRemark()
     */
    public void setQuantityDeterminationRemark(String value) {
        this.quantityDeterminationRemark = value;
    }

    /**
     * Rechnungsanteil
     * 
     * Gets the value of the invoiceShare property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invoiceShare property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getInvoiceShare().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TgInvoiceShare }
     * </p>
     * 
     * 
     * @return
     *     The value of the invoiceShare property.
     */
    public List<TgInvoiceShare> getInvoiceShare() {
        if (invoiceShare == null) {
            invoiceShare = new ArrayList<>();
        }
        return this.invoiceShare;
    }

    /**
     * Zahlungsbedingung
     * 
     * Gets the value of the terms property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the terms property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTerms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TgCashDiscount }
     * </p>
     * 
     * 
     * @return
     *     The value of the terms property.
     */
    public List<TgCashDiscount> getTerms() {
        if (terms == null) {
            terms = new ArrayList<>();
        }
        return this.terms;
    }

    /**
     * geleistete Zahlung
     * 
     * Gets the value of the paymentMade property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentMade property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPaymentMade().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TgPaymentMade }
     * </p>
     * 
     * 
     * @return
     *     The value of the paymentMade property.
     */
    public List<TgPaymentMade> getPaymentMade() {
        if (paymentMade == null) {
            paymentMade = new ArrayList<>();
        }
        return this.paymentMade;
    }

    /**
     * gestellte Rechnung
     * 
     * Gets the value of the invoiceMadeOut property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invoiceMadeOut property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getInvoiceMadeOut().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TgInvoiceMadeOut }
     * </p>
     * 
     * 
     * @return
     *     The value of the invoiceMadeOut property.
     */
    public List<TgInvoiceMadeOut> getInvoiceMadeOut() {
        if (invoiceMadeOut == null) {
            invoiceMadeOut = new ArrayList<>();
        }
        return this.invoiceMadeOut;
    }

    /**
     * Rechnungssumme Brutto
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalGross() {
        return totalGross;
    }

    /**
     * Legt den Wert der totalGross-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getTotalGross()
     */
    public void setTotalGross(BigDecimal value) {
        this.totalGross = value;
    }

}
