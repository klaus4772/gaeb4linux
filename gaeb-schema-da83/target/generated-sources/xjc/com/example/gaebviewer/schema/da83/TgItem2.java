//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v4.0.5 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
//


package com.example.gaebviewer.schema.da83;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für tgItem complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgItem">
 *   <complexContent>
 *     <restriction base="{http://www.gaeb.de/GAEB_DA_XML/DA83/3.3}tgItem">
 *       <sequence>
 *         <sequence minOccurs="0">
 *           <element name="ALNGroupNo" type="{http://www.gaeb.de/GAEB_DA_XML/DA83/3.3}tgALNGroupNo"/>
 *           <element name="ALNSerNo" type="{http://www.gaeb.de/GAEB_DA_XML/DA83/3.3}tgALNSerNo"/>
 *         </sequence>
 *         <element name="Provis" type="{http://www.gaeb.de/GAEB_DA_XML/DA83/3.3}tgProvis" minOccurs="0"/>
 *         <element name="LumpSumItem" type="{http://www.gaeb.de/GAEB_DA_XML/DA83/3.3}tgYesNo" minOccurs="0"/>
 *         <element name="HourIt" type="{http://www.gaeb.de/GAEB_DA_XML/DA83/3.3}tgHourIt" minOccurs="0"/>
 *         <element name="KeyIt" type="{http://www.gaeb.de/GAEB_DA_XML/DA83/3.3}tgKeyIt" minOccurs="0"/>
 *         <element name="UPBkdn" type="{http://www.gaeb.de/GAEB_DA_XML/DA83/3.3}tgYesNo" minOccurs="0"/>
 *         <element name="MarkupIt" type="{http://www.gaeb.de/GAEB_DA_XML/DA83/3.3}tgYesNo" minOccurs="0"/>
 *         <sequence minOccurs="0">
 *           <element name="CONo" type="{http://www.gaeb.de/GAEB_DA_XML/DA83/3.3}tgCONo"/>
 *           <element name="COStatus" type="{http://www.gaeb.de/GAEB_DA_XML/DA83/3.3}tgCOStatus"/>
 *         </sequence>
 *         <element name="RefDescr" type="{http://www.gaeb.de/GAEB_DA_XML/DA83/3.3}tgRefDescr" minOccurs="0"/>
 *         <choice minOccurs="0">
 *           <element name="RefRNo" type="{http://www.gaeb.de/GAEB_DA_XML/DA83/3.3}tgRefItem"/>
 *           <element name="RefPerfNo" type="{http://www.gaeb.de/GAEB_DA_XML/DA83/3.3}tgRefItem"/>
 *         </choice>
 *         <sequence minOccurs="0">
 *           <element name="HoldOutType" type="{http://www.gaeb.de/GAEB_DA_XML/DA83/3.3}tgHoldOutType"/>
 *           <element name="UseDur" type="{http://www.gaeb.de/GAEB_DA_XML/DA83/3.3}tgDecimal_13_2"/>
 *           <element name="UseDurLblTime" type="{http://www.gaeb.de/GAEB_DA_XML/DA83/3.3}tgUseDurLblTime"/>
 *           <element name="RefBaseItem" type="{http://www.gaeb.de/GAEB_DA_XML/DA83/3.3}tgRefItem" maxOccurs="unbounded" minOccurs="0"/>
 *         </sequence>
 *         <choice minOccurs="0">
 *           <sequence>
 *             <element name="QtyTBD" type="{http://www.gaeb.de/GAEB_DA_XML/DA83/3.3}tgYes"/>
 *           </sequence>
 *           <sequence>
 *             <element name="Qty" type="{http://www.gaeb.de/GAEB_DA_XML/DA83/3.3}tgDecimal_11_3"/>
 *             <element name="QtySplit" type="{http://www.gaeb.de/GAEB_DA_XML/DA83/3.3}tgQtySplit" maxOccurs="unbounded" minOccurs="0"/>
 *           </sequence>
 *         </choice>
 *         <element name="QU" type="{http://www.gaeb.de/GAEB_DA_XML/DA83/3.3}tgNormalizedString4"/>
 *         <element name="CtlgAssign" type="{http://www.gaeb.de/GAEB_DA_XML/DA83/3.3}tgCtlgAssign" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="VAT" type="{http://www.gaeb.de/GAEB_DA_XML/DA83/3.3}tgDecimal_5_2" minOccurs="0"/>
 *         <element name="Description" type="{http://www.gaeb.de/GAEB_DA_XML/DA83/3.3}tgDescription" minOccurs="0"/>
 *         <sequence minOccurs="0">
 *           <element name="SumDescr" type="{http://www.gaeb.de/GAEB_DA_XML/DA83/3.3}tgYes"/>
 *           <element name="SubDescr" type="{http://www.gaeb.de/GAEB_DA_XML/DA83/3.3}tgSubDescr" maxOccurs="unbounded" minOccurs="0"/>
 *         </sequence>
 *         <element name="Product" type="{http://www.gaeb.de/GAEB_DA_XML/DA83/3.3}tgProduct" minOccurs="0"/>
 *         <element name="QtyDeterm" type="{http://www.gaeb.de/GAEB_DA_XML/DA83/3.3}tgQtyDeterm" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       <attribute name="RNoPart" use="required" type="{http://www.gaeb.de/GAEB_DA_XML/DA83/3.3}tgRNoPart" />
 *       <attribute name="RNoIndex" type="{http://www.gaeb.de/GAEB_DA_XML/DA83/3.3}tgRNoIndex" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgItem")
public class TgItem2
    extends OriginalTgItem
{


}
