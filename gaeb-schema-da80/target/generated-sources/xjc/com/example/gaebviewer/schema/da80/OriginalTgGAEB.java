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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Aufgestellt vom Gemeinsamen Ausschuss Elektronik im Bauwesen (GAEB) © 2002 - 2021 by DIN Deutsches Institut fuer Normung e. V.
 * 
 * <p>Java-Klasse für tgGAEB complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgGAEB">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="GAEBInfo" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgGAEBInfo"/>
 *         <element name="PrjInfo" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgPrjInfo" minOccurs="0"/>
 *         <element name="Award" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgAward" minOccurs="0"/>
 *         <element name="Invoice" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgInvoice" minOccurs="0"/>
 *         <element name="Order" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgOrder" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "", propOrder = {
    "gaebInfo",
    "prjInfo",
    "award",
    "invoice",
    "order",
    "addText"
})
@XmlSeeAlso({
    TgGAEB2 .class
})
public class OriginalTgGAEB {

    /**
     * Informationen zum GAEB-Datenaustausch
     * 
     */
    @XmlElement(name = "GAEBInfo", required = true)
    protected TgGAEBInfo2 gaebInfo;
    /**
     * Informationen zum Projekt
     * 
     */
    @XmlElement(name = "PrjInfo")
    protected TgPrjInfo2 prjInfo;
    /**
     * Vergabe
     * In diesem Objekt werden die Informationen des Vergabeverfahrens abgelegt. 
     * Das Objekt kann in den Datenaustauschphasen D81-D88 verwendet werden.
     * 
     */
    @XmlElement(name = "Award")
    protected TgAward2 award;
    /**
     * Rechnung
     * In diesem Objekt werden die detaillierten Informationen zur Rechnung abgelegt.
     * 
     */
    @XmlElement(name = "Invoice")
    protected TgInvoice2 invoice;
    /**
     * Bestellung  Datenphase D9x. Die Wiederholung ist nur im Kontext der Rechnung möglich. 
     * Hier wird in der ersten Wiederholung die Rechnung und in den weiteren Wiederholungen die einzelnen Lieferscheine übertragen
     * 
     */
    @XmlElement(name = "Order")
    protected List<TgOrder2> order;
    /**
     * Zusaetzlicher Text; Zusätzliche Textinformation können hier abgelegt werden.
     * 
     */
    @XmlElement(name = "AddText")
    protected List<TgAddText2> addText;

    /**
     * Informationen zum GAEB-Datenaustausch
     * 
     * @return
     *     possible object is
     *     {@link TgGAEBInfo2 }
     *     
     */
    public TgGAEBInfo2 getGAEBInfo() {
        return gaebInfo;
    }

    /**
     * Legt den Wert der gaebInfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgGAEBInfo2 }
     *     
     * @see #getGAEBInfo()
     */
    public void setGAEBInfo(TgGAEBInfo2 value) {
        this.gaebInfo = value;
    }

    /**
     * Informationen zum Projekt
     * 
     * @return
     *     possible object is
     *     {@link TgPrjInfo2 }
     *     
     */
    public TgPrjInfo2 getPrjInfo() {
        return prjInfo;
    }

    /**
     * Legt den Wert der prjInfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgPrjInfo2 }
     *     
     * @see #getPrjInfo()
     */
    public void setPrjInfo(TgPrjInfo2 value) {
        this.prjInfo = value;
    }

    /**
     * Vergabe
     * In diesem Objekt werden die Informationen des Vergabeverfahrens abgelegt. 
     * Das Objekt kann in den Datenaustauschphasen D81-D88 verwendet werden.
     * 
     * @return
     *     possible object is
     *     {@link TgAward2 }
     *     
     */
    public TgAward2 getAward() {
        return award;
    }

    /**
     * Legt den Wert der award-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgAward2 }
     *     
     * @see #getAward()
     */
    public void setAward(TgAward2 value) {
        this.award = value;
    }

    /**
     * Rechnung
     * In diesem Objekt werden die detaillierten Informationen zur Rechnung abgelegt.
     * 
     * @return
     *     possible object is
     *     {@link TgInvoice2 }
     *     
     */
    public TgInvoice2 getInvoice() {
        return invoice;
    }

    /**
     * Legt den Wert der invoice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgInvoice2 }
     *     
     * @see #getInvoice()
     */
    public void setInvoice(TgInvoice2 value) {
        this.invoice = value;
    }

    /**
     * Bestellung  Datenphase D9x. Die Wiederholung ist nur im Kontext der Rechnung möglich. 
     * Hier wird in der ersten Wiederholung die Rechnung und in den weiteren Wiederholungen die einzelnen Lieferscheine übertragen
     * 
     * Gets the value of the order property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the order property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOrder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TgOrder2 }
     * </p>
     * 
     * 
     * @return
     *     The value of the order property.
     */
    public List<TgOrder2> getOrder() {
        if (order == null) {
            order = new ArrayList<>();
        }
        return this.order;
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
