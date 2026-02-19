//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v4.0.5 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
//


package com.example.gaebviewer.schema.da80;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Informationen zum Nachtrag
 * 
 * <p>Java-Klasse für tgCOInfo complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgCOInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CONo" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgCONo"/>
 *         <element name="COPhase" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgCOPhase" minOccurs="0"/>
 *         <element name="COStatus" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgCOStatus" minOccurs="0"/>
 *         <element name="COInit" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString">
 *               <enumeration value="Owner"/>
 *               <enumeration value="Contractor"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="COReas" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgFText" minOccurs="0"/>
 *         <element name="RefBoQCOInfo" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString60" minOccurs="0"/>
 *         <element name="CODate" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDate" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgCOInfo", propOrder = {
    "coNo",
    "coPhase",
    "coStatus",
    "coInit",
    "coReas",
    "refBoQCOInfo",
    "coDate"
})
public class TgCOInfo2 {

    /**
     * Nachtragsnummer
     * 
     */
    @XmlElement(name = "CONo")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected int coNo;
    /**
     * Datenaustauschphase bei Nachtraegen
     * 
     */
    @XmlElement(name = "COPhase")
    @XmlSchemaType(name = "normalizedString")
    protected TgCOPhase2 coPhase;
    /**
     * Status des Nachtrags
     * 
     */
    @XmlElement(name = "COStatus")
    @XmlSchemaType(name = "normalizedString")
    protected TgCOStatus2 coStatus;
    /**
     * Ersteller des Nachtrags
     * 
     */
    @XmlElement(name = "COInit")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String coInit;
    /**
     * Erlaeuterungen zur Begruendung des Nachtrags
     * 
     */
    @XmlElement(name = "COReas")
    protected TgFText2 coReas;
    /**
     * Bezeichnung des Auftrags-Leistungsverzeichnisses
     * 
     */
    @XmlElement(name = "RefBoQCOInfo")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String refBoQCOInfo;
    /**
     * Datum der Beauftragung des Nachtrages
     * 
     */
    @XmlElement(name = "CODate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar coDate;

    /**
     * Nachtragsnummer
     * 
     */
    public int getCONo() {
        return coNo;
    }

    /**
     * Legt den Wert der coNo-Eigenschaft fest.
     * 
     */
    public void setCONo(int value) {
        this.coNo = value;
    }

    /**
     * Datenaustauschphase bei Nachtraegen
     * 
     * @return
     *     possible object is
     *     {@link TgCOPhase2 }
     *     
     */
    public TgCOPhase2 getCOPhase() {
        return coPhase;
    }

    /**
     * Legt den Wert der coPhase-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgCOPhase2 }
     *     
     * @see #getCOPhase()
     */
    public void setCOPhase(TgCOPhase2 value) {
        this.coPhase = value;
    }

    /**
     * Status des Nachtrags
     * 
     * @return
     *     possible object is
     *     {@link TgCOStatus2 }
     *     
     */
    public TgCOStatus2 getCOStatus() {
        return coStatus;
    }

    /**
     * Legt den Wert der coStatus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgCOStatus2 }
     *     
     * @see #getCOStatus()
     */
    public void setCOStatus(TgCOStatus2 value) {
        this.coStatus = value;
    }

    /**
     * Ersteller des Nachtrags
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOInit() {
        return coInit;
    }

    /**
     * Legt den Wert der coInit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCOInit()
     */
    public void setCOInit(String value) {
        this.coInit = value;
    }

    /**
     * Erlaeuterungen zur Begruendung des Nachtrags
     * 
     * @return
     *     possible object is
     *     {@link TgFText2 }
     *     
     */
    public TgFText2 getCOReas() {
        return coReas;
    }

    /**
     * Legt den Wert der coReas-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgFText2 }
     *     
     * @see #getCOReas()
     */
    public void setCOReas(TgFText2 value) {
        this.coReas = value;
    }

    /**
     * Bezeichnung des Auftrags-Leistungsverzeichnisses
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefBoQCOInfo() {
        return refBoQCOInfo;
    }

    /**
     * Legt den Wert der refBoQCOInfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRefBoQCOInfo()
     */
    public void setRefBoQCOInfo(String value) {
        this.refBoQCOInfo = value;
    }

    /**
     * Datum der Beauftragung des Nachtrages
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCODate() {
        return coDate;
    }

    /**
     * Legt den Wert der coDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getCODate()
     */
    public void setCODate(XMLGregorianCalendar value) {
        this.coDate = value;
    }

}
