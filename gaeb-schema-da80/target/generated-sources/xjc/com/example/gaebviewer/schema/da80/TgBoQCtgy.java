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
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * LV-Bereich
 * 
 * <p>Java-Klasse für tgBoQCtgy complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgBoQCtgy">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="LblTx" type="{}tgMLText" minOccurs="0"/>
 *         <element name="CPVCode" type="{}tgCPVCode" maxOccurs="unbounded" minOccurs="0"/>
 *         <sequence minOccurs="0">
 *           <element name="CONo" type="{}tgCONo"/>
 *           <element name="COStatus" type="{}tgCOStatus"/>
 *         </sequence>
 *         <sequence minOccurs="0">
 *           <element name="ALNBGroupNo" type="{}tgALNGroupNo"/>
 *           <element name="ALNBSerNo" type="{}tgALNSerNo"/>
 *           <element name="Accepted" type="{}tgAccepted" minOccurs="0"/>
 *         </sequence>
 *         <element name="NotApplBoQ" type="{}tgNotAppl" minOccurs="0"/>
 *         <element name="CtlgAssign" type="{}tgCtlgAssign" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="BoQBody" type="{}tgBoQBody" minOccurs="0"/>
 *         <element name="Totals" type="{}tgTotals" minOccurs="0"/>
 *         <element name="AlterBidStatus" type="{}tgAlterBidStatus" minOccurs="0"/>
 *         <choice minOccurs="0">
 *           <element name="BidUpDownReq" type="{}tgYesNo"/>
 *           <element name="BidUpDownPct" type="{}tgBidUpDownPct"/>
 *         </choice>
 *       </sequence>
 *       <attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       <attribute name="RNoPart" use="required" type="{}tgRNoPart" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgBoQCtgy", namespace = "", propOrder = {
    "lblTx",
    "cpvCode",
    "coNo",
    "coStatus",
    "alnbGroupNo",
    "alnbSerNo",
    "accepted",
    "notApplBoQ",
    "ctlgAssign",
    "boQBody",
    "totals",
    "alterBidStatus",
    "bidUpDownReq",
    "bidUpDownPct"
})
public class TgBoQCtgy {

    /**
     * Bezeichnung des LV-Bereichs
     * 
     */
    @XmlElement(name = "LblTx")
    protected TgMLText lblTx;
    /**
     * CPV-Nomenklatur
     * 
     */
    @XmlElement(name = "CPVCode")
    protected List<TgCPVCode> cpvCode;
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
    protected TgCOStatus coStatus;
    /**
     * Gruppennummer der Zuordnungszahl zur Kennzeichnung zusammengehoerender Grund- und alternativer Ausfuehrungen
     * 
     */
    @XmlElement(name = "ALNBGroupNo")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected Integer alnbGroupNo;
    /**
     * Laufende Nummer der Zuordnungszahl
     * 
     */
    @XmlElement(name = "ALNBSerNo")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected Integer alnbSerNo;
    /**
     * Beauftragt
     * 
     */
    @XmlElement(name = "Accepted")
    @XmlSchemaType(name = "normalizedString")
    protected TgAccepted accepted;
    /**
     * LV-Bereich entfaellt
     * 
     */
    @XmlElement(name = "NotApplBoQ")
    @XmlSchemaType(name = "normalizedString")
    protected TgYesNo notApplBoQ;
    /**
     * Katalogzuordnung
     * 
     */
    @XmlElement(name = "CtlgAssign")
    protected List<TgCtlgAssign> ctlgAssign;
    /**
     * LV-Hauptteil
     * 
     */
    @XmlElement(name = "BoQBody")
    protected TgBoQBody boQBody;
    /**
     * LV-Bereich-Summen
     * 
     */
    @XmlElement(name = "Totals")
    protected TgTotals totals;
    /**
     * NebenangebotStatus; Bei new und modified werden die kompletten Positionen übertragen. Bei N/A wird nur die TeilOZ und dieses Kennzeichen übertragen.
     * 
     */
    @XmlElement(name = "AlterBidStatus")
    @XmlSchemaType(name = "normalizedString")
    protected TgAlterBidStatus alterBidStatus;
    /**
     * Anfoderung Auf-/Abgebot
     * 
     */
    @XmlElement(name = "BidUpDownReq")
    @XmlSchemaType(name = "normalizedString")
    protected TgYesNo bidUpDownReq;
    /**
     * Auf- oder Abgebot (in %)
     * 
     */
    @XmlElement(name = "BidUpDownPct")
    protected BigDecimal bidUpDownPct;
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

    /**
     * Bezeichnung des LV-Bereichs
     * 
     * @return
     *     possible object is
     *     {@link TgMLText }
     *     
     */
    public TgMLText getLblTx() {
        return lblTx;
    }

