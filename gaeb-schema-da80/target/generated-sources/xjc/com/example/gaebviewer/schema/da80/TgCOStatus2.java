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
 * Status des Nachtrags
 * 
 * <p>Java-Klasse für tgCOStatus.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * <pre>{@code
 * <simpleType name="tgCOStatus">
 *   <restriction base="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString">
 *     <enumeration value="Recog"/>
 *     <enumeration value="Filed"/>
 *     <enumeration value="Offered"/>
 *     <enumeration value="Withdrawn"/>
 *     <enumeration value="Rejected"/>
 *     <enumeration value="ObjToRecj"/>
 *     <enumeration value="FormAckn"/>
 *     <enumeration value="Approved"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "tgCOStatus")
@XmlEnum
public enum TgCOStatus2 {


    /**
     * erkannt
     * 
     */
    @XmlEnumValue("Recog")
    RECOG("Recog"),

    /**
     * angemeldet
     * 
     */
    @XmlEnumValue("Filed")
    FILED("Filed"),

    /**
     * angeboten
     * 
     */
    @XmlEnumValue("Offered")
    OFFERED("Offered"),

    /**
     * zurückgezogen
     * 
     */
    @XmlEnumValue("Withdrawn")
    WITHDRAWN("Withdrawn"),

    /**
     * abgelehnt
     * 
     */
    @XmlEnumValue("Rejected")
    REJECTED("Rejected"),

    /**
     * Widerspruch zur Ablehnun
     * 
     */
    @XmlEnumValue("ObjToRecj")
    OBJ_TO_RECJ("ObjToRecj"),

    /**
     * sachlich anerkannt
     * 
     */
    @XmlEnumValue("FormAckn")
    FORM_ACKN("FormAckn"),

    /**
     * genehmigt
     * 
     */
    @XmlEnumValue("Approved")
    APPROVED("Approved");
    private final String value;

    TgCOStatus2(String v) {
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
    public static TgCOStatus2 fromValue(String v) {
        for (TgCOStatus2 c: TgCOStatus2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
