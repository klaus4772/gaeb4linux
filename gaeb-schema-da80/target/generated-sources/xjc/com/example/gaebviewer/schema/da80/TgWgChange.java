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
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Lohnaenderung
 * 
 * <p>Java-Klasse für tgWgChange complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgWgChange">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="LblRefWage" type="{}tgNormalizedString120"/>
 *         <element name="RedPriceComp" type="{}tgDecimal_9_6" minOccurs="0"/>
 *         <sequence maxOccurs="unbounded">
 *           <choice maxOccurs="unbounded">
 *             <element name="RefBoQ" type="{}tgRefBoQ"/>
 *             <element name="RefLotNo" type="{}tgRefBoQCtgy"/>
 *             <element name="RefLotGrNo" type="{}tgRefLotGrp"/>
 *             <element name="RefItem" type="{}tgRefItem"/>
 *           </choice>
 *           <element name="WgChangeRate" type="{}tgDecimal_6_4" minOccurs="0"/>
 *         </sequence>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgWgChange", namespace = "", propOrder = {
    "lblRefWage",
    "redPriceComp",
    "refBoQOrRefLotNoOrRefLotGrNo"
})
public class TgWgChange {

    /**
     * Bezeichnung massgebender Lohn
     * 
     */
    @XmlElement(name = "LblRefWage", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String lblRefWage;
    /**
     * Minderung der Preise in Prozent
     * 
     */
    @XmlElement(name = "RedPriceComp")
    protected BigDecimal redPriceComp;
    @XmlElements({
        @XmlElement(name = "RefBoQ", type = TgRefBoQ.class),
        @XmlElement(name = "RefLotNo", type = TgRefBoQCtgy.class),
        @XmlElement(name = "RefLotGrNo", type = TgRefLotGrp.class),
        @XmlElement(name = "RefItem", type = TgRefItem.class),
        @XmlElement(name = "WgChangeRate", type = BigDecimal.class)
    })
    protected List<Object> refBoQOrRefLotNoOrRefLotGrNo;

    /**
     * Bezeichnung massgebender Lohn
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLblRefWage() {
        return lblRefWage;
    }

    /**
     * Legt den Wert der lblRefWage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getLblRefWage()
     */
    public void setLblRefWage(String value) {
        this.lblRefWage = value;
    }

    /**
     * Minderung der Preise in Prozent
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRedPriceComp() {
        return redPriceComp;
    }

    /**
     * Legt den Wert der redPriceComp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getRedPriceComp()
     */
    public void setRedPriceComp(BigDecimal value) {
        this.redPriceComp = value;
    }

    /**
     * Gets the value of the refBoQOrRefLotNoOrRefLotGrNo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refBoQOrRefLotNoOrRefLotGrNo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRefBoQOrRefLotNoOrRefLotGrNo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TgRefBoQ }
     * {@link TgRefBoQCtgy }
     * {@link TgRefItem }
     * {@link TgRefLotGrp }
     * {@link BigDecimal }
     * </p>
     * 
     * 
     * @return
     *     The value of the refBoQOrRefLotNoOrRefLotGrNo property.
     */
    public List<Object> getRefBoQOrRefLotNoOrRefLotGrNo() {
        if (refBoQOrRefLotNoOrRefLotGrNo == null) {
            refBoQOrRefLotNoOrRefLotGrNo = new ArrayList<>();
        }
        return this.refBoQOrRefLotNoOrRefLotGrNo;
    }

}
