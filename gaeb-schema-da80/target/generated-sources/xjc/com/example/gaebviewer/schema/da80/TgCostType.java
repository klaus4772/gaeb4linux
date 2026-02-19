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
 * Kostenart
 * 
 * <p>Java-Klasse für tgCostType complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgCostType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence minOccurs="0">
 *         <element name="CostDescription" type="{}tgpMLText" minOccurs="0"/>
 *         <element name="CostTypeUnit" type="{}tgNormalizedString4" minOccurs="0"/>
 *         <element name="Markup" type="{}tgDecimal_9_6" minOccurs="0"/>
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
@XmlType(name = "tgCostType", namespace = "", propOrder = {
    "costDescription",
    "costTypeUnit",
    "markup"
})
public class TgCostType {

    /**
     * Mehrzeiliige Beschreibung
     * 
     */
    @XmlElement(name = "CostDescription")
    protected TgpMLText costDescription;
    /**
     * Einheit der Kostenart
     * 
     */
    @XmlElement(name = "CostTypeUnit")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String costTypeUnit;
    /**
     * Zuschlag in %
     * 
     */
    @XmlElement(name = "Markup")
    protected BigDecimal markup;
    /**
     * eindeutiger Schlüssel
     * 
     */
    @XmlAttribute(name = "Key", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String key;

    /**
     * Mehrzeiliige Beschreibung
     * 
     * @return
     *     possible object is
     *     {@link TgpMLText }
     *     
     */
    public TgpMLText getCostDescription() {
        return costDescription;
    }

    /**
     * Legt den Wert der costDescription-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgpMLText }
     *     
     * @see #getCostDescription()
     */
    public void setCostDescription(TgpMLText value) {
        this.costDescription = value;
    }

    /**
     * Einheit der Kostenart
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostTypeUnit() {
        return costTypeUnit;
    }

    /**
     * Legt den Wert der costTypeUnit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCostTypeUnit()
     */
    public void setCostTypeUnit(String value) {
        this.costTypeUnit = value;
    }

    /**
     * Zuschlag in %
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMarkup() {
        return markup;
    }

    /**
     * Legt den Wert der markup-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getMarkup()
     */
    public void setMarkup(BigDecimal value) {
        this.markup = value;
    }

    /**
     * eindeutiger Schlüssel
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
