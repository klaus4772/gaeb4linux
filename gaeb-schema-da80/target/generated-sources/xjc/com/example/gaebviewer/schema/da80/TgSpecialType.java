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
 * Besondere Vergabeart
 * 
 * <p>Java-Klasse für tgSpecialType.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * <pre>{@code
 * <simpleType name="tgSpecialType">
 *   <restriction base="{}tgNormalizedString">
 *     <enumeration value="Maint"/>
 *     <enumeration value="MastAgree"/>
 *     <enumeration value="MastMaintAgree"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "tgSpecialType", namespace = "")
@XmlEnum
public enum TgSpecialType {


    /**
     * Instandhaltung
     * 
     */
    @XmlEnumValue("Maint")
    MAINT("Maint"),

    /**
     * Rahmenvertrag
     * 
     */
    @XmlEnumValue("MastAgree")
    MAST_AGREE("MastAgree"),

    /**
     * Rahmenvertrag fuer Instandhaltung
     * 
     */
    @XmlEnumValue("MastMaintAgree")
    MAST_MAINT_AGREE("MastMaintAgree");
    private final String value;

    TgSpecialType(String v) {
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
    public static TgSpecialType fromValue(String v) {
        for (TgSpecialType c: TgSpecialType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
