//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v4.0.5 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
//


package com.example.gaebviewer.schema.da80;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Kostenansatz
 * 
 * <p>Java-Klasse für tgCostApproach complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgCostApproach">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CostApproachQty" type="{}tgDecimal_13_3"/>
 *         <element name="CostApproachQU" type="{}tgNormalizedString4" minOccurs="0"/>
 *         <element name="Performance" type="{}tgDecimal_13_3" minOccurs="0"/>
 *         <element name="Value" type="{}tgDecimal_13_3"/>
 *       </sequence>
 *       <attribute name="Key" use="required" type="{}tgNormalizedString" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgCostApproach", namespace = "", propOrder = {
    "costApproachQty",
    "costApproachQU",
    "performance",
    "value"
})
public class TgCostApproach {

    /**
     * Menge
     * 
     */
    @XmlElement(name = "CostApproachQty", required = true)
    protected BigDecimal costApproachQty;
    /**
     * Mengeneinheit; wenn nicht vorhanden gilt die Mengeneinheit der Kostenart
     * 
     */
    @XmlElement(name = "CostApproachQU")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String costApproachQU;
    /**
     * Leistung; Die Leistung kann als Devisor der kalkulierten Kosten (Value) verwendet werden.
     * 
     */
    @XmlElement(name = "Performance")
    protected BigDecimal performance;
    /**
     * Wert in Währung des Leistungsverzeichnisses
     * 
     */
    @XmlElement(name = "Value", required = true)
    protected BigDecimal value;
    /**
     * Schlüssel der Kostenart
     * 
     */
    @XmlAttribute(name = "Key", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String key;

    /**
     * Menge
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCostApproachQty() {
        return costApproachQty;
    }

    /**
     * Legt den Wert der costApproachQty-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getCostApproachQty()
     */
    public void setCostApproachQty(BigDecimal value) {
        this.costApproachQty = value;
    }

    /**
     * Mengeneinheit; wenn nicht vorhanden gilt die Mengeneinheit der Kostenart
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostApproachQU() {
        return costApproachQU;
    }

    /**
     * Legt den Wert der costApproachQU-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCostApproachQU()
     */
    public void setCostApproachQU(String value) {
        this.costApproachQU = value;
    }

    /**
     * Leistung; Die Leistung kann als Devisor der kalkulierten Kosten (Value) verwendet werden.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPerformance() {
        return performance;
    }

    /**
     * Legt den Wert der performance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getPerformance()
     */
    public void setPerformance(BigDecimal value) {
        this.performance = value;
    }

    /**
     * Wert in Währung des Leistungsverzeichnisses
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Legt den Wert der value-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getValue()
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /**
     * Schlüssel der Kostenart
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Legt den Wert der key-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getKey()
     */
    public void setKey(String value) {
        this.key = value;
    }

}
