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
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Vergabe
 * 
 * <p>Java-Klasse für tgAward complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgAward">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DP" type="{}tgDP"/>
 *         <element name="AwardInfo" type="{}tgAwardInfo" minOccurs="0"/>
 *         <element name="IndivAgrInfo" type="{}tgIndivAgrInfo" minOccurs="0"/>
 *         <element name="OWN" type="{}tgOWN" minOccurs="0"/>
 *         <element name="Requester" type="{}tgRequester" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CTR" type="{}tgCTR" minOccurs="0"/>
 *         <sequence maxOccurs="unbounded" minOccurs="0">
 *           <element name="CnstSite" type="{}tgCnstSite"/>
 *           <element name="NotifSite" type="{}tgNotifSite" minOccurs="0"/>
 *         </sequence>
 *         <element name="AddText" type="{}tgAddText" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="BoQ" type="{}tgBoQ" minOccurs="0"/>
 *         <element name="WgChange" type="{}tgWgChange" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgAward", namespace = "", propOrder = {
    "dp",
    "awardInfo",
    "indivAgrInfo",
    "own",
    "requester",
    "ctr",
    "cnstSiteAndNotifSite",
    "addText",
    "boQ",
    "wgChange"
})
public class TgAward {

    /**
     * GAEB-Datenaustauschphase
     * 
     */
    @XmlElement(name = "DP", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String dp;
    /**
     * Informationen zur Vergabe
     * 
     */
    @XmlElement(name = "AwardInfo")
    protected TgAwardInfo awardInfo;
    @XmlElement(name = "IndivAgrInfo")
    protected TgIndivAgrInfo indivAgrInfo;
    /**
     * Informationen zum Auftraggeber
     * 
     */
    @XmlElement(name = "OWN")
    protected TgOWN own;
    /**
     * Informationen zum Bedarfstraeger
     * 
     */
    @XmlElement(name = "Requester")
    protected List<TgRequester> requester;
    /**
     * Informationen zum Bieter/Auftragnehmer
     * 
     */
    @XmlElement(name = "CTR")
    protected TgCTR ctr;
    @XmlElements({
        @XmlElement(name = "CnstSite", type = TgCnstSite.class),
        @XmlElement(name = "NotifSite", type = TgNotifSite.class)
    })
    protected List<Object> cnstSiteAndNotifSite;
    /**
     * Zusaetzlicher Text; Zusätzliche Textinformation können hier abgelegt werden.
     * 
     */
    @XmlElement(name = "AddText")
    protected List<TgAddText> addText;
    /**
     * Leistungsverzeichnis
     * 
     */
    @XmlElement(name = "BoQ")
    protected TgBoQ boQ;
    /**
     * Lohnaenderung
     * 
     */
    @XmlElement(name = "WgChange")
    protected TgWgChange wgChange;

    /**
     * GAEB-Datenaustauschphase
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDP() {
        return dp;
    }

    /**
     * Legt den Wert der dp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDP()
     */
    public void setDP(String value) {
        this.dp = value;
    }

    /**
     * Informationen zur Vergabe
     * 
     * @return
     *     possible object is
     *     {@link TgAwardInfo }
     *     
     */
    public TgAwardInfo getAwardInfo() {
        return awardInfo;
    }

    /**
     * Legt den Wert der awardInfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgAwardInfo }
     *     
     * @see #getAwardInfo()
     */
    public void setAwardInfo(TgAwardInfo value) {
        this.awardInfo = value;
    }

    /**
     * Ruft den Wert der indivAgrInfo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TgIndivAgrInfo }
     *     
     */
    public TgIndivAgrInfo getIndivAgrInfo() {
        return indivAgrInfo;
    }

    /**
     * Legt den Wert der indivAgrInfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgIndivAgrInfo }
     *     
     */
    public void setIndivAgrInfo(TgIndivAgrInfo value) {
        this.indivAgrInfo = value;
    }

    /**
     * Informationen zum Auftraggeber
     * 
     * @return
     *     possible object is
     *     {@link TgOWN }
     *     
     */
    public TgOWN getOWN() {
        return own;
    }

    /**
     * Legt den Wert der own-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgOWN }
     *     
     * @see #getOWN()
     */
    public void setOWN(TgOWN value) {
        this.own = value;
    }

    /**
     * Informationen zum Bedarfstraeger
     * 
     * Gets the value of the requester property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requester property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRequester().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TgRequester }
     * </p>
     * 
     * 
     * @return
     *     The value of the requester property.
     */
    public List<TgRequester> getRequester() {
        if (requester == null) {
            requester = new ArrayList<>();
        }
        return this.requester;
    }

    /**
     * Informationen zum Bieter/Auftragnehmer
     * 
     * @return
     *     possible object is
     *     {@link TgCTR }
     *     
     */
    public TgCTR getCTR() {
        return ctr;
    }

    /**
     * Legt den Wert der ctr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgCTR }
     *     
     * @see #getCTR()
     */
    public void setCTR(TgCTR value) {
        this.ctr = value;
    }

    /**
     * Gets the value of the cnstSiteAndNotifSite property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cnstSiteAndNotifSite property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCnstSiteAndNotifSite().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TgCnstSite }
     * {@link TgNotifSite }
     * </p>
     * 
     * 
     * @return
     *     The value of the cnstSiteAndNotifSite property.
     */
    public List<Object> getCnstSiteAndNotifSite() {
        if (cnstSiteAndNotifSite == null) {
            cnstSiteAndNotifSite = new ArrayList<>();
        }
        return this.cnstSiteAndNotifSite;
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

    /**
     * Leistungsverzeichnis
     * 
     * @return
     *     possible object is
     *     {@link TgBoQ }
     *     
     */
    public TgBoQ getBoQ() {
        return boQ;
    }

    /**
     * Legt den Wert der boQ-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgBoQ }
     *     
     * @see #getBoQ()
     */
    public void setBoQ(TgBoQ value) {
        this.boQ = value;
    }

    /**
     * Lohnaenderung
     * 
     * @return
     *     possible object is
     *     {@link TgWgChange }
     *     
     */
    public TgWgChange getWgChange() {
        return wgChange;
    }

    /**
     * Legt den Wert der wgChange-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgWgChange }
     *     
     * @see #getWgChange()
     */
    public void setWgChange(TgWgChange value) {
        this.wgChange = value;
    }

}
