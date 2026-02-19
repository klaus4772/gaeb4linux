//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v4.0.5 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
//


package com.example.gaebviewer.schema.da80;

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
 * Informationen zum LV
 * 
 * <p>Java-Klasse für tgBoQInfo complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgBoQInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Name" type="{}tgNormalizedString20" minOccurs="0"/>
 *         <element name="LblBoQ" type="{}tgNormalizedString60" minOccurs="0"/>
 *         <element name="CPVCode" type="{}tgCPVCode" maxOccurs="unbounded" minOccurs="0"/>
 *         <sequence minOccurs="0">
 *           <element name="CONo" type="{}tgCONo"/>
 *           <element name="COStatus" type="{}tgCOStatus"/>
 *         </sequence>
 *         <element name="Date" type="{}tgDate" minOccurs="0"/>
 *         <element name="OutlCompl" type="{}tgOutlCompl" minOccurs="0"/>
 *         <element name="BoQBkdn" type="{}tgBoQBkdn" maxOccurs="7"/>
 *         <sequence minOccurs="0">
 *           <element name="NoUPComps" type="{}tgNoUPComps"/>
 *           <element name="LblUPComp1" type="{}tgLblUpComp" minOccurs="0"/>
 *           <element name="LblUPComp2" type="{}tgLblUpComp" minOccurs="0"/>
 *           <element name="LblUPComp3" type="{}tgLblUpComp" minOccurs="0"/>
 *           <element name="LblUPComp4" type="{}tgLblUpComp" minOccurs="0"/>
 *           <element name="LblUPComp5" type="{}tgLblUpComp" minOccurs="0"/>
 *           <element name="LblUPComp6" type="{}tgLblUpComp" minOccurs="0"/>
 *         </sequence>
 *         <element name="LblTime" type="{}tgNormalizedString20" minOccurs="0"/>
 *         <element name="CtlgAssign" type="{}tgCtlgAssign" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Totals" type="{}tgTotals" minOccurs="0"/>
 *         <element name="Ctlg" type="{}tgCtlg" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CostType" type="{}tgCostType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="QtyDetermInfo" type="{}tgQtyDetermInfo" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgBoQInfo", namespace = "", propOrder = {
    "name",
    "lblBoQ",
    "cpvCode",
    "coNo",
    "coStatus",
    "date",
    "outlCompl",
    "boQBkdn",
    "noUPComps",
    "lblUPComp1",
    "lblUPComp2",
    "lblUPComp3",
    "lblUPComp4",
    "lblUPComp5",
    "lblUPComp6",
    "lblTime",
    "ctlgAssign",
    "totals",
    "ctlg",
    "costType",
    "qtyDetermInfo"
})
public class TgBoQInfo {

