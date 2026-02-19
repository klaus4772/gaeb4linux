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
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * <p>Java-Klasse für tgCtlgAssignQuantity complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgCtlgAssignQuantity">
 *   <simpleContent>
 *     <extension base="<http://www.gaeb.de/GAEB_DA_XML/DA80/3.3>tgDecimal_16_6">
 *       <attribute name="Type">
 *         <simpleType>
 *           <restriction base="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgString">
 *             <enumeration value="Absolut"/>
 *             <enumeration value="Pct"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgCtlgAssignQuantity", propOrder = {
    "value"
})
public class TgCtlgAssignQuantity2 {

    /**
     * Dezimalwert mit insgesamt 16 Stellen, davon 6 nach dem Komma
     * 
     */
    @XmlValue
    protected BigDecimal value;
    @XmlAttribute(name = "Type")
    protected String type;

    /**
     * Dezimalwert mit insgesamt 16 Stellen, davon 6 nach dem Komma
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
     * Ruft den Wert der type-Eigenschaft ab.
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
     */
    public void setType(String value) {
        this.type = value;
    }

}
