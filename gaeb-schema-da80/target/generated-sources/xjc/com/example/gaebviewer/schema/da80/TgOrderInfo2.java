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
 * <p>Java-Klasse für tgOrderInfo complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgOrderInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Inquiry" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString">
 *               <enumeration value="project-inquires"/>
 *               <enumeration value="immediate needs"/>
 *               <enumeration value="exhibition"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="CallOrder" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString">
 *               <enumeration value="V"/>
 *               <enumeration value="CO"/>
 *               <enumeration value="COfromCO"/>
 *               <enumeration value="COfromOffer"/>
 *               <enumeration value="CreateCOfromOffer"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="RepOrder" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString15" minOccurs="0"/>
 *         <element name="InquiryNo" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString15" minOccurs="0"/>
 *         <element name="OfferNo" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString15" minOccurs="0"/>
 *         <element name="PartNo" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString15" minOccurs="0"/>
 *         <element name="OrderConfNo" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString15" minOccurs="0"/>
 *         <element name="TenderDate" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDate" minOccurs="0"/>
 *         <element name="DeliveryType" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString">
 *               <enumeration value="fixed"/>
 *               <enumeration value="delivery"/>
 *               <enumeration value="collection"/>
 *               <enumeration value="way"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <choice minOccurs="0">
 *           <element name="DeliveryWeek" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgWeek"/>
 *           <sequence>
 *             <element name="DeliveryDate" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDate"/>
 *             <element name="DeliveryTime" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgTime" minOccurs="0"/>
 *           </sequence>
 *         </choice>
 *         <element name="FixedPriceDate" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDate" minOccurs="0"/>
 *         <element name="ModeOfShipment" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString30" minOccurs="0"/>
 *         <sequence minOccurs="0">
 *           <element name="Cur" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgISOCur"/>
 *           <element name="CurLbl" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgCurLbl" minOccurs="0"/>
 *         </sequence>
 *         <element name="AddText" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgAddText" minOccurs="0"/>
 *         <choice minOccurs="0">
 *           <element name="OfferFixedPriceDate" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDate"/>
 *           <element name="OfferFixedPriceWeek" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgWeek"/>
 *         </choice>
 *         <element name="CustomerBoQBkdn" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgBoQBkdn" maxOccurs="7" minOccurs="0"/>
 *         <element name="SupplierBoQBkdn" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgBoQBkdn" maxOccurs="7" minOccurs="0"/>
 *         <element name="PriceModification" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgPriceModification" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="VAT" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDecimal_5_2" minOccurs="0"/>
 *         <element name="CashDiscount" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgCashDiscount" maxOccurs="3" minOccurs="0"/>
 *         <element name="Quotation" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgQuotation" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SpecialPayTime" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString" minOccurs="0"/>
 *         <element name="Ctlg" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgCtlg" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CustomerReferenceNo" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString" minOccurs="0"/>
 *         <element name="SupplierReferenceNo" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString" minOccurs="0"/>
 *         <element name="DeliveryNo" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString" minOccurs="0"/>
 *         <element name="DeliveryNoteVoucherDate" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString" minOccurs="0"/>
 *         <element name="TotalWeight" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDecimal_13_2" minOccurs="0"/>
 *         <element name="UW" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString" minOccurs="0"/>
 *         <element name="ProvisionDate" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDate" minOccurs="0"/>
 *         <element name="CtlgAssign" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgCtlgAssign" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgOrderInfo", propOrder = {
    "inquiry",
    "callOrder",
    "repOrder",
    "inquiryNo",
    "offerNo",
    "partNo",
    "orderConfNo",
    "tenderDate",
    "deliveryType",
    "deliveryWeek",
    "deliveryDate",
    "deliveryTime",
    "fixedPriceDate",
    "modeOfShipment",
    "cur",
    "curLbl",
    "addText",
    "offerFixedPriceDate",
    "offerFixedPriceWeek",
    "customerBoQBkdn",
    "supplierBoQBkdn",
    "priceModification",
    "vat",
    "cashDiscount",
    "quotation",
    "specialPayTime",
    "ctlg",
    "customerReferenceNo",
    "supplierReferenceNo",
    "deliveryNo",
    "deliveryNoteVoucherDate",
    "totalWeight",
    "uw",
    "provisionDate",
    "ctlgAssign"
})
public class TgOrderInfo2 {

