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
 *         <element name="InvoiceShareType" type="{}tgInvoiceShareType"/>
 *         <element name="Description" type="{}tgNormalizedString256"/>
 *         <choice>
 *           <element name="Total" type="{}tgDecimal_13_2"/>
 *           <element name="Percent" type="{}tgDecimal_9_6"/>
 *         </choice>
 *         <element name="CounterClaim" type="{}tgYes" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgInvoiceShare", namespace = "", propOrder = {
    "invoiceShareType",
    "description",
    "total",
    "percent",
    "counterClaim"
})
public class TgInvoiceShare {

    /**
     * Art des Rechnungsanteils
     * 
     */
    @XmlElement(name = "InvoiceShareType", required = true)
    @XmlSchemaType(name = "normalizedString")
    protected TgInvoiceShareType invoiceShareType;
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
    protected TgYes counterClaim;

    /**
     * Art des Rechnungsanteils
     * 
     * @return
     *     possible object is
     *     {@link TgInvoiceShareType }
     *     
     */
    public TgInvoiceShareType getInvoiceShareType() {
        return invoiceShareType;
    }

    /**
     * Legt den Wert der invoiceShareType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgInvoiceShareType }
     *     
     * @see #getInvoiceShareType()
     */
    public void setInvoiceShareType(TgInvoiceShareType value) {
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
     *     {@link TgYes }
     *     
     */
    public TgYes getCounterClaim() {
        return counterClaim;
    }

    /**
     * Legt den Wert der counterClaim-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgYes }
     *     
     * @see #getCounterClaim()
     */
    public void setCounterClaim(TgYes value) {
        this.counterClaim = value;
    }

}
