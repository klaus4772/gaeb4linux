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
 * Tabellenkopf
 * 
 * <p>Java-Klasse für tgth complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgth">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice maxOccurs="unbounded" minOccurs="0">
 *         <element name="p" type="{}tgp"/>
 *         <element name="div" type="{}tgdiv"/>
 *         <element name="span" type="{}tgspan"/>
 *         <element name="br" type="{}tgbr"/>
 *         <element name="table" type="{}tgtable" maxOccurs="unbounded"/>
 *         <element name="ul" type="{}tgul"/>
 *         <element name="ol" type="{}tgol"/>
 *       </choice>
 *       <attribute name="class" type="{}tgAttClass" />
 *       <attribute name="style" type="{}tgAttStyle" />
 *       <attribute name="align" type="{}tgAttAlign" />
 *       <attribute name="valign" type="{}tgAttValign" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgth", namespace = "", propOrder = {
    "pOrDivOrSpan"
})
public class Tgth {

    @XmlElementRefs({
        @XmlElementRef(name = "p", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "div", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "span", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "br", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "table", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ul", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ol", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> pOrDivOrSpan;
    @XmlAttribute(name = "class")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String clazz;
    @XmlAttribute(name = "style")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String style;
    /**
     * Ausrichtung
     * 
     */
    @XmlAttribute(name = "align")
    protected TgAttAlign align;
    @XmlAttribute(name = "valign")
    protected TgAttValign valign;

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
     * {@link JAXBElement }{@code <}{@link Tgdiv }{@code >}
     * {@link JAXBElement }{@code <}{@link Tgol }{@code >}
     * {@link JAXBElement }{@code <}{@link Tgp }{@code >}
     * {@link JAXBElement }{@code <}{@link Tgspan }{@code >}
     * {@link JAXBElement }{@code <}{@link Tgtable }{@code >}
     * {@link JAXBElement }{@code <}{@link Tgul }{@code >}
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
     * Ruft den Wert der clazz-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * Legt den Wert der clazz-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClazz(String value) {
        this.clazz = value;
    }

    /**
     * Ruft den Wert der style-Eigenschaft ab.
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
     */
    public void setStyle(String value) {
        this.style = value;
    }

    /**
     * Ausrichtung
     * 
     * @return
     *     possible object is
     *     {@link TgAttAlign }
     *     
     */
    public TgAttAlign getAlign() {
        return align;
    }

    /**
     * Legt den Wert der align-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgAttAlign }
     *     
     * @see #getAlign()
     */
    public void setAlign(TgAttAlign value) {
        this.align = value;
    }

    /**
     * Ruft den Wert der valign-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TgAttValign }
     *     
     */
    public TgAttValign getValign() {
        return valign;
    }

    /**
     * Legt den Wert der valign-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgAttValign }
     *     
     */
    public void setValign(TgAttValign value) {
        this.valign = value;
    }

}
