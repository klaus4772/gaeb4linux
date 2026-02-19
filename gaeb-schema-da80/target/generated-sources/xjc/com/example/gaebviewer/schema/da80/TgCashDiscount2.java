//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v4.0.5 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
//


package com.example.gaebviewer.schema.da80;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für tgCashDiscount complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgCashDiscount">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <choice>
 *           <element name="CashDiscDays">
 *             <complexType>
 *               <complexContent>
 *                 <extension base="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgCashDiscDays">
 *                 </extension>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *           <element name="CashDiscDate" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDate"/>
 *         </choice>
 *         <element name="DiscountPcnt" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDecimal_9_6"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgCashDiscount", propOrder = {
    "cashDiscDays",
    "cashDiscDate",
    "discountPcnt"
})
public class TgCashDiscount2 {

    /**
     * Zahlungsfrist in Tagen
     * 
     */
    @XmlElement(name = "CashDiscDays")
    protected TgCashDiscount2 .CashDiscDays cashDiscDays;
    /**
     * Zahlungsziel
     * 
     */
    @XmlElement(name = "CashDiscDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cashDiscDate;
    @XmlElement(name = "DiscountPcnt", required = true)
    protected BigDecimal discountPcnt;

    /**
     * Zahlungsfrist in Tagen
     * 
     * @return
     *     possible object is
     *     {@link TgCashDiscount2 .CashDiscDays }
     *     
     */
    public TgCashDiscount2 .CashDiscDays getCashDiscDays() {
        return cashDiscDays;
    }

    /**
     * Legt den Wert der cashDiscDays-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgCashDiscount2 .CashDiscDays }
     *     
     * @see #getCashDiscDays()
     */
    public void setCashDiscDays(TgCashDiscount2 .CashDiscDays value) {
        this.cashDiscDays = value;
    }

    /**
     * Zahlungsziel
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCashDiscDate() {
        return cashDiscDate;
    }

    /**
     * Legt den Wert der cashDiscDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getCashDiscDate()
     */
    public void setCashDiscDate(XMLGregorianCalendar value) {
        this.cashDiscDate = value;
    }

    /**
     * Ruft den Wert der discountPcnt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountPcnt() {
        return discountPcnt;
    }

    /**
     * Legt den Wert der discountPcnt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscountPcnt(BigDecimal value) {
        this.discountPcnt = value;
    }


    /**
     * <p>Java-Klasse für anonymous complex type.</p>
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <extension base="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgCashDiscDays">
     *     </extension>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CashDiscDays
        extends TgCashDiscDays2
    {


    }

}
