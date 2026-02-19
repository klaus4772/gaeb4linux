//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v4.0.5 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
//


package com.example.gaebviewer.schema.da80;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Bruttobeträge der Einheitspreisanteile
 * 
 * <p>Java-Klasse für tgTotalNetUpComp complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgTotalNetUpComp">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="UpComp1" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDecimal_13_2" minOccurs="0"/>
 *         <element name="UpComp2" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDecimal_13_2" minOccurs="0"/>
 *         <element name="UpComp3" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDecimal_13_2" minOccurs="0"/>
 *         <element name="UpComp4" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDecimal_13_2" minOccurs="0"/>
 *         <element name="UpComp5" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDecimal_13_2" minOccurs="0"/>
 *         <element name="UpComp6" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDecimal_13_2" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgTotalNetUpComp", propOrder = {
    "upComp1",
    "upComp2",
    "upComp3",
    "upComp4",
    "upComp5",
    "upComp6"
})
public class TgTotalNetUpComp2 {

    /**
     * Nettobetrag des 1. EP-Anteils
     * 
     */
    @XmlElement(name = "UpComp1")
    protected BigDecimal upComp1;
    /**
     * Nettobetrag des 2. EP-Anteils
     * 
     */
    @XmlElement(name = "UpComp2")
    protected BigDecimal upComp2;
    /**
     * Nettobetrag des 3. EP-Anteils
     * 
     */
    @XmlElement(name = "UpComp3")
    protected BigDecimal upComp3;
    /**
     * Nettobetrag des 4. EP-Anteils
     * 
     */
    @XmlElement(name = "UpComp4")
    protected BigDecimal upComp4;
    /**
     * Nettobetrag des 5. EP-Anteils
     * 
     */
    @XmlElement(name = "UpComp5")
    protected BigDecimal upComp5;
    /**
     * Nettobetrag des 6. EP-Anteils
     * 
     */
    @XmlElement(name = "UpComp6")
    protected BigDecimal upComp6;

    /**
     * Nettobetrag des 1. EP-Anteils
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUpComp1() {
        return upComp1;
    }

    /**
     * Legt den Wert der upComp1-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getUpComp1()
     */
    public void setUpComp1(BigDecimal value) {
        this.upComp1 = value;
    }

    /**
     * Nettobetrag des 2. EP-Anteils
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUpComp2() {
        return upComp2;
    }

    /**
     * Legt den Wert der upComp2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getUpComp2()
     */
    public void setUpComp2(BigDecimal value) {
        this.upComp2 = value;
    }

    /**
     * Nettobetrag des 3. EP-Anteils
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUpComp3() {
        return upComp3;
    }

    /**
     * Legt den Wert der upComp3-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getUpComp3()
     */
    public void setUpComp3(BigDecimal value) {
        this.upComp3 = value;
    }

    /**
     * Nettobetrag des 4. EP-Anteils
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUpComp4() {
        return upComp4;
    }

    /**
     * Legt den Wert der upComp4-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getUpComp4()
     */
    public void setUpComp4(BigDecimal value) {
        this.upComp4 = value;
    }

    /**
     * Nettobetrag des 5. EP-Anteils
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUpComp5() {
        return upComp5;
    }

    /**
     * Legt den Wert der upComp5-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getUpComp5()
     */
    public void setUpComp5(BigDecimal value) {
        this.upComp5 = value;
    }

    /**
     * Nettobetrag des 6. EP-Anteils
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUpComp6() {
        return upComp6;
    }

    /**
     * Legt den Wert der upComp6-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getUpComp6()
     */
    public void setUpComp6(BigDecimal value) {
        this.upComp6 = value;
    }

}
