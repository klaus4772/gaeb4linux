//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v4.0.5 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
//


package com.example.gaebviewer.schema.da80;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java-Klasse für tgCtlg complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgCtlg">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CtlgID" type="{}tgCtlgID"/>
 *         <element name="CtlgType" type="{}tgCtlgType"/>
 *         <element name="CtlgName" type="{}tgCtlgName"/>
 *         <element name="CtlgAssignType" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{}tgString">
 *               <enumeration value="Unique"/>
 *               <enumeration value="Multi"/>
 *               <enumeration value="Percentaged"/>
 *               <enumeration value="Absolute"/>
 *               <enumeration value="PctAbs"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgCtlg", namespace = "", propOrder = {
    "ctlgID",
    "ctlgType",
    "ctlgName",
    "ctlgAssignType"
})
public class TgCtlg {

    @XmlElement(name = "CtlgID", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String ctlgID;
    /**
     * cost group DIN 276-81
     * cost group DIN 276-93
     * cost group DIN 276-06
     * cost group DIN 276-1 2008-12
     * cost group DIN 276 2018-12
     * locality
     * work category
     * cost unit
     * BIM
     * miscellaneous
     * 
     */
    @XmlElement(name = "CtlgType", required = true)
    protected String ctlgType;
    @XmlElement(name = "CtlgName", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String ctlgName;
    /**
     * Typ der Katalogzuordnung. PctAbs bedeutet das es beide Zuordnungen geben darf.
     * 
     */
    @XmlElement(name = "CtlgAssignType")
    protected String ctlgAssignType;

    /**
     * Ruft den Wert der ctlgID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtlgID() {
        return ctlgID;
    }

    /**
     * Legt den Wert der ctlgID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtlgID(String value) {
        this.ctlgID = value;
    }

    /**
     * cost group DIN 276-81
     * cost group DIN 276-93
     * cost group DIN 276-06
     * cost group DIN 276-1 2008-12
     * cost group DIN 276 2018-12
     * locality
     * work category
     * cost unit
     * BIM
     * miscellaneous
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtlgType() {
        return ctlgType;
    }

    /**
     * Legt den Wert der ctlgType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCtlgType()
     */
    public void setCtlgType(String value) {
        this.ctlgType = value;
    }

    /**
     * Ruft den Wert der ctlgName-Eigenschaft ab.
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
     */
    public void setCtlgName(String value) {
        this.ctlgName = value;
    }

    /**
     * Typ der Katalogzuordnung. PctAbs bedeutet das es beide Zuordnungen geben darf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtlgAssignType() {
        return ctlgAssignType;
    }

    /**
     * Legt den Wert der ctlgAssignType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCtlgAssignType()
     */
    public void setCtlgAssignType(String value) {
        this.ctlgAssignType = value;
    }

}
