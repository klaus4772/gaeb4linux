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
 * AuftragsWertSchluessel
 * 
 * <p>Java-Klasse für tgContrValCode complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgContrValCode">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Percent" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDecimal_9_6"/>
 *         <element name="Number">
 *           <simpleType>
 *             <restriction base="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgPositiveInteger">
 *               <maxInclusive value="99999"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgContrValCode", propOrder = {
    "percent",
    "number"
})
public class TgContrValCode2 {

    /**
     * Auftragsanteil je Rahmenvertrag in Prozent
     * 
     */
    @XmlElement(name = "Percent", required = true)
    protected BigDecimal percent;
    /**
     * Anzahl
     * 
     */
    @XmlElement(name = "Number")
    protected int number;

    /**
     * Auftragsanteil je Rahmenvertrag in Prozent
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercent() {
        return percent;
    }

    /**
     * Legt den Wert der percent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getPercent()
     */
    public void setPercent(BigDecimal value) {
        this.percent = value;
    }

    /**
     * Anzahl
     * 
     */
    public int getNumber() {
        return number;
    }

    /**
     * Legt den Wert der number-Eigenschaft fest.
     * 
     */
    public void setNumber(int value) {
        this.number = value;
    }

}
