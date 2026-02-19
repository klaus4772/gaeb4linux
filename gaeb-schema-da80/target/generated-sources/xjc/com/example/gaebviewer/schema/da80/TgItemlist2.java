//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v4.0.5 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
//


package com.example.gaebviewer.schema.da80;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für tgItemlist complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgItemlist">
 *   <complexContent>
 *     <restriction base="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgItemlist">
 *       <choice maxOccurs="unbounded" minOccurs="0">
 *         <element name="Remark" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgRemark"/>
 *         <element name="PerfDescr" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgPerfDescr"/>
 *         <element name="Item" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgItem"/>
 *         <element name="MarkupItem" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgMarkupItem"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgItemlist")
public class TgItemlist2
    extends OriginalTgItemlist
{


}
