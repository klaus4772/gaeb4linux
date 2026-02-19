//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v4.0.5 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
//


package com.example.gaebviewer.schema.da80;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Kurztext
 * 
 * <p>Java-Klasse für tgOutlineText complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgOutlineText">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OutlTSA" type="{}tgYesNo" minOccurs="0"/>
 *         <element name="OutlTxt" type="{}tgOutlTxt"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgOutlineText", namespace = "", propOrder = {
    "outlTSA",
    "outlTxt"
})
public class TgOutlineText {

    /**
     * Kennzeichen Textergaenzung des Ausschreibenden im Kurztext
     * 
     */
    @XmlElement(name = "OutlTSA")
    @XmlSchemaType(name = "normalizedString")
    protected TgYesNo outlTSA;
    /**
     * Kurztext
     * 
     */
    @XmlElement(name = "OutlTxt", required = true)
    protected TgOutlTxt outlTxt;

    /**
     * Kennzeichen Textergaenzung des Ausschreibenden im Kurztext
     * 
     * @return
     *     possible object is
     *     {@link TgYesNo }
     *     
     */
    public TgYesNo getOutlTSA() {
        return outlTSA;
    }

    /**
     * Legt den Wert der outlTSA-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgYesNo }
     *     
     * @see #getOutlTSA()
     */
    public void setOutlTSA(TgYesNo value) {
        this.outlTSA = value;
    }

    /**
     * Kurztext
     * 
     * @return
     *     possible object is
     *     {@link TgOutlTxt }
     *     
     */
    public TgOutlTxt getOutlTxt() {
        return outlTxt;
    }

    /**
     * Legt den Wert der outlTxt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgOutlTxt }
     *     
     * @see #getOutlTxt()
     */
    public void setOutlTxt(TgOutlTxt value) {
        this.outlTxt = value;
    }

}
