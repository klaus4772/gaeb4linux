//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v4.0.5 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
//


package com.example.gaebviewer.schema.da80;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Zusaetzlicher Text; Zusätzliche Textinformation können hier abgelegt werden.
 * 
 * <p>Java-Klasse für tgAddText complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgAddText">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OutlineAddText" type="{}tgMLText" minOccurs="0"/>
 *         <element name="DetailAddText" type="{}tgFText"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgAddText", namespace = "", propOrder = {
    "outlineAddText",
    "detailAddText"
})
public class TgAddText {

    @XmlElement(name = "OutlineAddText")
    protected TgMLText outlineAddText;
    @XmlElement(name = "DetailAddText", required = true)
    protected TgFText detailAddText;

    /**
     * Ruft den Wert der outlineAddText-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TgMLText }
     *     
     */
    public TgMLText getOutlineAddText() {
        return outlineAddText;
    }

    /**
     * Legt den Wert der outlineAddText-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgMLText }
     *     
     */
    public void setOutlineAddText(TgMLText value) {
        this.outlineAddText = value;
    }

    /**
     * Ruft den Wert der detailAddText-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TgFText }
     *     
     */
    public TgFText getDetailAddText() {
        return detailAddText;
    }

    /**
     * Legt den Wert der detailAddText-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgFText }
     *     
     */
    public void setDetailAddText(TgFText value) {
        this.detailAddText = value;
    }

}
