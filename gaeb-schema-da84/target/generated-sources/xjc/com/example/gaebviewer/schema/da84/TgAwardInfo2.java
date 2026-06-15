//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v4.0.5 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
//


package com.example.gaebviewer.schema.da84;

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
 *     <restriction base="{http://www.gaeb.de/GAEB_DA_XML/DA84/3.3}tgAwardInfo">
 *       <sequence>
 *         <element name="BoQID" type="{http://www.gaeb.de/GAEB_DA_XML/DA84/3.3}tgGUID32" minOccurs="0"/>
 *         <sequence minOccurs="0">
 *           <element name="Cur" type="{http://www.gaeb.de/GAEB_DA_XML/DA84/3.3}tgCur"/>
 *           <element name="CurLbl" type="{http://www.gaeb.de/GAEB_DA_XML/DA84/3.3}tgCurLbl" minOccurs="0"/>
 *         </sequence>
 *         <element name="BidDate" type="{http://www.gaeb.de/GAEB_DA_XML/DA84/3.3}tgDate" minOccurs="0"/>
 *         <element name="CashDiscount" type="{http://www.gaeb.de/GAEB_DA_XML/DA84/3.3}tgCashDiscount" maxOccurs="3" minOccurs="0"/>
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
