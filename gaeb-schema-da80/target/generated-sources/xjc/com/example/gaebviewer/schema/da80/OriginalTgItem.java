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
import jakarta.xml.bind.annotation.XmlSeeAlso;
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
 *           <element name="ALNGroupNo" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgALNGroupNo"/>
 *           <element name="ALNSerNo" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgALNSerNo"/>
 *           <element name="Accepted" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgAccepted" minOccurs="0"/>
 *         </sequence>
 *         <element name="Provis" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgProvis" minOccurs="0"/>
 *         <element name="ProvisAccpt" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgYesNo" minOccurs="0"/>
 *         <element name="LumpSumItem" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgYesNo" minOccurs="0"/>
 *         <element name="NotAppl" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNotAppl" minOccurs="0"/>
 *         <element name="NotOffered" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgYes" minOccurs="0"/>
 *         <element name="HourIt" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgHourIt" minOccurs="0"/>
 *         <element name="KeyIt" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgKeyIt" minOccurs="0"/>
 *         <element name="UPBkdn" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgYesNo" minOccurs="0"/>
 *         <element name="MarkupIt" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgYesNo" minOccurs="0"/>
 *         <sequence minOccurs="0">
 *           <element name="CONo" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgCONo"/>
 *           <element name="COStatus" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgCOStatus"/>
 *         </sequence>
 *         <element name="RefDescr" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgRefDescr" minOccurs="0"/>
 *         <choice minOccurs="0">
 *           <element name="RefRNo" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgRefItem"/>
 *           <element name="RefPerfNo" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgRefItem"/>
 *         </choice>
 *         <sequence minOccurs="0">
 *           <element name="HoldOutType" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgHoldOutType"/>
 *           <element name="UseDur" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDecimal_13_2"/>
 *           <element name="UseDurLblTime" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgUseDurLblTime"/>
 *           <element name="RefBaseItem" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgRefItem" maxOccurs="unbounded" minOccurs="0"/>
 *         </sequence>
 *         <choice minOccurs="0">
 *           <sequence>
 *             <element name="QtyTBD" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgYes"/>
 *             <element name="Qty" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDecimal_11_3" minOccurs="0"/>
 *           </sequence>
 *           <sequence>
 *             <element name="Qty" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDecimal_11_3"/>
 *             <element name="QtySplit" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgQtySplit" maxOccurs="unbounded" minOccurs="0"/>
 *           </sequence>
 *         </choice>
 *         <choice minOccurs="0">
 *           <element name="PredQty" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDecimal_11_3"/>
 *           <element name="BillQty" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDecimal_11_3"/>
 *         </choice>
 *         <element name="QU" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString4" minOccurs="0"/>
 *         <element name="CtlgAssign" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgCtlgAssign" maxOccurs="unbounded" minOccurs="0"/>
 *         <sequence minOccurs="0">
 *           <element name="UP" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDecimal_13_3"/>
 *           <element name="UP110" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDecimal_13_3" minOccurs="0"/>
 *           <element name="UPComp1" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDecimal_13_3" minOccurs="0"/>
 *           <element name="UPComp2" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDecimal_13_3" minOccurs="0"/>
 *           <element name="UPComp3" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDecimal_13_3" minOccurs="0"/>
 *           <element name="UPComp4" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDecimal_13_3" minOccurs="0"/>
 *           <element name="UPComp5" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDecimal_13_3" minOccurs="0"/>
 *           <element name="UPComp6" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDecimal_13_3" minOccurs="0"/>
 *           <element name="DiscountPcnt" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDecimal_9_6" minOccurs="0"/>
 *         </sequence>
 *         <element name="UPFrom" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDecimal_13_3" minOccurs="0"/>
 *         <element name="UPAvg" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDecimal_13_3" minOccurs="0"/>
 *         <element name="UPTo" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDecimal_13_3" minOccurs="0"/>
 *         <element name="UPWgFrom" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDecimal_13_3" minOccurs="0"/>
 *         <element name="UPWgAvg" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDecimal_13_3" minOccurs="0"/>
 *         <element name="UPWgTo" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDecimal_13_3" minOccurs="0"/>
 *         <element name="IT" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDecimal_13_2" minOccurs="0"/>
 *         <element name="VAT" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDecimal_5_2" minOccurs="0"/>
 *         <element name="PriceInfo" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgPriceInfo" minOccurs="0"/>
 *         <element name="TimeQu" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDecimal_13_2" minOccurs="0"/>
 *         <element name="Description" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDescription" minOccurs="0"/>
 *         <element name="BidComm" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgMLText" maxOccurs="unbounded" minOccurs="0"/>
 *         <sequence minOccurs="0">
 *           <element name="SumDescr" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgYes" minOccurs="0"/>
 *           <element name="SubDescr" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgSubDescr" maxOccurs="unbounded" minOccurs="0"/>
 *         </sequence>
 *         <element name="Product" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgProduct" minOccurs="0"/>
 *         <element name="AlterBidStatus" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgAlterBidStatus" minOccurs="0"/>
 *         <element name="CostApproach" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgCostApproach" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CheckNote" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgCheckNote" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="QtyDeterm" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgQtyDeterm" minOccurs="0"/>
 *         <choice minOccurs="0">
 *           <element name="BidUpDownReq" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgYesNo"/>
 *           <element name="BidUpDownPct" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgBidUpDownPct"/>
 *         </choice>
 *       </sequence>
 *       <attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       <attribute name="RNoPart" use="required" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgRNoPart" />
 *       <attribute name="RNoIndex" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgRNoIndex" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlSeeAlso({
    TgItem2 .class
})
public class OriginalTgItem {

