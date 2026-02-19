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
 * Art des Rechnungsanteil
 * :			
 * , Grundbetrag  --> basic amount
 * , SicherheitseinbehaltVertragserfüllung --> security deposit for fulfillment of a contract
 * , SicherheitseinbehaltMängelansprüche --> security deposit for requirements off defects
 * , Sicherheitsleistung -->  security deposit
 * , Vertragsstrafe -->  contract penalty
 * , Bautafel --> construction sign building-blackboard 
 * , Baustrom --> power consumed on site
 * , Wasser --> water
 * , Reinigung --> preparation
 * , Bauwesenversicherung  -->  insurance against builder's risk
 * , Bauabzugssteuer --> construction withholding tax
 * , SonstigerAbzug --> other type of discount
 * , SummebishergeleisteteZahlungen --> amount payments received 
 * , SummebisherigeRechnungen --> amount invoices
 * , SummeoffeneBeträge --> outstanding amount 
 * , Zwischensumme --> subtotal
 * , KleinstauftragszuschlagSTLBauZ --> small contract extra amount
 * , ProzentualeZuAbschlagSTLBauZ --> percentage extra or deduction amount
 * , Nachlass  --> discount
 * , Umsatzsteuer --> VAT
 * 
 * <p>Java-Klasse für tgInvoiceShareType.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * <pre>{@code
 * <simpleType name="tgInvoiceShareType">
 *   <restriction base="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString">
 *     <enumeration value="basic amount"/>
 *     <enumeration value="security deposit for fulfillment of a contract"/>
 *     <enumeration value="security deposit for requirements off defects"/>
 *     <enumeration value="security deposit"/>
 *     <enumeration value="contract penalty"/>
 *     <enumeration value="construction sign building-blackboard"/>
 *     <enumeration value="power consumed on site"/>
 *     <enumeration value="water"/>
 *     <enumeration value="preparation"/>
 *     <enumeration value="insurance against builder's risk"/>
 *     <enumeration value="construction withholding tax"/>
 *     <enumeration value="other type of discount"/>
 *     <enumeration value="amount payments received"/>
 *     <enumeration value="amount invoices"/>
 *     <enumeration value="outstanding amount"/>
 *     <enumeration value="subtotal"/>
 *     <enumeration value="small contract extra amount"/>
 *     <enumeration value="percentage extra or deduction amount"/>
 *     <enumeration value="discount"/>
 *     <enumeration value="VAT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "tgInvoiceShareType")
@XmlEnum
public enum TgInvoiceShareType2 {

    @XmlEnumValue("basic amount")
    BASIC_AMOUNT("basic amount"),
    @XmlEnumValue("security deposit for fulfillment of a contract")
    SECURITY_DEPOSIT_FOR_FULFILLMENT_OF_A_CONTRACT("security deposit for fulfillment of a contract"),
    @XmlEnumValue("security deposit for requirements off defects")
    SECURITY_DEPOSIT_FOR_REQUIREMENTS_OFF_DEFECTS("security deposit for requirements off defects"),
    @XmlEnumValue("security deposit")
    SECURITY_DEPOSIT("security deposit"),
    @XmlEnumValue("contract penalty")
    CONTRACT_PENALTY("contract penalty"),
    @XmlEnumValue("construction sign building-blackboard")
    CONSTRUCTION_SIGN_BUILDING_BLACKBOARD("construction sign building-blackboard"),
    @XmlEnumValue("power consumed on site")
    POWER_CONSUMED_ON_SITE("power consumed on site"),
    @XmlEnumValue("water")
    WATER("water"),
    @XmlEnumValue("preparation")
    PREPARATION("preparation"),
    @XmlEnumValue("insurance against builder's risk")
    INSURANCE_AGAINST_BUILDER_S_RISK("insurance against builder's risk"),
    @XmlEnumValue("construction withholding tax")
    CONSTRUCTION_WITHHOLDING_TAX("construction withholding tax"),
    @XmlEnumValue("other type of discount")
    OTHER_TYPE_OF_DISCOUNT("other type of discount"),
    @XmlEnumValue("amount payments received")
    AMOUNT_PAYMENTS_RECEIVED("amount payments received"),
    @XmlEnumValue("amount invoices")
    AMOUNT_INVOICES("amount invoices"),
    @XmlEnumValue("outstanding amount")
    OUTSTANDING_AMOUNT("outstanding amount"),
    @XmlEnumValue("subtotal")
    SUBTOTAL("subtotal"),
    @XmlEnumValue("small contract extra amount")
    SMALL_CONTRACT_EXTRA_AMOUNT("small contract extra amount"),
    @XmlEnumValue("percentage extra or deduction amount")
    PERCENTAGE_EXTRA_OR_DEDUCTION_AMOUNT("percentage extra or deduction amount"),
    @XmlEnumValue("discount")
    DISCOUNT("discount"),
    VAT("VAT");
    private final String value;

    TgInvoiceShareType2(String v) {
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
    public static TgInvoiceShareType2 fromValue(String v) {
        for (TgInvoiceShareType2 c: TgInvoiceShareType2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
