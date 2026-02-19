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
 * Informationen zu Einzelauftrag
 * 
 * <p>Java-Klasse für tgIndivAgrInfo complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgIndivAgrInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="InfoPerson" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString80" minOccurs="0"/>
 *         <element name="AttestPerson" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString80" minOccurs="0"/>
 *         <element name="CnstSiteLoc" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgMLText" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgIndivAgrInfo", propOrder = {
    "infoPerson",
    "attestPerson",
    "cnstSiteLoc"
})
public class TgIndivAgrInfo2 {

    /**
     * Auskunftserteilung durch
     * 
     */
    @XmlElement(name = "InfoPerson")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String infoPerson;
    /**
     * Bescheinigung von Stundenlohnzetteln durch
     * 
     */
    @XmlElement(name = "AttestPerson")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String attestPerson;
    /**
     * Ort der Ausführung des Einzelauftrags
     * 
     */
    @XmlElement(name = "CnstSiteLoc")
    protected TgMLText2 cnstSiteLoc;

    /**
     * Auskunftserteilung durch
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfoPerson() {
        return infoPerson;
    }

    /**
     * Legt den Wert der infoPerson-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getInfoPerson()
     */
    public void setInfoPerson(String value) {
        this.infoPerson = value;
    }

    /**
     * Bescheinigung von Stundenlohnzetteln durch
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttestPerson() {
        return attestPerson;
    }

    /**
     * Legt den Wert der attestPerson-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAttestPerson()
     */
    public void setAttestPerson(String value) {
        this.attestPerson = value;
    }

    /**
     * Ort der Ausführung des Einzelauftrags
     * 
     * @return
     *     possible object is
     *     {@link TgMLText2 }
     *     
     */
    public TgMLText2 getCnstSiteLoc() {
        return cnstSiteLoc;
    }

    /**
     * Legt den Wert der cnstSiteLoc-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgMLText2 }
     *     
     * @see #getCnstSiteLoc()
     */
    public void setCnstSiteLoc(TgMLText2 value) {
        this.cnstSiteLoc = value;
    }

}
