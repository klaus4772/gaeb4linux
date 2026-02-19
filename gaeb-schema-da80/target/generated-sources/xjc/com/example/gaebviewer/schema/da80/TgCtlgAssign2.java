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
 * Katalogzuordnung
 * 
 * <p>Java-Klasse für tgCtlgAssign complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgCtlgAssign">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CtlgID" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString100"/>
 *         <element name="CtlgCode" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString100"/>
 *         <element name="Quantity" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgCtlgAssignQuantity" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgCtlgAssign", propOrder = {
    "ctlgID",
    "ctlgCode",
    "quantity"
})
public class TgCtlgAssign2 {

    /**
     * Identifikator des Kataloges
     * 
     */
    @XmlElement(name = "CtlgID", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String ctlgID;
    /**
     * Schluessel der Zuordnung. Dies kann auch eine UUID (Universally Unique Identifier)  z. B. "936DA01F-9ABD-4D9D-80C7-02AF85C822A8" sein.
     * 
     */
    @XmlElement(name = "CtlgCode", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String ctlgCode;
    /**
     * Wert für den Anteil. Siehe CtlgAssignType in tgCtlg
     * 
     */
    @XmlElement(name = "Quantity")
    protected TgCtlgAssignQuantity2 quantity;

    /**
     * Identifikator des Kataloges
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtlgID() {
        return ctlgID;
    }

    /**
     * Legt den Wert der ctlgID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCtlgID()
     */
    public void setCtlgID(String value) {
        this.ctlgID = value;
    }

    /**
     * Schluessel der Zuordnung. Dies kann auch eine UUID (Universally Unique Identifier)  z. B. "936DA01F-9ABD-4D9D-80C7-02AF85C822A8" sein.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtlgCode() {
        return ctlgCode;
    }

    /**
     * Legt den Wert der ctlgCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCtlgCode()
     */
    public void setCtlgCode(String value) {
        this.ctlgCode = value;
    }

    /**
     * Wert für den Anteil. Siehe CtlgAssignType in tgCtlg
     * 
     * @return
     *     possible object is
     *     {@link TgCtlgAssignQuantity2 }
     *     
     */
    public TgCtlgAssignQuantity2 getQuantity() {
        return quantity;
    }

    /**
     * Legt den Wert der quantity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgCtlgAssignQuantity2 }
     *     
     * @see #getQuantity()
     */
    public void setQuantity(TgCtlgAssignQuantity2 value) {
        this.quantity = value;
    }

}
