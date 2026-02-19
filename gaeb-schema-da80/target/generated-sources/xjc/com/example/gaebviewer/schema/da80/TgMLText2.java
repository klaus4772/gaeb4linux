//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v4.0.5 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
//


package com.example.gaebviewer.schema.da80;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Mehrzeilige Textbeschreibung
 * 
 * <p>Java-Klasse für tgMLText complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgMLText">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice maxOccurs="unbounded" minOccurs="0">
 *         <element name="p" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgpMLText"/>
 *         <element name="div" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgdiv"/>
 *         <element name="span" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgspan"/>
 *         <element name="br" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgbr"/>
 *       </choice>
 *       <attribute name="style" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgAttStyle" />
 *       <attribute name="textWidth" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgMLText", propOrder = {
    "pOrDivOrSpan"
})
public class TgMLText2 {

    @XmlElementRefs({
        @XmlElementRef(name = "p", namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "div", namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "span", namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "br", namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> pOrDivOrSpan;
    /**
     * Oberster Style für mehrzeiligen Text
     * 
     */
    @XmlAttribute(name = "style")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String style;
    @XmlAttribute(name = "textWidth")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String textWidth;

    /**
     * Gets the value of the pOrDivOrSpan property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pOrDivOrSpan property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPOrDivOrSpan().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Tgdiv2 }{@code >}
     * {@link JAXBElement }{@code <}{@link TgpMLText2 }{@code >}
     * {@link JAXBElement }{@code <}{@link Tgspan2 }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * </p>
     * 
     * 
     * @return
     *     The value of the pOrDivOrSpan property.
     */
    public List<JAXBElement<?>> getPOrDivOrSpan() {
        if (pOrDivOrSpan == null) {
            pOrDivOrSpan = new ArrayList<>();
        }
        return this.pOrDivOrSpan;
    }

    /**
     * Oberster Style für mehrzeiligen Text
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStyle() {
        return style;
    }

    /**
     * Legt den Wert der style-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getStyle()
     */
    public void setStyle(String value) {
        this.style = value;
    }

    /**
     * Ruft den Wert der textWidth-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextWidth() {
        return textWidth;
    }

    /**
     * Legt den Wert der textWidth-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextWidth(String value) {
        this.textWidth = value;
    }

}
