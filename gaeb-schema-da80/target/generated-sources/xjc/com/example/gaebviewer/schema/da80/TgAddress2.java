//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v4.0.5 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
//


package com.example.gaebviewer.schema.da80;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Informationen zur Adresse
 * 
 * <p>Java-Klasse für tgAddress complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgAddress">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Name1" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString40"/>
 *         <element name="Name2" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString40" minOccurs="0"/>
 *         <element name="Name3" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString40" minOccurs="0"/>
 *         <element name="Name4" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString40" minOccurs="0"/>
 *         <element name="Street" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString40"/>
 *         <element name="PCode" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString20"/>
 *         <element name="City" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString40"/>
 *         <element name="Country" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString40" minOccurs="0"/>
 *         <choice minOccurs="0">
 *           <element name="ILN" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString20"/>
 *           <element name="CtlgAssign" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgCtlgAssign" maxOccurs="unbounded"/>
 *         </choice>
 *         <element name="Contact" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString40" minOccurs="0"/>
 *         <element name="Phone" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString20" minOccurs="0"/>
 *         <element name="Fax" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString20" minOccurs="0"/>
 *         <element name="Email" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString256" minOccurs="0"/>
 *         <element name="VATID" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString80" minOccurs="0"/>
 *         <element name="Bank" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgBank" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgAddress", propOrder = {
    "name1",
    "name2",
    "name3",
    "name4",
    "street",
    "pCode",
    "city",
    "country",
    "iln",
    "ctlgAssign",
    "contact",
    "phone",
    "fax",
    "email",
    "vatid",
    "bank"
})
public class TgAddress2 {

    /**
     * Name Zeile 1
     * 
     */
    @XmlElement(name = "Name1", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String name1;
    /**
     * Name Zeile 2
     * 
     */
    @XmlElement(name = "Name2")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String name2;
    /**
     * Name Zeile 3
     * 
     */
    @XmlElement(name = "Name3")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String name3;
    /**
     * Name Zeile 4
     * 
     */
    @XmlElement(name = "Name4")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String name4;
    /**
     * Strasse und Hausnummer oder "Postfach" und -Nr
     * 
     */
    @XmlElement(name = "Street", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String street;
    /**
     * Postleitzahl
     * 
     */
    @XmlElement(name = "PCode", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String pCode;
    /**
     * Ort
     * 
     */
    @XmlElement(name = "City", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String city;
    /**
     * Laenderbezeichnung
     * 
     */
    @XmlElement(name = "Country")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String country;
    /**
     * ILN-Nummer der Adresse
     * 
     */
    @XmlElement(name = "ILN")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String iln;
    /**
     * Katalogzuordnung
     * 
     */
    @XmlElement(name = "CtlgAssign")
    protected List<TgCtlgAssign2> ctlgAssign;
    /**
     * Ansprechpartner
     * 
     */
    @XmlElement(name = "Contact")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String contact;
    /**
     * Telefonnummer
     * 
     */
    @XmlElement(name = "Phone")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String phone;
    /**
     * Faxnummer
     * 
     */
    @XmlElement(name = "Fax")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String fax;
    /**
     * Email-Adresse
     * 
     */
    @XmlElement(name = "Email")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String email;
    /**
     * Umsatzsteuer-Identnummer
     * 
     */
    @XmlElement(name = "VATID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String vatid;
    /**
     * Informationen zur Bankverbindung
     * 
     */
    @XmlElement(name = "Bank")
    protected List<TgBank2> bank;

    /**
     * Name Zeile 1
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName1() {
        return name1;
    }

    /**
     * Legt den Wert der name1-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getName1()
     */
    public void setName1(String value) {
        this.name1 = value;
    }

    /**
     * Name Zeile 2
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName2() {
        return name2;
    }

    /**
     * Legt den Wert der name2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getName2()
     */
    public void setName2(String value) {
        this.name2 = value;
    }

    /**
     * Name Zeile 3
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName3() {
        return name3;
    }

    /**
     * Legt den Wert der name3-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getName3()
     */
    public void setName3(String value) {
        this.name3 = value;
    }

    /**
     * Name Zeile 4
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName4() {
        return name4;
    }

    /**
     * Legt den Wert der name4-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getName4()
     */
    public void setName4(String value) {
        this.name4 = value;
    }

    /**
     * Strasse und Hausnummer oder "Postfach" und -Nr
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet() {
        return street;
    }

    /**
     * Legt den Wert der street-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getStreet()
     */
    public void setStreet(String value) {
        this.street = value;
    }

    /**
     * Postleitzahl
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCode() {
        return pCode;
    }

    /**
     * Legt den Wert der pCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPCode()
     */
    public void setPCode(String value) {
        this.pCode = value;
    }

    /**
     * Ort
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Legt den Wert der city-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCity()
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Laenderbezeichnung
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Legt den Wert der country-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCountry()
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * ILN-Nummer der Adresse
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getILN() {
        return iln;
    }

    /**
     * Legt den Wert der iln-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getILN()
     */
    public void setILN(String value) {
        this.iln = value;
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
     * Ansprechpartner
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContact() {
        return contact;
    }

    /**
     * Legt den Wert der contact-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getContact()
     */
    public void setContact(String value) {
        this.contact = value;
    }

    /**
     * Telefonnummer
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Legt den Wert der phone-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPhone()
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Faxnummer
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * Legt den Wert der fax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFax()
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * Email-Adresse
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Legt den Wert der email-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getEmail()
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Umsatzsteuer-Identnummer
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVATID() {
        return vatid;
    }

    /**
     * Legt den Wert der vatid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getVATID()
     */
    public void setVATID(String value) {
        this.vatid = value;
    }

    /**
     * Informationen zur Bankverbindung
     * 
     * Gets the value of the bank property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bank property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getBank().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TgBank2 }
     * </p>
     * 
     * 
     * @return
     *     The value of the bank property.
     */
    public List<TgBank2> getBank() {
        if (bank == null) {
            bank = new ArrayList<>();
        }
        return this.bank;
    }

}
