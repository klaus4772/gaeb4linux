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
 * Kurz- und Langtext
 * 
 * <p>Java-Klasse für tgCompleteText complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgCompleteText">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ComplTSA" type="{}tgYesNo" minOccurs="0"/>
 *         <element name="ComplTSB" type="{}tgYesNo" minOccurs="0"/>
 *         <element name="DetailTxt" type="{}tgBoQText"/>
 *         <element name="OutlineText" type="{}tgOutlineText" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgCompleteText", namespace = "", propOrder = {
    "complTSA",
    "complTSB",
    "detailTxt",
    "outlineText"
})
public class TgCompleteText {

    /**
     * Kennzeichen Textergaenzung des Ausschreibenden im Langtext
     * 
     */
    @XmlElement(name = "ComplTSA")
    @XmlSchemaType(name = "normalizedString")
    protected TgYesNo complTSA;
    /**
     * Kennzeichen Textergaenzung des Bieters im Langtext
     * 
     */
    @XmlElement(name = "ComplTSB")
    @XmlSchemaType(name = "normalizedString")
    protected TgYesNo complTSB;
    /**
     * Langtext
     * 
     */
    @XmlElement(name = "DetailTxt", required = true)
    protected TgBoQText detailTxt;
    /**
     * Kurztext
     * 
     */
    @XmlElement(name = "OutlineText")
    protected TgOutlineText outlineText;

    /**
     * Kennzeichen Textergaenzung des Ausschreibenden im Langtext
     * 
     * @return
     *     possible object is
     *     {@link TgYesNo }
     *     
     */
    public TgYesNo getComplTSA() {
        return complTSA;
    }

    /**
     * Legt den Wert der complTSA-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgYesNo }
     *     
     * @see #getComplTSA()
     */
    public void setComplTSA(TgYesNo value) {
        this.complTSA = value;
    }

    /**
     * Kennzeichen Textergaenzung des Bieters im Langtext
     * 
     * @return
     *     possible object is
     *     {@link TgYesNo }
     *     
     */
    public TgYesNo getComplTSB() {
        return complTSB;
    }

    /**
     * Legt den Wert der complTSB-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgYesNo }
     *     
     * @see #getComplTSB()
     */
    public void setComplTSB(TgYesNo value) {
        this.complTSB = value;
    }

    /**
     * Langtext
     * 
     * @return
     *     possible object is
     *     {@link TgBoQText }
     *     
     */
    public TgBoQText getDetailTxt() {
        return detailTxt;
    }

    /**
     * Legt den Wert der detailTxt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgBoQText }
     *     
     * @see #getDetailTxt()
     */
    public void setDetailTxt(TgBoQText value) {
        this.detailTxt = value;
    }

    /**
     * Kurztext
     * 
     * @return
     *     possible object is
     *     {@link TgOutlineText }
     *     
     */
    public TgOutlineText getOutlineText() {
        return outlineText;
    }

    /**
     * Legt den Wert der outlineText-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgOutlineText }
     *     
     * @see #getOutlineText()
     */
    public void setOutlineText(TgOutlineText value) {
        this.outlineText = value;
    }

}
