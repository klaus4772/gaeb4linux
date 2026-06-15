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
 * <p>Java-Klasse für tgPrjInfo complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgPrjInfo">
 *   <complexContent>
 *     <restriction base="{http://www.gaeb.de/GAEB_DA_XML/DA84/3.3}tgPrjInfo">
 *       <sequence>
 *         <element name="NamePrj" type="{http://www.gaeb.de/GAEB_DA_XML/DA84/3.3}tgNormalizedString60"/>
 *         <element name="PrjID" type="{http://www.gaeb.de/GAEB_DA_XML/DA84/3.3}tgGUID32" minOccurs="0"/>
 *         <element name="LblPrj" type="{http://www.gaeb.de/GAEB_DA_XML/DA84/3.3}tgNormalizedString100" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgPrjInfo")
public class TgPrjInfo2
    extends OriginalTgPrjInfo
{


}
