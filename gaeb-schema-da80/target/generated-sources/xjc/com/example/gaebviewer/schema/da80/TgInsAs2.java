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
 * Informationen zur Berufsgenossenschaft
 * 
 * <p>Java-Klasse für tgInsAs complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgInsAs">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="InsAsName" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString60"/>
 *         <element name="InsAsDate" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDate"/>
 *         <element name="InsAsNo" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString20"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgInsAs", propOrder = {
    "insAsName",
    "insAsDate",
    "insAsNo"
})
public class TgInsAs2 {

    /**
     * Bezeichnung der Berufsgenossenschaft
     * 
     */
    @XmlElement(name = "InsAsName", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String insAsName;
    /**
     * Mitglied seit
     * 
     */
    @XmlElement(name = "InsAsDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar insAsDate;
    /**
     * Mitgliedsnummer
     * 
     */
    @XmlElement(name = "InsAsNo", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String insAsNo;

    /**
     * Bezeichnung der Berufsgenossenschaft
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsAsName() {
        return insAsName;
    }

    /**
     * Legt den Wert der insAsName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getInsAsName()
     */
    public void setInsAsName(String value) {
        this.insAsName = value;
    }

    /**
     * Mitglied seit
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInsAsDate() {
        return insAsDate;
    }

    /**
     * Legt den Wert der insAsDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getInsAsDate()
     */
    public void setInsAsDate(XMLGregorianCalendar value) {
        this.insAsDate = value;
    }

    /**
     * Mitgliedsnummer
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsAsNo() {
        return insAsNo;
    }

    /**
     * Legt den Wert der insAsNo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getInsAsNo()
     */
    public void setInsAsNo(String value) {
        this.insAsNo = value;
    }

}
