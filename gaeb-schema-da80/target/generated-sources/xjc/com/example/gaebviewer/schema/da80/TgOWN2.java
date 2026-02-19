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
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Informationen zum Auftraggeber
 * 
 * <p>Java-Klasse für tgOWN complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgOWN">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Address" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgAddress" minOccurs="0"/>
 *         <element name="DPNo" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString60" minOccurs="0"/>
 *         <element name="AwardNo" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString60" minOccurs="0"/>
 *         <element name="AcctRecNo" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString20" minOccurs="0"/>
 *         <sequence minOccurs="0">
 *           <element name="CntryType" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgCntryType"/>
 *           <element name="CntryName" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgCntryName" minOccurs="0"/>
 *         </sequence>
 *         <element name="AddText" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgAddText" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgOWN", propOrder = {
    "address",
    "dpNo",
    "awardNo",
    "acctRecNo",
    "cntryType",
    "cntryName",
    "addText"
})
public class TgOWN2 {

    /**
     * Informationen zur Adresse des AG
     * 
     */
    @XmlElement(name = "Address")
    protected TgAddress2 address;
    /**
     * DV-Nummer
     * 
     */
    @XmlElement(name = "DPNo")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String dpNo;
    /**
     * Vergabenummer
     * 
     */
    @XmlElement(name = "AwardNo")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String awardNo;
    /**
     * Debitoren-Nummer
     * 
     */
    @XmlElement(name = "AcctRecNo")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String acctRecNo;
    /**
     * Art des Staates
     * 
     */
    @XmlElement(name = "CntryType")
    @XmlSchemaType(name = "normalizedString")
    protected TgCntryType2 cntryType;
    /**
     * Name des Staates (internationales Kfz-Kennzeichen)
     * 
     */
    @XmlElement(name = "CntryName")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String cntryName;
    /**
     * Zusaetzlicher Text; Zusätzliche Textinformation können hier abgelegt werden.
     * 
     */
    @XmlElement(name = "AddText")
    protected List<TgAddText2> addText;

    /**
     * Informationen zur Adresse des AG
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
     * DV-Nummer
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDPNo() {
        return dpNo;
    }

    /**
     * Legt den Wert der dpNo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDPNo()
     */
    public void setDPNo(String value) {
        this.dpNo = value;
    }

    /**
     * Vergabenummer
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAwardNo() {
        return awardNo;
    }

    /**
     * Legt den Wert der awardNo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAwardNo()
     */
    public void setAwardNo(String value) {
        this.awardNo = value;
    }

    /**
     * Debitoren-Nummer
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctRecNo() {
        return acctRecNo;
    }

    /**
     * Legt den Wert der acctRecNo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAcctRecNo()
     */
    public void setAcctRecNo(String value) {
        this.acctRecNo = value;
    }

    /**
     * Art des Staates
     * 
     * @return
     *     possible object is
     *     {@link TgCntryType2 }
     *     
     */
    public TgCntryType2 getCntryType() {
        return cntryType;
    }

    /**
     * Legt den Wert der cntryType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgCntryType2 }
     *     
     * @see #getCntryType()
     */
    public void setCntryType(TgCntryType2 value) {
        this.cntryType = value;
    }

    /**
     * Name des Staates (internationales Kfz-Kennzeichen)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCntryName() {
        return cntryName;
    }

    /**
     * Legt den Wert der cntryName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCntryName()
     */
    public void setCntryName(String value) {
        this.cntryName = value;
    }

    /**
     * Zusaetzlicher Text; Zusätzliche Textinformation können hier abgelegt werden.
     * 
     * Gets the value of the addText property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addText property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAddText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TgAddText2 }
     * </p>
     * 
     * 
     * @return
     *     The value of the addText property.
     */
    public List<TgAddText2> getAddText() {
        if (addText == null) {
            addText = new ArrayList<>();
        }
        return this.addText;
    }

}
