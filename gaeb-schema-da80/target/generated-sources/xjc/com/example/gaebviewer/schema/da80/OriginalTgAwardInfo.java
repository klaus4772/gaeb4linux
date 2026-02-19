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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Informationen zur Vergabe
 * 
 * <p>Java-Klasse für tgAwardInfo complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgAwardInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BoQID" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgGUID32" minOccurs="0"/>
 *         <element name="Cat" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgCat" minOccurs="0"/>
 *         <element name="SpecialType" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgSpecialType" minOccurs="0"/>
 *         <sequence minOccurs="0">
 *           <element name="Cur" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgCur"/>
 *           <element name="CurLbl" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgCurLbl" minOccurs="0"/>
 *         </sequence>
 *         <element name="BidDate" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDate" minOccurs="0"/>
 *         <sequence minOccurs="0">
 *           <element name="OpenDate" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDate"/>
 *           <element name="OpenTime" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgTime" minOccurs="0"/>
 *         </sequence>
 *         <element name="EvalEnd" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDate" minOccurs="0"/>
 *         <element name="SubmLoc" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString60" minOccurs="0"/>
 *         <element name="CnstStart" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDate" minOccurs="0"/>
 *         <element name="CnstEnd" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDate" minOccurs="0"/>
 *         <element name="ContrNo" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString20" minOccurs="0"/>
 *         <element name="ContrDate" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDate" minOccurs="0"/>
 *         <element name="AcceptType" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString60" minOccurs="0"/>
 *         <element name="AcceptDate" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDate" minOccurs="0"/>
 *         <element name="WarrDur" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgWarrDur" minOccurs="0"/>
 *         <element name="WarrUnit" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgWarrUnit" minOccurs="0"/>
 *         <element name="WarrEnd" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDate" minOccurs="0"/>
 *         <element name="PerformPcnt" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDecimal_9_6" minOccurs="0"/>
 *         <element name="WarrantPcnt" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDecimal_9_6" minOccurs="0"/>
 *         <element name="COInfo" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgCOInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="MaintInfo" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgMaintInfo" minOccurs="0"/>
 *         <element name="MastAgrInfo" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgMastAgrInfo" minOccurs="0"/>
 *         <element name="CashDiscount" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgCashDiscount" maxOccurs="3" minOccurs="0"/>
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
@XmlType(name = "", propOrder = {
    "boQID",
    "cat",
    "specialType",
    "cur",
    "curLbl",
    "bidDate",
    "openDate",
    "openTime",
    "evalEnd",
    "submLoc",
    "cnstStart",
    "cnstEnd",
    "contrNo",
    "contrDate",
    "acceptType",
    "acceptDate",
    "warrDur",
    "warrUnit",
    "warrEnd",
    "performPcnt",
    "warrantPcnt",
    "coInfo",
    "maintInfo",
    "mastAgrInfo",
    "cashDiscount",
    "ctlgAssign"
})
@XmlSeeAlso({
    TgAwardInfo2 .class
})
public class OriginalTgAwardInfo {

