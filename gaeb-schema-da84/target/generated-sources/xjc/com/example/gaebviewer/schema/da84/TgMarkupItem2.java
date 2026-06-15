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
 * <p>Java-Klasse für tgMarkupItem complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgMarkupItem">
 *   <complexContent>
 *     <restriction base="{http://www.gaeb.de/GAEB_DA_XML/DA84/3.3}tgMarkupItem">
 *       <sequence>
 *         <element name="ITMarkup" type="{http://www.gaeb.de/GAEB_DA_XML/DA84/3.3}tgDecimal_13_2" minOccurs="0"/>
 *         <element name="Markup" type="{http://www.gaeb.de/GAEB_DA_XML/DA84/3.3}tgDecimal_9_6" minOccurs="0"/>
 *         <element name="DiscountPcnt" type="{http://www.gaeb.de/GAEB_DA_XML/DA84/3.3}tgDecimal_9_6" minOccurs="0"/>
 *         <element name="IT" type="{http://www.gaeb.de/GAEB_DA_XML/DA84/3.3}tgDecimal_13_2" minOccurs="0"/>
 *         <element name="Description" type="{http://www.gaeb.de/GAEB_DA_XML/DA84/3.3}tgDescription" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       <attribute name="RNoPart" use="required" type="{http://www.gaeb.de/GAEB_DA_XML/DA84/3.3}tgRNoPart" />
 *       <attribute name="RNoIndex" type="{http://www.gaeb.de/GAEB_DA_XML/DA84/3.3}tgRNoIndex" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgMarkupItem")
public class TgMarkupItem2
    extends OriginalTgMarkupItem
{


}
