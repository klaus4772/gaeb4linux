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
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Hinweistext
 * 
 * <p>Java-Klasse für tgRemark complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgRemark">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Description" type="{}tgDescription" minOccurs="0"/>
 *         <element name="CONo" type="{}tgCONo" minOccurs="0"/>
 *         <element name="AlterBidStatus" type="{}tgAlterBidStatus" minOccurs="0"/>
 *         <element name="CtlgAssign" type="{}tgCtlgAssign" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "tgRemark", namespace = "", propOrder = {
    "description",
    "coNo",
    "alterBidStatus",
    "ctlgAssign"
})
public class TgRemark {

    /**
     * Textorganisation
     * 
     */
    @XmlElement(name = "Description")
    protected TgDescription description;
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
    protected TgAlterBidStatus alterBidStatus;
    @XmlElement(name = "CtlgAssign")
    protected List<TgCtlgAssign> ctlgAssign;
    @XmlAttribute(name = "ID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Textorganisation
     * 
     * @return
     *     possible object is
     *     {@link TgDescription }
     *     
     */
    public TgDescription getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgDescription }
     *     
     * @see #getDescription()
     */
    public void setDescription(TgDescription value) {
        this.description = value;
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
     *     {@link TgAlterBidStatus }
     *     
     */
    public TgAlterBidStatus getAlterBidStatus() {
        return alterBidStatus;
    }

    /**
     * Legt den Wert der alterBidStatus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgAlterBidStatus }
     *     
     * @see #getAlterBidStatus()
     */
    public void setAlterBidStatus(TgAlterBidStatus value) {
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
     * {@link TgCtlgAssign }
     * </p>
     * 
     * 
     * @return
     *     The value of the ctlgAssign property.
     */
    public List<TgCtlgAssign> getCtlgAssign() {
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
