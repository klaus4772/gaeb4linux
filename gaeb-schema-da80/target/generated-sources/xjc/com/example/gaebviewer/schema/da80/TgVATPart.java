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
import jakarta.xml.bind.annotation.XmlType;


/**
 * Umsatzsatzsteuersatz mit Anteil
 * 
 * <p>Java-Klasse für tgVATPart complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgVATPart">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TotalNetPart" type="{}tgDecimal_13_2"/>
 *         <element name="VATAmount" type="{}tgDecimal_13_2"/>
 *       </sequence>
 *       <attribute name="VATPcnt" type="{}tgDecimal_5_2" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgVATPart", namespace = "", propOrder = {
    "totalNetPart",
    "vatAmount"
})
public class TgVATPart {

    /**
     * Netto-Summe aller Elemente mit den Umsatzsteuersatz VATPcnt.
     * Hinweis: 
     * Falls Nachlässe auf Elemente mit unterschiedlichen Umsatzsteuersätzen wirken, dann ist der jeweilige Nachlassbetrag auf die Teilsummen zu verteilen. Das Verteilungsgewicht ist das Verhältnis des Teilbetrages zur Summe der jeweiliegen Gruppenstufe/LV. Ein Rundungsrest ist der größten Teilsumme, bei mehreren größten der mit dem höreren Steuersatz, zuzuschlagen.
     * 
     */
    @XmlElement(name = "TotalNetPart", required = true)
    protected BigDecimal totalNetPart;
    /**
     * Umsatzsteuerbetrag für den Umsatzsteuersatz VATPcnt
     * 
     */
    @XmlElement(name = "VATAmount", required = true)
    protected BigDecimal vatAmount;
    /**
     * Umsatzsteuersatz in %
     * 
     */
    @XmlAttribute(name = "VATPcnt")
    protected BigDecimal vatPcnt;

    /**
     * Netto-Summe aller Elemente mit den Umsatzsteuersatz VATPcnt.
     * Hinweis: 
     * Falls Nachlässe auf Elemente mit unterschiedlichen Umsatzsteuersätzen wirken, dann ist der jeweilige Nachlassbetrag auf die Teilsummen zu verteilen. Das Verteilungsgewicht ist das Verhältnis des Teilbetrages zur Summe der jeweiliegen Gruppenstufe/LV. Ein Rundungsrest ist der größten Teilsumme, bei mehreren größten der mit dem höreren Steuersatz, zuzuschlagen.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalNetPart() {
        return totalNetPart;
    }

    /**
     * Legt den Wert der totalNetPart-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getTotalNetPart()
     */
    public void setTotalNetPart(BigDecimal value) {
        this.totalNetPart = value;
    }

    /**
     * Umsatzsteuerbetrag für den Umsatzsteuersatz VATPcnt
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVATAmount() {
        return vatAmount;
    }

    /**
     * Legt den Wert der vatAmount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getVATAmount()
     */
    public void setVATAmount(BigDecimal value) {
        this.vatAmount = value;
    }

    /**
     * Umsatzsteuersatz in %
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVATPcnt() {
        return vatPcnt;
    }

    /**
     * Legt den Wert der vatPcnt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getVATPcnt()
     */
    public void setVATPcnt(BigDecimal value) {
        this.vatPcnt = value;
    }

}
