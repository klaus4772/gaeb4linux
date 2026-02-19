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
 * <p>Java-Klasse für tgTextComplement complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgTextComplement">
 *   <complexContent>
 *     <restriction base="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgTextComplement">
 *       <sequence>
 *         <element name="ComplCaption" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgMLText" minOccurs="0"/>
 *         <choice minOccurs="0">
 *           <element name="ComplBodyDec" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgComplBodyDec"/>
 *           <element name="ComplBodyInt" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgComplBodyInt"/>
 *         </choice>
 *         <element name="ComplBody" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgMLText"/>
 *         <element name="ComplTail" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgMLText" minOccurs="0"/>
 *         <element name="CtlgAssign" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgCtlgAssign" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="MarkLbl" use="required" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgInteger" />
 *       <attribute name="Kind" use="required" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgAttKind" />
 *       <attribute name="Empty" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgYes" />
 *       <attribute name="ArtChrIdent" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgInteger" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgTextComplement")
public class TgTextComplement2
    extends OriginalTgTextComplement
{


}
