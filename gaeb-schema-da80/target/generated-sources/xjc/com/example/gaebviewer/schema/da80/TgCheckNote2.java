//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v4.0.5 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
//


package com.example.gaebviewer.schema.da80;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Prüfvermerk
 * 
 * <p>Java-Klasse für tgCheckNote complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgCheckNote">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="State" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgCheckNoteState"/>
 *         <element name="CheckDate" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDate"/>
 *         <element name="Annotation" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString256"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgCheckNote", propOrder = {
    "state",
    "checkDate",
    "annotation"
})
public class TgCheckNote2 {

    @XmlElement(name = "State", required = true)
    @XmlSchemaType(name = "normalizedString")
    protected TgCheckNoteState2 state;
    @XmlElement(name = "CheckDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar checkDate;
    @XmlElement(name = "Annotation", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String annotation;

    /**
     * Ruft den Wert der state-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TgCheckNoteState2 }
     *     
     */
    public TgCheckNoteState2 getState() {
        return state;
    }

    /**
     * Legt den Wert der state-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgCheckNoteState2 }
     *     
     */
    public void setState(TgCheckNoteState2 value) {
        this.state = value;
    }

    /**
     * Ruft den Wert der checkDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCheckDate() {
        return checkDate;
    }

    /**
     * Legt den Wert der checkDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCheckDate(XMLGregorianCalendar value) {
        this.checkDate = value;
    }

    /**
     * Ruft den Wert der annotation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnotation() {
        return annotation;
    }

    /**
     * Legt den Wert der annotation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnotation(String value) {
        this.annotation = value;
    }

}
