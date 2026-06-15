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
 * <p>Java-Klasse für tgWgChange complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgWgChange">
 *   <complexContent>
 *     <restriction base="{http://www.gaeb.de/GAEB_DA_XML/DA84/3.3}tgWgChange">
 *       <sequence>
 *         <element name="LblRefWage" type="{http://www.gaeb.de/GAEB_DA_XML/DA84/3.3}tgNormalizedString120"/>
 *         <element name="RedPriceComp" type="{http://www.gaeb.de/GAEB_DA_XML/DA84/3.3}tgDecimal_9_6" minOccurs="0"/>
 *         <sequence maxOccurs="unbounded">
 *           <choice maxOccurs="unbounded">
 *             <element name="RefBoQ" type="{http://www.gaeb.de/GAEB_DA_XML/DA84/3.3}tgRefBoQ"/>
 *             <element name="RefLotNo" type="{http://www.gaeb.de/GAEB_DA_XML/DA84/3.3}tgRefBoQCtgy"/>
 *             <element name="RefLotGrNo" type="{http://www.gaeb.de/GAEB_DA_XML/DA84/3.3}tgRefLotGrp"/>
 *             <element name="RefItem" type="{http://www.gaeb.de/GAEB_DA_XML/DA84/3.3}tgRefItem"/>
 *           </choice>
 *           <element name="WgChangeRate" type="{http://www.gaeb.de/GAEB_DA_XML/DA84/3.3}tgDecimal_6_4" minOccurs="0"/>
 *         </sequence>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgWgChange")
public class TgWgChange2
    extends OriginalTgWgChange
{


}
