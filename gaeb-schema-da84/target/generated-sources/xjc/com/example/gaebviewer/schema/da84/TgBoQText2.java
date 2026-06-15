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
 * <p>Java-Klasse für tgBoQText complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgBoQText">
 *   <complexContent>
 *     <restriction base="{http://www.gaeb.de/GAEB_DA_XML/DA84/3.3}tgBoQText">
 *       <sequence>
 *         <element name="Style" type="{http://www.gaeb.de/GAEB_DA_XML/DA84/3.3}tgStyle" minOccurs="0"/>
 *         <choice maxOccurs="unbounded">
 *           <element name="Text" type="{http://www.gaeb.de/GAEB_DA_XML/DA84/3.3}tgFTextTC" maxOccurs="unbounded" minOccurs="0"/>
 *           <element name="TextComplement" type="{http://www.gaeb.de/GAEB_DA_XML/DA84/3.3}tgTextComplement" maxOccurs="unbounded" minOccurs="0"/>
 *         </choice>
 *       </sequence>
 *       <attribute name="style" type="{http://www.gaeb.de/GAEB_DA_XML/DA84/3.3}tgAttStyle" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgBoQText")
public class TgBoQText2
    extends OriginalTgBoQText
{


}
