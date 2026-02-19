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
 * NebenangebotStatus; Bei new und modified werden die kompletten Positionen übertragen. Bei N/A wird nur die TeilOZ und dieses Kennzeichen übertragen.
 * 
 * <p>Java-Klasse für tgAlterBidStatus.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * <pre>{@code
 * <simpleType name="tgAlterBidStatus">
 *   <restriction base="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString">
 *     <enumeration value="Identical"/>
 *     <enumeration value="N/A"/>
 *     <enumeration value="Modified"/>
 *     <enumeration value="New"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "tgAlterBidStatus")
@XmlEnum
public enum TgAlterBidStatus2 {


    /**
     * Gleich
     * 
     */
    @XmlEnumValue("Identical")
    IDENTICAL("Identical"),

    /**
     * Entfällt
     * 
     */
    @XmlEnumValue("N/A")
    N_A("N/A"),

    /**
     * Modifiziert
     * 
     */
    @XmlEnumValue("Modified")
    MODIFIED("Modified"),

    /**
     * Neu
     * 
     */
    @XmlEnumValue("New")
    NEW("New");
    private final String value;

    TgAlterBidStatus2(String v) {
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
    public static TgAlterBidStatus2 fromValue(String v) {
        for (TgAlterBidStatus2 c: TgAlterBidStatus2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
