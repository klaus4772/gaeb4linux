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
 * Informationen zur Summe je MwSt-Satz
 * 
 * <p>Java-Klasse für tgOrderTotals complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgOrderTotals">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="VATRate" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDecimal_5_2"/>
 *         <element name="ItemTotal" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDecimal_13_2"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgOrderTotals", propOrder = {
    "vatRate",
    "itemTotal"
})
public class TgOrderTotals2 {

    /**
     * MwSt-Satz auf den sich die Angabe bezieht
     * 
     */
    @XmlElement(name = "VATRate", required = true)
    protected BigDecimal vatRate;
    /**
     * Summe aller Positionswerte zu dem MwSt-Satz
     * 
     */
    @XmlElement(name = "ItemTotal", required = true)
    protected BigDecimal itemTotal;

    /**
     * MwSt-Satz auf den sich die Angabe bezieht
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVATRate() {
        return vatRate;
    }

    /**
     * Legt den Wert der vatRate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getVATRate()
     */
    public void setVATRate(BigDecimal value) {
        this.vatRate = value;
    }

    /**
     * Summe aller Positionswerte zu dem MwSt-Satz
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getItemTotal() {
        return itemTotal;
    }

    /**
     * Legt den Wert der itemTotal-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getItemTotal()
     */
    public void setItemTotal(BigDecimal value) {
        this.itemTotal = value;
    }

}
