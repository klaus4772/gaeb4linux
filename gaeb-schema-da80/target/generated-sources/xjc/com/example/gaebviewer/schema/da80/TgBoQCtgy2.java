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
 * <p>Java-Klasse für tgBoQCtgy complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgBoQCtgy">
 *   <complexContent>
 *     <restriction base="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgBoQCtgy">
 *       <sequence>
 *         <element name="LblTx" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgMLText"/>
 *         <element name="CPVCode" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgCPVCode" maxOccurs="unbounded" minOccurs="0"/>
 *         <sequence minOccurs="0">
 *           <element name="CONo" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgCONo"/>
 *           <element name="COStatus" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgCOStatus"/>
 *         </sequence>
 *         <sequence minOccurs="0">
 *           <element name="ALNBGroupNo" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgALNGroupNo"/>
 *           <element name="ALNBSerNo" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgALNSerNo"/>
 *           <element name="Accepted" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgAccepted" minOccurs="0"/>
 *         </sequence>
 *         <element name="NotApplBoQ" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNotAppl" minOccurs="0"/>
 *         <element name="CtlgAssign" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgCtlgAssign" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="BoQBody" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgBoQBody" minOccurs="0"/>
 *         <element name="Totals" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgTotals" minOccurs="0"/>
 *         <element name="AlterBidStatus" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgAlterBidStatus" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       <attribute name="RNoPart" use="required" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgRNoPart" />
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
