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
 *         <element name="IDNo" type="{}tgNormalizedString20" minOccurs="0"/>
 *         <element name="Address" type="{}tgAddress"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgPlannerInfo", namespace = "", propOrder = {
    "idNo",
    "address"
})
public class TgPlannerInfo {

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
    protected TgAddress address;

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

}
