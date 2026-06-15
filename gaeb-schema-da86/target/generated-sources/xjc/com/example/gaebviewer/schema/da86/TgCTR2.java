//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v4.0.5 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
//


package com.example.gaebviewer.schema.da86;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für tgCTR complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgCTR">
 *   <complexContent>
 *     <restriction base="{http://www.gaeb.de/GAEB_DA_XML/DA86/3.3}tgCTR">
 *       <sequence>
 *         <element name="Address" type="{http://www.gaeb.de/GAEB_DA_XML/DA86/3.3}tgAddress"/>
 *         <element name="DPNo" type="{http://www.gaeb.de/GAEB_DA_XML/DA86/3.3}tgNormalizedString60" minOccurs="0"/>
 *         <element name="AwardNo" type="{http://www.gaeb.de/GAEB_DA_XML/DA86/3.3}tgNormalizedString60" minOccurs="0"/>
 *         <element name="AcctsPayNo" type="{http://www.gaeb.de/GAEB_DA_XML/DA86/3.3}tgNormalizedString20" minOccurs="0"/>
 *         <element name="BidderNo" type="{http://www.gaeb.de/GAEB_DA_XML/DA86/3.3}tgNormalizedString8" minOccurs="0"/>
 *         <sequence minOccurs="0">
 *           <element name="CntryType" type="{http://www.gaeb.de/GAEB_DA_XML/DA86/3.3}tgCntryType"/>
 *           <element name="CntryName" type="{http://www.gaeb.de/GAEB_DA_XML/DA86/3.3}tgCntryName" minOccurs="0"/>
 *         </sequence>
 *         <element name="SectorType" type="{http://www.gaeb.de/GAEB_DA_XML/DA86/3.3}tgSectorType" minOccurs="0"/>
 *         <element name="PrefBidType" type="{http://www.gaeb.de/GAEB_DA_XML/DA86/3.3}tgPrefBidType" minOccurs="0"/>
 *         <element name="SCType" type="{http://www.gaeb.de/GAEB_DA_XML/DA86/3.3}tgSCType" minOccurs="0"/>
 *         <element name="InsAs" type="{http://www.gaeb.de/GAEB_DA_XML/DA86/3.3}tgInsAs" minOccurs="0"/>
 *         <element name="AddText" type="{http://www.gaeb.de/GAEB_DA_XML/DA86/3.3}tgAddText" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgCTR")
public class TgCTR2
    extends OriginalTgCTR
{


}
