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
 * Nur bei Rahmenvertrag: Informationen zum Rahmenvertrag
 * 
 * <p>Java-Klasse für tgMastAgrInfo complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgMastAgrInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BidUpDown" type="{}tgYes" minOccurs="0"/>
 *         <element name="MastAgrLbl" type="{}tgMLText" minOccurs="0"/>
 *         <element name="MastAgrNo" type="{}tgNormalizedString60" minOccurs="0"/>
 *         <element name="Descrip" type="{}tgFText" minOccurs="0"/>
 *         <element name="MastAgrBeg" type="{}tgDate" minOccurs="0"/>
 *         <choice minOccurs="0">
 *           <element name="MastAgrDur">
 *             <simpleType>
 *               <restriction base="{}tgPositiveInteger">
 *                 <maxInclusive value="99"/>
 *               </restriction>
 *             </simpleType>
 *           </element>
 *           <element name="MastAgrEnd" type="{}tgDate"/>
 *         </choice>
 *         <element name="MastAgrDate" type="{}tgDate" minOccurs="0"/>
 *         <element name="MastAgrVers" type="{}tgNormalizedString20" minOccurs="0"/>
 *         <element name="TotContrVal" type="{}tgDecimal_13_2" minOccurs="0"/>
 *         <element name="MinContrVal" type="{}tgDecimal_13_2" minOccurs="0"/>
 *         <element name="MinContrAwd" type="{}tgDecimal_5_2" minOccurs="0"/>
 *         <element name="MaxContrVal" type="{}tgDecimal_13_2" minOccurs="0"/>
 *         <element name="ContrValCode" type="{}tgContrValCode" minOccurs="0"/>
 *         <element name="AwardAgencyAdr" type="{}tgAddress" minOccurs="0"/>
 *         <element name="CostResponsible" type="{}tgMLText" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgMastAgrInfo", namespace = "", propOrder = {
    "bidUpDown",
    "mastAgrLbl",
    "mastAgrNo",
    "descrip",
    "mastAgrBeg",
    "mastAgrDur",
    "mastAgrEnd",
    "mastAgrDate",
    "mastAgrVers",
    "totContrVal",
    "minContrVal",
    "minContrAwd",
    "maxContrVal",
    "contrValCode",
    "awardAgencyAdr",
    "costResponsible"
})
public class TgMastAgrInfo {

