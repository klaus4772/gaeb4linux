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
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Zuschlagsposition
 * 
 * <p>Java-Klasse für tgMarkupItem complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgMarkupItem">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <sequence minOccurs="0">
 *           <element name="ALNGroupNo" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgALNGroupNo"/>
 *           <element name="ALNSerNo" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgALNSerNo"/>
 *           <element name="Accepted" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgAccepted" minOccurs="0"/>
 *         </sequence>
 *         <element name="Provis" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgProvis" minOccurs="0"/>
 *         <element name="ProvisAccpt" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgYesNo" minOccurs="0"/>
 *         <element name="NotAppl" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNotAppl" minOccurs="0"/>
 *         <element name="HourIt" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgHourIt" minOccurs="0"/>
 *         <element name="KeyIt" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgKeyIt" minOccurs="0"/>
 *         <sequence minOccurs="0">
 *           <element name="CONo" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgCONo"/>
 *           <element name="COStatus" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgCOStatus"/>
 *         </sequence>
 *         <element name="RefDescr" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgRefDescr" minOccurs="0"/>
 *         <choice minOccurs="0">
 *           <element name="RefRNo" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgRefItem"/>
 *           <element name="RefPerfNo" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgRefItem"/>
 *         </choice>
 *         <element name="MarkupType" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgMarkupType" minOccurs="0"/>
 *         <element name="MarkupSubQty" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgMarkupSubQty" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ITMarkup" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDecimal_13_2" minOccurs="0"/>
 *         <element name="Markup" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDecimal_9_6" minOccurs="0"/>
 *         <element name="DiscountPcnt" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDecimal_9_6" minOccurs="0"/>
 *         <element name="IT" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDecimal_13_2" minOccurs="0"/>
 *         <element name="Description" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDescription" minOccurs="0"/>
 *         <element name="CtlgAssign" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgCtlgAssign" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AlterBidStatus" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgAlterBidStatus" minOccurs="0"/>
 *         <element name="CheckNote" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgCheckNote" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       <attribute name="RNoPart" use="required" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgRNoPart" />
 *       <attribute name="RNoIndex" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgRNoIndex" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "alnGroupNo",
    "alnSerNo",
    "accepted",
    "provis",
    "provisAccpt",
    "notAppl",
    "hourIt",
    "keyIt",
    "coNo",
    "coStatus",
    "refDescr",
    "refRNo",
    "refPerfNo",
    "markupType",
    "markupSubQty",
    "itMarkup",
    "markup",
    "discountPcnt",
    "it",
    "description",
    "ctlgAssign",
    "alterBidStatus",
    "checkNote"
})
@XmlSeeAlso({
    TgMarkupItem2 .class
})
public class OriginalTgMarkupItem {

