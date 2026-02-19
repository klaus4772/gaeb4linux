//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v4.0.5 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
//


package com.example.gaebviewer.schema.da80;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Ausfuehrungsbeschreibung
 * 
 * <p>Java-Klasse für tgPerfDescr complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgPerfDescr">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PerfNo" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgPerfNo"/>
 *         <element name="PerfLbl" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString55" minOccurs="0"/>
 *         <element name="Description" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgPerfDescription" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CONo" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgCONo" minOccurs="0"/>
 *         <element name="AlterBidStatus" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgAlterBidStatus" minOccurs="0"/>
 *         <element name="CtlgAssign" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgCtlgAssign" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "perfNo",
    "perfLbl",
    "description",
    "coNo",
    "alterBidStatus",
    "ctlgAssign"
})
@XmlSeeAlso({
    TgPerfDescr2 .class
})
public class OriginalTgPerfDescr {

    /**
     * Nummer der Ausfuehrungsbeschreibung
     * 
     */
    @XmlElement(name = "PerfNo")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected int perfNo;
    /**
     * Bezeichnung d. Ausfuehrungsbeschreibung
     * 
     */
    @XmlElement(name = "PerfLbl")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String perfLbl;
    /**
     * Textorganisation
     * 
     */
    @XmlElement(name = "Description")
    protected List<TgPerfDescription2> description;
    /**
     * Nachtragsnummer
     * 
     */
    @XmlElement(name = "CONo")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected Integer coNo;
    /**
     * NebenangebotStatus; Bei new und modified werden die kompletten Positionen übertragen. Bei N/A wird nur dieses Kennzeichen übertragen.
     * 
     */
    @XmlElement(name = "AlterBidStatus")
    @XmlSchemaType(name = "normalizedString")
    protected TgAlterBidStatus2 alterBidStatus;
    @XmlElement(name = "CtlgAssign")
    protected List<TgCtlgAssign2> ctlgAssign;
    @XmlAttribute(name = "ID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Nummer der Ausfuehrungsbeschreibung
     * 
     */
    public int getPerfNo() {
        return perfNo;
    }

    /**
     * Legt den Wert der perfNo-Eigenschaft fest.
     * 
     */
    public void setPerfNo(int value) {
        this.perfNo = value;
    }

    /**
     * Bezeichnung d. Ausfuehrungsbeschreibung
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerfLbl() {
        return perfLbl;
    }

    /**
     * Legt den Wert der perfLbl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPerfLbl()
     */
    public void setPerfLbl(String value) {
        this.perfLbl = value;
    }

    /**
     * Textorganisation
     * 
     * Gets the value of the description property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TgPerfDescription2 }
     * </p>
     * 
     * 
     * @return
     *     The value of the description property.
     */
    public List<TgPerfDescription2> getDescription() {
        if (description == null) {
            description = new ArrayList<>();
        }
        return this.description;
    }

    /**
     * Nachtragsnummer
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCONo() {
        return coNo;
    }

    /**
     * Legt den Wert der coNo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getCONo()
     */
    public void setCONo(Integer value) {
        this.coNo = value;
    }

    /**
     * NebenangebotStatus; Bei new und modified werden die kompletten Positionen übertragen. Bei N/A wird nur dieses Kennzeichen übertragen.
     * 
     * @return
     *     possible object is
     *     {@link TgAlterBidStatus2 }
     *     
     */
    public TgAlterBidStatus2 getAlterBidStatus() {
        return alterBidStatus;
    }

    /**
     * Legt den Wert der alterBidStatus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgAlterBidStatus2 }
     *     
     * @see #getAlterBidStatus()
     */
    public void setAlterBidStatus(TgAlterBidStatus2 value) {
        this.alterBidStatus = value;
    }

    /**
     * Gets the value of the ctlgAssign property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ctlgAssign property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCtlgAssign().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TgCtlgAssign2 }
     * </p>
     * 
     * 
     * @return
     *     The value of the ctlgAssign property.
     */
    public List<TgCtlgAssign2> getCtlgAssign() {
        if (ctlgAssign == null) {
            ctlgAssign = new ArrayList<>();
        }
        return this.ctlgAssign;
    }

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

}
