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
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Angebots-/Anfrage-/Bestellposition. 
 * Regeln:
 * 
 *  1) Das Attribut ID bezieht sich in der Regel auf die ID in einer vorhandenen,
 * vorherigen Datenaustauschphase (i.d.R. D93).
 *  2) LiefKennZ darf nicht in D93 existieren.
 *  3) Wenn AME nicht existiert, beziehen sich die Elemente PrBrutto, PrNetto und
 * PrBasis auf 1 Einheit des Elementes ArtMenge.
 * 
 * <p>Java-Klasse für tgOrderItem complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgOrderItem">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ItemChara" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{}tgNormalizedString">
 *               <enumeration value="normal"/>
 *               <enumeration value="alternate"/>
 *               <enumeration value="provis"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="ItemType" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{}tgNormalizedString">
 *               <enumeration value="jumbo-main"/>
 *               <enumeration value="jumbo-sub"/>
 *               <enumeration value="articel-main"/>
 *               <enumeration value="lump"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="RepOrder" type="{}tgNormalizedString" minOccurs="0"/>
 *         <element name="RefItems" type="{}tgRefItems" minOccurs="0"/>
 *         <element name="DeliveryChara" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{}tgNormalizedString">
 *               <enumeration value="no supply"/>
 *               <enumeration value="addition"/>
 *               <enumeration value="change"/>
 *               <enumeration value="alternate"/>
 *               <enumeration value="delivered partly, more follows"/>
 *               <enumeration value="delivered partly, more not applicable"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="Service" type="{}tgYesNo" minOccurs="0"/>
 *         <element name="EAN" type="{}tgDecimal_13_0" minOccurs="0"/>
 *         <element name="ArtNoID" type="{}tgNormalizedString13" minOccurs="0"/>
 *         <element name="ArtNo" type="{}tgNormalizedString15" minOccurs="0"/>
 *         <element name="SupplierArtNoID" type="{}tgNormalizedString13" minOccurs="0"/>
 *         <element name="SupplierArtNo" type="{}tgNormalizedString15" minOccurs="0"/>
 *         <element name="CustomerArtNo" type="{}tgNormalizedString15" minOccurs="0"/>
 *         <sequence minOccurs="0">
 *           <element name="CatalogArtNo" type="{}tgNormalizedString"/>
 *           <element name="CatalogNo" type="{}tgNormalizedString" minOccurs="0"/>
 *         </sequence>
 *         <element name="Qty" type="{}tgDecimal_13_2" minOccurs="0"/>
 *         <element name="QU" type="{}tgNormalizedString4" minOccurs="0"/>
 *         <element name="StorageGoods" type="{}tgYesNo" minOccurs="0"/>
 *         <element name="Description" type="{}tgDescription" minOccurs="0"/>
 *         <element name="BidComm" type="{}tgMLText" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="OfferPrice" type="{}tgDecimal_10_2" minOccurs="0"/>
 *         <element name="NetPrice" type="{}tgDecimal_10_2" minOccurs="0"/>
 *         <element name="PriceBasis" type="{}tgDecimal_10_2" minOccurs="0"/>
 *         <element name="AQU" type="{}tgNormalizedString" minOccurs="0"/>
 *         <element name="Address" type="{}tgAddress" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ModeOfShipment" type="{}tgNormalizedString" minOccurs="0"/>
 *         <element name="KindOfDate" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *               <enumeration value="fixed"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <choice minOccurs="0">
 *           <sequence>
 *             <element name="DeliveryDate" type="{}tgDate"/>
 *             <element name="DeliveryTime" type="{}tgTime" minOccurs="0"/>
 *           </sequence>
 *           <element name="DeliveryWeek" type="{}tgWeek"/>
 *         </choice>
 *         <element name="PriceModification" type="{}tgPriceModification" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PriceChara" type="{}tgNormalizedString" minOccurs="0"/>
 *         <element name="VAT" type="{}tgDecimal_5_2" minOccurs="0"/>
 *         <element name="ProvisionDate" type="{}tgDate" minOccurs="0"/>
 *         <element name="UserValue" type="{}tgUserValue" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Dimension" type="{}tgDimension" minOccurs="0"/>
 *         <sequence minOccurs="0">
 *           <element name="Weight" type="{}tgDecimal_13_2"/>
 *           <element name="UW" type="{}tgNormalizedString"/>
 *         </sequence>
 *         <element name="TechnClarification" type="{}tgYesNo" minOccurs="0"/>
 *         <element name="OrderPosNo" type="{}tgNormalizedString" minOccurs="0"/>
 *         <element name="CountryOfOrigin" type="{}tgNormalizedString" minOccurs="0"/>
 *         <element name="Discountable" type="{}tgYesNo" minOccurs="0"/>
 *         <element name="MetalResources" type="{}tgMetalResources" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CtlgAssign" type="{}tgCtlgAssign" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgOrderItem", namespace = "", propOrder = {
    "itemChara",
    "itemType",
    "repOrder",
    "refItems",
    "deliveryChara",
    "service",
    "ean",
    "artNoID",
    "artNo",
    "supplierArtNoID",
    "supplierArtNo",
    "customerArtNo",
    "catalogArtNo",
    "catalogNo",
    "qty",
    "qu",
    "storageGoods",
    "description",
    "bidComm",
    "offerPrice",
    "netPrice",
    "priceBasis",
    "aqu",
    "address",
    "modeOfShipment",
    "kindOfDate",
    "deliveryDate",
    "deliveryTime",
    "deliveryWeek",
    "priceModification",
    "priceChara",
    "vat",
    "provisionDate",
    "userValue",
    "dimension",
    "weight",
    "uw",
    "technClarification",
    "orderPosNo",
    "countryOfOrigin",
    "discountable",
    "metalResources",
    "ctlgAssign"
})
public class TgOrderItem {