    /**
     * Gruppennummer der Zuordnungszahl zur Kennzeichnung zusammengehoerender Grund- und alternativer Ausfuehrungen.
     * 
     */
    @XmlElement(name = "ALNGroupNo")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected Integer alnGroupNo;
    /**
     * Laufende Nummer der Zuordnungszahl
     * 
     */
    @XmlElement(name = "ALNSerNo")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected Integer alnSerNo;
    /**
     * Beauftragt
     * 
     */
    @XmlElement(name = "Accepted")
    @XmlSchemaType(name = "normalizedString")
    protected TgAccepted2 accepted;
    /**
     * Bedarfsposition
     * 
     */
    @XmlElement(name = "Provis")
    @XmlSchemaType(name = "normalizedString")
    protected TgProvis2 provis;
    /**
     * Kennzeichen Bedarfsposition beauftragt
     * 
     */
    @XmlElement(name = "ProvisAccpt")
    @XmlSchemaType(name = "normalizedString")
    protected TgYesNo2 provisAccpt;
    /**
     * Kennzeichen 
     * Position entfaellt
     * 
     */
    @XmlElement(name = "NotAppl")
    @XmlSchemaType(name = "normalizedString")
    protected TgYesNo2 notAppl;
    /**
     * Kennzeichen Stundenlohnarbeiten
     * 
     */
    @XmlElement(name = "HourIt")
    @XmlSchemaType(name = "normalizedString")
    protected TgYesNo2 hourIt;
    /**
     * Kennzeichen Schwerpunktposition
     * 
     */
    @XmlElement(name = "KeyIt")
    @XmlSchemaType(name = "normalizedString")
    protected TgYesNo2 keyIt;
    /**
     * Nachtragsnummer
     * 
     */
    @XmlElement(name = "CONo")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected Integer coNo;
    /**
     * Status des Nachtrags
     * 
     */
    @XmlElement(name = "COStatus")
    @XmlSchemaType(name = "normalizedString")
    protected TgCOStatus2 coStatus;
    /**
     * Kennzeichen Bezugs-/ Wiederholungsbeschreibung
     * 
     */
    @XmlElement(name = "RefDescr")
    @XmlSchemaType(name = "normalizedString")
    protected TgRefDescr2 refDescr;
    /**
     * Verweis auf Bezugsposition
     * 
     */
    @XmlElement(name = "RefRNo")
    protected TgRefItem2 refRNo;
    /**
     * Verweis auf Ausfuehrungsbeschreibung
     * 
     */
    @XmlElement(name = "RefPerfNo")
    protected TgRefItem2 refPerfNo;
    /**
     * Zuschlagsart
     * 
     */
    @XmlElement(name = "MarkupType")
    @XmlSchemaType(name = "normalizedString")
    protected TgMarkupType2 markupType;
    /**
     * Zu bezuschlagende Teilmengen
     * 
     */
    @XmlElement(name = "MarkupSubQty")
    protected List<TgMarkupSubQty2> markupSubQty;
    /**
     * Summe der Gesamtbetraege der zu bezuschlagenden Positionen
     * 
     */
    @XmlElement(name = "ITMarkup")
    protected BigDecimal itMarkup;
    /**
     * Zuschlagsprozentsatz
     * 
     */
    @XmlElement(name = "Markup")
    protected BigDecimal markup;
    /**
     * Prozentualer Nachlass
     * 
     */
    @XmlElement(name = "DiscountPcnt")
    protected BigDecimal discountPcnt;
    /**
     * Gesamtbetrag incl. Nachlass
     * 
     */
    @XmlElement(name = "IT")
    protected BigDecimal it;
    /**
     * Textorganisation
     * 
     */
    @XmlElement(name = "Description")
    protected TgDescription2 description;
    /**
     * Katalogzuordnung
     * 
     */
    @XmlElement(name = "CtlgAssign")
    protected List<TgCtlgAssign2> ctlgAssign;
    /**
     * NebenangebotStatus; Bei new und modified werden die kompletten Positionen übertragen. Bei N/A wird nur die TeilOZ und dieses Kennzeichen übertragen.
     * 
     */
    @XmlElement(name = "AlterBidStatus")
    @XmlSchemaType(name = "normalizedString")
    protected TgAlterBidStatus2 alterBidStatus;
    /**
     * Prüfvermerk
     * 
     */
    @XmlElement(name = "CheckNote")
    protected List<TgCheckNote2> checkNote;
    @XmlAttribute(name = "ID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    /**
     * Teil-OZ
     * 
     */
    @XmlAttribute(name = "RNoPart", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String rNoPart;
    @XmlAttribute(name = "RNoIndex")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String rNoIndex;

    /**
     * Gruppennummer der Zuordnungszahl zur Kennzeichnung zusammengehoerender Grund- und alternativer Ausfuehrungen.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getALNGroupNo() {
        return alnGroupNo;
    }

    /**
     * Legt den Wert der alnGroupNo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getALNGroupNo()
     */
    public void setALNGroupNo(Integer value) {
        this.alnGroupNo = value;
    }

    /**
     * Laufende Nummer der Zuordnungszahl
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getALNSerNo() {
        return alnSerNo;
    }

    /**
     * Legt den Wert der alnSerNo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getALNSerNo()
     */
    public void setALNSerNo(Integer value) {
        this.alnSerNo = value;
    }

    /**
     * Beauftragt
     * 
     * @return
     *     possible object is
     *     {@link TgAccepted2 }
     *     
     */
    public TgAccepted2 getAccepted() {
        return accepted;
    }

    /**
     * Legt den Wert der accepted-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgAccepted2 }
     *     
     * @see #getAccepted()
     */
    public void setAccepted(TgAccepted2 value) {
        this.accepted = value;
    }

    /**
     * Bedarfsposition
     * 
     * @return
     *     possible object is
     *     {@link TgProvis2 }
     *     
     */
    public TgProvis2 getProvis() {
        return provis;
    }

    /**
     * Legt den Wert der provis-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgProvis2 }
     *     
     * @see #getProvis()
     */
    public void setProvis(TgProvis2 value) {
        this.provis = value;
    }

    /**
     * Kennzeichen Bedarfsposition beauftragt
     * 
     * @return
     *     possible object is
     *     {@link TgYesNo2 }
     *     
     */
    public TgYesNo2 getProvisAccpt() {
        return provisAccpt;
    }

    /**
     * Legt den Wert der provisAccpt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgYesNo2 }
     *     
     * @see #getProvisAccpt()
     */
    public void setProvisAccpt(TgYesNo2 value) {
        this.provisAccpt = value;
    }

    /**
     * Kennzeichen 
     * Position entfaellt
     * 
     * @return
     *     possible object is
     *     {@link TgYesNo2 }
     *     
     */
    public TgYesNo2 getNotAppl() {
        return notAppl;
    }

    /**
     * Legt den Wert der notAppl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgYesNo2 }
     *     
     * @see #getNotAppl()
     */
    public void setNotAppl(TgYesNo2 value) {
        this.notAppl = value;
    }

    /**
     * Kennzeichen Stundenlohnarbeiten
     * 
     * @return
     *     possible object is
     *     {@link TgYesNo2 }
     *     
     */
    public TgYesNo2 getHourIt() {
        return hourIt;
    }

    /**
     * Legt den Wert der hourIt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgYesNo2 }
     *     
     * @see #getHourIt()
     */
    public void setHourIt(TgYesNo2 value) {
        this.hourIt = value;
    }

    /**
     * Kennzeichen Schwerpunktposition
     * 
     * @return
     *     possible object is
     *     {@link TgYesNo2 }
     *     
     */
    public TgYesNo2 getKeyIt() {
        return keyIt;
    }

    /**
     * Legt den Wert der keyIt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgYesNo2 }
     *     
     * @see #getKeyIt()
     */
    public void setKeyIt(TgYesNo2 value) {
        this.keyIt = value;
    }

    /**
     * Nachtragsnummer
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCONo() {
        return coNo;
    }

    /**
     * Legt den Wert der coNo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getCONo()
     */
    public void setCONo(Integer value) {
        this.coNo = value;
    }

    /**
     * Status des Nachtrags
     * 
     * @return
     *     possible object is
     *     {@link TgCOStatus2 }
     *     
     */
    public TgCOStatus2 getCOStatus() {
        return coStatus;
    }

    /**
     * Legt den Wert der coStatus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgCOStatus2 }
     *     
     * @see #getCOStatus()
     */
    public void setCOStatus(TgCOStatus2 value) {
        this.coStatus = value;
    }

    /**
     * Kennzeichen Bezugs-/ Wiederholungsbeschreibung
     * 
     * @return
     *     possible object is
     *     {@link TgRefDescr2 }
     *     
     */
    public TgRefDescr2 getRefDescr() {
        return refDescr;
    }

    /**
     * Legt den Wert der refDescr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgRefDescr2 }
     *     
     * @see #getRefDescr()
     */
    public void setRefDescr(TgRefDescr2 value) {
        this.refDescr = value;
    }

    /**
     * Verweis auf Bezugsposition
     * 
     * @return
     *     possible object is
     *     {@link TgRefItem2 }
     *     
     */
    public TgRefItem2 getRefRNo() {
        return refRNo;
    }

    /**
     * Legt den Wert der refRNo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgRefItem2 }
     *     
     * @see #getRefRNo()
     */
    public void setRefRNo(TgRefItem2 value) {
        this.refRNo = value;
    }

    /**
     * Verweis auf Ausfuehrungsbeschreibung
     * 
     * @return
     *     possible object is
     *     {@link TgRefItem2 }
     *     
     */
    public TgRefItem2 getRefPerfNo() {
        return refPerfNo;
    }

    /**
     * Legt den Wert der refPerfNo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgRefItem2 }
     *     
     * @see #getRefPerfNo()
     */
    public void setRefPerfNo(TgRefItem2 value) {
        this.refPerfNo = value;
    }

    /**
     * Zuschlagsart
     * 
     * @return
     *     possible object is
     *     {@link TgMarkupType2 }
     *     
     */
    public TgMarkupType2 getMarkupType() {
        return markupType;
    }

    /**
     * Legt den Wert der markupType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgMarkupType2 }
     *     
     * @see #getMarkupType()
     */
    public void setMarkupType(TgMarkupType2 value) {
        this.markupType = value;
    }

    /**
     * Zu bezuschlagende Teilmengen
     * 
     * Gets the value of the markupSubQty property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the markupSubQty property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getMarkupSubQty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TgMarkupSubQty2 }
     * </p>
     * 
     * 
     * @return
     *     The value of the markupSubQty property.
     */
    public List<TgMarkupSubQty2> getMarkupSubQty() {
        if (markupSubQty == null) {
            markupSubQty = new ArrayList<>();
        }
        return this.markupSubQty;
    }

    /**
     * Summe der Gesamtbetraege der zu bezuschlagenden Positionen
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getITMarkup() {
        return itMarkup;
    }

    /**
     * Legt den Wert der itMarkup-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getITMarkup()
     */
    public void setITMarkup(BigDecimal value) {
        this.itMarkup = value;
    }

    /**
     * Zuschlagsprozentsatz
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMarkup() {
        return markup;
    }

    /**
     * Legt den Wert der markup-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getMarkup()
     */
    public void setMarkup(BigDecimal value) {
        this.markup = value;
    }

    /**
     * Prozentualer Nachlass
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountPcnt() {
        return discountPcnt;
    }

    /**
     * Legt den Wert der discountPcnt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getDiscountPcnt()
     */
    public void setDiscountPcnt(BigDecimal value) {
        this.discountPcnt = value;
    }

    /**
     * Gesamtbetrag incl. Nachlass
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIT() {
        return it;
    }

    /**
     * Legt den Wert der it-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getIT()
     */
    public void setIT(BigDecimal value) {
        this.it = value;
    }

    /**
     * Textorganisation
     * 
     * @return
     *     possible object is
     *     {@link TgDescription2 }
     *     
     */
    public TgDescription2 getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgDescription2 }
     *     
     * @see #getDescription()
     */
    public void setDescription(TgDescription2 value) {
        this.description = value;
    }

    /**
     * Katalogzuordnung
     * 
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

    /**
     * NebenangebotStatus; Bei new und modified werden die kompletten Positionen übertragen. Bei N/A wird nur die TeilOZ und dieses Kennzeichen übertragen.
     * 
     * @return
     *     possible object is
     *     {@link TgAlterBidStatus2 }
     *     
     */
    public TgAlterBidStatus2 getAlterBidStatus() {
        return alterBidStatus;
    }

    /**
     * Legt den Wert der alterBidStatus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgAlterBidStatus2 }
     *     
     * @see #getAlterBidStatus()
     */
    public void setAlterBidStatus(TgAlterBidStatus2 value) {
        this.alterBidStatus = value;
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
     * {@link TgCheckNote2 }
     * </p>
     * 
     * 
     * @return
     *     The value of the checkNote property.
     */
    public List<TgCheckNote2> getCheckNote() {
        if (checkNote == null) {
            checkNote = new ArrayList<>();
        }
        return this.checkNote;
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

    /**
     * Teil-OZ
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRNoPart() {
        return rNoPart;
    }

    /**
     * Legt den Wert der rNoPart-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRNoPart()
     */
    public void setRNoPart(String value) {
        this.rNoPart = value;
    }

    /**
     * Ruft den Wert der rNoIndex-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRNoIndex() {
        return rNoIndex;
    }

    /**
     * Legt den Wert der rNoIndex-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRNoIndex(String value) {
        this.rNoIndex = value;
    }

}