    /**
     * Auf- und Abgebotsverfahren
     * 
     */
    @XmlElement(name = "BidUpDown")
    @XmlSchemaType(name = "normalizedString")
    protected TgYes bidUpDown;
    /**
     * Bezeichnung der Bauleistung (Bereich, in welchem die ZV-Arbeiten anfallen)
     * 
     */
    @XmlElement(name = "MastAgrLbl")
    protected TgMLText mastAgrLbl;
    /**
     * Maßnahmennummer
     * 
     */
    @XmlElement(name = "MastAgrNo")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String mastAgrNo;
    /**
     * Bezeichnung der Leistungsbereiche (n-fach) und Geschätzter Jahreswert getrennt nach Leistungsbereichen
     * 
     */
    @XmlElement(name = "Descrip")
    protected TgFText descrip;
    /**
     * Rahmenvertragsbeginn
     * 
     */
    @XmlElement(name = "MastAgrBeg")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar mastAgrBeg;
    /**
     * Rahmenvertragsdauer in Monaten
     * 
     */
    @XmlElement(name = "MastAgrDur")
    protected Integer mastAgrDur;
    /**
     * Datum Vertragsende
     * 
     */
    @XmlElement(name = "MastAgrEnd")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar mastAgrEnd;
    /**
     * Datum Vertragsabschluss
     * 
     */
    @XmlElement(name = "MastAgrDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar mastAgrDate;
    /**
     * Vertragsversion
     * 
     */
    @XmlElement(name = "MastAgrVers")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String mastAgrVers;
    /**
     * AuftragsGesamtWert
     * 
     */
    @XmlElement(name = "TotContrVal")
    protected BigDecimal totContrVal;
    /**
     * AuftragsMinWert (Wertgrenze fuer Kleinstauftraege)
     * 
     */
    @XmlElement(name = "MinContrVal")
    protected BigDecimal minContrVal;
    /**
     * AuftragsMinZuschlag (fuer Kleinstauftraege)
     * 
     */
    @XmlElement(name = "MinContrAwd")
    protected BigDecimal minContrAwd;
    /**
     * AuftragsMaxWert
     * 
     */
    @XmlElement(name = "MaxContrVal")
    protected BigDecimal maxContrVal;
    /**
     * AuftragsWertSchluessel
     * 
     */
    @XmlElement(name = "ContrValCode")
    protected TgContrValCode contrValCode;
    /**
     * Adresse der Vergabestelle
     * 
     */
    @XmlElement(name = "AwardAgencyAdr")
    protected TgAddress awardAgencyAdr;
    /**
     * Bedarfsträger
     * 
     */
    @XmlElement(name = "CostResponsible")
    protected TgMLText costResponsible;

    /**
     * Auf- und Abgebotsverfahren
     * 
     * @return
     *     possible object is
     *     {@link TgYes }
     *     
     */
    public TgYes getBidUpDown() {
        return bidUpDown;
    }

    /**
     * Legt den Wert der bidUpDown-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgYes }
     *     
     * @see #getBidUpDown()
     */
    public void setBidUpDown(TgYes value) {
        this.bidUpDown = value;
    }

    /**
     * Bezeichnung der Bauleistung (Bereich, in welchem die ZV-Arbeiten anfallen)
     * 
     * @return
     *     possible object is
     *     {@link TgMLText }
     *     
     */
    public TgMLText getMastAgrLbl() {
        return mastAgrLbl;
    }

    /**
     * Legt den Wert der mastAgrLbl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgMLText }
     *     
     * @see #getMastAgrLbl()
     */
    public void setMastAgrLbl(TgMLText value) {
        this.mastAgrLbl = value;
    }

    /**
     * Maßnahmennummer
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMastAgrNo() {
        return mastAgrNo;
    }

    /**
     * Legt den Wert der mastAgrNo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMastAgrNo()
     */
    public void setMastAgrNo(String value) {
        this.mastAgrNo = value;
    }

    /**
     * Bezeichnung der Leistungsbereiche (n-fach) und Geschätzter Jahreswert getrennt nach Leistungsbereichen
     * 
     * @return
     *     possible object is
     *     {@link TgFText }
     *     
     */
    public TgFText getDescrip() {
        return descrip;
    }

    /**
     * Legt den Wert der descrip-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgFText }
     *     
     * @see #getDescrip()
     */
    public void setDescrip(TgFText value) {
        this.descrip = value;
    }

    /**
     * Rahmenvertragsbeginn
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMastAgrBeg() {
        return mastAgrBeg;
    }

    /**
     * Legt den Wert der mastAgrBeg-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getMastAgrBeg()
     */
    public void setMastAgrBeg(XMLGregorianCalendar value) {
        this.mastAgrBeg = value;
    }

    /**
     * Rahmenvertragsdauer in Monaten
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMastAgrDur() {
        return mastAgrDur;
    }

    /**
     * Legt den Wert der mastAgrDur-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getMastAgrDur()
     */
    public void setMastAgrDur(Integer value) {
        this.mastAgrDur = value;
    }

    /**
     * Datum Vertragsende
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMastAgrEnd() {
        return mastAgrEnd;
    }

    /**
     * Legt den Wert der mastAgrEnd-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getMastAgrEnd()
     */
    public void setMastAgrEnd(XMLGregorianCalendar value) {
        this.mastAgrEnd = value;
    }

    /**
     * Datum Vertragsabschluss
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMastAgrDate() {
        return mastAgrDate;
    }

    /**
     * Legt den Wert der mastAgrDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getMastAgrDate()
     */
    public void setMastAgrDate(XMLGregorianCalendar value) {
        this.mastAgrDate = value;
    }

    /**
     * Vertragsversion
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMastAgrVers() {
        return mastAgrVers;
    }

    /**
     * Legt den Wert der mastAgrVers-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMastAgrVers()
     */
    public void setMastAgrVers(String value) {
        this.mastAgrVers = value;
    }

    /**
     * AuftragsGesamtWert
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotContrVal() {
        return totContrVal;
    }

    /**
     * Legt den Wert der totContrVal-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getTotContrVal()
     */
    public void setTotContrVal(BigDecimal value) {
        this.totContrVal = value;
    }

    /**
     * AuftragsMinWert (Wertgrenze fuer Kleinstauftraege)
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinContrVal() {
        return minContrVal;
    }

    /**
     * Legt den Wert der minContrVal-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getMinContrVal()
     */
    public void setMinContrVal(BigDecimal value) {
        this.minContrVal = value;
    }

    /**
     * AuftragsMinZuschlag (fuer Kleinstauftraege)
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinContrAwd() {
        return minContrAwd;
    }

    /**
     * Legt den Wert der minContrAwd-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getMinContrAwd()
     */
    public void setMinContrAwd(BigDecimal value) {
        this.minContrAwd = value;
    }

    /**
     * AuftragsMaxWert
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxContrVal() {
        return maxContrVal;
    }

    /**
     * Legt den Wert der maxContrVal-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getMaxContrVal()
     */
    public void setMaxContrVal(BigDecimal value) {
        this.maxContrVal = value;
    }

    /**
     * AuftragsWertSchluessel
     * 
     * @return
     *     possible object is
     *     {@link TgContrValCode }
     *     
     */
    public TgContrValCode getContrValCode() {
        return contrValCode;
    }

    /**
     * Legt den Wert der contrValCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgContrValCode }
     *     
     * @see #getContrValCode()
     */
    public void setContrValCode(TgContrValCode value) {
        this.contrValCode = value;
    }

    /**
     * Adresse der Vergabestelle
     * 
     * @return
     *     possible object is
     *     {@link TgAddress }
     *     
     */
    public TgAddress getAwardAgencyAdr() {
        return awardAgencyAdr;
    }

    /**
     * Legt den Wert der awardAgencyAdr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgAddress }
     *     
     * @see #getAwardAgencyAdr()
     */
    public void setAwardAgencyAdr(TgAddress value) {
        this.awardAgencyAdr = value;
    }

    /**
     * Bedarfsträger
     * 
     * @return
     *     possible object is
     *     {@link TgMLText }
     *     
     */
    public TgMLText getCostResponsible() {
        return costResponsible;
    }

    /**
     * Legt den Wert der costResponsible-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgMLText }
     *     
     * @see #getCostResponsible()
     */
    public void setCostResponsible(TgMLText value) {
        this.costResponsible = value;
    }

}