    /**
     * Legt den Wert der lblTx-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgMLText }
     *     
     * @see #getLblTx()
     */
    public void setLblTx(TgMLText value) {
        this.lblTx = value;
    }

    /**
     * CPV-Nomenklatur
     * 
     * Gets the value of the cpvCode property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cpvCode property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCPVCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TgCPVCode }
     * </p>
     * 
     * 
     * @return
     *     The value of the cpvCode property.
     */
    public List<TgCPVCode> getCPVCode() {
        if (cpvCode == null) {
            cpvCode = new ArrayList<>();
        }
        return this.cpvCode;
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
     *     {@link TgCOStatus }
     *     
     */
    public TgCOStatus getCOStatus() {
        return coStatus;
    }

    /**
     * Legt den Wert der coStatus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgCOStatus }
     *     
     * @see #getCOStatus()
     */
    public void setCOStatus(TgCOStatus value) {
        this.coStatus = value;
    }

    /**
     * Gruppennummer der Zuordnungszahl zur Kennzeichnung zusammengehoerender Grund- und alternativer Ausfuehrungen
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getALNBGroupNo() {
        return alnbGroupNo;
    }

    /**
     * Legt den Wert der alnbGroupNo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getALNBGroupNo()
     */
    public void setALNBGroupNo(Integer value) {
        this.alnbGroupNo = value;
    }

    /**
     * Laufende Nummer der Zuordnungszahl
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getALNBSerNo() {
        return alnbSerNo;
    }

    /**
     * Legt den Wert der alnbSerNo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getALNBSerNo()
     */
    public void setALNBSerNo(Integer value) {
        this.alnbSerNo = value;
    }

    /**
     * Beauftragt
     * 
     * @return
     *     possible object is
     *     {@link TgAccepted }
     *     
     */
    public TgAccepted getAccepted() {
        return accepted;
    }

    /**
     * Legt den Wert der accepted-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgAccepted }
     *     
     * @see #getAccepted()
     */
    public void setAccepted(TgAccepted value) {
        this.accepted = value;
    }

    /**
     * LV-Bereich entfaellt
     * 
     * @return
     *     possible object is
     *     {@link TgYesNo }
     *     
     */
    public TgYesNo getNotApplBoQ() {
        return notApplBoQ;
    }

    /**
     * Legt den Wert der notApplBoQ-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgYesNo }
     *     
     * @see #getNotApplBoQ()
     */
    public void setNotApplBoQ(TgYesNo value) {
        this.notApplBoQ = value;
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
     * LV-Hauptteil
     * 
     * @return
     *     possible object is
     *     {@link TgBoQBody }
     *     
     */
    public TgBoQBody getBoQBody() {
        return boQBody;
    }

    /**
     * Legt den Wert der boQBody-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgBoQBody }
     *     
     * @see #getBoQBody()
     */
    public void setBoQBody(TgBoQBody value) {
        this.boQBody = value;
    }

    /**
     * LV-Bereich-Summen
     * 
     * @return
     *     possible object is
     *     {@link TgTotals }
     *     
     */
    public TgTotals getTotals() {
        return totals;
    }

    /**
     * Legt den Wert der totals-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgTotals }
     *     
     * @see #getTotals()
     */
    public void setTotals(TgTotals value) {
        this.totals = value;
    }

    /**
     * NebenangebotStatus; Bei new und modified werden die kompletten Positionen übertragen. Bei N/A wird nur die TeilOZ und dieses Kennzeichen übertragen.
     * 
     * @return
     *     possible object is
     *     {@link TgAlterBidStatus }
     *     
     */
    public TgAlterBidStatus getAlterBidStatus() {
        return alterBidStatus;
    }

    /**
     * Legt den Wert der alterBidStatus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgAlterBidStatus }
     *     
     * @see #getAlterBidStatus()
     */
    public void setAlterBidStatus(TgAlterBidStatus value) {
        this.alterBidStatus = value;
    }

    /**
     * Anfoderung Auf-/Abgebot
     * 
     * @return
     *     possible object is
     *     {@link TgYesNo }
     *     
     */
    public TgYesNo getBidUpDownReq() {
        return bidUpDownReq;
    }

    /**
     * Legt den Wert der bidUpDownReq-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgYesNo }
     *     
     * @see #getBidUpDownReq()
     */
    public void setBidUpDownReq(TgYesNo value) {
        this.bidUpDownReq = value;
    }

    /**
     * Auf- oder Abgebot (in %)
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBidUpDownPct() {
        return bidUpDownPct;
    }

    /**
     * Legt den Wert der bidUpDownPct-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getBidUpDownPct()
     */
    public void setBidUpDownPct(BigDecimal value) {
        this.bidUpDownPct = value;
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

}
