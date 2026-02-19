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
 *         <element name="ComplTSA" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgYesNo" minOccurs="0"/>
 *         <element name="ComplTSB" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgYesNo" minOccurs="0"/>
 *         <element name="DetailTxt" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgBoQText"/>
 *         <element name="OutlineText" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgOutlineText" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgCompleteText", propOrder = {
    "complTSA",
    "complTSB",
    "detailTxt",
    "outlineText"
})
public class TgCompleteText2 {

    /**
     * Kennzeichen Textergaenzung des Ausschreibenden im Langtext
     * 
     */
    @XmlElement(name = "ComplTSA")
    @XmlSchemaType(name = "normalizedString")
    protected TgYesNo2 complTSA;
    /**
     * Kennzeichen Textergaenzung des Bieters im Langtext
     * 
     */
    @XmlElement(name = "ComplTSB")
    @XmlSchemaType(name = "normalizedString")
    protected TgYesNo2 complTSB;
    /**
     * Langtext
     * 
     */
    @XmlElement(name = "DetailTxt", required = true)
    protected TgBoQText2 detailTxt;
    /**
     * Kurztext
     * 
     */
    @XmlElement(name = "OutlineText")
    protected TgOutlineText2 outlineText;

    /**
     * Kennzeichen Textergaenzung des Ausschreibenden im Langtext
     * 
     * @return
     *     possible object is
     *     {@link TgYesNo2 }
     *     
     */
    public TgYesNo2 getComplTSA() {
        return complTSA;
    }

    /**
     * Legt den Wert der complTSA-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgYesNo2 }
     *     
     * @see #getComplTSA()
     */
    public void setComplTSA(TgYesNo2 value) {
        this.complTSA = value;
    }

    /**
     * Kennzeichen Textergaenzung des Bieters im Langtext
     * 
     * @return
     *     possible object is
     *     {@link TgYesNo2 }
     *     
     */
    public TgYesNo2 getComplTSB() {
        return complTSB;
    }

    /**
     * Legt den Wert der complTSB-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgYesNo2 }
     *     
     * @see #getComplTSB()
     */
    public void setComplTSB(TgYesNo2 value) {
        this.complTSB = value;
    }

    /**
     * Langtext
     * 
     * @return
     *     possible object is
     *     {@link TgBoQText2 }
     *     
     */
    public TgBoQText2 getDetailTxt() {
        return detailTxt;
    }

    /**
     * Legt den Wert der detailTxt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgBoQText2 }
     *     
     * @see #getDetailTxt()
     */
    public void setDetailTxt(TgBoQText2 value) {
        this.detailTxt = value;
    }

    /**
     * Kurztext
     * 
     * @return
     *     possible object is
     *     {@link TgOutlineText2 }
     *     
     */
    public TgOutlineText2 getOutlineText() {
        return outlineText;
    }

    /**
     * Legt den Wert der outlineText-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgOutlineText2 }
     *     
     * @see #getOutlineText()
     */
    public void setOutlineText(TgOutlineText2 value) {
        this.outlineText = value;
    }

}
