//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v4.0.5 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
//


package com.example.gaebviewer.schema.da80;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Losgruppe
 * 
 * <p>Java-Klasse für tgLotGrp complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgLotGrp">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="LotGrNo" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString"/>
 *         <element name="RefLotNo" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgRefBoQCtgy" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Totals" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgTotals" minOccurs="0"/>
 *         <element name="CtlgAssign" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgCtlgAssign" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgLotGrp", propOrder = {
    "lotGrNo",
    "refLotNo",
    "totals",
    "ctlgAssign"
})
public class TgLotGrp2 {

    /**
     * Nummer der Losgruppe
     * 
     */
    @XmlElement(name = "LotGrNo", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String lotGrNo;
    /**
     * Verweis auf Los
     * 
     */
    @XmlElement(name = "RefLotNo")
    protected List<TgRefBoQCtgy2> refLotNo;
    /**
     * Losgruppensumme
     * 
     */
    @XmlElement(name = "Totals")
    protected TgTotals2 totals;
    @XmlElement(name = "CtlgAssign")
    protected List<TgCtlgAssign2> ctlgAssign;
    @XmlAttribute(name = "ID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Nummer der Losgruppe
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLotGrNo() {
        return lotGrNo;
    }

    /**
     * Legt den Wert der lotGrNo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getLotGrNo()
     */
    public void setLotGrNo(String value) {
        this.lotGrNo = value;
    }

    /**
     * Verweis auf Los
     * 
     * Gets the value of the refLotNo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refLotNo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRefLotNo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TgRefBoQCtgy2 }
     * </p>
     * 
     * 
     * @return
     *     The value of the refLotNo property.
     */
    public List<TgRefBoQCtgy2> getRefLotNo() {
        if (refLotNo == null) {
            refLotNo = new ArrayList<>();
        }
        return this.refLotNo;
    }

    /**
     * Losgruppensumme
     * 
     * @return
     *     possible object is
     *     {@link TgTotals2 }
     *     
     */
    public TgTotals2 getTotals() {
        return totals;
    }

    /**
     * Legt den Wert der totals-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgTotals2 }
     *     
     * @see #getTotals()
     */
    public void setTotals(TgTotals2 value) {
        this.totals = value;
    }

    /**
     * Gets the value of the ctlgAssign property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ctlgAssign property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCtlgAssign().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TgCtlgAssign2 }
     * </p>
     * 
     * 
     * @return
     *     The value of the ctlgAssign property.
     */
    public List<TgCtlgAssign2> getCtlgAssign() {
        if (ctlgAssign == null) {
            ctlgAssign = new ArrayList<>();
        }
        return this.ctlgAssign;
    }

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

}
