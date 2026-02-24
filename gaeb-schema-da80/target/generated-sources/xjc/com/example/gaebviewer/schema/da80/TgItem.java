//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v4.0.5 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
//


package com.example.gaebviewer.schema.da80;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Position
 * 
 * <p>Java-Klasse für tgItem complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgItem">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <sequence minOccurs="0">
 *           <element name="ALNGroupNo" type="{}tgALNGroupNo"/>
 *           <element name="ALNSerNo" type="{}tgALNSerNo"/>
 *           <element name="Accepted" type="{}tgAccepted" minOccurs="0"/>
 *         </sequence>
 *         <element name="Provis" type="{}tgProvis" minOccurs="0"/>
 *         <element name="ProvisAccpt" type="{}tgYesNo" minOccurs="0"/>
 *         <element name="LumpSumItem" type="{}tgYesNo" minOccurs="0"/>
 *         <element name="NotAppl" type="{}tgNotAppl" minOccurs="0"/>
 *         <element name="NotOffered" type="{}tgYes" minOccurs="0"/>
 *         <element name="HourIt" type="{}tgHourIt" minOccurs="0"/>
 *         <element name="KeyIt" type="{}tgKeyIt" minOccurs="0"/>
 *         <element name="UPBkdn" type="{}tgYesNo" minOccurs="0"/>
 *         <element name="MarkupIt" type="{}tgYesNo" minOccurs="0"/>
 *         <sequence minOccurs="0">
 *           <element name="CONo" type="{}tgCONo"/>
 *           <element name="COStatus" type="{}tgCOStatus"/>
 *         </sequence>
 *         <element name="RefDescr" type="{}tgRefDescr" minOccurs="0"/>
 *         <choice minOccurs="0">
 *           <element name="RefRNo" type="{}tgRefItem"/>
 *           <element name="RefPerfNo" type="{}tgRefItem"/>
 *         </choice>
 *         <sequence minOccurs="0">
 *           <element name="HoldOutType" type="{}tgHoldOutType"/>
 *           <element name="UseDur" type="{}tgDecimal_13_2"/>
 *           <element name="UseDurLblTime" type="{}tgUseDurLblTime"/>
 *           <element name="RefBaseItem" type="{}tgRefItem" maxOccurs="unbounded" minOccurs="0"/>
 *         </sequence>
 *         <choice minOccurs="0">
 *           <sequence>
 *             <element name="QtyTBD" type="{}tgYes"/>
 *             <element name="Qty" type="{}tgDecimal_11_3" minOccurs="0"/>
 *           </sequence>
 *           <sequence>
 *             <element name="Qty" type="{}tgDecimal_11_3"/>
 *             <element name="QtySplit" type="{}tgQtySplit" maxOccurs="unbounded" minOccurs="0"/>
 *           </sequence>
 *         </choice>
 *         <choice minOccurs="0">
 *           <element name="PredQty" type="{}tgDecimal_11_3"/>
 *           <element name="BillQty" type="{}tgDecimal_11_3"/>
 *         </choice>
 *         <element name="QU" type="{}tgNormalizedString4" minOccurs="0"/>
 *         <element name="CtlgAssign" type="{}tgCtlgAssign" maxOccurs="unbounded" minOccurs="0"/>
 *         <sequence minOccurs="0">
 *           <element name="UP" type="{}tgDecimal_13_3"/>
 *           <element name="UP110" type="{}tgDecimal_13_3" minOccurs="0"/>
 *           <element name="UPComp1" type="{}tgDecimal_13_3" minOccurs="0"/>
 *           <element name="UPComp2" type="{}tgDecimal_13_3" minOccurs="0"/>
 *           <element name="UPComp3" type="{}tgDecimal_13_3" minOccurs="0"/>
 *           <element name="UPComp4" type="{}tgDecimal_13_3" minOccurs="0"/>
 *           <element name="UPComp5" type="{}tgDecimal_13_3" minOccurs="0"/>
 *           <element name="UPComp6" type="{}tgDecimal_13_3" minOccurs="0"/>
 *           <element name="DiscountPcnt" type="{}tgDecimal_9_6" minOccurs="0"/>
 *         </sequence>
 *         <element name="UPFrom" type="{}tgDecimal_13_3" minOccurs="0"/>
 *         <element name="UPAvg" type="{}tgDecimal_13_3" minOccurs="0"/>
 *         <element name="UPTo" type="{}tgDecimal_13_3" minOccurs="0"/>
 *         <element name="UPWgFrom" type="{}tgDecimal_13_3" minOccurs="0"/>
 *         <element name="UPWgAvg" type="{}tgDecimal_13_3" minOccurs="0"/>
 *         <element name="UPWgTo" type="{}tgDecimal_13_3" minOccurs="0"/>
 *         <element name="IT" type="{}tgDecimal_13_2" minOccurs="0"/>
 *         <element name="VAT" type="{}tgDecimal_5_2" minOccurs="0"/>
 *         <element name="PriceInfo" type="{}tgPriceInfo" minOccurs="0"/>
 *         <element name="TimeQu" type="{}tgDecimal_13_2" minOccurs="0"/>
 *         <element name="Description" type="{}tgDescription" minOccurs="0"/>
 *         <element name="BidComm" type="{}tgMLText" maxOccurs="unbounded" minOccurs="0"/>
 *         <sequence minOccurs="0">
 *           <element name="SumDescr" type="{}tgYes" minOccurs="0"/>
 *           <element name="SubDescr" type="{}tgSubDescr" maxOccurs="unbounded" minOccurs="0"/>
 *         </sequence>
 *         <element name="Product" type="{}tgProduct" minOccurs="0"/>
 *         <element name="AlterBidStatus" type="{}tgAlterBidStatus" minOccurs="0"/>
 *         <element name="CostApproach" type="{}tgCostApproach" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CheckNote" type="{}tgCheckNote" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="QtyDeterm" type="{}tgQtyDeterm" minOccurs="0"/>
 *         <choice minOccurs="0">
 *           <element name="BidUpDownReq" type="{}tgYesNo"/>
 *           <element name="BidUpDownPct" type="{}tgBidUpDownPct"/>
 *         </choice>
 *       </sequence>
 *       <attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       <attribute name="RNoPart" use="required" type="{}tgRNoPart" />
 *       <attribute name="RNoIndex" type="{}tgRNoIndex" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgItem", namespace = "", propOrder = {
    "content"
})
public class TgItem {