    /**
     * Ruft das restliche Contentmodell ab. 
     * 
     * <p>
     * Sie rufen diese "catch-all"-Eigenschaft aus folgendem Grund ab: 
     * Der Feldname "Qty" wird von zwei verschiedenen Teilen eines Schemas verwendet. Siehe: 
     * Zeile 2506 von file:/C:/Users/kjahn/IdeaProjects/gaeb4linux/gaebviewer/gaeb-schema-da80/src/main/resources/xsd/GAEB_DA_XML_Lib_3.3_2021-05.xsd
     * Zeile 2499 von file:/C:/Users/kjahn/IdeaProjects/gaeb4linux/gaebviewer/gaeb-schema-da80/src/main/resources/xsd/GAEB_DA_XML_Lib_3.3_2021-05.xsd
     * <p>
     * Um diese Eigenschaft zu entfernen, wenden Sie eine Eigenschaftenanpassung für eine
     * der beiden folgenden Deklarationen an, um deren Namen zu ändern:
     * 
     */
    @XmlElementRefs({
        @XmlElementRef(name = "ALNGroupNo", namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ALNSerNo", namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Accepted", namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Provis", namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ProvisAccpt", namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "LumpSumItem", namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "NotAppl", namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "NotOffered", namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "HourIt", namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "KeyIt", namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "UPBkdn", namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "MarkupIt", namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CONo", namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "COStatus", namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "RefDescr", namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "RefRNo", namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "RefPerfNo", namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "HoldOutType", namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "UseDur", namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "UseDurLblTime", namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "RefBaseItem", namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "QtyTBD", namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Qty", namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "QtySplit", namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PredQty", namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "BillQty", namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "QU", namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CtlgAssign", namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "UP", namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "UP110", namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "UPComp1", namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "UPComp2", namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "UPComp3", namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "UPComp4", namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "UPComp5", namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "UPComp6", namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DiscountPcnt", namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "UPFrom", namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "UPAvg", namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "UPTo", namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "UPWgFrom", namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "UPWgAvg", namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "UPWgTo", namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "IT", namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "VAT", namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PriceInfo", namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TimeQu", namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Description", namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "BidComm", namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SumDescr", namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SubDescr", namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Product", namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AlterBidStatus", namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CostApproach", namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CheckNote", namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "QtyDeterm", namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "BidUpDownReq", namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "BidUpDownPct", namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", type = JAXBElement.class, required = false)
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
     * Zeile 2506 von file:/C:/Users/kjahn/IdeaProjects/gaeb4linux/gaebviewer/gaeb-schema-da80/src/main/resources/xsd/GAEB_DA_XML_Lib_3.3_2021-05.xsd
     * Zeile 2499 von file:/C:/Users/kjahn/IdeaProjects/gaeb4linux/gaebviewer/gaeb-schema-da80/src/main/resources/xsd/GAEB_DA_XML_Lib_3.3_2021-05.xsd
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
     * {@link JAXBElement }{@code <}{@link TgAccepted2 }{@code >}
     * {@link JAXBElement }{@code <}{@link TgAlterBidStatus2 }{@code >}
     * {@link JAXBElement }{@code <}{@link TgCOStatus2 }{@code >}
     * {@link JAXBElement }{@code <}{@link TgCheckNote2 }{@code >}
     * {@link JAXBElement }{@code <}{@link TgCostApproach2 }{@code >}
     * {@link JAXBElement }{@code <}{@link TgCtlgAssign2 }{@code >}
     * {@link JAXBElement }{@code <}{@link TgDescription2 }{@code >}
     * {@link JAXBElement }{@code <}{@link TgHoldOutType2 }{@code >}
     * {@link JAXBElement }{@code <}{@link TgMLText2 }{@code >}
     * {@link JAXBElement }{@code <}{@link TgPriceInfo2 }{@code >}
     * {@link JAXBElement }{@code <}{@link TgProduct2 }{@code >}
     * {@link JAXBElement }{@code <}{@link TgProvis2 }{@code >}
     * {@link JAXBElement }{@code <}{@link TgQtyDeterm2 }{@code >}
     * {@link JAXBElement }{@code <}{@link TgQtySplit2 }{@code >}
     * {@link JAXBElement }{@code <}{@link TgRefDescr2 }{@code >}
     * {@link JAXBElement }{@code <}{@link TgRefItem2 }{@code >}
     * {@link JAXBElement }{@code <}{@link TgRefItem2 }{@code >}
     * {@link JAXBElement }{@code <}{@link TgRefItem2 }{@code >}
     * {@link JAXBElement }{@code <}{@link TgSubDescr2 }{@code >}
     * {@link JAXBElement }{@code <}{@link TgUseDurLblTime2 }{@code >}
     * {@link JAXBElement }{@code <}{@link TgYes2 }{@code >}
     * {@link JAXBElement }{@code <}{@link TgYes2 }{@code >}
     * {@link JAXBElement }{@code <}{@link TgYes2 }{@code >}
     * {@link JAXBElement }{@code <}{@link TgYesNo2 }{@code >}
     * {@link JAXBElement }{@code <}{@link TgYesNo2 }{@code >}
     * {@link JAXBElement }{@code <}{@link TgYesNo2 }{@code >}
     * {@link JAXBElement }{@code <}{@link TgYesNo2 }{@code >}
     * {@link JAXBElement }{@code <}{@link TgYesNo2 }{@code >}
     * {@link JAXBElement }{@code <}{@link TgYesNo2 }{@code >}
     * {@link JAXBElement }{@code <}{@link TgYesNo2 }{@code >}
     * {@link JAXBElement }{@code <}{@link TgYesNo2 }{@code >}
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
