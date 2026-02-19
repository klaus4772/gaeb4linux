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
 * CPV-Nomenklatur
 * 
 * <p>Java-Klasse für tgCPVCode complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgCPVCode">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CPVNo" type="{}tgNormalizedString12"/>
 *         <element name="CPVText" type="{}tgNormalizedString100"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgCPVCode", namespace = "", propOrder = {
    "cpvNo",
    "cpvText"
})
public class TgCPVCode {

    /**
     * Schluesselnummer der CPV-Nomenklatur
     * 
     */
    @XmlElement(name = "CPVNo", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String cpvNo;
    /**
     * Text der CPV-Nomenklatur
     * 
     */
    @XmlElement(name = "CPVText", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String cpvText;

    /**
     * Schluesselnummer der CPV-Nomenklatur
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPVNo() {
        return cpvNo;
    }

    /**
     * Legt den Wert der cpvNo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCPVNo()
     */
    public void setCPVNo(String value) {
        this.cpvNo = value;
    }

    /**
     * Text der CPV-Nomenklatur
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPVText() {
        return cpvText;
    }

    /**
     * Legt den Wert der cpvText-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCPVText()
     */
    public void setCPVText(String value) {
        this.cpvText = value;
    }

}