    /**
     * Name des Leistungsverzeichnisses (Lesbarer Identifikator)
     * 
     */
    @XmlElement(name = "Name")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String name;
    /**
     * Bezeichnung des Leistungsverzeichnisses
     * 
     */
    @XmlElement(name = "LblBoQ")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String lblBoQ;
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
     * Datum
     * 
     */
    @XmlElement(name = "Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    /**
     * Kurz- und Langtext
     * 
     */
    @XmlElement(name = "OutlCompl")
    @XmlSchemaType(name = "normalizedString")
    protected TgOutlCompl outlCompl;
    /**
     * Informationen zur Gliederung des LV
     * 
     */
    @XmlElement(name = "BoQBkdn", required = true)
    protected List<TgBoQBkdn> boQBkdn;
    /**
     * Anzahl der Einheitspreisanteile
     * 
     */
    @XmlElement(name = "NoUPComps")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String noUPComps;
    /**
     * Bezeichnung des 1. EP-Anteils
     * 
     */
    @XmlElement(name = "LblUPComp1")
    protected TgLblUpComp lblUPComp1;
    /**
     * Bezeichnung des 2. EP-Anteils
     * 
     */
    @XmlElement(name = "LblUPComp2")
    protected TgLblUpComp lblUPComp2;
    /**
     * Bezeichnung des 3. EP-Anteils
     * 
     */
    @XmlElement(name = "LblUPComp3")
    protected TgLblUpComp lblUPComp3;
    /**
     * Bezeichnung des 4. EP-Anteils
     * 
     */
    @XmlElement(name = "LblUPComp4")
    protected TgLblUpComp lblUPComp4;
    /**
     * Bezeichnung des 5. EP-Anteils
     * 
     */
    @XmlElement(name = "LblUPComp5")
    protected TgLblUpComp lblUPComp5;
    /**
     * Bezeichnung des 6. EP-Anteils
     * 
     */
    @XmlElement(name = "LblUPComp6")
    protected TgLblUpComp lblUPComp6;
    /**
     * Bezeichnung der Zeiteinheit
     * 
     */
    @XmlElement(name = "LblTime")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String lblTime;
    /**
     * Katalogzuordnung
     * 
     */
    @XmlElement(name = "CtlgAssign")
    protected List<TgCtlgAssign> ctlgAssign;
    /**
     * LV-Summen
     * 
     */
    @XmlElement(name = "Totals")
    protected TgTotals totals;
    /**
     * Katalog
     * 
     */
    @XmlElement(name = "Ctlg")
    protected List<TgCtlg> ctlg;
    /**
     * Kostenarten
     * 
     */
    @XmlElement(name = "CostType")
    protected List<TgCostType> costType;
    @XmlElement(name = "QtyDetermInfo")
    protected TgQtyDetermInfo qtyDetermInfo;

    /**
     * Name des Leistungsverzeichnisses (Lesbarer Identifikator)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getName()
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Bezeichnung des Leistungsverzeichnisses
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLblBoQ() {
        return lblBoQ;
    }

    /**
     * Legt den Wert der lblBoQ-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getLblBoQ()
     */
    public void setLblBoQ(String value) {
        this.lblBoQ = value;
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
     * Datum
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Legt den Wert der date-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getDate()
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Kurz- und Langtext
     * 
     * @return
     *     possible object is
     *     {@link TgOutlCompl }
     *     
     */
    public TgOutlCompl getOutlCompl() {
        return outlCompl;
    }

    /**
     * Legt den Wert der outlCompl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgOutlCompl }
     *     
     * @see #getOutlCompl()
     */
    public void setOutlCompl(TgOutlCompl value) {
        this.outlCompl = value;
    }

    /**
     * Informationen zur Gliederung des LV
     * 
     * Gets the value of the boQBkdn property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the boQBkdn property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getBoQBkdn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TgBoQBkdn }
     * </p>
     * 
     * 
     * @return
     *     The value of the boQBkdn property.
     */
    public List<TgBoQBkdn> getBoQBkdn() {
        if (boQBkdn == null) {
            boQBkdn = new ArrayList<>();
        }
        return this.boQBkdn;
    }

    /**
     * Anzahl der Einheitspreisanteile
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoUPComps() {
        return noUPComps;
    }

    /**
     * Legt den Wert der noUPComps-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getNoUPComps()
     */
    public void setNoUPComps(String value) {
        this.noUPComps = value;
    }

    /**
     * Bezeichnung des 1. EP-Anteils
     * 
     * @return
     *     possible object is
     *     {@link TgLblUpComp }
     *     
     */
    public TgLblUpComp getLblUPComp1() {
        return lblUPComp1;
    }

    /**
     * Legt den Wert der lblUPComp1-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgLblUpComp }
     *     
     * @see #getLblUPComp1()
     */
    public void setLblUPComp1(TgLblUpComp value) {
        this.lblUPComp1 = value;
    }

    /**
     * Bezeichnung des 2. EP-Anteils
     * 
     * @return
     *     possible object is
     *     {@link TgLblUpComp }
     *     
     */
    public TgLblUpComp getLblUPComp2() {
        return lblUPComp2;
    }

    /**
     * Legt den Wert der lblUPComp2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgLblUpComp }
     *     
     * @see #getLblUPComp2()
     */
    public void setLblUPComp2(TgLblUpComp value) {
        this.lblUPComp2 = value;
    }

    /**
     * Bezeichnung des 3. EP-Anteils
     * 
     * @return
     *     possible object is
     *     {@link TgLblUpComp }
     *     
     */
    public TgLblUpComp getLblUPComp3() {
        return lblUPComp3;
    }

    /**
     * Legt den Wert der lblUPComp3-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgLblUpComp }
     *     
     * @see #getLblUPComp3()
     */
    public void setLblUPComp3(TgLblUpComp value) {
        this.lblUPComp3 = value;
    }

    /**
     * Bezeichnung des 4. EP-Anteils
     * 
     * @return
     *     possible object is
     *     {@link TgLblUpComp }
     *     
     */
    public TgLblUpComp getLblUPComp4() {
        return lblUPComp4;
    }

    /**
     * Legt den Wert der lblUPComp4-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgLblUpComp }
     *     
     * @see #getLblUPComp4()
     */
    public void setLblUPComp4(TgLblUpComp value) {
        this.lblUPComp4 = value;
    }

    /**
     * Bezeichnung des 5. EP-Anteils
     * 
     * @return
     *     possible object is
     *     {@link TgLblUpComp }
     *     
     */
    public TgLblUpComp getLblUPComp5() {
        return lblUPComp5;
    }

    /**
     * Legt den Wert der lblUPComp5-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgLblUpComp }
     *     
     * @see #getLblUPComp5()
     */
    public void setLblUPComp5(TgLblUpComp value) {
        this.lblUPComp5 = value;
    }

    /**
     * Bezeichnung des 6. EP-Anteils
     * 
     * @return
     *     possible object is
     *     {@link TgLblUpComp }
     *     
     */
    public TgLblUpComp getLblUPComp6() {
        return lblUPComp6;
    }

    /**
     * Legt den Wert der lblUPComp6-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgLblUpComp }
     *     
     * @see #getLblUPComp6()
     */
    public void setLblUPComp6(TgLblUpComp value) {
        this.lblUPComp6 = value;
    }

    /**
     * Bezeichnung der Zeiteinheit
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLblTime() {
        return lblTime;
    }

    /**
     * Legt den Wert der lblTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getLblTime()
     */
    public void setLblTime(String value) {
        this.lblTime = value;
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
     * LV-Summen
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
     * {@link TgCtlg }
     * </p>
     * 
     * 
     * @return
     *     The value of the ctlg property.
     */
    public List<TgCtlg> getCtlg() {
        if (ctlg == null) {
            ctlg = new ArrayList<>();
        }
        return this.ctlg;
    }

    /**
     * Kostenarten
     * 
     * Gets the value of the costType property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the costType property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCostType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TgCostType }
     * </p>
     * 
     * 
     * @return
     *     The value of the costType property.
     */
    public List<TgCostType> getCostType() {
        if (costType == null) {
            costType = new ArrayList<>();
        }
        return this.costType;
    }

    /**
     * Ruft den Wert der qtyDetermInfo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TgQtyDetermInfo }
     *     
     */
    public TgQtyDetermInfo getQtyDetermInfo() {
        return qtyDetermInfo;
    }

    /**
     * Legt den Wert der qtyDetermInfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgQtyDetermInfo }
     *     
     */
    public void setQtyDetermInfo(TgQtyDetermInfo value) {
        this.qtyDetermInfo = value;
    }

}
