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
 * Informationen zum GAEB-Datenaustausch
 * 
 * <p>Java-Klasse für tgGAEBInfo complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgGAEBInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Version" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgVersion"/>
 *         <element name="VersDate" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgGAEBVersDate"/>
 *         <element name="Date" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDate"/>
 *         <element name="Time" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgTime" minOccurs="0"/>
 *         <element name="ProgSystem" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString60" minOccurs="0"/>
 *         <element name="ProgName" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString60" minOccurs="0"/>
 *         <element name="Certific" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgCertific" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgGAEBInfo", propOrder = {
    "version",
    "versDate",
    "date",
    "time",
    "progSystem",
    "progName",
    "certific"
})
public class TgGAEBInfo2 {

    /**
     * Version des GAEB DA XML
     * 
     */
    @XmlElement(name = "Version", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String version;
    /**
     * Datum der Ausgabe der GAEB-DA-XML  Schnittstellendefinition
     * 
     */
    @XmlElement(name = "VersDate", required = true)
    @XmlSchemaType(name = "gYearMonth")
    protected XMLGregorianCalendar versDate;
    /**
     * Datum
     * 
     */
    @XmlElement(name = "Date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    /**
     * Erstellungszeit der Datenaustauschdatei
     * 
     */
    @XmlElement(name = "Time")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar time;
    /**
     * Programmsystem
     * 
     */
    @XmlElement(name = "ProgSystem")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String progSystem;
    /**
     * Umsetzprogramm
     * 
     */
    @XmlElement(name = "ProgName")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String progName;
    /**
     * Pruefzertifikat der benutzten Version GAEB DA XML liegt vor
     * 
     */
    @XmlElement(name = "Certific")
    @XmlSchemaType(name = "normalizedString")
    protected TgCertific2 certific;

    /**
     * Version des GAEB DA XML
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Legt den Wert der version-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getVersion()
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Datum der Ausgabe der GAEB-DA-XML  Schnittstellendefinition
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVersDate() {
        return versDate;
    }

    /**
     * Legt den Wert der versDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getVersDate()
     */
    public void setVersDate(XMLGregorianCalendar value) {
        this.versDate = value;
    }

    /**
     * Datum
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Legt den Wert der date-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getDate()
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Erstellungszeit der Datenaustauschdatei
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTime() {
        return time;
    }

    /**
     * Legt den Wert der time-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getTime()
     */
    public void setTime(XMLGregorianCalendar value) {
        this.time = value;
    }

    /**
     * Programmsystem
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgSystem() {
        return progSystem;
    }

    /**
     * Legt den Wert der progSystem-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getProgSystem()
     */
    public void setProgSystem(String value) {
        this.progSystem = value;
    }

    /**
     * Umsetzprogramm
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgName() {
        return progName;
    }

    /**
     * Legt den Wert der progName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getProgName()
     */
    public void setProgName(String value) {
        this.progName = value;
    }

    /**
     * Pruefzertifikat der benutzten Version GAEB DA XML liegt vor
     * 
     * @return
     *     possible object is
     *     {@link TgCertific2 }
     *     
     */
    public TgCertific2 getCertific() {
        return certific;
    }

    /**
     * Legt den Wert der certific-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgCertific2 }
     *     
     * @see #getCertific()
     */
    public void setCertific(TgCertific2 value) {
        this.certific = value;
    }

}
