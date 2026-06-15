//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v4.0.5 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
//


package com.example.gaebviewer.schema.da85;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für tgDescription complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgDescription">
 *   <complexContent>
 *     <restriction base="{http://www.gaeb.de/GAEB_DA_XML/DA85/3.3}tgDescription">
 *       <sequence>
 *         <choice minOccurs="0">
 *           <element name="STLBBau" type="{http://www.gaeb.de/GAEB_DA_XML/DA85/3.3}tgSTLBBau"/>
 *           <element name="StLNo" type="{http://www.gaeb.de/GAEB_DA_XML/DA85/3.3}tgStLNo"/>
 *         </choice>
 *         <element name="WICNo" type="{http://www.gaeb.de/GAEB_DA_XML/DA85/3.3}tgNormalizedString40" minOccurs="0"/>
 *         <choice>
 *           <element name="CompleteText" type="{http://www.gaeb.de/GAEB_DA_XML/DA85/3.3}tgCompleteText"/>
 *           <element name="OutlineText" type="{http://www.gaeb.de/GAEB_DA_XML/DA85/3.3}tgOutlineText"/>
 *         </choice>
 *       </sequence>
 *       <attribute name="ID" type="{http://www.gaeb.de/GAEB_DA_XML/DA85/3.3}tgGUID32" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgDescription")
@XmlSeeAlso({
    TgPerfDescription2 .class
})
public class TgDescription2
    extends OriginalTgDescription
{


}
