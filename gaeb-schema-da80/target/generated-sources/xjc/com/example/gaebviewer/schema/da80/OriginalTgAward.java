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
import jakarta.xml.bind.annotation.XmlSeeAlso;
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
 *         <element name="DP" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDP"/>
 *         <element name="AwardInfo" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgAwardInfo" minOccurs="0"/>
 *         <element name="IndivAgrInfo" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgIndivAgrInfo" minOccurs="0"/>
 *         <element name="OWN" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgOWN" minOccurs="0"/>
 *         <element name="Requester" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgRequester" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CTR" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgCTR" minOccurs="0"/>
 *         <sequence maxOccurs="unbounded" minOccurs="0">
 *           <element name="CnstSite" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgCnstSite"/>
 *           <element name="NotifSite" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNotifSite" minOccurs="0"/>
 *         </sequence>
 *         <element name="AddText" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgAddText" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="BoQ" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgBoQ" minOccurs="0"/>
 *         <element name="WgChange" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgWgChange" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
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
@XmlSeeAlso({
    TgAward2 .class
})
public class OriginalTgAward {

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
    protected TgAwardInfo2 awardInfo;
    @XmlElement(name = "IndivAgrInfo")
    protected TgIndivAgrInfo2 indivAgrInfo;
    /**
     * Informationen zum Auftraggeber
     * 
     */
    @XmlElement(name = "OWN")
    protected TgOWN2 own;
    /**
     * Informationen zum Bedarfstraeger
     * 
     */
    @XmlElement(name = "Requester")
    protected List<TgRequester2> requester;
    /**
     * Informationen zum Bieter/Auftragnehmer
     * 
     */
    @XmlElement(name = "CTR")
    protected TgCTR2 ctr;
    @XmlElements({
        @XmlElement(name = "CnstSite", type = TgCnstSite2 .class),
        @XmlElement(name = "NotifSite", type = TgNotifSite2 .class)
    })
    protected List<Object> cnstSiteAndNotifSite;
    /**
     * Zusaetzlicher Text; Zusätzliche Textinformation können hier abgelegt werden.
     * 
     */
    @XmlElement(name = "AddText")
    protected List<TgAddText2> addText;
    /**
     * Leistungsverzeichnis
     * 
     */
    @XmlElement(name = "BoQ")
    protected TgBoQ2 boQ;
    /**
     * Lohnaenderung
     * 
     */
    @XmlElement(name = "WgChange")
    protected TgWgChange2 wgChange;

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
     *     {@link TgAwardInfo2 }
     *     
     */
    public TgAwardInfo2 getAwardInfo() {
        return awardInfo;
    }

    /**
     * Legt den Wert der awardInfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgAwardInfo2 }
     *     
     * @see #getAwardInfo()
     */
    public void setAwardInfo(TgAwardInfo2 value) {
        this.awardInfo = value;
    }

    /**
     * Ruft den Wert der indivAgrInfo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TgIndivAgrInfo2 }
     *     
     */
    public TgIndivAgrInfo2 getIndivAgrInfo() {
        return indivAgrInfo;
    }

    /**
     * Legt den Wert der indivAgrInfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgIndivAgrInfo2 }
     *     
     */
    public void setIndivAgrInfo(TgIndivAgrInfo2 value) {
        this.indivAgrInfo = value;
    }

    /**
     * Informationen zum Auftraggeber
     * 
     * @return
     *     possible object is
     *     {@link TgOWN2 }
     *     
     */
    public TgOWN2 getOWN() {
        return own;
    }

    /**
     * Legt den Wert der own-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgOWN2 }
     *     
     * @see #getOWN()
     */
    public void setOWN(TgOWN2 value) {
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
     * {@link TgRequester2 }
     * </p>
     * 
     * 
     * @return
     *     The value of the requester property.
     */
    public List<TgRequester2> getRequester() {
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
     *     {@link TgCTR2 }
     *     
     */
    public TgCTR2 getCTR() {
        return ctr;
    }

    /**
     * Legt den Wert der ctr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgCTR2 }
     *     
     * @see #getCTR()
     */
    public void setCTR(TgCTR2 value) {
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
     * {@link TgCnstSite2 }
     * {@link TgNotifSite2 }
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

    /**
     * Leistungsverzeichnis
     * 
     * @return
     *     possible object is
     *     {@link TgBoQ2 }
     *     
     */
    public TgBoQ2 getBoQ() {
        return boQ;
    }

    /**
     * Legt den Wert der boQ-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgBoQ2 }
     *     
     * @see #getBoQ()
     */
    public void setBoQ(TgBoQ2 value) {
        this.boQ = value;
    }

    /**
     * Lohnaenderung
     * 
     * @return
     *     possible object is
     *     {@link TgWgChange2 }
     *     
     */
    public TgWgChange2 getWgChange() {
        return wgChange;
    }

    /**
     * Legt den Wert der wgChange-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgWgChange2 }
     *     
     * @see #getWgChange()
     */
    public void setWgChange(TgWgChange2 value) {
        this.wgChange = value;
    }

}
