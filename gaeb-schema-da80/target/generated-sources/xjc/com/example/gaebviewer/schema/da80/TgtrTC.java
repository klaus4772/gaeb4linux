//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v4.0.5 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
//


package com.example.gaebviewer.schema.da80;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Tabellenzeile mit Textergänzung
 * 
 * <p>Java-Klasse für tgtrTC complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgtrTC">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence maxOccurs="unbounded">
 *         <element name="th" type="{}tgth" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="td" type="{}tgtdTC" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
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
@XmlType(name = "tgtrTC", namespace = "", propOrder = {
    "thAndTd"
})
public class TgtrTC {

    @XmlElements({
        @XmlElement(name = "th", type = Tgth.class),
        @XmlElement(name = "td", type = TgtdTC.class)
    })
    protected List<Object> thAndTd;
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
     * Gets the value of the thAndTd property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the thAndTd property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getThAndTd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TgtdTC }
     * {@link Tgth }
     * </p>
     * 
     * 
     * @return
     *     The value of the thAndTd property.
     */
    public List<Object> getThAndTd() {
        if (thAndTd == null) {
            thAndTd = new ArrayList<>();
        }
        return this.thAndTd;
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
