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
 * Informationen zum Bieter/Auftragnehmer
 * 
 * <p>Java-Klasse für tgCTR complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgCTR">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Address" type="{}tgAddress" minOccurs="0"/>
 *         <element name="DPNo" type="{}tgNormalizedString60" minOccurs="0"/>
 *         <element name="AwardNo" type="{}tgNormalizedString60" minOccurs="0"/>
 *         <element name="AcctsPayNo" type="{}tgNormalizedString20" minOccurs="0"/>
 *         <element name="BidderNo" type="{}tgNormalizedString8" minOccurs="0"/>
 *         <sequence minOccurs="0">
 *           <element name="CntryType" type="{}tgCntryType"/>
 *           <element name="CntryName" type="{}tgCntryName" minOccurs="0"/>
 *         </sequence>
 *         <element name="SectorType" type="{}tgSectorType" minOccurs="0"/>
 *         <element name="PrefBidType" type="{}tgPrefBidType" minOccurs="0"/>
 *         <element name="SCType" type="{}tgSCType" minOccurs="0"/>
 *         <element name="InsAs" type="{}tgInsAs" minOccurs="0"/>
 *         <element name="AddText" type="{}tgAddText" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgCTR", namespace = "", propOrder = {
    "address",
    "dpNo",
    "awardNo",
    "acctsPayNo",
    "bidderNo",
    "cntryType",
    "cntryName",
    "sectorType",
    "prefBidType",
    "scType",
    "insAs",
    "addText"
})
public class TgCTR {

    /**
     * Informationen zur Adresse des Bieters/AN
     * 
     */
    @XmlElement(name = "Address")
    protected TgAddress address;
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
     * Kreditoren-Nummer
     * 
     */
    @XmlElement(name = "AcctsPayNo")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String acctsPayNo;
    /**
     * Bieternummer
     * 
     */
    @XmlElement(name = "BidderNo")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String bidderNo;
    /**
     * Art des Staates
     * 
     */
    @XmlElement(name = "CntryType")
    @XmlSchemaType(name = "normalizedString")
    protected TgCntryType cntryType;
    /**
     * Name des Staates (internationales Kfz-Kennzeichen)
     * 
     */
    @XmlElement(name = "CntryName")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String cntryName;
    /**
     * Branche
     * 
     */
    @XmlElement(name = "SectorType")
    @XmlSchemaType(name = "normalizedString")
    protected TgSectorType sectorType;
    /**
     * Bevorzugter Bewerber
     * 
     */
    @XmlElement(name = "PrefBidType")
    @XmlSchemaType(name = "normalizedString")
    protected TgPrefBidType prefBidType;
    /**
     * Art der Leistung
     * 
     */
    @XmlElement(name = "SCType")
    @XmlSchemaType(name = "normalizedString")
    protected TgSCType scType;
    /**
     * Informationen zur Berufsgenossenschaft
     * 
     */
    @XmlElement(name = "InsAs")
    protected TgInsAs insAs;
    /**
     * Zusaetzlicher Text; Zusätzliche Textinformation können hier abgelegt werden.
     * 
     */
    @XmlElement(name = "AddText")
    protected List<TgAddText> addText;

    /**
     * Informationen zur Adresse des Bieters/AN
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
     * Kreditoren-Nummer
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctsPayNo() {
        return acctsPayNo;
    }

    /**
     * Legt den Wert der acctsPayNo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAcctsPayNo()
     */
    public void setAcctsPayNo(String value) {
        this.acctsPayNo = value;
    }

    /**
     * Bieternummer
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBidderNo() {
        return bidderNo;
    }

    /**
     * Legt den Wert der bidderNo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getBidderNo()
     */
    public void setBidderNo(String value) {
        this.bidderNo = value;
    }

    /**
     * Art des Staates
     * 
     * @return
     *     possible object is
     *     {@link TgCntryType }
     *     
     */
    public TgCntryType getCntryType() {
        return cntryType;
    }

    /**
     * Legt den Wert der cntryType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgCntryType }
     *     
     * @see #getCntryType()
     */
    public void setCntryType(TgCntryType value) {
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
     * Branche
     * 
     * @return
     *     possible object is
     *     {@link TgSectorType }
     *     
     */
    public TgSectorType getSectorType() {
        return sectorType;
    }

    /**
     * Legt den Wert der sectorType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgSectorType }
     *     
     * @see #getSectorType()
     */
    public void setSectorType(TgSectorType value) {
        this.sectorType = value;
    }

    /**
     * Bevorzugter Bewerber
     * 
     * @return
     *     possible object is
     *     {@link TgPrefBidType }
     *     
     */
    public TgPrefBidType getPrefBidType() {
        return prefBidType;
    }

    /**
     * Legt den Wert der prefBidType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgPrefBidType }
     *     
     * @see #getPrefBidType()
     */
    public void setPrefBidType(TgPrefBidType value) {
        this.prefBidType = value;
    }

    /**
     * Art der Leistung
     * 
     * @return
     *     possible object is
     *     {@link TgSCType }
     *     
     */
    public TgSCType getSCType() {
        return scType;
    }

    /**
     * Legt den Wert der scType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgSCType }
     *     
     * @see #getSCType()
     */
    public void setSCType(TgSCType value) {
        this.scType = value;
    }

    /**
     * Informationen zur Berufsgenossenschaft
     * 
     * @return
     *     possible object is
     *     {@link TgInsAs }
     *     
     */
    public TgInsAs getInsAs() {
        return insAs;
    }

    /**
     * Legt den Wert der insAs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgInsAs }
     *     
     * @see #getInsAs()
     */
    public void setInsAs(TgInsAs value) {
        this.insAs = value;
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
     * {@link TgAddText }
     * </p>
     * 
     * 
     * @return
     *     The value of the addText property.
     */
    public List<TgAddText> getAddText() {
        if (addText == null) {
            addText = new ArrayList<>();
        }
        return this.addText;
    }

}
