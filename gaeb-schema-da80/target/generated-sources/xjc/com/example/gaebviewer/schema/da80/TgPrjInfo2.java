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
 * Informationen zum Projekt
 * 
 * <p>Java-Klasse für tgPrjInfo complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgPrjInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="NamePrj" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString60" minOccurs="0"/>
 *         <element name="PrjID" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgGUID32" minOccurs="0"/>
 *         <element name="LblPrj" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString100" minOccurs="0"/>
 *         <element name="Descrip" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgFText" minOccurs="0"/>
 *         <sequence minOccurs="0">
 *           <element name="Cur" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgCur"/>
 *           <element name="CurLbl" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgCurLbl" minOccurs="0"/>
 *         </sequence>
 *         <element name="BidCommPerm" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgYesNo" minOccurs="0"/>
 *         <element name="AlterBidPerm" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgYes" minOccurs="0"/>
 *         <element name="AddText" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgAddText" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="UPFracDig" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgUPFracDig" minOccurs="0"/>
 *         <element name="CtlgAssign" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgCtlgAssign" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgPrjInfo", propOrder = {
    "namePrj",
    "prjID",
    "lblPrj",
    "descrip",
    "cur",
    "curLbl",
    "bidCommPerm",
    "alterBidPerm",
    "addText",
    "upFracDig",
    "ctlgAssign"
})
public class TgPrjInfo2 {

    /**
     * Projektname (Lesbarer Identifikator)
     * 
     */
    @XmlElement(name = "NamePrj")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String namePrj;
    /**
     * ID des Projektes
     * 
     */
    @XmlElement(name = "PrjID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String prjID;
    /**
     * Bezeichnung des Projektes
     * 
     */
    @XmlElement(name = "LblPrj")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String lblPrj;
    /**
     * Kurzbeschreibung des Projektes
     * 
     */
    @XmlElement(name = "Descrip")
    protected TgFText2 descrip;
    /**
     * Waehrung
     * 
     */
    @XmlElement(name = "Cur")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String cur;
    /**
     * Bezeichnung der Waehrung
     * 
     */
    @XmlElement(name = "CurLbl")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String curLbl;
    /**
     * Bieter Kommentar zugelassen
     * 
     */
    @XmlElement(name = "BidCommPerm")
    @XmlSchemaType(name = "normalizedString")
    protected TgYesNo2 bidCommPerm;
    /**
     * Nebenangebot zulassen; Bei Nebenangeboten sollten die Elemente AlterBidStatus gesetzt sein
     * 
     */
    @XmlElement(name = "AlterBidPerm")
    @XmlSchemaType(name = "normalizedString")
    protected TgYes2 alterBidPerm;
    /**
     * Zusaetzlicher Text; Zusätzliche Textinformation können hier abgelegt werden.
     * 
     */
    @XmlElement(name = "AddText")
    protected List<TgAddText2> addText;
    /**
     * Die Einheitspreise sind mit zwei oder drei Nachkommasstellen zu erstellen bzw. werden so übertragen.
     * 
     */
    @XmlElement(name = "UPFracDig")
    @XmlSchemaType(name = "integer")
    protected Integer upFracDig;
    @XmlElement(name = "CtlgAssign")
    protected List<TgCtlgAssign2> ctlgAssign;

    /**
     * Projektname (Lesbarer Identifikator)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamePrj() {
        return namePrj;
    }

    /**
     * Legt den Wert der namePrj-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getNamePrj()
     */
    public void setNamePrj(String value) {
        this.namePrj = value;
    }

    /**
     * ID des Projektes
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrjID() {
        return prjID;
    }

    /**
     * Legt den Wert der prjID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPrjID()
     */
    public void setPrjID(String value) {
        this.prjID = value;
    }

    /**
     * Bezeichnung des Projektes
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLblPrj() {
        return lblPrj;
    }

    /**
     * Legt den Wert der lblPrj-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getLblPrj()
     */
    public void setLblPrj(String value) {
        this.lblPrj = value;
    }

    /**
     * Kurzbeschreibung des Projektes
     * 
     * @return
     *     possible object is
     *     {@link TgFText2 }
     *     
     */
    public TgFText2 getDescrip() {
        return descrip;
    }

    /**
     * Legt den Wert der descrip-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgFText2 }
     *     
     * @see #getDescrip()
     */
    public void setDescrip(TgFText2 value) {
        this.descrip = value;
    }

    /**
     * Waehrung
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCur() {
        return cur;
    }

    /**
     * Legt den Wert der cur-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCur()
     */
    public void setCur(String value) {
        this.cur = value;
    }

    /**
     * Bezeichnung der Waehrung
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurLbl() {
        return curLbl;
    }

    /**
     * Legt den Wert der curLbl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCurLbl()
     */
    public void setCurLbl(String value) {
        this.curLbl = value;
    }

    /**
     * Bieter Kommentar zugelassen
     * 
     * @return
     *     possible object is
     *     {@link TgYesNo2 }
     *     
     */
    public TgYesNo2 getBidCommPerm() {
        return bidCommPerm;
    }

    /**
     * Legt den Wert der bidCommPerm-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgYesNo2 }
     *     
     * @see #getBidCommPerm()
     */
    public void setBidCommPerm(TgYesNo2 value) {
        this.bidCommPerm = value;
    }

    /**
     * Nebenangebot zulassen; Bei Nebenangeboten sollten die Elemente AlterBidStatus gesetzt sein
     * 
     * @return
     *     possible object is
     *     {@link TgYes2 }
     *     
     */
    public TgYes2 getAlterBidPerm() {
        return alterBidPerm;
    }

    /**
     * Legt den Wert der alterBidPerm-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgYes2 }
     *     
     * @see #getAlterBidPerm()
     */
    public void setAlterBidPerm(TgYes2 value) {
        this.alterBidPerm = value;
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
     * Die Einheitspreise sind mit zwei oder drei Nachkommasstellen zu erstellen bzw. werden so übertragen.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUPFracDig() {
        return upFracDig;
    }

    /**
     * Legt den Wert der upFracDig-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getUPFracDig()
     */
    public void setUPFracDig(Integer value) {
        this.upFracDig = value;
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

}
