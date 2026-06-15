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
 * <p>Java-Klasse für tgBoQInfo complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgBoQInfo">
 *   <complexContent>
 *     <restriction base="{http://www.gaeb.de/GAEB_DA_XML/DA84/3.3}tgBoQInfo">
 *       <sequence>
 *         <element name="Name" type="{http://www.gaeb.de/GAEB_DA_XML/DA84/3.3}tgNormalizedString20"/>
 *         <element name="BoQBkdn" type="{http://www.gaeb.de/GAEB_DA_XML/DA84/3.3}tgBoQBkdn" maxOccurs="7"/>
 *         <element name="Totals" type="{http://www.gaeb.de/GAEB_DA_XML/DA84/3.3}tgTotals" minOccurs="0"/>
 *         <element name="QtyDetermInfo" type="{http://www.gaeb.de/GAEB_DA_XML/DA84/3.3}tgQtyDetermInfo" minOccurs="0"/>
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
