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
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Leistungsverzeichnis
 * 
 * <p>Java-Klasse für tgBoQ complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgBoQ">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BoQInfo" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgBoQInfo"/>
 *         <element name="BoQBody" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgBoQBody"/>
 *         <element name="LotGrp" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgLotGrp" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "tgBoQ", propOrder = {
    "boQInfo",
    "boQBody",
    "lotGrp"
})
public class TgBoQ2 {

    /**
     * Informationen zum LV
     * 
     */
    @XmlElement(name = "BoQInfo", required = true)
    protected TgBoQInfo2 boQInfo;
    /**
     * LV-Hauptteil
     * 
     */
    @XmlElement(name = "BoQBody", required = true)
    protected TgBoQBody2 boQBody;
    /**
     * Losgruppe
     * 
     */
    @XmlElement(name = "LotGrp")
    protected List<TgLotGrp2> lotGrp;
    @XmlAttribute(name = "ID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Informationen zum LV
     * 
     * @return
     *     possible object is
     *     {@link TgBoQInfo2 }
     *     
     */
    public TgBoQInfo2 getBoQInfo() {
        return boQInfo;
    }

    /**
     * Legt den Wert der boQInfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgBoQInfo2 }
     *     
     * @see #getBoQInfo()
     */
    public void setBoQInfo(TgBoQInfo2 value) {
        this.boQInfo = value;
    }

    /**
     * LV-Hauptteil
     * 
     * @return
     *     possible object is
     *     {@link TgBoQBody2 }
     *     
     */
    public TgBoQBody2 getBoQBody() {
        return boQBody;
    }

    /**
     * Legt den Wert der boQBody-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgBoQBody2 }
     *     
     * @see #getBoQBody()
     */
    public void setBoQBody(TgBoQBody2 value) {
        this.boQBody = value;
    }

    /**
     * Losgruppe
     * 
     * Gets the value of the lotGrp property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lotGrp property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getLotGrp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TgLotGrp2 }
     * </p>
     * 
     * 
     * @return
     *     The value of the lotGrp property.
     */
    public List<TgLotGrp2> getLotGrp() {
        if (lotGrp == null) {
            lotGrp = new ArrayList<>();
        }
        return this.lotGrp;
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
