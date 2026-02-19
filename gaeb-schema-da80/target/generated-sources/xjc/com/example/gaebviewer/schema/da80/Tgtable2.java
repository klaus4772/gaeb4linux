//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v4.0.5 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
//


package com.example.gaebviewer.schema.da80;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Tabelle
 * 
 * <p>Java-Klasse für tgtable complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgtable">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="tr" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgtr" maxOccurs="unbounded"/>
 *       </sequence>
 *       <attribute name="class" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgAttClass" />
 *       <attribute name="style" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgAttStyle" />
 *       <attribute name="align" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgAttAlignTable" />
 *       <attribute name="border" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgAttBorder" />
 *       <attribute name="cellpadding" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgAttCellpadding" />
 *       <attribute name="frame" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgAttFrame" />
 *       <attribute name="height" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgAttHeight" />
 *       <attribute name="width" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgAttWidth" />
 *       <attribute name="org" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgAttOrg" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgtable", propOrder = {
    "tr"
})
public class Tgtable2 {

    /**
     * Tabellenzeile
     * 
     */
    @XmlElement(required = true)
    protected List<Tgtr2> tr;
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
    protected TgAttAlignTable2 align;
    /**
     * Linien
     * 
     */
    @XmlAttribute(name = "border")
    protected BigInteger border;
    /**
     * Zellenabstand
     * 
     */
    @XmlAttribute(name = "cellpadding")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String cellpadding;
    @XmlAttribute(name = "frame")
    protected TgAttFrame2 frame;
    @XmlAttribute(name = "height")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String height;
    @XmlAttribute(name = "width")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String width;
    @XmlAttribute(name = "org")
    protected TgAttOrg2 org;

    /**
     * Tabellenzeile
     * 
     * Gets the value of the tr property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tr property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tgtr2 }
     * </p>
     * 
     * 
     * @return
     *     The value of the tr property.
     */
    public List<Tgtr2> getTr() {
        if (tr == null) {
            tr = new ArrayList<>();
        }
        return this.tr;
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
     *     {@link TgAttAlignTable2 }
     *     
     */
    public TgAttAlignTable2 getAlign() {
        return align;
    }

    /**
     * Legt den Wert der align-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgAttAlignTable2 }
     *     
     * @see #getAlign()
     */
    public void setAlign(TgAttAlignTable2 value) {
        this.align = value;
    }

    /**
     * Linien
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
     * @see #getBorder()
     */
    public void setBorder(BigInteger value) {
        this.border = value;
    }

    /**
     * Zellenabstand
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellpadding() {
        return cellpadding;
    }

    /**
     * Legt den Wert der cellpadding-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCellpadding()
     */
    public void setCellpadding(String value) {
        this.cellpadding = value;
    }

    /**
     * Ruft den Wert der frame-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TgAttFrame2 }
     *     
     */
    public TgAttFrame2 getFrame() {
        return frame;
    }

    /**
     * Legt den Wert der frame-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgAttFrame2 }
     *     
     */
    public void setFrame(TgAttFrame2 value) {
        this.frame = value;
    }

    /**
     * Ruft den Wert der height-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeight() {
        return height;
    }

    /**
     * Legt den Wert der height-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeight(String value) {
        this.height = value;
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
     * Ruft den Wert der org-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TgAttOrg2 }
     *     
     */
    public TgAttOrg2 getOrg() {
        return org;
    }

    /**
     * Legt den Wert der org-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgAttOrg2 }
     *     
     */
    public void setOrg(TgAttOrg2 value) {
        this.org = value;
    }

}
