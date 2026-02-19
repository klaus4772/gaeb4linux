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
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Notation
 * 
 * <p>Java-Klasse für tgQuotation complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgQuotation">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Kind">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="PriceFrom" type="{}tgDecimal_13_2"/>
 *         <element name="PriceTo" type="{}tgDecimal_13_2" minOccurs="0"/>
 *         <sequence minOccurs="0">
 *           <element name="Cur" type="{}tgISOCur"/>
 *           <element name="CurLbl" type="{}tgCurLbl" minOccurs="0"/>
 *         </sequence>
 *         <element name="ConversionRate" type="{}tgDecimal_9_6" minOccurs="0"/>
 *         <element name="Weight" type="{}tgDecimal_13_2"/>
 *         <element name="UW" type="{}tgNormalizedString"/>
 *         <element name="WeightPart" type="{}tgWeightPart" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgQuotation", namespace = "", propOrder = {
    "kind",
    "priceFrom",
    "priceTo",
    "cur",
    "curLbl",
    "conversionRate",
    "weight",
    "uw",
    "weightPart"
})
public class TgQuotation {

    /**
     * Z.B. CU=Kupfer
     * 
     */
    @XmlElement(name = "Kind", required = true)
    protected TgQuotation.Kind kind;
    /**
     * VON Rohstoff Tagespreis
     * 
     */
    @XmlElement(name = "PriceFrom", required = true)
    protected BigDecimal priceFrom;
    /**
     * BIS Rohstoff Tagespreis
     * 
     */
    @XmlElement(name = "PriceTo")
    protected BigDecimal priceTo;
    /**
     * Waehrung
     * 
     */
    @XmlElement(name = "Cur")
    protected TgISOCur cur;
    /**
     * Bezeichnung der Waehrung
     * 
     */
    @XmlElement(name = "CurLbl")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String curLbl;
    /**
     * Umrechnugsfaktor
     * 
     */
    @XmlElement(name = "ConversionRate")
    protected BigDecimal conversionRate;
    @XmlElement(name = "Weight", required = true)
    protected BigDecimal weight;
    @XmlElement(name = "UW", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String uw;
    /**
     * Gewichtseinheit, unit weight
     * 
     */
    @XmlElement(name = "WeightPart")
    protected List<TgWeightPart> weightPart;

    /**
     * Z.B. CU=Kupfer
     * 
     * @return
     *     possible object is
     *     {@link TgQuotation.Kind }
     *     
     */
    public TgQuotation.Kind getKind() {
        return kind;
    }

    /**
     * Legt den Wert der kind-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgQuotation.Kind }
     *     
     * @see #getKind()
     */
    public void setKind(TgQuotation.Kind value) {
        this.kind = value;
    }

    /**
     * VON Rohstoff Tagespreis
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceFrom() {
        return priceFrom;
    }

    /**
     * Legt den Wert der priceFrom-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getPriceFrom()
     */
    public void setPriceFrom(BigDecimal value) {
        this.priceFrom = value;
    }

    /**
     * BIS Rohstoff Tagespreis
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceTo() {
        return priceTo;
    }

    /**
     * Legt den Wert der priceTo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getPriceTo()
     */
    public void setPriceTo(BigDecimal value) {
        this.priceTo = value;
    }

    /**
     * Waehrung
     * 
     * @return
     *     possible object is
     *     {@link TgISOCur }
     *     
     */
    public TgISOCur getCur() {
        return cur;
    }

    /**
     * Legt den Wert der cur-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgISOCur }
     *     
     * @see #getCur()
     */
    public void setCur(TgISOCur value) {
        this.cur = value;
    }

    /**
     * Bezeichnung der Waehrung
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurLbl() {
        return curLbl;
    }

    /**
     * Legt den Wert der curLbl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCurLbl()
     */
    public void setCurLbl(String value) {
        this.curLbl = value;
    }

    /**
     * Umrechnugsfaktor
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getConversionRate() {
        return conversionRate;
    }

    /**
     * Legt den Wert der conversionRate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getConversionRate()
     */
    public void setConversionRate(BigDecimal value) {
        this.conversionRate = value;
    }

    /**
     * Ruft den Wert der weight-Eigenschaft ab.
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
     */
    public void setWeight(BigDecimal value) {
        this.weight = value;
    }

    /**
     * Ruft den Wert der uw-Eigenschaft ab.
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
     */
    public void setUW(String value) {
        this.uw = value;
    }

    /**
     * Gewichtseinheit, unit weight
     * 
     * Gets the value of the weightPart property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the weightPart property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getWeightPart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TgWeightPart }
     * </p>
     * 
     * 
     * @return
     *     The value of the weightPart property.
     */
    public List<TgWeightPart> getWeightPart() {
        if (weightPart == null) {
            weightPart = new ArrayList<>();
        }
        return this.weightPart;
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
     *       <attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Kind {

        @XmlAttribute(name = "ID")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        @XmlSchemaType(name = "ID")
        protected String id;

        /**
         * Ruft den Wert der id-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getID() {
            return id;
        }

        /**
         * Legt den Wert der id-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setID(String value) {
            this.id = value;
        }

    }

}
