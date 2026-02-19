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
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Unterbeschreibung
 * 
 * <p>Java-Klasse für tgSubDescr complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgSubDescr">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SubDNo" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgSubDNo"/>
 *         <element name="Description" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDescription" minOccurs="0"/>
 *         <sequence minOccurs="0">
 *           <element name="QtySpec" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgYes"/>
 *           <element name="QtyTBD" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgYes" minOccurs="0"/>
 *         </sequence>
 *         <sequence minOccurs="0">
 *           <element name="Qty" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDecimal_11_3"/>
 *           <element name="QU" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString4" minOccurs="0"/>
 *         </sequence>
 *         <element name="UPSpec" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgYesNo" minOccurs="0"/>
 *         <element name="UPBkdn" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgYesNo" minOccurs="0"/>
 *         <sequence minOccurs="0">
 *           <element name="UP" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDecimal_13_3"/>
 *           <element name="UPComp1" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDecimal_13_3" minOccurs="0"/>
 *           <element name="UPComp2" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDecimal_13_3" minOccurs="0"/>
 *           <element name="UPComp3" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDecimal_13_3" minOccurs="0"/>
 *           <element name="UPComp4" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDecimal_13_3" minOccurs="0"/>
 *           <element name="UPComp5" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDecimal_13_3" minOccurs="0"/>
 *           <element name="UPComp6" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDecimal_13_3" minOccurs="0"/>
 *         </sequence>
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
    "subDNo",
    "description",
    "qtySpec",
    "qtyTBD",
    "qty",
    "qu",
    "upSpec",
    "upBkdn",
    "up",
    "upComp1",
    "upComp2",
    "upComp3",
    "upComp4",
    "upComp5",
    "upComp6",
    "ctlgAssign"
})
@XmlSeeAlso({
    TgSubDescr2 .class
})
public class OriginalTgSubDescr {

    /**
     * Nummer der Unterbeschreibung
     * 
     */
    @XmlElement(name = "SubDNo")
    @XmlSchemaType(name = "positiveInteger")
    protected int subDNo;
    /**
     * Textorganisation
     * 
     */
    @XmlElement(name = "Description")
    protected TgDescription2 description;
    /**
     * Angabe der Menge erforderlich
     * 
     */
    @XmlElement(name = "QtySpec")
    @XmlSchemaType(name = "normalizedString")
    protected TgYes2 qtySpec;
    /**
     * Kennzeichen Freie Menge
     * 
     */
    @XmlElement(name = "QtyTBD")
    @XmlSchemaType(name = "normalizedString")
    protected TgYes2 qtyTBD;
    /**
     * Menge
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
     * Angabe des Einheitspreises erforderlich
     * 
     */
    @XmlElement(name = "UPSpec")
    @XmlSchemaType(name = "normalizedString")
    protected TgYesNo2 upSpec;
    /**
     * Aufforderung zur EP-Aufgliederung
     * 
     */
    @XmlElement(name = "UPBkdn")
    @XmlSchemaType(name = "normalizedString")
    protected TgYesNo2 upBkdn;
    /**
     * Einheitspreis
     * 
     */
    @XmlElement(name = "UP")
    protected BigDecimal up;
    /**
     *  1. Einheitspreisanteil
     * 
     */
    @XmlElement(name = "UPComp1")
    protected BigDecimal upComp1;
    /**
     *  2. Einheitspreisanteil
     * 
     */
    @XmlElement(name = "UPComp2")
    protected BigDecimal upComp2;
    /**
     *  3. Einheitspreisanteil
     * 
     */
    @XmlElement(name = "UPComp3")
    protected BigDecimal upComp3;
    /**
     *  4. Einheitspreisanteil
     * 
     */
    @XmlElement(name = "UPComp4")
    protected BigDecimal upComp4;
    /**
     *  5. Einheitspreisanteil
     * 
     */
    @XmlElement(name = "UPComp5")
    protected BigDecimal upComp5;
    /**
     *  6. Einheitspreisanteil
     * 
     */
    @XmlElement(name = "UPComp6")
    protected BigDecimal upComp6;
    @XmlElement(name = "CtlgAssign")
    protected List<TgCtlgAssign2> ctlgAssign;

