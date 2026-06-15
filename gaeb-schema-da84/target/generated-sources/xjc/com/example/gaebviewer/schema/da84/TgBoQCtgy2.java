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
 * <p>Java-Klasse für tgBoQCtgy complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgBoQCtgy">
 *   <complexContent>
 *     <restriction base="{http://www.gaeb.de/GAEB_DA_XML/DA84/3.3}tgBoQCtgy">
 *       <sequence>
 *         <element name="BoQBody" type="{http://www.gaeb.de/GAEB_DA_XML/DA84/3.3}tgBoQBody" minOccurs="0"/>
 *         <element name="Totals" type="{http://www.gaeb.de/GAEB_DA_XML/DA84/3.3}tgTotals"/>
 *       </sequence>
 *       <attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       <attribute name="RNoPart" use="required" type="{http://www.gaeb.de/GAEB_DA_XML/DA84/3.3}tgRNoPart" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgBoQCtgy")
public class TgBoQCtgy2
    extends OriginalTgBoQCtgy
{


}
