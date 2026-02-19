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
 * Bevorzugter Bewerber
 * 
 * <p>Java-Klasse für tgPrefBidType.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * <pre>{@code
 * <simpleType name="tgPrefBidType">
 *   <restriction base="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString">
 *     <enumeration value="DisplPers"/>
 *     <enumeration value="Refugee"/>
 *     <enumeration value="Persecutee"/>
 *     <enumeration value="WrkShopForDis"/>
 *     <enumeration value="WrkShopForBli"/>
 *     <enumeration value="Other"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "tgPrefBidType")
@XmlEnum
public enum TgPrefBidType2 {

    @XmlEnumValue("DisplPers")
    DISPL_PERS("DisplPers"),
    @XmlEnumValue("Refugee")
    REFUGEE("Refugee"),
    @XmlEnumValue("Persecutee")
    PERSECUTEE("Persecutee"),
    @XmlEnumValue("WrkShopForDis")
    WRK_SHOP_FOR_DIS("WrkShopForDis"),
    @XmlEnumValue("WrkShopForBli")
    WRK_SHOP_FOR_BLI("WrkShopForBli"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    TgPrefBidType2(String v) {
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
    public static TgPrefBidType2 fromValue(String v) {
        for (TgPrefBidType2 c: TgPrefBidType2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
