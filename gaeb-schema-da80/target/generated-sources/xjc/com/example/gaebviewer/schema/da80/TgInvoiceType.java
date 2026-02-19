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
 * Rechnungsart
 * 	: Abschlag  --->  deduction,  Schluss ---> final account, Teilschluss ---> part final account, Vorauszahlung   --->  advance payment, Einzelrechnung ---> single invoice, Entwurf_Prüfrechnung --->  pro forma invoice, 	GeprüfteRechnungvonAGanAN ---> reviewed invoice
 * 
 * <p>Java-Klasse für tgInvoiceType.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * <pre>{@code
 * <simpleType name="tgInvoiceType">
 *   <restriction base="{}tgNormalizedString">
 *     <enumeration value="deduction"/>
 *     <enumeration value="final account"/>
 *     <enumeration value="part final account"/>
 *     <enumeration value="advance payment"/>
 *     <enumeration value="single invoice"/>
 *     <enumeration value="pro forma invoice"/>
 *     <enumeration value="reviewed invoice"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "tgInvoiceType", namespace = "")
@XmlEnum
public enum TgInvoiceType {

    @XmlEnumValue("deduction")
    DEDUCTION("deduction"),
    @XmlEnumValue("final account")
    FINAL_ACCOUNT("final account"),
    @XmlEnumValue("part final account")
    PART_FINAL_ACCOUNT("part final account"),
    @XmlEnumValue("advance payment")
    ADVANCE_PAYMENT("advance payment"),
    @XmlEnumValue("single invoice")
    SINGLE_INVOICE("single invoice"),
    @XmlEnumValue("pro forma invoice")
    PRO_FORMA_INVOICE("pro forma invoice"),
    @XmlEnumValue("reviewed invoice")
    REVIEWED_INVOICE("reviewed invoice");
    private final String value;

    TgInvoiceType(String v) {
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
    public static TgInvoiceType fromValue(String v) {
        for (TgInvoiceType c: TgInvoiceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
