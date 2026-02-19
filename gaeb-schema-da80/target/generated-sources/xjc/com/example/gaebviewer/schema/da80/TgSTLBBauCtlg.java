//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v4.0.5 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
//


package com.example.gaebviewer.schema.da80;

import java.math.BigInteger;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Schluessel fuer Katalog und Gruppe der Leistung (STLB-Bau)
 * 
 * <p>Java-Klasse für tgSTLBBauCtlg complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgSTLBBauCtlg">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CtlgName" type="{}tgNormalizedString10"/>
 *         <element name="VersDate" type="{}tgVersDate" minOccurs="0"/>
 *         <element name="WCtg" type="{}tgNormalizedString3" minOccurs="0"/>
 *         <element name="Group" type="{}tgInteger"/>
 *         <element name="CostGrp" type="{}tgNormalizedString20" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgSTLBBauCtlg", namespace = "", propOrder = {
    "ctlgName",
    "versDate",
    "wCtg",
    "group",
    "costGrp"
})
public class TgSTLBBauCtlg {

    /**
     * Name des Katalogs
     * 
     */
    @XmlElement(name = "CtlgName", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String ctlgName;
    /**
     * Datum der Version des Katalogs
     * 
     */
    @XmlElement(name = "VersDate")
    @XmlSchemaType(name = "gYearMonth")
    protected XMLGregorianCalendar versDate;
    /**
     * Leistungsbereich
     * 
     */
    @XmlElement(name = "WCtg")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String wCtg;
    /**
     * Identifikator der Gruppe
     * 
     */
    @XmlElement(name = "Group", required = true)
    protected BigInteger group;
    /**
     * Kostengruppe
     * 
     */
    @XmlElement(name = "CostGrp")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String costGrp;

    /**
     * Name des Katalogs
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtlgName() {
        return ctlgName;
    }

    /**
     * Legt den Wert der ctlgName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCtlgName()
     */
    public void setCtlgName(String value) {
        this.ctlgName = value;
    }

    /**
     * Datum der Version des Katalogs
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVersDate() {
        return versDate;
    }

    /**
     * Legt den Wert der versDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getVersDate()
     */
    public void setVersDate(XMLGregorianCalendar value) {
        this.versDate = value;
    }

    /**
     * Leistungsbereich
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWCtg() {
        return wCtg;
    }

    /**
     * Legt den Wert der wCtg-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getWCtg()
     */
    public void setWCtg(String value) {
        this.wCtg = value;
    }

    /**
     * Identifikator der Gruppe
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGroup() {
        return group;
    }

    /**
     * Legt den Wert der group-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getGroup()
     */
    public void setGroup(BigInteger value) {
        this.group = value;
    }

    /**
     * Kostengruppe
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostGrp() {
        return costGrp;
    }

    /**
     * Legt den Wert der costGrp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCostGrp()
     */
    public void setCostGrp(String value) {
        this.costGrp = value;
    }

}
