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
 * <p>Java-Klasse für tgAward complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgAward">
 *   <complexContent>
 *     <restriction base="{http://www.gaeb.de/GAEB_DA_XML/DA84/3.3}tgAward">
 *       <sequence>
 *         <element name="DP" type="{http://www.gaeb.de/GAEB_DA_XML/DA84/3.3}tgDP"/>
 *         <element name="AwardInfo" type="{http://www.gaeb.de/GAEB_DA_XML/DA84/3.3}tgAwardInfo" minOccurs="0"/>
 *         <element name="CTR" type="{http://www.gaeb.de/GAEB_DA_XML/DA84/3.3}tgCTR"/>
 *         <element name="BoQ" type="{http://www.gaeb.de/GAEB_DA_XML/DA84/3.3}tgBoQ"/>
 *         <element name="WgChange" type="{http://www.gaeb.de/GAEB_DA_XML/DA84/3.3}tgWgChange" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgAward")
public class TgAward2
    extends OriginalTgAward
{


}
