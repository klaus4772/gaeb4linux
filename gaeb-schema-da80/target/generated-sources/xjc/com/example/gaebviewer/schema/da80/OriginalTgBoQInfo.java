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
import jakarta.xml.bind.annotation.XmlSeeAlso;
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
 *         <element name="Name" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString20" minOccurs="0"/>
 *         <element name="LblBoQ" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString60" minOccurs="0"/>
 *         <element name="CPVCode" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgCPVCode" maxOccurs="unbounded" minOccurs="0"/>
 *         <sequence minOccurs="0">
 *           <element name="CONo" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgCONo"/>
 *           <element name="COStatus" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgCOStatus"/>
 *         </sequence>
 *         <element name="Date" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDate" minOccurs="0"/>
 *         <element name="OutlCompl" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgOutlCompl" minOccurs="0"/>
 *         <element name="BoQBkdn" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgBoQBkdn" maxOccurs="7"/>
 *         <sequence minOccurs="0">
 *           <element name="NoUPComps" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNoUPComps"/>
 *           <element name="LblUPComp1" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgLblUpComp" minOccurs="0"/>
 *           <element name="LblUPComp2" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgLblUpComp" minOccurs="0"/>
 *           <element name="LblUPComp3" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgLblUpComp" minOccurs="0"/>
 *           <element name="LblUPComp4" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgLblUpComp" minOccurs="0"/>
 *           <element name="LblUPComp5" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgLblUpComp" minOccurs="0"/>
 *           <element name="LblUPComp6" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgLblUpComp" minOccurs="0"/>
 *         </sequence>
 *         <element name="LblTime" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString20" minOccurs="0"/>
 *         <element name="CtlgAssign" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgCtlgAssign" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Totals" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgTotals" minOccurs="0"/>
 *         <element name="Ctlg" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgCtlg" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CostType" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgCostType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="QtyDetermInfo" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgQtyDetermInfo" minOccurs="0"/>
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
@XmlSeeAlso({
    TgBoQInfo2 .class
})
public class OriginalTgBoQInfo {

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
    protected List<TgCPVCode2> cpvCode;
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
    protected TgOutlCompl2 outlCompl;
    /**
     * Informationen zur Gliederung des LV
     * 
     */
    @XmlElement(name = "BoQBkdn", required = true)
    protected List<TgBoQBkdn2> boQBkdn;
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
    protected TgLblUpComp2 lblUPComp1;
    /**
     * Bezeichnung des 2. EP-Anteils
     * 
     */
    @XmlElement(name = "LblUPComp2")
    protected TgLblUpComp2 lblUPComp2;
    /**
     * Bezeichnung des 3. EP-Anteils
     * 
     */
    @XmlElement(name = "LblUPComp3")
    protected TgLblUpComp2 lblUPComp3;
    /**
     * Bezeichnung des 4. EP-Anteils
     * 
     */
    @XmlElement(name = "LblUPComp4")
    protected TgLblUpComp2 lblUPComp4;
    /**
     * Bezeichnung des 5. EP-Anteils
     * 
     */
    @XmlElement(name = "LblUPComp5")
    protected TgLblUpComp2 lblUPComp5;
    /**
     * Bezeichnung des 6. EP-Anteils
     * 
     */
    @XmlElement(name = "LblUPComp6")
    protected TgLblUpComp2 lblUPComp6;
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
    protected List<TgCtlgAssign2> ctlgAssign;
    /**
     * LV-Summen
     * 
     */
    @XmlElement(name = "Totals")
    protected TgTotals2 totals;
    /**
     * Katalog
     * 
     */
    @XmlElement(name = "Ctlg")
    protected List<TgCtlg2> ctlg;
    /**
     * Kostenarten
     * 
     */
    @XmlElement(name = "CostType")
    protected List<TgCostType2> costType;
    @XmlElement(name = "QtyDetermInfo")
    protected TgQtyDetermInfo2 qtyDetermInfo;

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
     * {@link TgCPVCode2 }
     * </p>
     * 
     * 
     * @return
     *     The value of the cpvCode property.
     */
    public List<TgCPVCode2> getCPVCode() {
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
     *     {@link TgOutlCompl2 }
     *     
     */
    public TgOutlCompl2 getOutlCompl() {
        return outlCompl;
    }

    /**
     * Legt den Wert der outlCompl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgOutlCompl2 }
     *     
     * @see #getOutlCompl()
     */
    public void setOutlCompl(TgOutlCompl2 value) {
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
     * {@link TgBoQBkdn2 }
     * </p>
     * 
     * 
     * @return
     *     The value of the boQBkdn property.
     */
    public List<TgBoQBkdn2> getBoQBkdn() {
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
     *     {@link TgLblUpComp2 }
     *     
     */
    public TgLblUpComp2 getLblUPComp1() {
        return lblUPComp1;
    }

    /**
     * Legt den Wert der lblUPComp1-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgLblUpComp2 }
     *     
     * @see #getLblUPComp1()
     */
    public void setLblUPComp1(TgLblUpComp2 value) {
        this.lblUPComp1 = value;
    }

    /**
     * Bezeichnung des 2. EP-Anteils
     * 
     * @return
     *     possible object is
     *     {@link TgLblUpComp2 }
     *     
     */
    public TgLblUpComp2 getLblUPComp2() {
        return lblUPComp2;
    }

    /**
     * Legt den Wert der lblUPComp2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgLblUpComp2 }
     *     
     * @see #getLblUPComp2()
     */
    public void setLblUPComp2(TgLblUpComp2 value) {
        this.lblUPComp2 = value;
    }

    /**
     * Bezeichnung des 3. EP-Anteils
     * 
     * @return
     *     possible object is
     *     {@link TgLblUpComp2 }
     *     
     */
    public TgLblUpComp2 getLblUPComp3() {
        return lblUPComp3;
    }

    /**
     * Legt den Wert der lblUPComp3-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgLblUpComp2 }
     *     
     * @see #getLblUPComp3()
     */
    public void setLblUPComp3(TgLblUpComp2 value) {
        this.lblUPComp3 = value;
    }

    /**
     * Bezeichnung des 4. EP-Anteils
     * 
     * @return
     *     possible object is
     *     {@link TgLblUpComp2 }
     *     
     */
    public TgLblUpComp2 getLblUPComp4() {
        return lblUPComp4;
    }

    /**
     * Legt den Wert der lblUPComp4-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgLblUpComp2 }
     *     
     * @see #getLblUPComp4()
     */
    public void setLblUPComp4(TgLblUpComp2 value) {
        this.lblUPComp4 = value;
    }

    /**
     * Bezeichnung des 5. EP-Anteils
     * 
     * @return
     *     possible object is
     *     {@link TgLblUpComp2 }
     *     
     */
    public TgLblUpComp2 getLblUPComp5() {
        return lblUPComp5;
    }

    /**
     * Legt den Wert der lblUPComp5-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgLblUpComp2 }
     *     
     * @see #getLblUPComp5()
     */
    public void setLblUPComp5(TgLblUpComp2 value) {
        this.lblUPComp5 = value;
    }

    /**
     * Bezeichnung des 6. EP-Anteils
     * 
     * @return
     *     possible object is
     *     {@link TgLblUpComp2 }
     *     
     */
    public TgLblUpComp2 getLblUPComp6() {
        return lblUPComp6;
    }

    /**
     * Legt den Wert der lblUPComp6-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgLblUpComp2 }
     *     
     * @see #getLblUPComp6()
     */
    public void setLblUPComp6(TgLblUpComp2 value) {
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
     * LV-Summen
     * 
     * @return
     *     possible object is
     *     {@link TgTotals2 }
     *     
     */
    public TgTotals2 getTotals() {
        return totals;
    }

    /**
     * Legt den Wert der totals-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgTotals2 }
     *     
     * @see #getTotals()
     */
    public void setTotals(TgTotals2 value) {
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
     * {@link TgCostType2 }
     * </p>
     * 
     * 
     * @return
     *     The value of the costType property.
     */
    public List<TgCostType2> getCostType() {
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
     *     {@link TgQtyDetermInfo2 }
     *     
     */
    public TgQtyDetermInfo2 getQtyDetermInfo() {
        return qtyDetermInfo;
    }

    /**
     * Legt den Wert der qtyDetermInfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgQtyDetermInfo2 }
     *     
     */
    public void setQtyDetermInfo(TgQtyDetermInfo2 value) {
        this.qtyDetermInfo = value;
    }

}
