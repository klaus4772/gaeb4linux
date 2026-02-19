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
 * <p>Java-Klasse für tgOutlCompl.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * <pre>{@code
 * <simpleType name="tgOutlCompl">
 *   <restriction base="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString">
 *     <enumeration value="AllTxt"/>
 *     <enumeration value="OutTxt"/>
 *     <enumeration value="DetailTxt"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "tgOutlCompl")
@XmlEnum
public enum TgOutlCompl2 {

    @XmlEnumValue("AllTxt")
    ALL_TXT("AllTxt"),
    @XmlEnumValue("OutTxt")
    OUT_TXT("OutTxt"),
    @XmlEnumValue("DetailTxt")
    DETAIL_TXT("DetailTxt");
    private final String value;

    TgOutlCompl2(String v) {
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
    public static TgOutlCompl2 fromValue(String v) {
        for (TgOutlCompl2 c: TgOutlCompl2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
