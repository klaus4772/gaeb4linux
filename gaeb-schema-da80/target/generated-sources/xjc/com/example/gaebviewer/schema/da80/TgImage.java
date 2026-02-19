//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v4.0.5 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
//


package com.example.gaebviewer.schema.da80;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * einzelnes Bild
 * 
 * <p>Java-Klasse für tgImage complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgImage">
 *   <simpleContent>
 *     <extension base="<>tgString">
 *       <attribute name="align" type="{}tgAttAlign" />
 *       <attribute name="border" type="{}tgAttBorder" />
 *       <attribute name="hspace" type="{}tgNormalizedString" />
 *       <attribute name="vspace" type="{}tgNormalizedString" />
 *       <attribute name="width" type="{}tgAttWidth" />
 *       <attribute name="Type" use="required">
 *         <simpleType>
 *           <restriction base="{}tgNormalizedString">
 *             <enumeration value="image/jpeg"/>
 *             <enumeration value="image/gif"/>
 *             <enumeration value="image/png"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="Name" type="{}tgNormalizedString" />
 *       <attribute name="Encoding" default="base64">
 *         <simpleType>
 *           <restriction base="{}tgNormalizedString">
 *             <enumeration value="base64"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgImage", namespace = "", propOrder = {
    "value"
})
public class TgImage {

    @XmlValue
    protected String value;
    /**
     * Ausrichtung
     * 
     */
    @XmlAttribute(name = "align")
    protected TgAttAlign align;
    @XmlAttribute(name = "border")
    protected BigInteger border;
    @XmlAttribute(name = "hspace")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String hspace;
    @XmlAttribute(name = "vspace")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String vspace;
    @XmlAttribute(name = "width")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String width;
    @XmlAttribute(name = "Type", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String type;
    @XmlAttribute(name = "Name")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String name;
    @XmlAttribute(name = "Encoding")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String encoding;

    /**
     * Ruft den Wert der value-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Legt den Wert der value-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
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
     * Ruft den Wert der border-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBorder() {
        return border;
    }

    /**
     * Legt den Wert der border-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBorder(BigInteger value) {
        this.border = value;
    }

    /**
     * Ruft den Wert der hspace-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHspace() {
        return hspace;
    }

    /**
     * Legt den Wert der hspace-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHspace(String value) {
        this.hspace = value;
    }

    /**
     * Ruft den Wert der vspace-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVspace() {
        return vspace;
    }

    /**
     * Legt den Wert der vspace-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVspace(String value) {
        this.vspace = value;
    }

    /**
     * Ruft den Wert der width-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWidth() {
        return width;
    }

    /**
     * Legt den Wert der width-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWidth(String value) {
        this.width = value;
    }

    /**
     * Ruft den Wert der type-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der encoding-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncoding() {
        if (encoding == null) {
            return "base64";
        } else {
            return encoding;
        }
    }

    /**
     * Legt den Wert der encoding-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncoding(String value) {
        this.encoding = value;
    }

}
