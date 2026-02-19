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
 * Tabelle mit Textergänzung
 * 
 * <p>Java-Klasse für tgtableTC complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgtableTC">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="tr" type="{}tgtrTC" maxOccurs="unbounded"/>
 *       </sequence>
 *       <attribute name="class" type="{}tgAttClass" />
 *       <attribute name="style" type="{}tgAttStyle" />
 *       <attribute name="align" type="{}tgAttAlignTable" />
 *       <attribute name="border" type="{}tgAttBorder" />
 *       <attribute name="cellpadding" type="{}tgAttCellpadding" />
 *       <attribute name="frame" type="{}tgAttFrame" />
 *       <attribute name="height" type="{}tgAttHeight" />
 *       <attribute name="width" type="{}tgAttWidth" />
 *       <attribute name="org" type="{}tgAttOrg" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgtableTC", namespace = "", propOrder = {
    "tr"
})
public class TgtableTC {

    /**
     * Tabellenzeile
     * 
     */
    @XmlElement(required = true)
    protected List<TgtrTC> tr;
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
    protected TgAttAlignTable align;
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
    protected TgAttFrame frame;
    @XmlAttribute(name = "height")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String height;
    @XmlAttribute(name = "width")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String width;
    @XmlAttribute(name = "org")
    protected TgAttOrg org;

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
     * {@link TgtrTC }
     * </p>
     * 
     * 
     * @return
     *     The value of the tr property.
     */
    public List<TgtrTC> getTr() {
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
     *     {@link TgAttAlignTable }
     *     
     */
    public TgAttAlignTable getAlign() {
        return align;
    }

    /**
     * Legt den Wert der align-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgAttAlignTable }
     *     
     * @see #getAlign()
     */
    public void setAlign(TgAttAlignTable value) {
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
     *     {@link TgAttFrame }
     *     
     */
    public TgAttFrame getFrame() {
        return frame;
    }

    /**
     * Legt den Wert der frame-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgAttFrame }
     *     
     */
    public void setFrame(TgAttFrame value) {
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
     *     {@link TgAttOrg }
     *     
     */
    public TgAttOrg getOrg() {
        return org;
    }

    /**
     * Legt den Wert der org-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgAttOrg }
     *     
     */
    public void setOrg(TgAttOrg value) {
        this.org = value;
    }

}