    /**
     * ID für das LV
     * 
     */
    @XmlElement(name = "BoQID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String boQID;
    /**
     * Vergabeverfahren
     * 
     */
    @XmlElement(name = "Cat")
    @XmlSchemaType(name = "normalizedString")
    protected TgCat2 cat;
    /**
     * Besondere Vergabeart
     * 
     */
    @XmlElement(name = "SpecialType")
    @XmlSchemaType(name = "normalizedString")
    protected TgSpecialType2 specialType;
    /**
     * Waehrung
     * 
     */
    @XmlElement(name = "Cur")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String cur;
    /**
     * Bezeichnung der Waehrung
     * 
     */
    @XmlElement(name = "CurLbl")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String curLbl;
    /**
     * Angebotsdatum
     * 
     */
    @XmlElement(name = "BidDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar bidDate;
    /**
     * Datum des Eroeffnungstermins
     * 
     */
    @XmlElement(name = "OpenDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar openDate;
    /**
     * Uhrzeit des Eroeffnungstermins
     * 
     */
    @XmlElement(name = "OpenTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar openTime;
    /**
     * Ende der Zuschlagsfrist
     * 
     */
    @XmlElement(name = "EvalEnd")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar evalEnd;
    /**
     * Ort der Abgabe
     * 
     */
    @XmlElement(name = "SubmLoc")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String submLoc;
    /**
     * Voraussichtlicher Beginn der Ausfuehrungszeit
     * 
     */
    @XmlElement(name = "CnstStart")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cnstStart;
    /**
     * Voraussichtliches Ende der Ausfuehrungszeit
     * 
     */
    @XmlElement(name = "CnstEnd")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cnstEnd;
    /**
     * Auftragsnummer
     * 
     */
    @XmlElement(name = "ContrNo")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String contrNo;
    /**
     * Auftragsdatum
     * 
     */
    @XmlElement(name = "ContrDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar contrDate;
    /**
     * Art der Abnahme
     * 
     */
    @XmlElement(name = "AcceptType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String acceptType;
    /**
     * Datum der Abnahme
     * 
     */
    @XmlElement(name = "AcceptDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar acceptDate;
    /**
     * Dauer der Gewaehrleistung
     * 
     */
    @XmlElement(name = "WarrDur")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected Integer warrDur;
    /**
     * Einheit der Gewaehrleistung
     * 
     */
    @XmlElement(name = "WarrUnit")
    @XmlSchemaType(name = "normalizedString")
    protected TgWarrUnit2 warrUnit;
    /**
     * Ende der Gewaehrleistung
     * 
     */
    @XmlElement(name = "WarrEnd")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar warrEnd;
    /**
     * Ausfuehrungsbuergschaft als Anteil der Auftragssumme einschl. Nachtraege in Prozent
     * 
     */
    @XmlElement(name = "PerformPcnt")
    protected BigDecimal performPcnt;
    /**
     * Gewaehrleistungsbuergschaft als Anteil der Abrechnungssumme in Pro-zent
     * 
     */
    @XmlElement(name = "WarrantPcnt")
    protected BigDecimal warrantPcnt;
    /**
     * Informationen zum Nachtrag
     * 
     */
    @XmlElement(name = "COInfo")
    protected List<TgCOInfo2> coInfo;
    /**
     * Nur bei Instandhaltung: Informationen zur Instandhaltung
     * 
     */
    @XmlElement(name = "MaintInfo")
    protected TgMaintInfo2 maintInfo;
    /**
     * Nur bei Rahmenvertrag: Informationen zum Rahmenvertrag
     * 
     */
    @XmlElement(name = "MastAgrInfo")
    protected TgMastAgrInfo2 mastAgrInfo;
    /**
     * Skonto
     * 
     */
    @XmlElement(name = "CashDiscount")
    protected List<TgCashDiscount2> cashDiscount;
    @XmlElement(name = "CtlgAssign")
    protected List<TgCtlgAssign2> ctlgAssign;

    /**
     * ID für das LV
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoQID() {
        return boQID;
    }

    /**
     * Legt den Wert der boQID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getBoQID()
     */
    public void setBoQID(String value) {
        this.boQID = value;
    }

    /**
     * Vergabeverfahren
     * 
     * @return
     *     possible object is
     *     {@link TgCat2 }
     *     
     */
    public TgCat2 getCat() {
        return cat;
    }

    /**
     * Legt den Wert der cat-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgCat2 }
     *     
     * @see #getCat()
     */
    public void setCat(TgCat2 value) {
        this.cat = value;
    }

    /**
     * Besondere Vergabeart
     * 
     * @return
     *     possible object is
     *     {@link TgSpecialType2 }
     *     
     */
    public TgSpecialType2 getSpecialType() {
        return specialType;
    }

    /**
     * Legt den Wert der specialType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgSpecialType2 }
     *     
     * @see #getSpecialType()
     */
    public void setSpecialType(TgSpecialType2 value) {
        this.specialType = value;
    }

    /**
     * Waehrung
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCur() {
        return cur;
    }

    /**
     * Legt den Wert der cur-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCur()
     */
    public void setCur(String value) {
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
     * Angebotsdatum
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBidDate() {
        return bidDate;
    }

    /**
     * Legt den Wert der bidDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getBidDate()
     */
    public void setBidDate(XMLGregorianCalendar value) {
        this.bidDate = value;
    }

    /**
     * Datum des Eroeffnungstermins
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOpenDate() {
        return openDate;
    }

    /**
     * Legt den Wert der openDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getOpenDate()
     */
    public void setOpenDate(XMLGregorianCalendar value) {
        this.openDate = value;
    }

    /**
     * Uhrzeit des Eroeffnungstermins
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOpenTime() {
        return openTime;
    }

    /**
     * Legt den Wert der openTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getOpenTime()
     */
    public void setOpenTime(XMLGregorianCalendar value) {
        this.openTime = value;
    }

    /**
     * Ende der Zuschlagsfrist
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEvalEnd() {
        return evalEnd;
    }

    /**
     * Legt den Wert der evalEnd-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getEvalEnd()
     */
    public void setEvalEnd(XMLGregorianCalendar value) {
        this.evalEnd = value;
    }

    /**
     * Ort der Abgabe
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmLoc() {
        return submLoc;
    }

    /**
     * Legt den Wert der submLoc-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSubmLoc()
     */
    public void setSubmLoc(String value) {
        this.submLoc = value;
    }

    /**
     * Voraussichtlicher Beginn der Ausfuehrungszeit
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCnstStart() {
        return cnstStart;
    }

    /**
     * Legt den Wert der cnstStart-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getCnstStart()
     */
    public void setCnstStart(XMLGregorianCalendar value) {
        this.cnstStart = value;
    }

    /**
     * Voraussichtliches Ende der Ausfuehrungszeit
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCnstEnd() {
        return cnstEnd;
    }

    /**
     * Legt den Wert der cnstEnd-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getCnstEnd()
     */
    public void setCnstEnd(XMLGregorianCalendar value) {
        this.cnstEnd = value;
    }

    /**
     * Auftragsnummer
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContrNo() {
        return contrNo;
    }

    /**
     * Legt den Wert der contrNo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getContrNo()
     */
    public void setContrNo(String value) {
        this.contrNo = value;
    }

    /**
     * Auftragsdatum
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getContrDate() {
        return contrDate;
    }

    /**
     * Legt den Wert der contrDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getContrDate()
     */
    public void setContrDate(XMLGregorianCalendar value) {
        this.contrDate = value;
    }

    /**
     * Art der Abnahme
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcceptType() {
        return acceptType;
    }

    /**
     * Legt den Wert der acceptType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAcceptType()
     */
    public void setAcceptType(String value) {
        this.acceptType = value;
    }

    /**
     * Datum der Abnahme
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAcceptDate() {
        return acceptDate;
    }

    /**
     * Legt den Wert der acceptDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getAcceptDate()
     */
    public void setAcceptDate(XMLGregorianCalendar value) {
        this.acceptDate = value;
    }

    /**
     * Dauer der Gewaehrleistung
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWarrDur() {
        return warrDur;
    }

    /**
     * Legt den Wert der warrDur-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getWarrDur()
     */
    public void setWarrDur(Integer value) {
        this.warrDur = value;
    }

    /**
     * Einheit der Gewaehrleistung
     * 
     * @return
     *     possible object is
     *     {@link TgWarrUnit2 }
     *     
     */
    public TgWarrUnit2 getWarrUnit() {
        return warrUnit;
    }

    /**
     * Legt den Wert der warrUnit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgWarrUnit2 }
     *     
     * @see #getWarrUnit()
     */
    public void setWarrUnit(TgWarrUnit2 value) {
        this.warrUnit = value;
    }

    /**
     * Ende der Gewaehrleistung
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWarrEnd() {
        return warrEnd;
    }

    /**
     * Legt den Wert der warrEnd-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getWarrEnd()
     */
    public void setWarrEnd(XMLGregorianCalendar value) {
        this.warrEnd = value;
    }

    /**
     * Ausfuehrungsbuergschaft als Anteil der Auftragssumme einschl. Nachtraege in Prozent
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPerformPcnt() {
        return performPcnt;
    }

    /**
     * Legt den Wert der performPcnt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getPerformPcnt()
     */
    public void setPerformPcnt(BigDecimal value) {
        this.performPcnt = value;
    }

    /**
     * Gewaehrleistungsbuergschaft als Anteil der Abrechnungssumme in Pro-zent
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWarrantPcnt() {
        return warrantPcnt;
    }

    /**
     * Legt den Wert der warrantPcnt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getWarrantPcnt()
     */
    public void setWarrantPcnt(BigDecimal value) {
        this.warrantPcnt = value;
    }

    /**
     * Informationen zum Nachtrag
     * 
     * Gets the value of the coInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCOInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TgCOInfo2 }
     * </p>
     * 
     * 
     * @return
     *     The value of the coInfo property.
     */
    public List<TgCOInfo2> getCOInfo() {
        if (coInfo == null) {
            coInfo = new ArrayList<>();
        }
        return this.coInfo;
    }

    /**
     * Nur bei Instandhaltung: Informationen zur Instandhaltung
     * 
     * @return
     *     possible object is
     *     {@link TgMaintInfo2 }
     *     
     */
    public TgMaintInfo2 getMaintInfo() {
        return maintInfo;
    }

    /**
     * Legt den Wert der maintInfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgMaintInfo2 }
     *     
     * @see #getMaintInfo()
     */
    public void setMaintInfo(TgMaintInfo2 value) {
        this.maintInfo = value;
    }

    /**
     * Nur bei Rahmenvertrag: Informationen zum Rahmenvertrag
     * 
     * @return
     *     possible object is
     *     {@link TgMastAgrInfo2 }
     *     
     */
    public TgMastAgrInfo2 getMastAgrInfo() {
        return mastAgrInfo;
    }

    /**
     * Legt den Wert der mastAgrInfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgMastAgrInfo2 }
     *     
     * @see #getMastAgrInfo()
     */
    public void setMastAgrInfo(TgMastAgrInfo2 value) {
        this.mastAgrInfo = value;
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
