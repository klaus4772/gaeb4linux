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
 * <p>Java-Klasse für tgSubDescr complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgSubDescr">
 *   <complexContent>
 *     <restriction base="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgSubDescr">
 *       <sequence>
 *         <element name="SubDNo" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgSubDNo"/>
 *         <element name="Description" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDescription"/>
 *         <sequence minOccurs="0">
 *           <element name="QtySpec" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgYes"/>
 *           <element name="QtyTBD" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgYes" minOccurs="0"/>
 *         </sequence>
 *         <sequence minOccurs="0">
 *           <element name="Qty" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDecimal_11_3"/>
 *           <element name="QU" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString4" minOccurs="0"/>
 *         </sequence>
 *         <element name="UPSpec" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgYesNo" minOccurs="0"/>
 *         <element name="UPBkdn" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgYesNo" minOccurs="0"/>
 *         <sequence minOccurs="0">
 *           <element name="UP" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDecimal_13_3"/>
 *           <element name="UPComp1" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDecimal_13_3" minOccurs="0"/>
 *           <element name="UPComp2" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDecimal_13_3" minOccurs="0"/>
 *           <element name="UPComp3" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDecimal_13_3" minOccurs="0"/>
 *           <element name="UPComp4" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDecimal_13_3" minOccurs="0"/>
 *           <element name="UPComp5" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDecimal_13_3" minOccurs="0"/>
 *           <element name="UPComp6" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDecimal_13_3" minOccurs="0"/>
 *         </sequence>
 *         <element name="CtlgAssign" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgCtlgAssign" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgSubDescr")
public class TgSubDescr2
    extends OriginalTgSubDescr
{


}
