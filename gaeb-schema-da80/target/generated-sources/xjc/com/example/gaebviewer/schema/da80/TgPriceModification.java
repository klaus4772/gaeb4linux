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
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java-Klasse für tgPriceModification complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgPriceModification">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Type" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *               <enumeration value="info"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="SubQty" type="{}tgDecimal_10_2" minOccurs="0"/>
 *         <element name="Threshold" type="{}tgDecimal_10_2" minOccurs="0"/>
 *         <element name="Name" type="{}tgNormalizedString" minOccurs="0"/>
 *         <element name="Quotation" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <attribute name="IDRef" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <choice>
 *           <element name="DiscountPcnt" type="{}tgDecimal_9_6"/>
 *           <element name="DiscountAbs" type="{}tgDecimal_13_2"/>
 *           <element name="MarkupPcnt" type="{}tgDecimal_9_6"/>
 *           <element name="MarkupAbs" type="{}tgDecimal_13_2"/>
 *           <element name="Multiplicator" type="{}tgDecimal_9_6"/>
 *         </choice>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgPriceModification", namespace = "", propOrder = {
    "type",
    "subQty",
    "threshold",
    "name",
    "quotation",
    "discountPcnt",
    "discountAbs",
    "markupPcnt",
    "markupAbs",
    "multiplicator"
})
public class TgPriceModification {

    /**
     * Wenn Modifikation nur Informatorisch dann ist type=info
     * 
     */
    @XmlElement(name = "Type")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;
    /**
     * Teilmenge
     * 
     */
    @XmlElement(name = "SubQty")
    protected BigDecimal subQty;
    /**
     * Rabattschwelle (Menge) ab der der Rabatt greift
     * 
     */
    @XmlElement(name = "Threshold")
    protected BigDecimal threshold;
    /**
     * Name des Zuschlags / Nachlasses
     * 
     */
    @XmlElement(name = "Name")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String name;
    /**
     * Reference auf Quotation, Notierung
     * 
     */
    @XmlElement(name = "Quotation")
    protected TgPriceModification.Quotation quotation;
    @XmlElement(name = "DiscountPcnt")
    protected BigDecimal discountPcnt;
    @XmlElement(name = "DiscountAbs")
    protected BigDecimal discountAbs;
    @XmlElement(name = "MarkupPcnt")
    protected BigDecimal markupPcnt;
    @XmlElement(name = "MarkupAbs")
    protected BigDecimal markupAbs;
    @XmlElement(name = "Multiplicator")
    protected BigDecimal multiplicator;

    /**
     * Wenn Modifikation nur Informatorisch dann ist type=info
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getType()
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Teilmenge
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSubQty() {
        return subQty;
    }

    /**
     * Legt den Wert der subQty-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getSubQty()
     */
    public void setSubQty(BigDecimal value) {
        this.subQty = value;
    }

    /**
     * Rabattschwelle (Menge) ab der der Rabatt greift
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getThreshold() {
        return threshold;
    }

    /**
     * Legt den Wert der threshold-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getThreshold()
     */
    public void setThreshold(BigDecimal value) {
        this.threshold = value;
    }

    /**
     * Name des Zuschlags / Nachlasses
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
     * Reference auf Quotation, Notierung
     * 
     * @return
     *     possible object is
     *     {@link TgPriceModification.Quotation }
     *     
     */
    public TgPriceModification.Quotation getQuotation() {
        return quotation;
    }

    /**
     * Legt den Wert der quotation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgPriceModification.Quotation }
     *     
     * @see #getQuotation()
     */
    public void setQuotation(TgPriceModification.Quotation value) {
        this.quotation = value;
    }

    /**
     * Ruft den Wert der discountPcnt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountPcnt() {
        return discountPcnt;
    }

    /**
     * Legt den Wert der discountPcnt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscountPcnt(BigDecimal value) {
        this.discountPcnt = value;
    }

    /**
     * Ruft den Wert der discountAbs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountAbs() {
        return discountAbs;
    }

    /**
     * Legt den Wert der discountAbs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscountAbs(BigDecimal value) {
        this.discountAbs = value;
    }

    /**
     * Ruft den Wert der markupPcnt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMarkupPcnt() {
        return markupPcnt;
    }

    /**
     * Legt den Wert der markupPcnt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMarkupPcnt(BigDecimal value) {
        this.markupPcnt = value;
    }

    /**
     * Ruft den Wert der markupAbs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMarkupAbs() {
        return markupAbs;
    }

    /**
     * Legt den Wert der markupAbs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMarkupAbs(BigDecimal value) {
        this.markupAbs = value;
    }

    /**
     * Ruft den Wert der multiplicator-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMultiplicator() {
        return multiplicator;
    }

    /**
     * Legt den Wert der multiplicator-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMultiplicator(BigDecimal value) {
        this.multiplicator = value;
    }


    /**
     * <p>Java-Klasse für anonymous complex type.</p>
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <attribute name="IDRef" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Quotation {

        @XmlAttribute(name = "IDRef")
        @XmlIDREF
        @XmlSchemaType(name = "IDREF")
        protected Object idRef;

        /**
         * Ruft den Wert der idRef-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getIDRef() {
            return idRef;
        }

        /**
         * Legt den Wert der idRef-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setIDRef(Object value) {
            this.idRef = value;
        }

    }

}
