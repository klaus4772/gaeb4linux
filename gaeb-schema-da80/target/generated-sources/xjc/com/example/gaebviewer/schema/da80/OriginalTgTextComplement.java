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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Textergaenzung
 * 
 * <p>Java-Klasse für tgTextComplement complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgTextComplement">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ComplCaption" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgMLText" minOccurs="0"/>
 *         <choice minOccurs="0">
 *           <element name="ComplBodyDec" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgComplBodyDec"/>
 *           <element name="ComplBodyInt" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgComplBodyInt"/>
 *         </choice>
 *         <element name="ComplBody" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgMLText"/>
 *         <element name="ComplTail" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgMLText" minOccurs="0"/>
 *         <element name="CtlgAssign" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgCtlgAssign" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="ID" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgGUID32" />
 *       <attribute name="MarkLbl" use="required" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgInteger" />
 *       <attribute name="Kind" use="required" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgAttKind" />
 *       <attribute name="Empty" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgYes" />
 *       <attribute name="ArtChrIdent" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgInteger" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "complCaption",
    "complBodyDec",
    "complBodyInt",
    "complBody",
    "complTail",
    "ctlgAssign"
})
@XmlSeeAlso({
    TgTextComplement2 .class
})
public class OriginalTgTextComplement {

    /**
     * Textergaenzung Anfang
     * 
     */
    @XmlElement(name = "ComplCaption")
    protected TgMLText2 complCaption;
    /**
     * In ComplBody wird der Inhalt wiederholt
     * 
     */
    @XmlElement(name = "ComplBodyDec")
    protected TgComplBodyDec2 complBodyDec;
    /**
     * In ComplBody wird der Inhalt wiederholt
     * 
     */
    @XmlElement(name = "ComplBodyInt")
    protected TgComplBodyInt2 complBodyInt;
    /**
     * Textergaenzung Hauptteil
     * 
     */
    @XmlElement(name = "ComplBody", required = true)
    protected TgMLText2 complBody;
    /**
     * Textergaenzung Ende
     * 
     */
    @XmlElement(name = "ComplTail")
    protected TgMLText2 complTail;
    @XmlElement(name = "CtlgAssign")
    protected List<TgCtlgAssign2> ctlgAssign;
    @XmlAttribute(name = "ID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String id;
    @XmlAttribute(name = "MarkLbl", required = true)
    protected BigInteger markLbl;
    @XmlAttribute(name = "Kind", required = true)
    protected TgAttKind2 kind;
    @XmlAttribute(name = "Empty")
    protected TgYes2 empty;
    /**
     * Identifikator des STLB-Bau Beschreibungsmerkmals
     * 
     */
    @XmlAttribute(name = "ArtChrIdent")
    protected BigInteger artChrIdent;

    /**
     * Textergaenzung Anfang
     * 
     * @return
     *     possible object is
     *     {@link TgMLText2 }
     *     
     */
    public TgMLText2 getComplCaption() {
        return complCaption;
    }

    /**
     * Legt den Wert der complCaption-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgMLText2 }
     *     
     * @see #getComplCaption()
     */
    public void setComplCaption(TgMLText2 value) {
        this.complCaption = value;
    }

    /**
     * In ComplBody wird der Inhalt wiederholt
     * 
     * @return
     *     possible object is
     *     {@link TgComplBodyDec2 }
     *     
     */
    public TgComplBodyDec2 getComplBodyDec() {
        return complBodyDec;
    }

    /**
     * Legt den Wert der complBodyDec-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgComplBodyDec2 }
     *     
     * @see #getComplBodyDec()
     */
    public void setComplBodyDec(TgComplBodyDec2 value) {
        this.complBodyDec = value;
    }

    /**
     * In ComplBody wird der Inhalt wiederholt
     * 
     * @return
     *     possible object is
     *     {@link TgComplBodyInt2 }
     *     
     */
    public TgComplBodyInt2 getComplBodyInt() {
        return complBodyInt;
    }

    /**
     * Legt den Wert der complBodyInt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgComplBodyInt2 }
     *     
     * @see #getComplBodyInt()
     */
    public void setComplBodyInt(TgComplBodyInt2 value) {
        this.complBodyInt = value;
    }

    /**
     * Textergaenzung Hauptteil
     * 
     * @return
     *     possible object is
     *     {@link TgMLText2 }
     *     
     */
    public TgMLText2 getComplBody() {
        return complBody;
    }

    /**
     * Legt den Wert der complBody-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgMLText2 }
     *     
     * @see #getComplBody()
     */
    public void setComplBody(TgMLText2 value) {
        this.complBody = value;
    }

    /**
     * Textergaenzung Ende
     * 
     * @return
     *     possible object is
     *     {@link TgMLText2 }
     *     
     */
    public TgMLText2 getComplTail() {
        return complTail;
    }

    /**
     * Legt den Wert der complTail-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgMLText2 }
     *     
     * @see #getComplTail()
     */
    public void setComplTail(TgMLText2 value) {
        this.complTail = value;
    }

    /**
     * Gets the value of the ctlgAssign property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ctlgAssign property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCtlgAssign().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TgCtlgAssign2 }
     * </p>
     * 
     * 
     * @return
     *     The value of the ctlgAssign property.
     */
    public List<TgCtlgAssign2> getCtlgAssign() {
        if (ctlgAssign == null) {
            ctlgAssign = new ArrayList<>();
        }
        return this.ctlgAssign;
    }

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Ruft den Wert der markLbl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMarkLbl() {
        return markLbl;
    }

    /**
     * Legt den Wert der markLbl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMarkLbl(BigInteger value) {
        this.markLbl = value;
    }

    /**
     * Ruft den Wert der kind-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TgAttKind2 }
     *     
     */
    public TgAttKind2 getKind() {
        return kind;
    }

    /**
     * Legt den Wert der kind-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgAttKind2 }
     *     
     */
    public void setKind(TgAttKind2 value) {
        this.kind = value;
    }

    /**
     * Ruft den Wert der empty-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TgYes2 }
     *     
     */
    public TgYes2 getEmpty() {
        return empty;
    }

    /**
     * Legt den Wert der empty-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgYes2 }
     *     
     */
    public void setEmpty(TgYes2 value) {
        this.empty = value;
    }

    /**
     * Identifikator des STLB-Bau Beschreibungsmerkmals
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getArtChrIdent() {
        return artChrIdent;
    }

    /**
     * Legt den Wert der artChrIdent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getArtChrIdent()
     */
    public void setArtChrIdent(BigInteger value) {
        this.artChrIdent = value;
    }

}
