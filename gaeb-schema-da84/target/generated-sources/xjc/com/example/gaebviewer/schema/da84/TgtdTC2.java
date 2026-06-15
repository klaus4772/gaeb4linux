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
 * <p>Java-Klasse für tgtdTC complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgtdTC">
 *   <complexContent>
 *     <restriction base="{http://www.gaeb.de/GAEB_DA_XML/DA84/3.3}tgtdTC">
 *       <choice maxOccurs="unbounded" minOccurs="0">
 *         <element name="p" type="{http://www.gaeb.de/GAEB_DA_XML/DA84/3.3}tgpTC"/>
 *         <element name="div" type="{http://www.gaeb.de/GAEB_DA_XML/DA84/3.3}tgdivTC"/>
 *         <element name="table" type="{http://www.gaeb.de/GAEB_DA_XML/DA84/3.3}tgtableTC" maxOccurs="unbounded"/>
 *         <element name="ol" type="{http://www.gaeb.de/GAEB_DA_XML/DA84/3.3}tgolTC"/>
 *         <element name="ul" type="{http://www.gaeb.de/GAEB_DA_XML/DA84/3.3}tgulTC"/>
 *         <element name="TextComplement" type="{http://www.gaeb.de/GAEB_DA_XML/DA84/3.3}tgTextComplement"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgtdTC")
public class TgtdTC2
    extends OriginalTgtdTC
{


}
