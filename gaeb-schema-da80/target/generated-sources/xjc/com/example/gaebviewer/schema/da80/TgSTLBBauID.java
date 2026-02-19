//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v4.0.5 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
//


package com.example.gaebviewer.schema.da80;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Schlüssel einer Ausprägung (STLB-Bau Identifier)
 * 
 * <p>Java-Klasse für tgSTLBBauID complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgSTLBBauID">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ArtChrIdent" type="{}tgInteger"/>
 *         <element name="ArtChIdx" type="{}tgInteger" minOccurs="0"/>
 *         <element name="ChVIdent" type="{}tgInteger" minOccurs="0"/>
 *         <element name="OutlTextPart" type="{}tgYes" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgSTLBBauID", namespace = "", propOrder = {
    "artChrIdent",
    "artChIdx",
    "chVIdent",
    "outlTextPart"
})
public class TgSTLBBauID {

    /**
     * Identifikator des Beschreibungsmerkmals
     * 
     */
    @XmlElement(name = "ArtChrIdent", required = true)
    protected BigInteger artChrIdent;
    /**
     * Index zum Beschreibungsmerkmal (entfällt bei Textergaenzungen)
     * 
     */
    @XmlElement(name = "ArtChIdx")
    protected BigInteger artChIdx;
    /**
     * Identifikator der Auspraegung (entfällt bei Textergaenzungen)
     * 
     */
    @XmlElement(name = "ChVIdent")
    protected BigInteger chVIdent;
    /**
     * Existiert nur, wenn das Beschreibungsmerkmal einen  Teil des Kurztextes liefert.
     * 
     */
    @XmlElement(name = "OutlTextPart")
    @XmlSchemaType(name = "normalizedString")
    protected TgYes outlTextPart;

    /**
     * Identifikator des Beschreibungsmerkmals
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getArtChrIdent() {
        return artChrIdent;
    }

    /**
     * Legt den Wert der artChrIdent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getArtChrIdent()
     */
    public void setArtChrIdent(BigInteger value) {
        this.artChrIdent = value;
    }

    /**
     * Index zum Beschreibungsmerkmal (entfällt bei Textergaenzungen)
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getArtChIdx() {
        return artChIdx;
    }

    /**
     * Legt den Wert der artChIdx-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getArtChIdx()
     */
    public void setArtChIdx(BigInteger value) {
        this.artChIdx = value;
    }

    /**
     * Identifikator der Auspraegung (entfällt bei Textergaenzungen)
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getChVIdent() {
        return chVIdent;
    }

    /**
     * Legt den Wert der chVIdent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getChVIdent()
     */
    public void setChVIdent(BigInteger value) {
        this.chVIdent = value;
    }

    /**
     * Existiert nur, wenn das Beschreibungsmerkmal einen  Teil des Kurztextes liefert.
     * 
     * @return
     *     possible object is
     *     {@link TgYes }
     *     
     */
    public TgYes getOutlTextPart() {
        return outlTextPart;
    }

    /**
     * Legt den Wert der outlTextPart-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgYes }
     *     
     * @see #getOutlTextPart()
     */
    public void setOutlTextPart(TgYes value) {
        this.outlTextPart = value;
    }

}
