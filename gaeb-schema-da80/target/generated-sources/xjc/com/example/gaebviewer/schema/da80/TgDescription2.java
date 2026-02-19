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
 *           <element name="STLBBau" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgSTLBBau"/>
 *           <element name="StLNo" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgStLNo"/>
 *         </choice>
 *         <element name="WICNo" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString40" minOccurs="0"/>
 *         <choice minOccurs="0">
 *           <element name="CompleteText" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgCompleteText"/>
 *           <element name="OutlineText" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgOutlineText"/>
 *         </choice>
 *         <element name="SubmissionComment" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgMLText" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="ID" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgGUID32" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgDescription", propOrder = {
    "stlbBau",
    "stLNo",
    "wicNo",
    "completeText",
    "outlineText",
    "submissionComment"
})
@XmlSeeAlso({
    TgPerfDescription2 .class
})
public class TgDescription2 {

    /**
     * Schluessel STLB-Bau
     * 
     */
    @XmlElement(name = "STLBBau")
    protected TgSTLBBau2 stlbBau;
    /**
     * Standardleistungsnummer (StLB/STLK)
     * 
     */
    @XmlElement(name = "StLNo")
    protected TgStLNo2 stLNo;
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
    protected TgCompleteText2 completeText;
    /**
     * Kurztext
     * 
     */
    @XmlElement(name = "OutlineText")
    protected TgOutlineText2 outlineText;
    /**
     * Nur in 84P-Dateien
     * 
     */
    @XmlElement(name = "SubmissionComment")
    protected TgMLText2 submissionComment;
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
     *     {@link TgSTLBBau2 }
     *     
     */
    public TgSTLBBau2 getSTLBBau() {
        return stlbBau;
    }

    /**
     * Legt den Wert der stlbBau-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgSTLBBau2 }
     *     
     * @see #getSTLBBau()
     */
    public void setSTLBBau(TgSTLBBau2 value) {
        this.stlbBau = value;
    }

    /**
     * Standardleistungsnummer (StLB/STLK)
     * 
     * @return
     *     possible object is
     *     {@link TgStLNo2 }
     *     
     */
    public TgStLNo2 getStLNo() {
        return stLNo;
    }

    /**
     * Legt den Wert der stLNo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgStLNo2 }
     *     
     * @see #getStLNo()
     */
    public void setStLNo(TgStLNo2 value) {
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
     *     {@link TgCompleteText2 }
     *     
     */
    public TgCompleteText2 getCompleteText() {
        return completeText;
    }

    /**
     * Legt den Wert der completeText-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgCompleteText2 }
     *     
     * @see #getCompleteText()
     */
    public void setCompleteText(TgCompleteText2 value) {
        this.completeText = value;
    }

    /**
     * Kurztext
     * 
     * @return
     *     possible object is
     *     {@link TgOutlineText2 }
     *     
     */
    public TgOutlineText2 getOutlineText() {
        return outlineText;
    }

    /**
     * Legt den Wert der outlineText-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgOutlineText2 }
     *     
     * @see #getOutlineText()
     */
    public void setOutlineText(TgOutlineText2 value) {
        this.outlineText = value;
    }

    /**
     * Nur in 84P-Dateien
     * 
     * @return
     *     possible object is
     *     {@link TgMLText2 }
     *     
     */
    public TgMLText2 getSubmissionComment() {
        return submissionComment;
    }

    /**
     * Legt den Wert der submissionComment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgMLText2 }
     *     
     * @see #getSubmissionComment()
     */
    public void setSubmissionComment(TgMLText2 value) {
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