    /**
     * Ruft das restliche Contentmodell ab. 
     * 
     * <p>
     * Sie rufen diese "catch-all"-Eigenschaft aus folgendem Grund ab: 
     * Der Feldname "Qty" wird von zwei verschiedenen Teilen eines Schemas verwendet. Siehe: 
     * Zeile 2506 von file:/C:/Users/kjahn/IdeaProjects/gaeb4linux/gaeb4linux/gaeb-schema-da80/src/main/resources/xsd/GAEB_DA_XML_Lib_3.3_2021-05.xsd
     * Zeile 2499 von file:/C:/Users/kjahn/IdeaProjects/gaeb4linux/gaeb4linux/gaeb-schema-da80/src/main/resources/xsd/GAEB_DA_XML_Lib_3.3_2021-05.xsd
     * <p>
     * Um diese Eigenschaft zu entfernen, wenden Sie eine Eigenschaftenanpassung für eine
     * der beiden folgenden Deklarationen an, um deren Namen zu ändern:
     * 
     */
    @XmlElementRefs({
        @XmlElementRef(name = "ALNGroupNo", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ALNSerNo", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Accepted", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Provis", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ProvisAccpt", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "LumpSumItem", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "NotAppl", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "NotOffered", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "HourIt", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "KeyIt", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "UPBkdn", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "MarkupIt", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CONo", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "COStatus", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "RefDescr", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "RefRNo", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "RefPerfNo", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "HoldOutType", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "UseDur", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "UseDurLblTime", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "RefBaseItem", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "QtyTBD", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Qty", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "QtySplit", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PredQty", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "BillQty", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "QU", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CtlgAssign", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "UP", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "UP110", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "UPComp1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "UPComp2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "UPComp3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "UPComp4", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "UPComp5", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "UPComp6", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DiscountPcnt", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "UPFrom", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "UPAvg", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "UPTo", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "UPWgFrom", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "UPWgAvg", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "UPWgTo", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "IT", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "VAT", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PriceInfo", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TimeQu", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Description", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "BidComm", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SumDescr", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SubDescr", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Product", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AlterBidStatus", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CostApproach", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CheckNote", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "QtyDeterm", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "BidUpDownReq", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "BidUpDownPct", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> content;
    @XmlAttribute(name = "ID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    /**
     * Teil-OZ
     * 
     */
    @XmlAttribute(name = "RNoPart", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String rNoPart;
    @XmlAttribute(name = "RNoIndex")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String rNoIndex;

    /**
     * Ruft das restliche Contentmodell ab. 
     * 
     * <p>
     * Sie rufen diese "catch-all"-Eigenschaft aus folgendem Grund ab: 
     * Der Feldname "Qty" wird von zwei verschiedenen Teilen eines Schemas verwendet. Siehe: 
     * Zeile 2506 von file:/C:/Users/kjahn/IdeaProjects/gaeb4linux/gaeb4linux/gaeb-schema-da80/src/main/resources/xsd/GAEB_DA_XML_Lib_3.3_2021-05.xsd
     * Zeile 2499 von file:/C:/Users/kjahn/IdeaProjects/gaeb4linux/gaeb4linux/gaeb-schema-da80/src/main/resources/xsd/GAEB_DA_XML_Lib_3.3_2021-05.xsd
     * <p>
     * Um diese Eigenschaft zu entfernen, wenden Sie eine Eigenschaftenanpassung für eine
     * der beiden folgenden Deklarationen an, um deren Namen zu ändern:
     * 
     * Gets the value of the content property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link TgAccepted }{@code >}
     * {@link JAXBElement }{@code <}{@link TgAlterBidStatus }{@code >}
     * {@link JAXBElement }{@code <}{@link TgCOStatus }{@code >}
     * {@link JAXBElement }{@code <}{@link TgCheckNote }{@code >}
     * {@link JAXBElement }{@code <}{@link TgCostApproach }{@code >}
     * {@link JAXBElement }{@code <}{@link TgCtlgAssign }{@code >}
     * {@link JAXBElement }{@code <}{@link TgDescription }{@code >}
     * {@link JAXBElement }{@code <}{@link TgHoldOutType }{@code >}
     * {@link JAXBElement }{@code <}{@link TgMLText }{@code >}
     * {@link JAXBElement }{@code <}{@link TgPriceInfo }{@code >}
     * {@link JAXBElement }{@code <}{@link TgProduct }{@code >}
     * {@link JAXBElement }{@code <}{@link TgProvis }{@code >}
     * {@link JAXBElement }{@code <}{@link TgQtyDeterm }{@code >}
     * {@link JAXBElement }{@code <}{@link TgQtySplit }{@code >}
     * {@link JAXBElement }{@code <}{@link TgRefDescr }{@code >}
     * {@link JAXBElement }{@code <}{@link TgRefItem }{@code >}
     * {@link JAXBElement }{@code <}{@link TgRefItem }{@code >}
     * {@link JAXBElement }{@code <}{@link TgRefItem }{@code >}
     * {@link JAXBElement }{@code <}{@link TgSubDescr }{@code >}
     * {@link JAXBElement }{@code <}{@link TgUseDurLblTime }{@code >}
     * {@link JAXBElement }{@code <}{@link TgYes }{@code >}
     * {@link JAXBElement }{@code <}{@link TgYes }{@code >}
     * {@link JAXBElement }{@code <}{@link TgYes }{@code >}
     * {@link JAXBElement }{@code <}{@link TgYesNo }{@code >}
     * {@link JAXBElement }{@code <}{@link TgYesNo }{@code >}
     * {@link JAXBElement }{@code <}{@link TgYesNo }{@code >}
     * {@link JAXBElement }{@code <}{@link TgYesNo }{@code >}
     * {@link JAXBElement }{@code <}{@link TgYesNo }{@code >}
     * {@link JAXBElement }{@code <}{@link TgYesNo }{@code >}
     * {@link JAXBElement }{@code <}{@link TgYesNo }{@code >}
     * {@link JAXBElement }{@code <}{@link TgYesNo }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * </p>
     * 
     * 
     * @return
     *     The value of the content property.
     */
    public List<JAXBElement<?>> getContent() {
        if (content == null) {
            content = new ArrayList<>();
        }
        return this.content;
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

    /**
     * Teil-OZ
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRNoPart() {
        return rNoPart;
    }

    /**
     * Legt den Wert der rNoPart-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRNoPart()
     */
    public void setRNoPart(String value) {
        this.rNoPart = value;
    }

    /**
     * Ruft den Wert der rNoIndex-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRNoIndex() {
        return rNoIndex;
    }

    /**
     * Legt den Wert der rNoIndex-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRNoIndex(String value) {
        this.rNoIndex = value;
    }

}
