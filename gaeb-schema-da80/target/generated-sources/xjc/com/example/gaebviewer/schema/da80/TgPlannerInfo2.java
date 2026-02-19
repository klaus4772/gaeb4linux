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
 * Informationen zum Planer (Projektanten)
 * 
 * <p>Java-Klasse für tgPlannerInfo complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgPlannerInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="IDNo" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString20" minOccurs="0"/>
 *         <element name="Address" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgAddress"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgPlannerInfo", propOrder = {
    "idNo",
    "address"
})
public class TgPlannerInfo2 {

    /**
     * Planer-Nummer
     * 
     */
    @XmlElement(name = "IDNo")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String idNo;
    /**
     * Informationen zur Adresse des Planers
     * 
     */
    @XmlElement(name = "Address", required = true)
    protected TgAddress2 address;

    /**
     * Planer-Nummer
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
     * Informationen zur Adresse des Planers
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

}
