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
 * <p>Java-Klasse für tgHoldOutType.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * <pre>{@code
 * <simpleType name="tgHoldOutType">
 *   <restriction base="{}tgNormalizedString">
 *     <enumeration value="BaseUseItem"/>
 *     <enumeration value="ExtUseItem"/>
 *     <enumeration value="RentUseItem"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "tgHoldOutType", namespace = "")
@XmlEnum
public enum TgHoldOutType {

    @XmlEnumValue("BaseUseItem")
    BASE_USE_ITEM("BaseUseItem"),
    @XmlEnumValue("ExtUseItem")
    EXT_USE_ITEM("ExtUseItem"),
    @XmlEnumValue("RentUseItem")
    RENT_USE_ITEM("RentUseItem");
    private final String value;

    TgHoldOutType(String v) {
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
    public static TgHoldOutType fromValue(String v) {
        for (TgHoldOutType c: TgHoldOutType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