    /**
     * AnfrArt, P = Projektanfrage, S = Sofortbedarf, A = Ausstellung
     * 
     */
    @XmlElement(name = "Inquiry")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String inquiry;
    /**
     * Abrufauftrag, 
     * 
     * V =valid;   zulässig (nur D93 oder D97), 
     * CO =call order;  Abrufauftrag,
     * COfromCO =call order for supply from a call order; Abrufauftrag zur Lieferung aus einem Abrufauftrag,
     * COfromOffer =call order for supply from an offer; Abrufauftrag zur Lieferung aus einem Angebeot
     * CreateCOfromOffer=create a call order from an offer; Erstellen eines Abrufauftrages aus einer Angebot
     * 
     */
    @XmlElement(name = "CallOrder")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String callOrder;
    /**
     * Nachbestellung zu Auftragsnummer
     * 
     */
    @XmlElement(name = "RepOrder")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String repOrder;
    /**
     * AnfrNrKunde, Anfragenummer (Name aus D93)
     * 
     */
    @XmlElement(name = "InquiryNo")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String inquiryNo;
    /**
     * AngebNrLief, Angebotsnummer (Name aus D94)
     * 
     */
    @XmlElement(name = "OfferNo")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String offerNo;
    /**
     * BestNr, Bestellnummer (Name aus D96)
     * 
     */
    @XmlElement(name = "PartNo")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String partNo;
    /**
     * ABNr, Auftragsbestätigungsnummer (Name aus D97)
     * 
     */
    @XmlElement(name = "OrderConfNo")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String orderConfNo;
    /**
     * ErDatum, Submissionstermin (Eröffnungsdatum)
     * 
     */
    @XmlElement(name = "TenderDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar tenderDate;
    /**
     * LieferArt, Bei Bedarf "FIX". Für DA 98 und 99 auch Lieferung, Abholung und Strecke.
     * 
     */
    @XmlElement(name = "DeliveryType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String deliveryType;
    /**
     * Lieferwoche
     * 
     */
    @XmlElement(name = "DeliveryWeek")
    @XmlSchemaType(name = "positiveInteger")
    protected Integer deliveryWeek;
    /**
     * Lieferdatum
     * 
     */
    @XmlElement(name = "DeliveryDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar deliveryDate;
    /**
     * Lieferzeit
     * 
     */
    @XmlElement(name = "DeliveryTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar deliveryTime;
    /**
     * Preisbindungsdatum in Angebot
     * 
     */
    @XmlElement(name = "FixedPriceDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fixedPriceDate;
    /**
     * VersArt, Lieferung / Abholung / Strecke
     * 
     */
    @XmlElement(name = "ModeOfShipment")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String modeOfShipment;
    /**
     * Waehrung
     * 
     */
    @XmlElement(name = "Cur")
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
     * Zusätzlicher Text zum Vorgang
     * 
     */
    @XmlElement(name = "AddText")
    protected TgAddText2 addText;
    /**
     * Rückgabe für Preisanfrage (D93), Preisbindung für Angebot (D94)
     * 
     */
    @XmlElement(name = "OfferFixedPriceDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar offerFixedPriceDate;
    /**
     * Rückgabe für Preisanfrage (D93), Preisbindung für Angebot (D94)
     * 
     */
    @XmlElement(name = "OfferFixedPriceWeek")
    @XmlSchemaType(name = "positiveInteger")
    protected Integer offerFixedPriceWeek;
    /**
     * OZ Defintion für die OZ Referenz in OrderItem
     * 
     */
    @XmlElement(name = "CustomerBoQBkdn")
    protected List<TgBoQBkdn2> customerBoQBkdn;
    /**
     * OZ Defintion für die OZ Referenz in OrderItem
     * 
     */
    @XmlElement(name = "SupplierBoQBkdn")
    protected List<TgBoQBkdn2> supplierBoQBkdn;
    /**
     * Nachlässe / Zuschläge auf die gesamte Bestellung
     * 
     */
    @XmlElement(name = "PriceModification")
    protected List<TgPriceModification2> priceModification;
    /**
     * MwSt in %
     * 
     */
    @XmlElement(name = "VAT")
    protected BigDecimal vat;
    /**
     * Skonto
     * 
     */
    @XmlElement(name = "CashDiscount")
    protected List<TgCashDiscount2> cashDiscount;
    /**
     * DEL Notierung
     * 
     */
    @XmlElement(name = "Quotation")
    protected List<TgQuotation2> quotation;
    /**
     * Sonderzahlungsziel als Beschreibung.
     * 
     */
    @XmlElement(name = "SpecialPayTime")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String specialPayTime;
    /**
     * Katalog
     * 
     */
    @XmlElement(name = "Ctlg")
    protected List<TgCtlg2> ctlg;
    /**
     * Projekt-, Kommissionsnummer des HW. Kann in RefItems je Artikelüberschrieben werden.
     * 
     */
    @XmlElement(name = "CustomerReferenceNo")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String customerReferenceNo;
    /**
     * Vorgangsnummer des Lieferanten.
     * 
     */
    @XmlElement(name = "SupplierReferenceNo")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String supplierReferenceNo;
    /**
     * Lieferscheinnummer des Lieferanten
     * 
     */
    @XmlElement(name = "DeliveryNo")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String deliveryNo;
    /**
     * Lieferscheindatum des Lieferanten
     * 
     */
    @XmlElement(name = "DeliveryNoteVoucherDate")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String deliveryNoteVoucherDate;
    /**
     * Gesamtgewicht in UW
     * 
     */
    @XmlElement(name = "TotalWeight")
    protected BigDecimal totalWeight;
    /**
     * Gewichtseinheit
     * 
     */
    @XmlElement(name = "UW")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String uw;
    /**
     * Tatsächliches Lieferdatum
     * 
     */
    @XmlElement(name = "ProvisionDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar provisionDate;
    @XmlElement(name = "CtlgAssign")
    protected List<TgCtlgAssign2> ctlgAssign;

    /**
     * AnfrArt, P = Projektanfrage, S = Sofortbedarf, A = Ausstellung
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInquiry() {
        return inquiry;
    }

    /**
     * Legt den Wert der inquiry-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getInquiry()
     */
    public void setInquiry(String value) {
        this.inquiry = value;
    }

    /**
     * Abrufauftrag, 
     * 
     * V =valid;   zulässig (nur D93 oder D97), 
     * CO =call order;  Abrufauftrag,
     * COfromCO =call order for supply from a call order; Abrufauftrag zur Lieferung aus einem Abrufauftrag,
     * COfromOffer =call order for supply from an offer; Abrufauftrag zur Lieferung aus einem Angebeot
     * CreateCOfromOffer=create a call order from an offer; Erstellen eines Abrufauftrages aus einer Angebot
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallOrder() {
        return callOrder;
    }

    /**
     * Legt den Wert der callOrder-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCallOrder()
     */
    public void setCallOrder(String value) {
        this.callOrder = value;
    }

    /**
     * Nachbestellung zu Auftragsnummer
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepOrder() {
        return repOrder;
    }

    /**
     * Legt den Wert der repOrder-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRepOrder()
     */
    public void setRepOrder(String value) {
        this.repOrder = value;
    }

    /**
     * AnfrNrKunde, Anfragenummer (Name aus D93)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInquiryNo() {
        return inquiryNo;
    }

    /**
     * Legt den Wert der inquiryNo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getInquiryNo()
     */
    public void setInquiryNo(String value) {
        this.inquiryNo = value;
    }

    /**
     * AngebNrLief, Angebotsnummer (Name aus D94)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferNo() {
        return offerNo;
    }

    /**
     * Legt den Wert der offerNo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOfferNo()
     */
    public void setOfferNo(String value) {
        this.offerNo = value;
    }

    /**
     * BestNr, Bestellnummer (Name aus D96)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartNo() {
        return partNo;
    }

    /**
     * Legt den Wert der partNo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPartNo()
     */
    public void setPartNo(String value) {
        this.partNo = value;
    }

    /**
     * ABNr, Auftragsbestätigungsnummer (Name aus D97)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderConfNo() {
        return orderConfNo;
    }

    /**
     * Legt den Wert der orderConfNo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOrderConfNo()
     */
    public void setOrderConfNo(String value) {
        this.orderConfNo = value;
    }

    /**
     * ErDatum, Submissionstermin (Eröffnungsdatum)
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTenderDate() {
        return tenderDate;
    }

    /**
     * Legt den Wert der tenderDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getTenderDate()
     */
    public void setTenderDate(XMLGregorianCalendar value) {
        this.tenderDate = value;
    }

    /**
     * LieferArt, Bei Bedarf "FIX". Für DA 98 und 99 auch Lieferung, Abholung und Strecke.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryType() {
        return deliveryType;
    }

    /**
     * Legt den Wert der deliveryType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDeliveryType()
     */
    public void setDeliveryType(String value) {
        this.deliveryType = value;
    }

    /**
     * Lieferwoche
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDeliveryWeek() {
        return deliveryWeek;
    }

    /**
     * Legt den Wert der deliveryWeek-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getDeliveryWeek()
     */
    public void setDeliveryWeek(Integer value) {
        this.deliveryWeek = value;
    }

    /**
     * Lieferdatum
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeliveryDate() {
        return deliveryDate;
    }

    /**
     * Legt den Wert der deliveryDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getDeliveryDate()
     */
    public void setDeliveryDate(XMLGregorianCalendar value) {
        this.deliveryDate = value;
    }

    /**
     * Lieferzeit
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeliveryTime() {
        return deliveryTime;
    }

    /**
     * Legt den Wert der deliveryTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getDeliveryTime()
     */
    public void setDeliveryTime(XMLGregorianCalendar value) {
        this.deliveryTime = value;
    }

    /**
     * Preisbindungsdatum in Angebot
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFixedPriceDate() {
        return fixedPriceDate;
    }

    /**
     * Legt den Wert der fixedPriceDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getFixedPriceDate()
     */
    public void setFixedPriceDate(XMLGregorianCalendar value) {
        this.fixedPriceDate = value;
    }

    /**
     * VersArt, Lieferung / Abholung / Strecke
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModeOfShipment() {
        return modeOfShipment;
    }

    /**
     * Legt den Wert der modeOfShipment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getModeOfShipment()
     */
    public void setModeOfShipment(String value) {
        this.modeOfShipment = value;
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
     * Zusätzlicher Text zum Vorgang
     * 
     * @return
     *     possible object is
     *     {@link TgAddText2 }
     *     
     */
    public TgAddText2 getAddText() {
        return addText;
    }

    /**
     * Legt den Wert der addText-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgAddText2 }
     *     
     * @see #getAddText()
     */
    public void setAddText(TgAddText2 value) {
        this.addText = value;
    }

    /**
     * Rückgabe für Preisanfrage (D93), Preisbindung für Angebot (D94)
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOfferFixedPriceDate() {
        return offerFixedPriceDate;
    }

    /**
     * Legt den Wert der offerFixedPriceDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getOfferFixedPriceDate()
     */
    public void setOfferFixedPriceDate(XMLGregorianCalendar value) {
        this.offerFixedPriceDate = value;
    }

    /**
     * Rückgabe für Preisanfrage (D93), Preisbindung für Angebot (D94)
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOfferFixedPriceWeek() {
        return offerFixedPriceWeek;
    }

    /**
     * Legt den Wert der offerFixedPriceWeek-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getOfferFixedPriceWeek()
     */
    public void setOfferFixedPriceWeek(Integer value) {
        this.offerFixedPriceWeek = value;
    }

    /**
     * OZ Defintion für die OZ Referenz in OrderItem
     * 
     * Gets the value of the customerBoQBkdn property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerBoQBkdn property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCustomerBoQBkdn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TgBoQBkdn2 }
     * </p>
     * 
     * 
     * @return
     *     The value of the customerBoQBkdn property.
     */
    public List<TgBoQBkdn2> getCustomerBoQBkdn() {
        if (customerBoQBkdn == null) {
            customerBoQBkdn = new ArrayList<>();
        }
        return this.customerBoQBkdn;
    }

    /**
     * OZ Defintion für die OZ Referenz in OrderItem
     * 
     * Gets the value of the supplierBoQBkdn property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supplierBoQBkdn property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSupplierBoQBkdn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TgBoQBkdn2 }
     * </p>
     * 
     * 
     * @return
     *     The value of the supplierBoQBkdn property.
     */
    public List<TgBoQBkdn2> getSupplierBoQBkdn() {
        if (supplierBoQBkdn == null) {
            supplierBoQBkdn = new ArrayList<>();
        }
        return this.supplierBoQBkdn;
    }

    /**
     * Nachlässe / Zuschläge auf die gesamte Bestellung
     * 
     * Gets the value of the priceModification property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceModification property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPriceModification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TgPriceModification2 }
     * </p>
     * 
     * 
     * @return
     *     The value of the priceModification property.
     */
    public List<TgPriceModification2> getPriceModification() {
        if (priceModification == null) {
            priceModification = new ArrayList<>();
        }
        return this.priceModification;
    }

    /**
     * MwSt in %
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVAT() {
        return vat;
    }

    /**
     * Legt den Wert der vat-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getVAT()
     */
    public void setVAT(BigDecimal value) {
        this.vat = value;
    }

    /**
     * Skonto
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

    /**
     * DEL Notierung
     * 
     * Gets the value of the quotation property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quotation property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getQuotation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TgQuotation2 }
     * </p>
     * 
     * 
     * @return
     *     The value of the quotation property.
     */
    public List<TgQuotation2> getQuotation() {
        if (quotation == null) {
            quotation = new ArrayList<>();
        }
        return this.quotation;
    }

    /**
     * Sonderzahlungsziel als Beschreibung.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialPayTime() {
        return specialPayTime;
    }

    /**
     * Legt den Wert der specialPayTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSpecialPayTime()
     */
    public void setSpecialPayTime(String value) {
        this.specialPayTime = value;
    }

    /**
     * Katalog
     * 
     * Gets the value of the ctlg property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ctlg property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCtlg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TgCtlg2 }
     * </p>
     * 
     * 
     * @return
     *     The value of the ctlg property.
     */
    public List<TgCtlg2> getCtlg() {
        if (ctlg == null) {
            ctlg = new ArrayList<>();
        }
        return this.ctlg;
    }

    /**
     * Projekt-, Kommissionsnummer des HW. Kann in RefItems je Artikelüberschrieben werden.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerReferenceNo() {
        return customerReferenceNo;
    }

    /**
     * Legt den Wert der customerReferenceNo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCustomerReferenceNo()
     */
    public void setCustomerReferenceNo(String value) {
        this.customerReferenceNo = value;
    }

    /**
     * Vorgangsnummer des Lieferanten.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierReferenceNo() {
        return supplierReferenceNo;
    }

    /**
     * Legt den Wert der supplierReferenceNo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSupplierReferenceNo()
     */
    public void setSupplierReferenceNo(String value) {
        this.supplierReferenceNo = value;
    }

    /**
     * Lieferscheinnummer des Lieferanten
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryNo() {
        return deliveryNo;
    }

    /**
     * Legt den Wert der deliveryNo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDeliveryNo()
     */
    public void setDeliveryNo(String value) {
        this.deliveryNo = value;
    }

    /**
     * Lieferscheindatum des Lieferanten
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryNoteVoucherDate() {
        return deliveryNoteVoucherDate;
    }

    /**
     * Legt den Wert der deliveryNoteVoucherDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDeliveryNoteVoucherDate()
     */
    public void setDeliveryNoteVoucherDate(String value) {
        this.deliveryNoteVoucherDate = value;
    }

    /**
     * Gesamtgewicht in UW
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalWeight() {
        return totalWeight;
    }

    /**
     * Legt den Wert der totalWeight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getTotalWeight()
     */
    public void setTotalWeight(BigDecimal value) {
        this.totalWeight = value;
    }

    /**
     * Gewichtseinheit
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUW() {
        return uw;
    }

    /**
     * Legt den Wert der uw-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getUW()
     */
    public void setUW(String value) {
        this.uw = value;
    }

    /**
     * Tatsächliches Lieferdatum
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProvisionDate() {
        return provisionDate;
    }

    /**
     * Legt den Wert der provisionDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getProvisionDate()
     */
    public void setProvisionDate(XMLGregorianCalendar value) {
        this.provisionDate = value;
    }

    /**
     * Gets the value of the ctlgAssign property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ctlgAssign property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCtlgAssign().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TgCtlgAssign2 }
     * </p>
     * 
     * 
     * @return
     *     The value of the ctlgAssign property.
     */
    public List<TgCtlgAssign2> getCtlgAssign() {
        if (ctlgAssign == null) {
            ctlgAssign = new ArrayList<>();
        }
        return this.ctlgAssign;
    }

}
