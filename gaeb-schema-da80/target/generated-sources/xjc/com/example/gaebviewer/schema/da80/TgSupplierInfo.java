//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v4.0.5 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
//


package com.example.gaebviewer.schema.da80;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Informationen zum Lieferanten
 * 
 * <p>Java-Klasse für tgSupplierInfo complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgSupplierInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="IDNo" type="{}tgNormalizedString20" minOccurs="0"/>
 *         <element name="Address" type="{}tgAddress"/>
 *         <element name="TaxNo" type="{}tgNormalizedString80"/>
 *         <element name="RegNo" type="{}tgNormalizedString"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgSupplierInfo", namespace = "", propOrder = {
    "idNo",
    "address",
    "taxNo",
    "regNo"
})
public class TgSupplierInfo {

    /**
     * Lieferanten-Nummer
     * 
     */
    @XmlElement(name = "IDNo")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String idNo;
    /**
     * Informationen zur Adresse des Lieferanten
     * 
     */
    @XmlElement(name = "Address", required = true)
    protected TgAddress address;
    /**
     * Steuernummer
     * 
     */
    @XmlElement(name = "TaxNo", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String taxNo;
    /**
     * Unternehmens / Ortsregistrierungsnummer 
     * WEEE Registrierungsnummer
     * 
     */
    @XmlElement(name = "RegNo", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String regNo;

    /**
     * Lieferanten-Nummer
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDNo() {
        return idNo;
    }

    /**
     * Legt den Wert der idNo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getIDNo()
     */
    public void setIDNo(String value) {
        this.idNo = value;
    }

    /**
     * Informationen zur Adresse des Lieferanten
     * 
     * @return
     *     possible object is
     *     {@link TgAddress }
     *     
     */
    public TgAddress getAddress() {
        return address;
    }

    /**
     * Legt den Wert der address-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgAddress }
     *     
     * @see #getAddress()
     */
    public void setAddress(TgAddress value) {
        this.address = value;
    }

    /**
     * Steuernummer
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxNo() {
        return taxNo;
    }

    /**
     * Legt den Wert der taxNo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTaxNo()
     */
    public void setTaxNo(String value) {
        this.taxNo = value;
    }

    /**
     * Unternehmens / Ortsregistrierungsnummer 
     * WEEE Registrierungsnummer
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegNo() {
        return regNo;
    }

    /**
     * Legt den Wert der regNo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRegNo()
     */
    public void setRegNo(String value) {
        this.regNo = value;
    }

}
