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
 * <p>Java-Klasse für tgMetalResources complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgMetalResources">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Resource">
 *           <simpleType>
 *             <restriction base="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString">
 *               <enumeration value="AL"/>
 *               <enumeration value="PB"/>
 *               <enumeration value="CR"/>
 *               <enumeration value="AU"/>
 *               <enumeration value="CD"/>
 *               <enumeration value="CU"/>
 *               <enumeration value="MG"/>
 *               <enumeration value="NI"/>
 *               <enumeration value="PL"/>
 *               <enumeration value="AG"/>
 *               <enumeration value="W"/>
 *               <enumeration value="ZN"/>
 *               <enumeration value="SN"/>
 *               <enumeration value="CUZN"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="WeigthPartValue" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDecimal_13_2"/>
 *         <element name="WPU" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString"/>
 *         <element name="BaseValue" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDecimal_13_2"/>
 *         <element name="BU" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString"/>
 *         <element name="BaseDELQuotation" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDecimal_13_2"/>
 *         <element name="CurDELQuotation" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDecimal_13_2"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgMetalResources", propOrder = {
    "resource",
    "weigthPartValue",
    "wpu",
    "baseValue",
    "bu",
    "baseDELQuotation",
    "curDELQuotation"
})
public class TgMetalResources2 {

    /**
     * Rohstoff
     * 
     * AL = Aluminium
     * PB = Blei
     * CR = Chrom
     * AU = Gold
     * CD = Kadmium
     * CU = Kupfer
     * MG = Magnesium
     * NI = Nickel
     * PL = Platin
     * AG = Silber
     * W  = Wolfram
     * ZN = Zink
     * SN = Zinn
     * CUZN = Messing
     * 
     */
    @XmlElement(name = "Resource", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String resource;
    /**
     * Gewichtsanteilwert
     * 
     */
    @XmlElement(name = "WeigthPartValue", required = true)
    protected BigDecimal weigthPartValue;
    /**
     * Gewichtanteileinheit
     * 
     */
    @XmlElement(name = "WPU", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String wpu;
    /**
     * Basiswert
     * 
     */
    @XmlElement(name = "BaseValue", required = true)
    protected BigDecimal baseValue;
    /**
     * Basiseinheit
     * 
     */
    @XmlElement(name = "BU", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String bu;
    /**
     * Basis DEL Notierung
     * 
     */
    @XmlElement(name = "BaseDELQuotation", required = true)
    protected BigDecimal baseDELQuotation;
    /**
     * Aktuelle DEL Notierung
     * 
     */
    @XmlElement(name = "CurDELQuotation", required = true)
    protected BigDecimal curDELQuotation;

    /**
     * Rohstoff
     * 
     * AL = Aluminium
     * PB = Blei
     * CR = Chrom
     * AU = Gold
     * CD = Kadmium
     * CU = Kupfer
     * MG = Magnesium
     * NI = Nickel
     * PL = Platin
     * AG = Silber
     * W  = Wolfram
     * ZN = Zink
     * SN = Zinn
     * CUZN = Messing
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResource() {
        return resource;
    }

    /**
     * Legt den Wert der resource-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getResource()
     */
    public void setResource(String value) {
        this.resource = value;
    }

    /**
     * Gewichtsanteilwert
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWeigthPartValue() {
        return weigthPartValue;
    }

    /**
     * Legt den Wert der weigthPartValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getWeigthPartValue()
     */
    public void setWeigthPartValue(BigDecimal value) {
        this.weigthPartValue = value;
    }

    /**
     * Gewichtanteileinheit
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWPU() {
        return wpu;
    }

    /**
     * Legt den Wert der wpu-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getWPU()
     */
    public void setWPU(String value) {
        this.wpu = value;
    }

    /**
     * Basiswert
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBaseValue() {
        return baseValue;
    }

    /**
     * Legt den Wert der baseValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getBaseValue()
     */
    public void setBaseValue(BigDecimal value) {
        this.baseValue = value;
    }

    /**
     * Basiseinheit
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBU() {
        return bu;
    }

    /**
     * Legt den Wert der bu-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getBU()
     */
    public void setBU(String value) {
        this.bu = value;
    }

    /**
     * Basis DEL Notierung
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBaseDELQuotation() {
        return baseDELQuotation;
    }

    /**
     * Legt den Wert der baseDELQuotation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getBaseDELQuotation()
     */
    public void setBaseDELQuotation(BigDecimal value) {
        this.baseDELQuotation = value;
    }

    /**
     * Aktuelle DEL Notierung
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurDELQuotation() {
        return curDELQuotation;
    }

    /**
     * Legt den Wert der curDELQuotation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getCurDELQuotation()
     */
    public void setCurDELQuotation(BigDecimal value) {
        this.curDELQuotation = value;
    }

}
