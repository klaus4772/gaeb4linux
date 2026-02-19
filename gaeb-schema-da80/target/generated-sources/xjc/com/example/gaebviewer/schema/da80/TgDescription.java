//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v4.0.5 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
//


package com.example.gaebviewer.schema.da80;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Textorganisation
 * 
 * <p>Java-Klasse für tgDescription complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgDescription">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <choice minOccurs="0">
 *           <element name="STLBBau" type="{}tgSTLBBau"/>
 *           <element name="StLNo" type="{}tgStLNo"/>
 *         </choice>
 *         <element name="WICNo" type="{}tgNormalizedString40" minOccurs="0"/>
 *         <choice minOccurs="0">
 *           <element name="CompleteText" type="{}tgCompleteText"/>
 *           <element name="OutlineText" type="{}tgOutlineText"/>
 *         </choice>
 *         <element name="SubmissionComment" type="{}tgMLText" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="ID" type="{}tgGUID32" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgDescription", namespace = "", propOrder = {
    "stlbBau",
    "stLNo",
    "wicNo",
    "completeText",
    "outlineText",
    "submissionComment"
})
@XmlSeeAlso({
    TgPerfDescription.class
})
public class TgDescription {

    /**
     * Schluessel STLB-Bau
     * 
     */
    @XmlElement(name = "STLBBau")
    protected TgSTLBBau stlbBau;
    /**
     * Standardleistungsnummer (StLB/STLK)
     * 
     */
    @XmlElement(name = "StLNo")
    protected TgStLNo stLNo;
    /**
     * Katalognummer (Mutter-LV)
     * 
     */
    @XmlElement(name = "WICNo")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String wicNo;
    /**
     * Kurz- und Langtext
     * 
     */
    @XmlElement(name = "CompleteText")
    protected TgCompleteText completeText;
    /**
     * Kurztext
     * 
     */
    @XmlElement(name = "OutlineText")
    protected TgOutlineText outlineText;
    /**
     * Nur in 84P-Dateien
     * 
     */
    @XmlElement(name = "SubmissionComment")
    protected TgMLText submissionComment;
    /**
     * Die ID muss in 83 - > 84 Austausch erhalten bleiben. Damit können Descriptions eindeutig Identifiziert werden.
     * 
     */
    @XmlAttribute(name = "ID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String id;

    /**
     * Schluessel STLB-Bau
     * 
     * @return
     *     possible object is
     *     {@link TgSTLBBau }
     *     
     */
    public TgSTLBBau getSTLBBau() {
        return stlbBau;
    }

    /**
     * Legt den Wert der stlbBau-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgSTLBBau }
     *     
     * @see #getSTLBBau()
     */
    public void setSTLBBau(TgSTLBBau value) {
        this.stlbBau = value;
    }

    /**
     * Standardleistungsnummer (StLB/STLK)
     * 
     * @return
     *     possible object is
     *     {@link TgStLNo }
     *     
     */
    public TgStLNo getStLNo() {
        return stLNo;
    }

    /**
     * Legt den Wert der stLNo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgStLNo }
     *     
     * @see #getStLNo()
     */
    public void setStLNo(TgStLNo value) {
        this.stLNo = value;
    }

    /**
     * Katalognummer (Mutter-LV)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWICNo() {
        return wicNo;
    }

    /**
     * Legt den Wert der wicNo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getWICNo()
     */
    public void setWICNo(String value) {
        this.wicNo = value;
    }

    /**
     * Kurz- und Langtext
     * 
     * @return
     *     possible object is
     *     {@link TgCompleteText }
     *     
     */
    public TgCompleteText getCompleteText() {
        return completeText;
    }

    /**
     * Legt den Wert der completeText-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgCompleteText }
     *     
     * @see #getCompleteText()
     */
    public void setCompleteText(TgCompleteText value) {
        this.completeText = value;
    }

    /**
     * Kurztext
     * 
     * @return
     *     possible object is
     *     {@link TgOutlineText }
     *     
     */
    public TgOutlineText getOutlineText() {
        return outlineText;
    }

    /**
     * Legt den Wert der outlineText-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgOutlineText }
     *     
     * @see #getOutlineText()
     */
    public void setOutlineText(TgOutlineText value) {
        this.outlineText = value;
    }

    /**
     * Nur in 84P-Dateien
     * 
     * @return
     *     possible object is
     *     {@link TgMLText }
     *     
     */
    public TgMLText getSubmissionComment() {
        return submissionComment;
    }

    /**
     * Legt den Wert der submissionComment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgMLText }
     *     
     * @see #getSubmissionComment()
     */
    public void setSubmissionComment(TgMLText value) {
        this.submissionComment = value;
    }

    /**
     * Die ID muss in 83 - > 84 Austausch erhalten bleiben. Damit können Descriptions eindeutig Identifiziert werden.
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
     * @see #getID()
     */
    public void setID(String value) {
        this.id = value;
    }

}
