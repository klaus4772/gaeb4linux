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
 * <p>Java-Klasse für tgCtlgEnum.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * <pre>{@code
 * <simpleType name="tgCtlgEnum">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="cost group DIN 276-81"/>
 *     <enumeration value="cost group DIN 276-93"/>
 *     <enumeration value="cost group DIN 276-06"/>
 *     <enumeration value="cost group DIN 276-1 2008-12"/>
 *     <enumeration value="cost group DIN 276 2018-12"/>
 *     <enumeration value="locality"/>
 *     <enumeration value="work category"/>
 *     <enumeration value="cost unit"/>
 *     <enumeration value="BIM"/>
 *     <enumeration value="miscellaneous"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "tgCtlgEnum", namespace = "")
@XmlEnum
public enum TgCtlgEnum {

    @XmlEnumValue("cost group DIN 276-81")
    COST_GROUP_DIN_276_81("cost group DIN 276-81"),
    @XmlEnumValue("cost group DIN 276-93")
    COST_GROUP_DIN_276_93("cost group DIN 276-93"),
    @XmlEnumValue("cost group DIN 276-06")
    COST_GROUP_DIN_276_06("cost group DIN 276-06"),
    @XmlEnumValue("cost group DIN 276-1 2008-12")
    COST_GROUP_DIN_276_1_2008_12("cost group DIN 276-1 2008-12"),
    @XmlEnumValue("cost group DIN 276 2018-12")
    COST_GROUP_DIN_276_2018_12("cost group DIN 276 2018-12"),
    @XmlEnumValue("locality")
    LOCALITY("locality"),
    @XmlEnumValue("work category")
    WORK_CATEGORY("work category"),
    @XmlEnumValue("cost unit")
    COST_UNIT("cost unit"),
    BIM("BIM"),
    @XmlEnumValue("miscellaneous")
    MISCELLANEOUS("miscellaneous");
    private final String value;

    TgCtlgEnum(String v) {
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
    public static TgCtlgEnum fromValue(String v) {
        for (TgCtlgEnum c: TgCtlgEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
