//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v4.0.5 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
//


package com.example.gaebviewer.schema.da80;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Informationen zu einem Artikel
 * 
 * <p>Java-Klasse für tgArticle complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgArticle">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Brand" type="{}tgNormalizedString60" minOccurs="0"/>
 *         <element name="ArtNo" type="{}tgNormalizedString15" minOccurs="0"/>
 *         <element name="Qty" type="{}tgDecimal_11_3" minOccurs="0"/>
 *         <element name="QU" type="{}tgNormalizedString4" minOccurs="0"/>
 *         <element name="ArtOutline" type="{}tgMLText" minOccurs="0"/>
 *         <element name="AddText" type="{}tgAddText" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgArticle", namespace = "", propOrder = {
    "brand",
    "artNo",
    "qty",
    "qu",
    "artOutline",
    "addText"
})
public class TgArticle {

    /**
     * Markenname des Produktes bzw. Markenbezeichnung von Serien
     * 
     */
    @XmlElement(name = "Brand")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String brand;
    /**
     * Artikelnummer
     * 
     */
    @XmlElement(name = "ArtNo")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String artNo;
    /**
     * Menge
     * 
     */
    @XmlElement(name = "Qty")
    protected BigDecimal qty;
    /**
     * Mengeneinheit
     * 
     */
    @XmlElement(name = "QU")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String qu;
    /**
     * Kurzbeschreibung des Artikels
     * 
     */
    @XmlElement(name = "ArtOutline")
    protected TgMLText artOutline;
    /**
     * Zusaetzlicher Text; Zusätzliche Textinformation können hier abgelegt werden.
     * 
     */
    @XmlElement(name = "AddText")
    protected List<TgAddText> addText;

    /**
     * Markenname des Produktes bzw. Markenbezeichnung von Serien
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Legt den Wert der brand-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getBrand()
     */
    public void setBrand(String value) {
        this.brand = value;
    }

    /**
     * Artikelnummer
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArtNo() {
        return artNo;
    }

    /**
     * Legt den Wert der artNo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getArtNo()
     */
    public void setArtNo(String value) {
        this.artNo = value;
    }

    /**
     * Menge
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQty() {
        return qty;
    }

    /**
     * Legt den Wert der qty-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getQty()
     */
    public void setQty(BigDecimal value) {
        this.qty = value;
    }

    /**
     * Mengeneinheit
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQU() {
        return qu;
    }

    /**
     * Legt den Wert der qu-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getQU()
     */
    public void setQU(String value) {
        this.qu = value;
    }

    /**
     * Kurzbeschreibung des Artikels
     * 
     * @return
     *     possible object is
     *     {@link TgMLText }
     *     
     */
    public TgMLText getArtOutline() {
        return artOutline;
    }

    /**
     * Legt den Wert der artOutline-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgMLText }
     *     
     * @see #getArtOutline()
     */
    public void setArtOutline(TgMLText value) {
        this.artOutline = value;
    }

    /**
     * Zusaetzlicher Text; Zusätzliche Textinformation können hier abgelegt werden.
     * 
     * Gets the value of the addText property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addText property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAddText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TgAddText }
     * </p>
     * 
     * 
     * @return
     *     The value of the addText property.
     */
    public List<TgAddText> getAddText() {
        if (addText == null) {
            addText = new ArrayList<>();
        }
        return this.addText;
    }

}
