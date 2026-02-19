//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v4.0.5 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
//


package com.example.gaebviewer.schema.da80;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java-Klasse für tgAttOrg.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * <pre>{@code
 * <simpleType name="tgAttOrg">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     <enumeration value="TAB"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "tgAttOrg", namespace = "")
@XmlEnum
public enum TgAttOrg {

    TAB;

    public String value() {
        return name();
    }

    public static TgAttOrg fromValue(String v) {
        return valueOf(v);
    }

}
