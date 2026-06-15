//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v4.0.5 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
//


package com.example.gaebviewer.schema.da87;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für tgCnstSite complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgCnstSite">
 *   <complexContent>
 *     <restriction base="{http://www.gaeb.de/GAEB_DA_XML/DA87/3.3}tgCnstSite">
 *       <sequence>
 *         <element name="Address" type="{http://www.gaeb.de/GAEB_DA_XML/DA87/3.3}tgAddress"/>
 *         <element name="CnstSiteIDNo" type="{http://www.gaeb.de/GAEB_DA_XML/DA87/3.3}tgNormalizedString20" minOccurs="0"/>
 *         <element name="CnstSiteName" type="{http://www.gaeb.de/GAEB_DA_XML/DA87/3.3}tgNormalizedString60" minOccurs="0"/>
 *         <element name="AddText" type="{http://www.gaeb.de/GAEB_DA_XML/DA87/3.3}tgAddText" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgCnstSite")
public class TgCnstSite2
    extends OriginalTgCnstSite
{


}
