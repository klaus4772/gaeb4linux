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
 * Vergabeverfahren
 * 
 * <p>Java-Klasse für tgCat.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * <pre>{@code
 * <simpleType name="tgCat">
 *   <restriction base="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString">
 *     <enumeration value="OpenProc"/>
 *     <enumeration value="ClosedProc"/>
 *     <enumeration value="NegProc"/>
 *     <enumeration value="OpenCall"/>
 *     <enumeration value="SelectCall"/>
 *     <enumeration value="NegCont"/>
 *     <enumeration value="IntNATO"/>
 *     <enumeration value="SelectCallPostOpen"/>
 *     <enumeration value="NegProcOpen"/>
 *     <enumeration value="CompetDialog"/>
 *     <enumeration value="InnovationPartnership"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "tgCat")
@XmlEnum
public enum TgCat2 {


    /**
     * Offenes Verfahren
     * 
     */
    @XmlEnumValue("OpenProc")
    OPEN_PROC("OpenProc"),

    /**
     * Nichtoffenes Verfahren
     * 
     */
    @XmlEnumValue("ClosedProc")
    CLOSED_PROC("ClosedProc"),

    /**
     * Verhandlungsverfahren ohne Teilnehmewettbewerb
     * 
     */
    @XmlEnumValue("NegProc")
    NEG_PROC("NegProc"),

    /**
     * Oeffentliche Ausschreibung
     * 
     */
    @XmlEnumValue("OpenCall")
    OPEN_CALL("OpenCall"),

    /**
     * Beschränkte Ausschreibung ohne Teilnahmewettbewerb
     * 
     */
    @XmlEnumValue("SelectCall")
    SELECT_CALL("SelectCall"),

    /**
     * Freihaendige Vergabe
     * 
     */
    @XmlEnumValue("NegCont")
    NEG_CONT("NegCont"),

    /**
     * Internationale NATO-Ausschreibung
     * 
     */
    @XmlEnumValue("IntNATO")
    INT_NATO("IntNATO"),

    /**
     * Beschränkte Ausschreibung mit Teilnahmewettbewerb
     * 
     */
    @XmlEnumValue("SelectCallPostOpen")
    SELECT_CALL_POST_OPEN("SelectCallPostOpen"),

    /**
     * Verhandlungsverfahren mit Teilnahmewettbewerb
     * 
     */
    @XmlEnumValue("NegProcOpen")
    NEG_PROC_OPEN("NegProcOpen"),

    /**
     * Wettbewerblicher Dialog
     * 
     */
    @XmlEnumValue("CompetDialog")
    COMPET_DIALOG("CompetDialog"),

    /**
     * Innovationspartnerschaft
     * 
     */
    @XmlEnumValue("InnovationPartnership")
    INNOVATION_PARTNERSHIP("InnovationPartnership");
    private final String value;

    TgCat2(String v) {
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
    public static TgCat2 fromValue(String v) {
        for (TgCat2 c: TgCat2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
