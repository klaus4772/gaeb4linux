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
 * Informationen zur Bankverbindung
 * 
 * <p>Java-Klasse für tgBank complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgBank">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="LblBank" type="{}tgNormalizedString80"/>
 *         <element name="BRNo" type="{}tgNormalizedString30"/>
 *         <element name="AcctNo" type="{}tgNormalizedString20"/>
 *         <element name="BIC" type="{}tgNormalizedString12" minOccurs="0"/>
 *         <element name="IBAN" type="{}tgIBAN" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgBank", namespace = "", propOrder = {
    "lblBank",
    "brNo",
    "acctNo",
    "bic",
    "iban"
})
public class TgBank {

    /**
     * Bezeichnung des Geldinstituts
     * 
     */
    @XmlElement(name = "LblBank", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String lblBank;
    /**
     * Bankleitzahl des Geldinstituts
     * 
     */
    @XmlElement(name = "BRNo", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String brNo;
    /**
     * Kontonummer
     * 
     */
    @XmlElement(name = "AcctNo", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String acctNo;
    @XmlElement(name = "BIC")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String bic;
    @XmlElement(name = "IBAN")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String iban;

    /**
     * Bezeichnung des Geldinstituts
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLblBank() {
        return lblBank;
    }

    /**
     * Legt den Wert der lblBank-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getLblBank()
     */
    public void setLblBank(String value) {
        this.lblBank = value;
    }

    /**
     * Bankleitzahl des Geldinstituts
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBRNo() {
        return brNo;
    }

    /**
     * Legt den Wert der brNo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getBRNo()
     */
    public void setBRNo(String value) {
        this.brNo = value;
    }

    /**
     * Kontonummer
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctNo() {
        return acctNo;
    }

    /**
     * Legt den Wert der acctNo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAcctNo()
     */
    public void setAcctNo(String value) {
        this.acctNo = value;
    }

    /**
     * Ruft den Wert der bic-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBIC() {
        return bic;
    }

    /**
     * Legt den Wert der bic-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBIC(String value) {
        this.bic = value;
    }

    /**
     * Ruft den Wert der iban-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIBAN() {
        return iban;
    }

    /**
     * Legt den Wert der iban-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIBAN(String value) {
        this.iban = value;
    }

}
