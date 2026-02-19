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
 * Formatierte Textbeschreibung mit Textergänzung
 * 
 * <p>Java-Klasse für tgFTextTC complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgFTextTC">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice maxOccurs="unbounded" minOccurs="0">
 *         <element name="p" type="{}tgpTC"/>
 *         <element name="div" type="{}tgdivTC"/>
 *         <element name="span" type="{}tgspan"/>
 *         <element name="ul" type="{}tgulTC" maxOccurs="unbounded"/>
 *         <element name="ol" type="{}tgolTC" maxOccurs="unbounded"/>
 *         <element name="table" type="{}tgtableTC" maxOccurs="unbounded"/>
 *         <element name="br" type="{}tgbr"/>
 *         <element name="page" type="{}tgpage"/>
 *         <element name="Image" type="{}tgImage"/>
 *         <element name="TextComplement" type="{}tgTextComplement"/>
 *       </choice>
 *       <attribute name="style" type="{}tgAttStyle" />
 *       <attribute name="textWidth" type="{}tgNormalizedString" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgFTextTC", namespace = "", propOrder = {
    "pOrDivOrSpan"
})
public class TgFTextTC {

    @XmlElementRefs({
        @XmlElementRef(name = "p", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "div", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "span", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ul", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ol", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "table", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "br", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "page", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Image", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TextComplement", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> pOrDivOrSpan;
    /**
     * Oberster Style für formatierten Text
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
     * {@link JAXBElement }{@code <}{@link TgImage }{@code >}
     * {@link JAXBElement }{@code <}{@link TgTextComplement }{@code >}
     * {@link JAXBElement }{@code <}{@link TgdivTC }{@code >}
     * {@link JAXBElement }{@code <}{@link TgolTC }{@code >}
     * {@link JAXBElement }{@code <}{@link TgpTC }{@code >}
     * {@link JAXBElement }{@code <}{@link Tgspan }{@code >}
     * {@link JAXBElement }{@code <}{@link TgtableTC }{@code >}
     * {@link JAXBElement }{@code <}{@link TgulTC }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
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
     * Oberster Style für formatierten Text
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
