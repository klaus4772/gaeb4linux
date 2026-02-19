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
 *         <element name="OutlTSA" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgYesNo" minOccurs="0"/>
 *         <element name="OutlTxt" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgOutlTxt"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgOutlineText", propOrder = {
    "outlTSA",
    "outlTxt"
})
public class TgOutlineText2 {

    /**
     * Kennzeichen Textergaenzung des Ausschreibenden im Kurztext
     * 
     */
    @XmlElement(name = "OutlTSA")
    @XmlSchemaType(name = "normalizedString")
    protected TgYesNo2 outlTSA;
    /**
     * Kurztext
     * 
     */
    @XmlElement(name = "OutlTxt", required = true)
    protected TgOutlTxt2 outlTxt;

    /**
     * Kennzeichen Textergaenzung des Ausschreibenden im Kurztext
     * 
     * @return
     *     possible object is
     *     {@link TgYesNo2 }
     *     
     */
    public TgYesNo2 getOutlTSA() {
        return outlTSA;
    }

    /**
     * Legt den Wert der outlTSA-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgYesNo2 }
     *     
     * @see #getOutlTSA()
     */
    public void setOutlTSA(TgYesNo2 value) {
        this.outlTSA = value;
    }

    /**
     * Kurztext
     * 
     * @return
     *     possible object is
     *     {@link TgOutlTxt2 }
     *     
     */
    public TgOutlTxt2 getOutlTxt() {
        return outlTxt;
    }

    /**
     * Legt den Wert der outlTxt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgOutlTxt2 }
     *     
     * @see #getOutlTxt()
     */
    public void setOutlTxt(TgOutlTxt2 value) {
        this.outlTxt = value;
    }

}
