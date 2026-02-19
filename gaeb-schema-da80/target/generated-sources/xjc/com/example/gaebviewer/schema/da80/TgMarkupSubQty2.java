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
 * Zu bezuschlagende Teilmengen
 * 
 * <p>Java-Klasse für tgMarkupSubQty complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgMarkupSubQty">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RefItem" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgRefItem"/>
 *         <element name="SubQty" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDecimal_11_3" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgMarkupSubQty", propOrder = {
    "refItem",
    "subQty"
})
public class TgMarkupSubQty2 {

    /**
     * Verweis auf Position
     * 
     */
    @XmlElement(name = "RefItem", required = true)
    protected TgRefItem2 refItem;
    /**
     * Teilmenge oder Menge
     * 
     */
    @XmlElement(name = "SubQty")
    protected BigDecimal subQty;

    /**
     * Verweis auf Position
     * 
     * @return
     *     possible object is
     *     {@link TgRefItem2 }
     *     
     */
    public TgRefItem2 getRefItem() {
        return refItem;
    }

    /**
     * Legt den Wert der refItem-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgRefItem2 }
     *     
     * @see #getRefItem()
     */
    public void setRefItem(TgRefItem2 value) {
        this.refItem = value;
    }

    /**
     * Teilmenge oder Menge
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

}
