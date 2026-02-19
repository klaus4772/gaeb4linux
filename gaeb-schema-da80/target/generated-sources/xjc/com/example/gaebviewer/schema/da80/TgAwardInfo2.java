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
 * <p>Java-Klasse für tgAwardInfo complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgAwardInfo">
 *   <complexContent>
 *     <restriction base="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgAwardInfo">
 *       <sequence>
 *         <element name="BoQID" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgGUID32" minOccurs="0"/>
 *         <element name="Cat" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgCat" minOccurs="0"/>
 *         <element name="SpecialType" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgSpecialType" minOccurs="0"/>
 *         <sequence minOccurs="0">
 *           <element name="Cur" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgCur"/>
 *           <element name="CurLbl" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgCurLbl" minOccurs="0"/>
 *         </sequence>
 *         <element name="BidDate" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDate" minOccurs="0"/>
 *         <sequence minOccurs="0">
 *           <element name="OpenDate" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDate"/>
 *           <element name="OpenTime" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgTime" minOccurs="0"/>
 *         </sequence>
 *         <element name="EvalEnd" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDate" minOccurs="0"/>
 *         <element name="SubmLoc" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString60" minOccurs="0"/>
 *         <element name="CnstStart" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDate" minOccurs="0"/>
 *         <element name="CnstEnd" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDate" minOccurs="0"/>
 *         <element name="ContrNo" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString20" minOccurs="0"/>
 *         <element name="ContrDate" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDate" minOccurs="0"/>
 *         <element name="AcceptType" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString60" minOccurs="0"/>
 *         <element name="AcceptDate" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDate" minOccurs="0"/>
 *         <element name="WarrDur" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgWarrDur" minOccurs="0"/>
 *         <element name="WarrUnit" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgWarrUnit" minOccurs="0"/>
 *         <element name="WarrEnd" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDate" minOccurs="0"/>
 *         <element name="PerformPcnt" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDecimal_9_6" minOccurs="0"/>
 *         <element name="WarrantPcnt" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDecimal_9_6" minOccurs="0"/>
 *         <element name="COInfo" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgCOInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="MaintInfo" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgMaintInfo" minOccurs="0"/>
 *         <element name="CashDiscount" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgCashDiscount" maxOccurs="3" minOccurs="0"/>
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
@XmlType(name = "tgAwardInfo")
public class TgAwardInfo2
    extends OriginalTgAwardInfo
{


}
