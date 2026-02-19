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
 * Branche
 * 
 * <p>Java-Klasse für tgSectorType.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * <pre>{@code
 * <simpleType name="tgSectorType">
 *   <restriction base="{}tgNormalizedString">
 *     <enumeration value="Crafts"/>
 *     <enumeration value="Industry"/>
 *     <enumeration value="Dealer"/>
 *     <enumeration value="UtilityComp"/>
 *     <enumeration value="Other"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "tgSectorType", namespace = "")
@XmlEnum
public enum TgSectorType {

    @XmlEnumValue("Crafts")
    CRAFTS("Crafts"),
    @XmlEnumValue("Industry")
    INDUSTRY("Industry"),
    @XmlEnumValue("Dealer")
    DEALER("Dealer"),
    @XmlEnumValue("UtilityComp")
    UTILITY_COMP("UtilityComp"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    TgSectorType(String v) {
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
    public static TgSectorType fromValue(String v) {
        for (TgSectorType c: TgSectorType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
