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
 * <p>Java-Klasse für tgInvoiceCreator complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgInvoiceCreator">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Address" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgAddress"/>
 *         <element name="TaxNo" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString80"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgInvoiceCreator", propOrder = {
    "address",
    "taxNo"
})
public class TgInvoiceCreator2 {

    /**
     * Adresse des Rechnungsersteller
     * 
     */
    @XmlElement(name = "Address", required = true)
    protected TgAddress2 address;
    /**
     * Steuernummer Rechnungsersteller
     * 
     */
    @XmlElement(name = "TaxNo", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String taxNo;

    /**
     * Adresse des Rechnungsersteller
     * 
     * @return
     *     possible object is
     *     {@link TgAddress2 }
     *     
     */
    public TgAddress2 getAddress() {
        return address;
    }

    /**
     * Legt den Wert der address-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgAddress2 }
     *     
     * @see #getAddress()
     */
    public void setAddress(TgAddress2 value) {
        this.address = value;
    }

    /**
     * Steuernummer Rechnungsersteller
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

}
