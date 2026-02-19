//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v4.0.5 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
//


package com.example.gaebviewer.schema.da80;

import java.math.BigInteger;
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
 * Zelle einer Tabelle
 * 
 * <p>Java-Klasse für tgtd complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgtd">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice maxOccurs="unbounded" minOccurs="0">
 *         <element name="p" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgp"/>
 *         <element name="div" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgdiv"/>
 *         <element name="span" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgspan"/>
 *         <element name="br" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgbr"/>
 *         <element name="table" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgtable" maxOccurs="unbounded"/>
 *         <element name="ol" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgol"/>
 *         <element name="ul" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgul"/>
 *       </choice>
 *       <attribute name="class" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgAttClass" />
 *       <attribute name="style" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgAttStyle" />
 *       <attribute name="align" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgAttAlign" />
 *       <attribute name="colspan" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgAttColspan" />
 *       <attribute name="rowspan" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgAttRowspan" />
 *       <attribute name="valign" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgAttValign" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgtd", propOrder = {
    "pOrDivOrSpan"
})
public class Tgtd2 {

    @XmlElementRefs({
        @XmlElementRef(name = "p", namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "div", namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "span", namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "br", namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "table", namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ol", namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ul", namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", type = JAXBElement.class, required = false)
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
    protected TgAttAlign2 align;
    /**
     * Spaltenzusammenfassung
     * 
     */
    @XmlAttribute(name = "colspan")
    protected BigInteger colspan;
    @XmlAttribute(name = "rowspan")
    protected BigInteger rowspan;
    @XmlAttribute(name = "valign")
    protected TgAttValign2 valign;

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
     * {@link JAXBElement }{@code <}{@link Tgol2 }{@code >}
     * {@link JAXBElement }{@code <}{@link Tgp2 }{@code >}
     * {@link JAXBElement }{@code <}{@link Tgspan2 }{@code >}
     * {@link JAXBElement }{@code <}{@link Tgtable2 }{@code >}
     * {@link JAXBElement }{@code <}{@link Tgul2 }{@code >}
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
     *     {@link TgAttAlign2 }
     *     
     */
    public TgAttAlign2 getAlign() {
        return align;
    }

    /**
     * Legt den Wert der align-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgAttAlign2 }
     *     
     * @see #getAlign()
     */
    public void setAlign(TgAttAlign2 value) {
        this.align = value;
    }

    /**
     * Spaltenzusammenfassung
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getColspan() {
        return colspan;
    }

    /**
     * Legt den Wert der colspan-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getColspan()
     */
    public void setColspan(BigInteger value) {
        this.colspan = value;
    }

    /**
     * Ruft den Wert der rowspan-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRowspan() {
        return rowspan;
    }

    /**
     * Legt den Wert der rowspan-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRowspan(BigInteger value) {
        this.rowspan = value;
    }

    /**
     * Ruft den Wert der valign-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TgAttValign2 }
     *     
     */
    public TgAttValign2 getValign() {
        return valign;
    }

    /**
     * Legt den Wert der valign-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgAttValign2 }
     *     
     */
    public void setValign(TgAttValign2 value) {
        this.valign = value;
    }

}
