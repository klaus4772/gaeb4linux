//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v4.0.5 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
//


package com.example.gaebviewer.schema.da80;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Summen
 * 
 * <p>Java-Klasse für tgTotals complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgTotals">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Total" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDecimal_13_2"/>
 *         <choice minOccurs="0">
 *           <sequence>
 *             <choice>
 *               <element name="DiscountPcnt" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDecimal_9_6"/>
 *               <element name="DiscountAmt" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDecimal_13_2"/>
 *             </choice>
 *             <element name="TotAfterDisc" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDecimal_13_2"/>
 *           </sequence>
 *           <element name="TotalLSUM" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDecimal_13_2"/>
 *         </choice>
 *         <element name="VAT" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDecimal_5_2" minOccurs="0"/>
 *         <element name="TotalNet" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDecimal_13_2" minOccurs="0"/>
 *         <element name="TotalNetUpComp" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgTotalNetUpComp" minOccurs="0"/>
 *         <element name="VATPart" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgVATPart" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="VATAmount" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDecimal_13_2" minOccurs="0"/>
 *         <element name="TotalGross" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDecimal_13_2" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgTotals", propOrder = {
    "total",
    "discountPcnt",
    "discountAmt",
    "totAfterDisc",
    "totalLSUM",
    "vat",
    "totalNet",
    "totalNetUpComp",
    "vatPart",
    "vatAmount",
    "totalGross"
})
public class TgTotals2 {

    /**
     * Summe
     * 
     */
    @XmlElement(name = "Total", required = true)
    protected BigDecimal total;
    /**
     * Prozentualer Nachlass
     * 
     */
    @XmlElement(name = "DiscountPcnt")
    protected BigDecimal discountPcnt;
    /**
     * Absoluter Nachlass
     * 
     */
    @XmlElement(name = "DiscountAmt")
    protected BigDecimal discountAmt;
    /**
     * Summe nach Nachlass
     * 
     */
    @XmlElement(name = "TotAfterDisc")
    protected BigDecimal totAfterDisc;
    /**
     * Pauschalsumme
     * 
     */
    @XmlElement(name = "TotalLSUM")
    protected BigDecimal totalLSUM;
    /**
     * Umsatzsteuersatz in %
     * 
     */
    @XmlElement(name = "VAT")
    protected BigDecimal vat;
    /**
     * Netto-Summe mit Berücksichtigung von Nachlässen
     * 
     */
    @XmlElement(name = "TotalNet")
    protected BigDecimal totalNet;
    /**
     * Nettobeträge der Einheitspreisanteile
     * 
     */
    @XmlElement(name = "TotalNetUpComp")
    protected TgTotalNetUpComp2 totalNetUpComp;
    /**
     * Umsatzsteuersatz
     * 
     */
    @XmlElement(name = "VATPart")
    protected List<TgVATPart2> vatPart;
    /**
     * Umsatzsteuerbetrag
     * 
     */
    @XmlElement(name = "VATAmount")
    protected BigDecimal vatAmount;
    /**
     * Summe mit Beruecksichtigung von Nachlaessen und Umsatzsteuer
     * 
     */
    @XmlElement(name = "TotalGross")
    protected BigDecimal totalGross;

    /**
     * Summe
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
     * Prozentualer Nachlass
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
     * @see #getDiscountPcnt()
     */
    public void setDiscountPcnt(BigDecimal value) {
        this.discountPcnt = value;
    }

    /**
     * Absoluter Nachlass
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountAmt() {
        return discountAmt;
    }

    /**
     * Legt den Wert der discountAmt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getDiscountAmt()
     */
    public void setDiscountAmt(BigDecimal value) {
        this.discountAmt = value;
    }

    /**
     * Summe nach Nachlass
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotAfterDisc() {
        return totAfterDisc;
    }

    /**
     * Legt den Wert der totAfterDisc-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getTotAfterDisc()
     */
    public void setTotAfterDisc(BigDecimal value) {
        this.totAfterDisc = value;
    }

    /**
     * Pauschalsumme
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalLSUM() {
        return totalLSUM;
    }

    /**
     * Legt den Wert der totalLSUM-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getTotalLSUM()
     */
    public void setTotalLSUM(BigDecimal value) {
        this.totalLSUM = value;
    }

    /**
     * Umsatzsteuersatz in %
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVAT() {
        return vat;
    }

    /**
     * Legt den Wert der vat-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getVAT()
     */
    public void setVAT(BigDecimal value) {
        this.vat = value;
    }

    /**
     * Netto-Summe mit Berücksichtigung von Nachlässen
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalNet() {
        return totalNet;
    }

    /**
     * Legt den Wert der totalNet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getTotalNet()
     */
    public void setTotalNet(BigDecimal value) {
        this.totalNet = value;
    }

    /**
     * Nettobeträge der Einheitspreisanteile
     * 
     * @return
     *     possible object is
     *     {@link TgTotalNetUpComp2 }
     *     
     */
    public TgTotalNetUpComp2 getTotalNetUpComp() {
        return totalNetUpComp;
    }

    /**
     * Legt den Wert der totalNetUpComp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgTotalNetUpComp2 }
     *     
     * @see #getTotalNetUpComp()
     */
    public void setTotalNetUpComp(TgTotalNetUpComp2 value) {
        this.totalNetUpComp = value;
    }

    /**
     * Umsatzsteuersatz
     * 
     * Gets the value of the vatPart property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vatPart property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVATPart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TgVATPart2 }
     * </p>
     * 
     * 
     * @return
     *     The value of the vatPart property.
     */
    public List<TgVATPart2> getVATPart() {
        if (vatPart == null) {
            vatPart = new ArrayList<>();
        }
        return this.vatPart;
    }

    /**
     * Umsatzsteuerbetrag
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVATAmount() {
        return vatAmount;
    }

    /**
     * Legt den Wert der vatAmount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getVATAmount()
     */
    public void setVATAmount(BigDecimal value) {
        this.vatAmount = value;
    }

    /**
     * Summe mit Beruecksichtigung von Nachlaessen und Umsatzsteuer
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalGross() {
        return totalGross;
    }

    /**
     * Legt den Wert der totalGross-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getTotalGross()
     */
    public void setTotalGross(BigDecimal value) {
        this.totalGross = value;
    }

}
