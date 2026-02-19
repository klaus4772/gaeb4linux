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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Gewichtseinheit, unit weight
 * 
 * <p>Java-Klasse für tgWeightPart complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgWeightPart">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Weight" type="{}tgDecimal_13_2"/>
 *         <element name="UW" type="{}tgNormalizedString"/>
 *         <element name="Base" type="{}tgDecimal_13_2" minOccurs="0"/>
 *         <element name="UnitBase" type="{}tgNormalizedString" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgWeightPart", namespace = "", propOrder = {
    "weight",
    "uw",
    "base",
    "unitBase"
})
public class TgWeightPart {

    /**
     * Gewicht
     * 
     */
    @XmlElement(name = "Weight", required = true)
    protected BigDecimal weight;
    /**
     * Gewichtseinheit
     * 
     */
    @XmlElement(name = "UW", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String uw;
    /**
     * Basis
     * 
     */
    @XmlElement(name = "Base")
    protected BigDecimal base;
    /**
     * Basiseinheit
     * 
     */
    @XmlElement(name = "UnitBase")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String unitBase;

    /**
     * Gewicht
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWeight() {
        return weight;
    }

    /**
     * Legt den Wert der weight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getWeight()
     */
    public void setWeight(BigDecimal value) {
        this.weight = value;
    }

    /**
     * Gewichtseinheit
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUW() {
        return uw;
    }

    /**
     * Legt den Wert der uw-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getUW()
     */
    public void setUW(String value) {
        this.uw = value;
    }

    /**
     * Basis
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBase() {
        return base;
    }

    /**
     * Legt den Wert der base-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getBase()
     */
    public void setBase(BigDecimal value) {
        this.base = value;
    }

    /**
     * Basiseinheit
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitBase() {
        return unitBase;
    }

    /**
     * Legt den Wert der unitBase-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getUnitBase()
     */
    public void setUnitBase(String value) {
        this.unitBase = value;
    }

}
