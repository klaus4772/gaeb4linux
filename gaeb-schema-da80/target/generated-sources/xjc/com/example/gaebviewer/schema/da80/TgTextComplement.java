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
 *         <element name="ComplCaption" type="{}tgMLText" minOccurs="0"/>
 *         <choice minOccurs="0">
 *           <element name="ComplBodyDec" type="{}tgComplBodyDec"/>
 *           <element name="ComplBodyInt" type="{}tgComplBodyInt"/>
 *         </choice>
 *         <element name="ComplBody" type="{}tgMLText"/>
 *         <element name="ComplTail" type="{}tgMLText" minOccurs="0"/>
 *         <element name="CtlgAssign" type="{}tgCtlgAssign" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="ID" type="{}tgGUID32" />
 *       <attribute name="MarkLbl" use="required" type="{}tgInteger" />
 *       <attribute name="Kind" use="required" type="{}tgAttKind" />
 *       <attribute name="Empty" type="{}tgYes" />
 *       <attribute name="ArtChrIdent" type="{}tgInteger" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgTextComplement", namespace = "", propOrder = {
    "complCaption",
    "complBodyDec",
    "complBodyInt",
    "complBody",
    "complTail",
    "ctlgAssign"
})
public class TgTextComplement {

    /**
     * Textergaenzung Anfang
     * 
     */
    @XmlElement(name = "ComplCaption")
    protected TgMLText complCaption;
    /**
     * In ComplBody wird der Inhalt wiederholt
     * 
     */
    @XmlElement(name = "ComplBodyDec")
    protected TgComplBodyDec complBodyDec;
    /**
     * In ComplBody wird der Inhalt wiederholt
     * 
     */
    @XmlElement(name = "ComplBodyInt")
    protected TgComplBodyInt complBodyInt;
    /**
     * Textergaenzung Hauptteil
     * 
     */
    @XmlElement(name = "ComplBody", required = true)
    protected TgMLText complBody;
    /**
     * Textergaenzung Ende
     * 
     */
    @XmlElement(name = "ComplTail")
    protected TgMLText complTail;
    @XmlElement(name = "CtlgAssign")
    protected List<TgCtlgAssign> ctlgAssign;
    @XmlAttribute(name = "ID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String id;
    @XmlAttribute(name = "MarkLbl", required = true)
    protected BigInteger markLbl;
    @XmlAttribute(name = "Kind", required = true)
    protected TgAttKind kind;
    @XmlAttribute(name = "Empty")
    protected TgYes empty;
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
     *     {@link TgMLText }
     *     
     */
    public TgMLText getComplCaption() {
        return complCaption;
    }

    /**
     * Legt den Wert der complCaption-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgMLText }
     *     
     * @see #getComplCaption()
     */
    public void setComplCaption(TgMLText value) {
        this.complCaption = value;
    }

    /**
     * In ComplBody wird der Inhalt wiederholt
     * 
     * @return
     *     possible object is
     *     {@link TgComplBodyDec }
     *     
     */
    public TgComplBodyDec getComplBodyDec() {
        return complBodyDec;
    }

    /**
     * Legt den Wert der complBodyDec-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgComplBodyDec }
     *     
     * @see #getComplBodyDec()
     */
    public void setComplBodyDec(TgComplBodyDec value) {
        this.complBodyDec = value;
    }

    /**
     * In ComplBody wird der Inhalt wiederholt
     * 
     * @return
     *     possible object is
     *     {@link TgComplBodyInt }
     *     
     */
    public TgComplBodyInt getComplBodyInt() {
        return complBodyInt;
    }

    /**
     * Legt den Wert der complBodyInt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgComplBodyInt }
     *     
     * @see #getComplBodyInt()
     */
    public void setComplBodyInt(TgComplBodyInt value) {
        this.complBodyInt = value;
    }

    /**
     * Textergaenzung Hauptteil
     * 
     * @return
     *     possible object is
     *     {@link TgMLText }
     *     
     */
    public TgMLText getComplBody() {
        return complBody;
    }

    /**
     * Legt den Wert der complBody-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgMLText }
     *     
     * @see #getComplBody()
     */
    public void setComplBody(TgMLText value) {
        this.complBody = value;
    }

    /**
     * Textergaenzung Ende
     * 
     * @return
     *     possible object is
     *     {@link TgMLText }
     *     
     */
    public TgMLText getComplTail() {
        return complTail;
    }

    /**
     * Legt den Wert der complTail-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgMLText }
     *     
     * @see #getComplTail()
     */
    public void setComplTail(TgMLText value) {
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
     * {@link TgCtlgAssign }
     * </p>
     * 
     * 
     * @return
     *     The value of the ctlgAssign property.
     */
    public List<TgCtlgAssign> getCtlgAssign() {
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
     *     {@link TgAttKind }
     *     
     */
    public TgAttKind getKind() {
        return kind;
    }

    /**
     * Legt den Wert der kind-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgAttKind }
     *     
     */
    public void setKind(TgAttKind value) {
        this.kind = value;
    }

    /**
     * Ruft den Wert der empty-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TgYes }
     *     
     */
    public TgYes getEmpty() {
        return empty;
    }

    /**
     * Legt den Wert der empty-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgYes }
     *     
     */
    public void setEmpty(TgYes value) {
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
