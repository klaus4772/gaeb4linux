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
 * <p>Java-Klasse für tgBoQInfo complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgBoQInfo">
 *   <complexContent>
 *     <restriction base="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgBoQInfo">
 *       <sequence>
 *         <element name="Name" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString20"/>
 *         <element name="LblBoQ" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString60"/>
 *         <element name="CPVCode" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgCPVCode" maxOccurs="unbounded" minOccurs="0"/>
 *         <sequence minOccurs="0">
 *           <element name="CONo" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgCONo"/>
 *           <element name="COStatus" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgCOStatus"/>
 *         </sequence>
 *         <element name="Date" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDate" minOccurs="0"/>
 *         <element name="OutlCompl" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgOutlCompl"/>
 *         <element name="BoQBkdn" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgBoQBkdn" maxOccurs="7"/>
 *         <sequence minOccurs="0">
 *           <element name="NoUPComps" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNoUPComps"/>
 *           <element name="LblUPComp1" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgLblUpComp" minOccurs="0"/>
 *           <element name="LblUPComp2" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgLblUpComp" minOccurs="0"/>
 *           <element name="LblUPComp3" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgLblUpComp" minOccurs="0"/>
 *           <element name="LblUPComp4" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgLblUpComp" minOccurs="0"/>
 *           <element name="LblUPComp5" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgLblUpComp" minOccurs="0"/>
 *           <element name="LblUPComp6" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgLblUpComp" minOccurs="0"/>
 *         </sequence>
 *         <element name="LblTime" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString20" minOccurs="0"/>
 *         <element name="CtlgAssign" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgCtlgAssign" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Totals" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgTotals" minOccurs="0"/>
 *         <element name="Ctlg" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgCtlg" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CostType" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgCostType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="QtyDetermInfo" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgQtyDetermInfo" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgBoQInfo")
public class TgBoQInfo2
    extends OriginalTgBoQInfo
{


}
