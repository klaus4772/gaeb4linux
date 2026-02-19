//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v4.0.5 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
//


package com.example.gaebviewer.schema.da80;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Rechnungsanteil
 * 
 * <p>Java-Klasse für tgInvoiceShare complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgInvoiceShare">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="InvoiceShareType" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgInvoiceShareType"/>
 *         <element name="Description" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString256"/>
 *         <choice>
 *           <element name="Total" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDecimal_13_2"/>
 *           <element name="Percent" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDecimal_9_6"/>
 *         </choice>
 *         <element name="CounterClaim" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgYes" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgInvoiceShare", propOrder = {
    "invoiceShareType",
    "description",
    "total",
    "percent",
    "counterClaim"
})
public class TgInvoiceShare2 {

    /**
     * Art des Rechnungsanteils
     * 
     */
    @XmlElement(name = "InvoiceShareType", required = true)
    @XmlSchemaType(name = "normalizedString")
    protected TgInvoiceShareType2 invoiceShareType;
    /**
     * Bezeichnung des Rechnungsanteil
     * 
     */
    @XmlElement(name = "Description", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String description;
    /**
     * Betrag des Rechnungsanteil
     * 
     */
    @XmlElement(name = "Total")
    protected BigDecimal total;
    /**
     * Prozentwert des Rechnungsanteil
     * 
     */
    @XmlElement(name = "Percent")
    protected BigDecimal percent;
    /**
     * Gegenforderung
     * 
     */
    @XmlElement(name = "CounterClaim")
    @XmlSchemaType(name = "normalizedString")
    protected TgYes2 counterClaim;

    /**
     * Art des Rechnungsanteils
     * 
     * @return
     *     possible object is
     *     {@link TgInvoiceShareType2 }
     *     
     */
    public TgInvoiceShareType2 getInvoiceShareType() {
        return invoiceShareType;
    }

    /**
     * Legt den Wert der invoiceShareType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgInvoiceShareType2 }
     *     
     * @see #getInvoiceShareType()
     */
    public void setInvoiceShareType(TgInvoiceShareType2 value) {
        this.invoiceShareType = value;
    }

    /**
     * Bezeichnung des Rechnungsanteil
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDescription()
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Betrag des Rechnungsanteil
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotal() {
        return total;
    }

    /**
     * Legt den Wert der total-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getTotal()
     */
    public void setTotal(BigDecimal value) {
        this.total = value;
    }

    /**
     * Prozentwert des Rechnungsanteil
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercent() {
        return percent;
    }

    /**
     * Legt den Wert der percent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getPercent()
     */
    public void setPercent(BigDecimal value) {
        this.percent = value;
    }

    /**
     * Gegenforderung
     * 
     * @return
     *     possible object is
     *     {@link TgYes2 }
     *     
     */
    public TgYes2 getCounterClaim() {
        return counterClaim;
    }

    /**
     * Legt den Wert der counterClaim-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgYes2 }
     *     
     * @see #getCounterClaim()
     */
    public void setCounterClaim(TgYes2 value) {
        this.counterClaim = value;
    }

}
