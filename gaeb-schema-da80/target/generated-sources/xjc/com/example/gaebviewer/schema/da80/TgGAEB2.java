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
 * Aufgestellt vom Gemeinsamen Ausschuss Elektronik im Bauwesen (GAEB) © 2002 - 2019 by DIN Deutsches Institut fuer Normung e. V.
 * 
 * <p>Java-Klasse für tgGAEB complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgGAEB">
 *   <complexContent>
 *     <restriction base="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgGAEB">
 *       <sequence>
 *         <element name="GAEBInfo" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgGAEBInfo"/>
 *         <element name="PrjInfo" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgPrjInfo" minOccurs="0"/>
 *         <element name="Award" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgAward"/>
 *         <element name="AddText" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgAddText" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgGAEB")
public class TgGAEB2
    extends OriginalTgGAEB
{


}
