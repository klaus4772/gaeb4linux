//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v4.0.5 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
//


package com.example.gaebviewer.schema.da80;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java-Klasse für tgCashDiscDays complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgCashDiscDays">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="TypeOfDays">
 *         <simpleType>
 *           <restriction base="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString">
 *             <enumeration value="work days"/>
 *             <enumeration value="week days"/>
 *             <enumeration value="calendar days"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="Days" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgPositiveInteger" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgCashDiscDays")
@XmlSeeAlso({
    com.example.gaebviewer.schema.da80.TgCashDiscount2 .CashDiscDays.class
})
public class TgCashDiscDays2 {

    @XmlAttribute(name = "TypeOfDays")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String typeOfDays;
    @XmlAttribute(name = "Days")
    protected BigInteger days;

    /**
     * Ruft den Wert der typeOfDays-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeOfDays() {
        return typeOfDays;
    }

    /**
     * Legt den Wert der typeOfDays-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeOfDays(String value) {
        this.typeOfDays = value;
    }

    /**
     * Ruft den Wert der days-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDays() {
        return days;
    }

    /**
     * Legt den Wert der days-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDays(BigInteger value) {
        this.days = value;
    }

}
