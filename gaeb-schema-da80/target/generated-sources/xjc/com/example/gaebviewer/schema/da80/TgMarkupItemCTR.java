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
 * Zuschlagsposition
 * 
 * <p>Java-Klasse für tgMarkupItemCTR complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgMarkupItemCTR">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RefItem" type="{}tgRefItem" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Markup" type="{}tgDecimal_9_6" minOccurs="0"/>
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
@XmlType(name = "tgMarkupItemCTR", namespace = "", propOrder = {
    "refItem",
    "markup",
    "description",
    "ctlgAssign"
})
public class TgMarkupItemCTR {

    /**
     * Verweis auf Position
     * 
     */
    @XmlElement(name = "RefItem")
    protected List<TgRefItem> refItem;
    /**
     * Zuschlagsprozentsatz
     * 
     */
    @XmlElement(name = "Markup")
    protected BigDecimal markup;
    /**
     * Textorganisation
     * 
     */
    @XmlElement(name = "Description")
    protected TgDescription description;
    /**
     * Katalogzuordnung
     * 
     */
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
     * Verweis auf Position
     * 
     * Gets the value of the refItem property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refItem property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRefItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TgRefItem }
     * </p>
     * 
     * 
     * @return
     *     The value of the refItem property.
     */
    public List<TgRefItem> getRefItem() {
        if (refItem == null) {
            refItem = new ArrayList<>();
        }
        return this.refItem;
    }

    /**
     * Zuschlagsprozentsatz
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMarkup() {
        return markup;
    }

    /**
     * Legt den Wert der markup-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getMarkup()
     */
    public void setMarkup(BigDecimal value) {
        this.markup = value;
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
     * Katalogzuordnung
     * 
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