    /**
     * Nummer der Unterbeschreibung
     * 
     */
    public int getSubDNo() {
        return subDNo;
    }

    /**
     * Legt den Wert der subDNo-Eigenschaft fest.
     * 
     */
    public void setSubDNo(int value) {
        this.subDNo = value;
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
     * Angabe der Menge erforderlich
     * 
     * @return
     *     possible object is
     *     {@link TgYes2 }
     *     
     */
    public TgYes2 getQtySpec() {
        return qtySpec;
    }

    /**
     * Legt den Wert der qtySpec-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgYes2 }
     *     
     * @see #getQtySpec()
     */
    public void setQtySpec(TgYes2 value) {
        this.qtySpec = value;
    }

    /**
     * Kennzeichen Freie Menge
     * 
     * @return
     *     possible object is
     *     {@link TgYes2 }
     *     
     */
    public TgYes2 getQtyTBD() {
        return qtyTBD;
    }

    /**
     * Legt den Wert der qtyTBD-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgYes2 }
     *     
     * @see #getQtyTBD()
     */
    public void setQtyTBD(TgYes2 value) {
        this.qtyTBD = value;
    }

    /**
     * Menge
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
     * Angabe des Einheitspreises erforderlich
     * 
     * @return
     *     possible object is
     *     {@link TgYesNo2 }
     *     
     */
    public TgYesNo2 getUPSpec() {
        return upSpec;
    }

    /**
     * Legt den Wert der upSpec-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgYesNo2 }
     *     
     * @see #getUPSpec()
     */
    public void setUPSpec(TgYesNo2 value) {
        this.upSpec = value;
    }

    /**
     * Aufforderung zur EP-Aufgliederung
     * 
     * @return
     *     possible object is
     *     {@link TgYesNo2 }
     *     
     */
    public TgYesNo2 getUPBkdn() {
        return upBkdn;
    }

    /**
     * Legt den Wert der upBkdn-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgYesNo2 }
     *     
     * @see #getUPBkdn()
     */
    public void setUPBkdn(TgYesNo2 value) {
        this.upBkdn = value;
    }

    /**
     * Einheitspreis
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUP() {
        return up;
    }

    /**
     * Legt den Wert der up-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getUP()
     */
    public void setUP(BigDecimal value) {
        this.up = value;
    }

    /**
     *  1. Einheitspreisanteil
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUPComp1() {
        return upComp1;
    }

    /**
     * Legt den Wert der upComp1-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getUPComp1()
     */
    public void setUPComp1(BigDecimal value) {
        this.upComp1 = value;
    }

    /**
     *  2. Einheitspreisanteil
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUPComp2() {
        return upComp2;
    }

    /**
     * Legt den Wert der upComp2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getUPComp2()
     */
    public void setUPComp2(BigDecimal value) {
        this.upComp2 = value;
    }

    /**
     *  3. Einheitspreisanteil
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUPComp3() {
        return upComp3;
    }

    /**
     * Legt den Wert der upComp3-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getUPComp3()
     */
    public void setUPComp3(BigDecimal value) {
        this.upComp3 = value;
    }

    /**
     *  4. Einheitspreisanteil
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUPComp4() {
        return upComp4;
    }

    /**
     * Legt den Wert der upComp4-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getUPComp4()
     */
    public void setUPComp4(BigDecimal value) {
        this.upComp4 = value;
    }

    /**
     *  5. Einheitspreisanteil
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUPComp5() {
        return upComp5;
    }

    /**
     * Legt den Wert der upComp5-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getUPComp5()
     */
    public void setUPComp5(BigDecimal value) {
        this.upComp5 = value;
    }

    /**
     *  6. Einheitspreisanteil
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUPComp6() {
        return upComp6;
    }

    /**
     * Legt den Wert der upComp6-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getUPComp6()
     */
    public void setUPComp6(BigDecimal value) {
        this.upComp6 = value;
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
