//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v4.0.5 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
//


package com.example.gaebviewer.schema.da80;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java-Klasse für tgBoQBkdnType.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * <pre>{@code
 * <simpleType name="tgBoQBkdnType">
 *   <restriction base="{}tgNormalizedString">
 *     <enumeration value="Lot"/>
 *     <enumeration value="BoQLevel"/>
 *     <enumeration value="Item"/>
 *     <enumeration value="Index"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "tgBoQBkdnType", namespace = "")
@XmlEnum
public enum TgBoQBkdnType {

    @XmlEnumValue("Lot")
    LOT("Lot"),
    @XmlEnumValue("BoQLevel")
    BO_Q_LEVEL("BoQLevel"),
    @XmlEnumValue("Item")
    ITEM("Item"),
    @XmlEnumValue("Index")
    INDEX("Index");
    private final String value;

    TgBoQBkdnType(String v) {
        value = v;
    }

    /**
     * Gets the value associated to the enum constant.
     * 
     * @return
     *     The value linked to the enum.
     */
    public String value() {
        return value;
    }

    /**
     * Gets the enum associated to the value passed as parameter.
     * 
     * @param v
     *     The value to get the enum from.
     * @return
     *     The enum which corresponds to the value, if it exists.
     * @throws IllegalArgumentException
     *     If no value matches in the enum declaration.
     */
    public static TgBoQBkdnType fromValue(String v) {
        for (TgBoQBkdnType c: TgBoQBkdnType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