    /**
     * PosKennZ, 
     * normal = Normalposition, 
     * alternate = Alternativposition,
     * provis = Bedarfsposition,
     * 
     */
    @XmlElement(name = "ItemChara")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String itemChara;
    /**
     * PosKennZ, 
     * ´jumbo-main´ = Jumbo-Hauptposition (Stücklisten-Hauptpos.)
     * ´jumbo-sub´= Jumbo-Unterposition
     * `artcel-main`= Reguläre Artikel-Hauptposition
     * 'lump'=Pauschalposition zur Angabe einer pauschalen Menge zum angegebenen Preis
     * 
     */
    @XmlElement(name = "ItemType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String itemType;
    /**
     * Nachbestellung zu Position, ID der Position
     * 
     */
    @XmlElement(name = "RepOrder")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String repOrder;
    /**
     * OZs, Ordnungszahlen
     * 
     */
    @XmlElement(name = "RefItems")
    protected TgRefItems refItems;
    /**
     * LiefKennZ, 
     * 'no supply' = keine Lieferung, 
     * 'addition' = Ergänzung,
     * 'change' = Änderung (D94), 
     * 'alternate' = Alternative,
     * 'delivered partly, more follows' = Teilgeliefert, Rest folgt,
     * 'delivered partly, more not applicable' = Teilgeliefert, Rest entfällt.
     * 
     */
    @XmlElement(name = "DeliveryChara")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String deliveryChara;
    /**
     * Dienstleistung
     * 
     */
    @XmlElement(name = "Service")
    @XmlSchemaType(name = "normalizedString")
    protected TgYesNo service;
    /**
     * EAN/GTIN-Nummer der Position. Element Substitution kann XmlSpy nicht
     * 
     */
    @XmlElement(name = "EAN")
    protected BigDecimal ean;
    /**
     * Kenn-Nummer (z.B. ILN) zu Artikelnummer, falls
     * abweichend von IdNr des Lieferanten
     * 
     */
    @XmlElement(name = "ArtNoID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String artNoID;
    /**
     * Artikelnummer des Lieferanten
     * 
     */
    @XmlElement(name = "ArtNo")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String artNo;
    /**
     * LiefArtNrID, ILN-Nummer (z.B. ILN) zu abweichender Artikelnummer
     * des Lieferanten
     * 
     */
    @XmlElement(name = "SupplierArtNoID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String supplierArtNoID;
    /**
     * LiefArtNr, Abweichende Artikelnummer des Lieferanten (z.B.
     * Werksnummer)
     * 
     */
    @XmlElement(name = "SupplierArtNo")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String supplierArtNo;
    @XmlElement(name = "CustomerArtNo")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String customerArtNo;
    /**
     * Katalog Artikelnummer
     * 
     */
    @XmlElement(name = "CatalogArtNo")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String catalogArtNo;
    /**
     * Katalog Nummer
     * 
     */
    @XmlElement(name = "CatalogNo")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String catalogNo;
    /**
     * ArtMenge, Anfrage-, Angebots- oder Bestellmenge (je nach
     * Datenaustauschphase)
     * 
     */
    @XmlElement(name = "Qty")
    protected BigDecimal qty;
    /**
     * Mengeneinheit
     * 
     */
    @XmlElement(name = "QU")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String qu;
    /**
     * Lagerware
     * 
     */
    @XmlElement(name = "StorageGoods")
    @XmlSchemaType(name = "normalizedString")
    protected TgYesNo storageGoods;
    /**
     * Langtext, Kurztext
     * 
     */
    @XmlElement(name = "Description")
    protected TgDescription description;
    /**
     * Bieter Kommentar
     * 
     */
    @XmlElement(name = "BidComm")
    protected List<TgMLText> bidComm;
    /**
     * PrBrutto, Angebotspreis (Brutto-, Listenpreis)
     * 
     */
    @XmlElement(name = "OfferPrice")
    protected BigDecimal offerPrice;
    /**
     * PrNetto, Nettopreis (Einkaufspreis des Kunden)
     * 
     */
    @XmlElement(name = "NetPrice")
    protected BigDecimal netPrice;
    /**
     * PrBasis, Preis bezieht sich auf "n" Einheiten (BME)
     * 
     */
    @XmlElement(name = "PriceBasis")
    protected BigDecimal priceBasis;
    /**
     * AME, Abrechnungs-Mengeneinheit in Bezug auf PrBasis
     * 
     */
    @XmlElement(name = "AQU")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String aqu;
    /**
     * Informationen zur Adresse für abweichenden, positionsbezogenen
     * Lieferort
     * 
     */
    @XmlElement(name = "Address")
    protected List<TgAddress> address;
    /**
     * VersArt, Lieferung/Abholung/Strecke (positionsbezogen)
     * 
     */
    @XmlElement(name = "ModeOfShipment")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String modeOfShipment;
    /**
     * TerminArt, Bei Bedarf "FIX" (positionsbezogen)
     * 
     */
    @XmlElement(name = "KindOfDate")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String kindOfDate;
    @XmlElement(name = "DeliveryDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar deliveryDate;
    @XmlElement(name = "DeliveryTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar deliveryTime;
    @XmlElement(name = "DeliveryWeek")
    @XmlSchemaType(name = "positiveInteger")
    protected Integer deliveryWeek;
    @XmlElement(name = "PriceModification")
    protected List<TgPriceModification> priceModification;
    /**
     * Preis-Kz. (Dokumentation der Nettopreis-Ermittlung)
     * ´1´ = Listenpreis abzgl. Rabatt 1 oder Rabatt 1 und 2
     * (Einzelpreis Brutto, Rabatt 1 (oder 1 und 2) und
     * Netto-Positionswert gefüllt)
     * ´2´ = Rabatte können nicht dargestellt werden
     * (Einzelpreis Brutto und Netto-Positionswert gefüllt)
     * ´3´ = Rabatte und Einzelpreis Brutto nicht darstellbar
     * (nur Netto-Positionswert gefüllt)
     * 
     */
    @XmlElement(name = "PriceChara")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String priceChara;
    /**
     * MwSt in %
     * 
     */
    @XmlElement(name = "VAT")
    protected BigDecimal vat;
    /**
     * Tatsächliches Lieferdatum
     * 
     * Nur Im Kontext der Rechnung möglich
     * 
     */
    @XmlElement(name = "ProvisionDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar provisionDate;
    @XmlElement(name = "UserValue")
    protected List<TgUserValue> userValue;
    @XmlElement(name = "Dimension")
    protected TgDimension dimension;
    @XmlElement(name = "Weight")
    protected BigDecimal weight;
    /**
     * Gewichtseinheit, unit weight
     * 
     */
    @XmlElement(name = "UW")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String uw;
    /**
     * technical clarification
     * 
     * Vorbehaltlich der technischen Klärung:
     * Yes = Ja
     * No =Nein (kein Vorbehalt)
     * Leer = kein Vorbehalt
     * 
     */
    @XmlElement(name = "TechnClarification")
    @XmlSchemaType(name = "normalizedString")
    protected TgYesNo technClarification;
    /**
     * Positionsnummer in der Bestellung
     * Im Kontext des Lieferscheins und der Rechnung Pflicht
     * 
     */
    @XmlElement(name = "OrderPosNo")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String orderPosNo;
    /**
     * Ursprungsland
     * 
     */
    @XmlElement(name = "CountryOfOrigin")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String countryOfOrigin;
    /**
     * Position ist Skontofähig. Mögliche 'Yes' für Skontofähig   'No' für nicht Skontofähig
     * 
     * Nur im Kontext der Rechnung möglich und dort Pflicht
     * 
     */
    @XmlElement(name = "Discountable")
    @XmlSchemaType(name = "normalizedString")
    protected TgYesNo discountable;
    /**
     * Rohstoffanteile
     * 
     */
    @XmlElement(name = "MetalResources")
    protected List<TgMetalResources> metalResources;
    @XmlElement(name = "CtlgAssign")
    protected List<TgCtlgAssign> ctlgAssign;
    @XmlAttribute(name = "ID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * PosKennZ, 
     * normal = Normalposition, 
     * alternate = Alternativposition,
     * provis = Bedarfsposition,
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemChara() {
        return itemChara;
    }

    /**
     * Legt den Wert der itemChara-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getItemChara()
     */
    public void setItemChara(String value) {
        this.itemChara = value;
    }

    /**
     * PosKennZ, 
     * ´jumbo-main´ = Jumbo-Hauptposition (Stücklisten-Hauptpos.)
     * ´jumbo-sub´= Jumbo-Unterposition
     * `artcel-main`= Reguläre Artikel-Hauptposition
     * 'lump'=Pauschalposition zur Angabe einer pauschalen Menge zum angegebenen Preis
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemType() {
        return itemType;
    }

    /**
     * Legt den Wert der itemType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getItemType()
     */
    public void setItemType(String value) {
        this.itemType = value;
    }

    /**
     * Nachbestellung zu Position, ID der Position
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
     * OZs, Ordnungszahlen
     * 
     * @return
     *     possible object is
     *     {@link TgRefItems }
     *     
     */
    public TgRefItems getRefItems() {
        return refItems;
    }

    /**
     * Legt den Wert der refItems-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgRefItems }
     *     
     * @see #getRefItems()
     */
    public void setRefItems(TgRefItems value) {
        this.refItems = value;
    }

    /**
     * LiefKennZ, 
     * 'no supply' = keine Lieferung, 
     * 'addition' = Ergänzung,
     * 'change' = Änderung (D94), 
     * 'alternate' = Alternative,
     * 'delivered partly, more follows' = Teilgeliefert, Rest folgt,
     * 'delivered partly, more not applicable' = Teilgeliefert, Rest entfällt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryChara() {
        return deliveryChara;
    }

    /**
     * Legt den Wert der deliveryChara-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDeliveryChara()
     */
    public void setDeliveryChara(String value) {
        this.deliveryChara = value;
    }

    /**
     * Dienstleistung
     * 
     * @return
     *     possible object is
     *     {@link TgYesNo }
     *     
     */
    public TgYesNo getService() {
        return service;
    }

    /**
     * Legt den Wert der service-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgYesNo }
     *     
     * @see #getService()
     */
    public void setService(TgYesNo value) {
        this.service = value;
    }

    /**
     * EAN/GTIN-Nummer der Position. Element Substitution kann XmlSpy nicht
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEAN() {
        return ean;
    }

    /**
     * Legt den Wert der ean-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getEAN()
     */
    public void setEAN(BigDecimal value) {
        this.ean = value;
    }

    /**
     * Kenn-Nummer (z.B. ILN) zu Artikelnummer, falls
     * abweichend von IdNr des Lieferanten
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArtNoID() {
        return artNoID;
    }

    /**
     * Legt den Wert der artNoID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getArtNoID()
     */
    public void setArtNoID(String value) {
        this.artNoID = value;
    }

    /**
     * Artikelnummer des Lieferanten
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArtNo() {
        return artNo;
    }

    /**
     * Legt den Wert der artNo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getArtNo()
     */
    public void setArtNo(String value) {
        this.artNo = value;
    }

    /**
     * LiefArtNrID, ILN-Nummer (z.B. ILN) zu abweichender Artikelnummer
     * des Lieferanten
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierArtNoID() {
        return supplierArtNoID;
    }

    /**
     * Legt den Wert der supplierArtNoID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSupplierArtNoID()
     */
    public void setSupplierArtNoID(String value) {
        this.supplierArtNoID = value;
    }

    /**
     * LiefArtNr, Abweichende Artikelnummer des Lieferanten (z.B.
     * Werksnummer)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierArtNo() {
        return supplierArtNo;
    }

    /**
     * Legt den Wert der supplierArtNo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSupplierArtNo()
     */
    public void setSupplierArtNo(String value) {
        this.supplierArtNo = value;
    }

    /**
     * Ruft den Wert der customerArtNo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerArtNo() {
        return customerArtNo;
    }

    /**
     * Legt den Wert der customerArtNo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerArtNo(String value) {
        this.customerArtNo = value;
    }

    /**
     * Katalog Artikelnummer
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatalogArtNo() {
        return catalogArtNo;
    }

    /**
     * Legt den Wert der catalogArtNo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCatalogArtNo()
     */
    public void setCatalogArtNo(String value) {
        this.catalogArtNo = value;
    }

    /**
     * Katalog Nummer
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatalogNo() {
        return catalogNo;
    }

    /**
     * Legt den Wert der catalogNo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCatalogNo()
     */
    public void setCatalogNo(String value) {
        this.catalogNo = value;
    }

    /**
     * ArtMenge, Anfrage-, Angebots- oder Bestellmenge (je nach
     * Datenaustauschphase)
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQty() {
        return qty;
    }

    /**
     * Legt den Wert der qty-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getQty()
     */
    public void setQty(BigDecimal value) {
        this.qty = value;
    }

    /**
     * Mengeneinheit
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQU() {
        return qu;
    }

    /**
     * Legt den Wert der qu-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getQU()
     */
    public void setQU(String value) {
        this.qu = value;
    }

    /**
     * Lagerware
     * 
     * @return
     *     possible object is
     *     {@link TgYesNo }
     *     
     */
    public TgYesNo getStorageGoods() {
        return storageGoods;
    }

    /**
     * Legt den Wert der storageGoods-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgYesNo }
     *     
     * @see #getStorageGoods()
     */
    public void setStorageGoods(TgYesNo value) {
        this.storageGoods = value;
    }

    /**
     * Langtext, Kurztext
     * 
     * @return
     *     possible object is
     *     {@link TgDescription }
     *     
     */
    public TgDescription getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgDescription }
     *     
     * @see #getDescription()
     */
    public void setDescription(TgDescription value) {
        this.description = value;
    }

    /**
     * Bieter Kommentar
     * 
     * Gets the value of the bidComm property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bidComm property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getBidComm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TgMLText }
     * </p>
     * 
     * 
     * @return
     *     The value of the bidComm property.
     */
    public List<TgMLText> getBidComm() {
        if (bidComm == null) {
            bidComm = new ArrayList<>();
        }
        return this.bidComm;
    }

    /**
     * PrBrutto, Angebotspreis (Brutto-, Listenpreis)
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOfferPrice() {
        return offerPrice;
    }

    /**
     * Legt den Wert der offerPrice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getOfferPrice()
     */
    public void setOfferPrice(BigDecimal value) {
        this.offerPrice = value;
    }

    /**
     * PrNetto, Nettopreis (Einkaufspreis des Kunden)
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetPrice() {
        return netPrice;
    }

    /**
     * Legt den Wert der netPrice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getNetPrice()
     */
    public void setNetPrice(BigDecimal value) {
        this.netPrice = value;
    }

    /**
     * PrBasis, Preis bezieht sich auf "n" Einheiten (BME)
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceBasis() {
        return priceBasis;
    }

    /**
     * Legt den Wert der priceBasis-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getPriceBasis()
     */
    public void setPriceBasis(BigDecimal value) {
        this.priceBasis = value;
    }

    /**
     * AME, Abrechnungs-Mengeneinheit in Bezug auf PrBasis
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAQU() {
        return aqu;
    }

    /**
     * Legt den Wert der aqu-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAQU()
     */
    public void setAQU(String value) {
        this.aqu = value;
    }

    /**
     * Informationen zur Adresse für abweichenden, positionsbezogenen
     * Lieferort
     * 
     * Gets the value of the address property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the address property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TgAddress }
     * </p>
     * 
     * 
     * @return
     *     The value of the address property.
     */
    public List<TgAddress> getAddress() {
        if (address == null) {
            address = new ArrayList<>();
        }
        return this.address;
    }

    /**
     * VersArt, Lieferung/Abholung/Strecke (positionsbezogen)
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
     * TerminArt, Bei Bedarf "FIX" (positionsbezogen)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKindOfDate() {
        return kindOfDate;
    }

    /**
     * Legt den Wert der kindOfDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getKindOfDate()
     */
    public void setKindOfDate(String value) {
        this.kindOfDate = value;
    }

    /**
     * Ruft den Wert der deliveryDate-Eigenschaft ab.
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
     */
    public void setDeliveryDate(XMLGregorianCalendar value) {
        this.deliveryDate = value;
    }

    /**
     * Ruft den Wert der deliveryTime-Eigenschaft ab.
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
     */
    public void setDeliveryTime(XMLGregorianCalendar value) {
        this.deliveryTime = value;
    }

    /**
     * Ruft den Wert der deliveryWeek-Eigenschaft ab.
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
     */
    public void setDeliveryWeek(Integer value) {
        this.deliveryWeek = value;
    }

    /**
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
     * {@link TgPriceModification }
     * </p>
     * 
     * 
     * @return
     *     The value of the priceModification property.
     */
    public List<TgPriceModification> getPriceModification() {
        if (priceModification == null) {
            priceModification = new ArrayList<>();
        }
        return this.priceModification;
    }

    /**
     * Preis-Kz. (Dokumentation der Nettopreis-Ermittlung)
     * ´1´ = Listenpreis abzgl. Rabatt 1 oder Rabatt 1 und 2
     * (Einzelpreis Brutto, Rabatt 1 (oder 1 und 2) und
     * Netto-Positionswert gefüllt)
     * ´2´ = Rabatte können nicht dargestellt werden
     * (Einzelpreis Brutto und Netto-Positionswert gefüllt)
     * ´3´ = Rabatte und Einzelpreis Brutto nicht darstellbar
     * (nur Netto-Positionswert gefüllt)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceChara() {
        return priceChara;
    }

    /**
     * Legt den Wert der priceChara-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPriceChara()
     */
    public void setPriceChara(String value) {
        this.priceChara = value;
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
     * Tatsächliches Lieferdatum
     * 
     * Nur Im Kontext der Rechnung möglich
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
     * Gets the value of the userValue property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userValue property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getUserValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TgUserValue }
     * </p>
     * 
     * 
     * @return
     *     The value of the userValue property.
     */
    public List<TgUserValue> getUserValue() {
        if (userValue == null) {
            userValue = new ArrayList<>();
        }
        return this.userValue;
    }

    /**
     * Ruft den Wert der dimension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TgDimension }
     *     
     */
    public TgDimension getDimension() {
        return dimension;
    }

    /**
     * Legt den Wert der dimension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgDimension }
     *     
     */
    public void setDimension(TgDimension value) {
        this.dimension = value;
    }

    /**
     * Ruft den Wert der weight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWeight() {
        return weight;
    }

    /**
     * Legt den Wert der weight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWeight(BigDecimal value) {
        this.weight = value;
    }

    /**
     * Gewichtseinheit, unit weight
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
     * technical clarification
     * 
     * Vorbehaltlich der technischen Klärung:
     * Yes = Ja
     * No =Nein (kein Vorbehalt)
     * Leer = kein Vorbehalt
     * 
     * @return
     *     possible object is
     *     {@link TgYesNo }
     *     
     */
    public TgYesNo getTechnClarification() {
        return technClarification;
    }

    /**
     * Legt den Wert der technClarification-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgYesNo }
     *     
     * @see #getTechnClarification()
     */
    public void setTechnClarification(TgYesNo value) {
        this.technClarification = value;
    }

    /**
     * Positionsnummer in der Bestellung
     * Im Kontext des Lieferscheins und der Rechnung Pflicht
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderPosNo() {
        return orderPosNo;
    }

    /**
     * Legt den Wert der orderPosNo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOrderPosNo()
     */
    public void setOrderPosNo(String value) {
        this.orderPosNo = value;
    }

    /**
     * Ursprungsland
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    /**
     * Legt den Wert der countryOfOrigin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCountryOfOrigin()
     */
    public void setCountryOfOrigin(String value) {
        this.countryOfOrigin = value;
    }

    /**
     * Position ist Skontofähig. Mögliche 'Yes' für Skontofähig   'No' für nicht Skontofähig
     * 
     * Nur im Kontext der Rechnung möglich und dort Pflicht
     * 
     * @return
     *     possible object is
     *     {@link TgYesNo }
     *     
     */
    public TgYesNo getDiscountable() {
        return discountable;
    }

    /**
     * Legt den Wert der discountable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgYesNo }
     *     
     * @see #getDiscountable()
     */
    public void setDiscountable(TgYesNo value) {
        this.discountable = value;
    }

    /**
     * Rohstoffanteile
     * 
     * Gets the value of the metalResources property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metalResources property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getMetalResources().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TgMetalResources }
     * </p>
     * 
     * 
     * @return
     *     The value of the metalResources property.
     */
    public List<TgMetalResources> getMetalResources() {
        if (metalResources == null) {
            metalResources = new ArrayList<>();
        }
        return this.metalResources;
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
     * {@link TgCtlgAssign }
     * </p>
     * 
     * 
     * @return
     *     The value of the ctlgAssign property.
     */
    public List<TgCtlgAssign> getCtlgAssign() {
        if (ctlgAssign == null) {
            ctlgAssign = new ArrayList<>();
        }
        return this.ctlgAssign;
    }

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

}
