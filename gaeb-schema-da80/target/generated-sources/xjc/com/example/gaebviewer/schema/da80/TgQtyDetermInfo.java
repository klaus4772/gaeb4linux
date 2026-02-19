//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v4.0.5 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
//


package com.example.gaebviewer.schema.da80;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Informationen zur Mengenermittlung
 * 
 * <p>Java-Klasse für tgQtyDetermInfo complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgQtyDetermInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MethodDescription">
 *           <simpleType>
 *             <restriction base="{}tgNormalizedString">
 *               <enumeration value="REB23003-1979"/>
 *               <enumeration value="REB23003-2009"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="OrdDescr" type="{}tgNormalizedString40" minOccurs="0"/>
 *         <element name="ProjDescr" type="{}tgNormalizedString80" minOccurs="0"/>
 *         <element name="ServiceProvisionStartDate" type="{}tgDate" minOccurs="0"/>
 *         <element name="ServiceProvisionEndDate" type="{}tgDate" minOccurs="0"/>
 *         <element name="Creator" type="{}tgAddress" minOccurs="0"/>
 *         <element name="Profiler" type="{}tgAddress" minOccurs="0"/>
 *         <element name="CtlgAssign" type="{}tgCtlgAssign" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "tgQtyDetermInfo", namespace = "", propOrder = {
    "methodDescription",
    "ordDescr",
    "projDescr",
    "serviceProvisionStartDate",
    "serviceProvisionEndDate",
    "creator",
    "profiler",
    "ctlgAssign"
})
public class TgQtyDetermInfo {

    /**
     * REB Verfahrensbeschreibung
     * 
     */
    @XmlElement(name = "MethodDescription", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String methodDescription;
    /**
     * Bezeichnung des Auftrags (optional)
     * 
     */
    @XmlElement(name = "OrdDescr")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String ordDescr;
    /**
     * Bezeichnung der Baumaßnahme, des BA
     * 
     */
    @XmlElement(name = "ProjDescr")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String projDescr;
    /**
     * Beginn der Leistungserbringung
     * 
     */
    @XmlElement(name = "ServiceProvisionStartDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar serviceProvisionStartDate;
    /**
     * Ende der Leistungserbringung
     * 
     */
    @XmlElement(name = "ServiceProvisionEndDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar serviceProvisionEndDate;
    /**
     * Adresse des Erstellers
     * 
     */
    @XmlElement(name = "Creator")
    protected TgAddress creator;
    /**
     * Adresse des Prüfers
     * 
     */
    @XmlElement(name = "Profiler")
    protected TgAddress profiler;
    @XmlElement(name = "CtlgAssign")
    protected List<TgCtlgAssign> ctlgAssign;
    @XmlAttribute(name = "ID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String id;

    /**
     * REB Verfahrensbeschreibung
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMethodDescription() {
        return methodDescription;
    }

    /**
     * Legt den Wert der methodDescription-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMethodDescription()
     */
    public void setMethodDescription(String value) {
        this.methodDescription = value;
    }

    /**
     * Bezeichnung des Auftrags (optional)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdDescr() {
        return ordDescr;
    }

    /**
     * Legt den Wert der ordDescr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOrdDescr()
     */
    public void setOrdDescr(String value) {
        this.ordDescr = value;
    }

    /**
     * Bezeichnung der Baumaßnahme, des BA
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjDescr() {
        return projDescr;
    }

    /**
     * Legt den Wert der projDescr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getProjDescr()
     */
    public void setProjDescr(String value) {
        this.projDescr = value;
    }

    /**
     * Beginn der Leistungserbringung
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getServiceProvisionStartDate() {
        return serviceProvisionStartDate;
    }

    /**
     * Legt den Wert der serviceProvisionStartDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getServiceProvisionStartDate()
     */
    public void setServiceProvisionStartDate(XMLGregorianCalendar value) {
        this.serviceProvisionStartDate = value;
    }

    /**
     * Ende der Leistungserbringung
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getServiceProvisionEndDate() {
        return serviceProvisionEndDate;
    }

    /**
     * Legt den Wert der serviceProvisionEndDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getServiceProvisionEndDate()
     */
    public void setServiceProvisionEndDate(XMLGregorianCalendar value) {
        this.serviceProvisionEndDate = value;
    }

    /**
     * Adresse des Erstellers
     * 
     * @return
     *     possible object is
     *     {@link TgAddress }
     *     
     */
    public TgAddress getCreator() {
        return creator;
    }

    /**
     * Legt den Wert der creator-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgAddress }
     *     
     * @see #getCreator()
     */
    public void setCreator(TgAddress value) {
        this.creator = value;
    }

    /**
     * Adresse des Prüfers
     * 
     * @return
     *     possible object is
     *     {@link TgAddress }
     *     
     */
    public TgAddress getProfiler() {
        return profiler;
    }

    /**
     * Legt den Wert der profiler-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgAddress }
     *     
     * @see #getProfiler()
     */
    public void setProfiler(TgAddress value) {
        this.profiler = value;
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

}
