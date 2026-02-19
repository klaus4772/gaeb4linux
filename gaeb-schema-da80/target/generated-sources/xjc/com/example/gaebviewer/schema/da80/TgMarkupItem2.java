//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v4.0.5 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
//


package com.example.gaebviewer.schema.da80;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für tgMarkupItem complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgMarkupItem">
 *   <complexContent>
 *     <restriction base="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgMarkupItem">
 *       <sequence>
 *         <sequence minOccurs="0">
 *           <element name="ALNGroupNo" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgALNGroupNo"/>
 *           <element name="ALNSerNo" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgALNSerNo"/>
 *           <element name="Accepted" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgAccepted" minOccurs="0"/>
 *         </sequence>
 *         <element name="Provis" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgProvis" minOccurs="0"/>
 *         <element name="ProvisAccpt" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgYesNo" minOccurs="0"/>
 *         <element name="NotAppl" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNotAppl" minOccurs="0"/>
 *         <element name="HourIt" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgHourIt" minOccurs="0"/>
 *         <element name="KeyIt" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgKeyIt" minOccurs="0"/>
 *         <sequence minOccurs="0">
 *           <element name="CONo" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgCONo"/>
 *           <element name="COStatus" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgCOStatus"/>
 *         </sequence>
 *         <element name="RefDescr" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgRefDescr" minOccurs="0"/>
 *         <choice minOccurs="0">
 *           <element name="RefRNo" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgRefItem"/>
 *           <element name="RefPerfNo" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgRefItem"/>
 *         </choice>
 *         <element name="MarkupType" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgMarkupType"/>
 *         <element name="MarkupSubQty" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgMarkupSubQty" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ITMarkup" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDecimal_13_2" minOccurs="0"/>
 *         <element name="Markup" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDecimal_9_6" minOccurs="0"/>
 *         <element name="DiscountPcnt" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDecimal_9_6" minOccurs="0"/>
 *         <element name="IT" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDecimal_13_2" minOccurs="0"/>
 *         <element name="Description" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDescription"/>
 *         <element name="CtlgAssign" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgCtlgAssign" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AlterBidStatus" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgAlterBidStatus" minOccurs="0"/>
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
@XmlType(name = "tgMarkupItem")
public class TgMarkupItem2
    extends OriginalTgMarkupItem
{


}
