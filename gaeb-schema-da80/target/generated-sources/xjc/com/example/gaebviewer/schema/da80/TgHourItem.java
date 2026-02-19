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
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Stundenlohnarbeiten
 * 
 * <p>Java-Klasse für tgHourItem complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgHourItem">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MarkupIt" type="{}tgYesNo" minOccurs="0"/>
 *         <choice minOccurs="0">
 *           <element name="Qty" type="{}tgDecimal_11_3"/>
 *           <element name="PredQty" type="{}tgDecimal_11_3"/>
 *         </choice>
 *         <element name="QU" type="{}tgQUHour" minOccurs="0"/>
 *         <element name="UP" type="{}tgDecimal_13_3" minOccurs="0"/>
 *         <element name="IT" type="{}tgDecimal_13_2" minOccurs="0"/>
 *         <element name="Description" type="{}tgDescription" minOccurs="0"/>
 *         <element name="CtlgAssign" type="{}tgCtlgAssign" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       <attribute name="RNoPart" use="required" type="{}tgRNoPart" />
 *       <attribute name="RNoIndex" type="{}tgRNoIndex" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgHourItem", namespace = "", propOrder = {
    "markupIt",
    "qty",
    "predQty",
    "qu",
    "up",
    "it",
    "description",
    "ctlgAssign"
})
public class TgHourItem {

    /**
     * Kennzeichen fuer zu bezuschlagen
     * 
     */
    @XmlElement(name = "MarkupIt")
    @XmlSchemaType(name = "normalizedString")
    protected TgYesNo markupIt;
    /**
     * Menge
     * 
     */
    @XmlElement(name = "Qty")
    protected BigDecimal qty;
    /**
     * Voraussichtliche Menge (Prognose)
     * 
     */
    @XmlElement(name = "PredQty")
    protected BigDecimal predQty;
    /**
     * Mengeneinheit
     * 
     */
    @XmlElement(name = "QU")
    @XmlSchemaType(name = "normalizedString")
    protected TgQUHour qu;
    /**
     * Einheitspreis
     * 
     */
    @XmlElement(name = "UP")
    protected BigDecimal up;
    /**
     * Gesamtbetrag incl. Nachlass
     * 
     */
    @XmlElement(name = "IT")
    protected BigDecimal it;
    /**
     * Textorganisation
     * 
     */
    @XmlElement(name = "Description")
    protected TgDescription description;
    @XmlElement(name = "CtlgAssign")
    protected List<TgCtlgAssign> ctlgAssign;
    @XmlAttribute(name = "ID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    /**
     * Teil-OZ
     * 
     */
    @XmlAttribute(name = "RNoPart", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String rNoPart;
    @XmlAttribute(name = "RNoIndex")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String rNoIndex;

    /**
     * Kennzeichen fuer zu bezuschlagen
     * 
     * @return
     *     possible object is
     *     {@link TgYesNo }
     *     
     */
    public TgYesNo getMarkupIt() {
        return markupIt;
    }

    /**
     * Legt den Wert der markupIt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgYesNo }
     *     
     * @see #getMarkupIt()
     */
    public void setMarkupIt(TgYesNo value) {
        this.markupIt = value;
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
     * Voraussichtliche Menge (Prognose)
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPredQty() {
        return predQty;
    }

    /**
     * Legt den Wert der predQty-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getPredQty()
     */
    public void setPredQty(BigDecimal value) {
        this.predQty = value;
    }

    /**
     * Mengeneinheit
     * 
     * @return
     *     possible object is
     *     {@link TgQUHour }
     *     
     */
    public TgQUHour getQU() {
        return qu;
    }

    /**
     * Legt den Wert der qu-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgQUHour }
     *     
     * @see #getQU()
     */
    public void setQU(TgQUHour value) {
        this.qu = value;
    }

    /**
     * Einheitspreis
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUP() {
        return up;
    }

    /**
     * Legt den Wert der up-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getUP()
     */
    public void setUP(BigDecimal value) {
        this.up = value;
    }

    /**
     * Gesamtbetrag incl. Nachlass
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIT() {
        return it;
    }

    /**
     * Legt den Wert der it-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getIT()
     */
    public void setIT(BigDecimal value) {
        this.it = value;
    }

    /**
     * Textorganisation
     * 
     * @return
     *     possible object is
     *     {@link TgDescription }
     *     
     */
    public TgDescription getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgDescription }
     *     
     * @see #getDescription()
     */
    public void setDescription(TgDescription value) {
        this.description = value;
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
     * Teil-OZ
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRNoPart() {
        return rNoPart;
    }

    /**
     * Legt den Wert der rNoPart-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRNoPart()
     */
    public void setRNoPart(String value) {
        this.rNoPart = value;
    }

    /**
     * Ruft den Wert der rNoIndex-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRNoIndex() {
        return rNoIndex;
    }

    /**
     * Legt den Wert der rNoIndex-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRNoIndex(String value) {
        this.rNoIndex = value;
    }

}
