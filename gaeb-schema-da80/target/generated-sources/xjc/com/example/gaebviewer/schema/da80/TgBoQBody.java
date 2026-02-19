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
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlType;


/**
 * LV-Hauptteil
 * 
 * <p>Java-Klasse für tgBoQBody complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgBoQBody">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice minOccurs="0">
 *         <choice maxOccurs="unbounded">
 *           <element name="Remark" type="{}tgRemark"/>
 *           <element name="PerfDescr" type="{}tgPerfDescr"/>
 *           <element name="BoQCtgy" type="{}tgBoQCtgy"/>
 *         </choice>
 *         <element name="Itemlist" type="{}tgItemlist"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgBoQBody", namespace = "", propOrder = {
    "remarkOrPerfDescrOrBoQCtgy",
    "itemlist"
})
public class TgBoQBody {

    @XmlElements({
        @XmlElement(name = "Remark", type = TgRemark.class),
        @XmlElement(name = "PerfDescr", type = TgPerfDescr.class),
        @XmlElement(name = "BoQCtgy", type = TgBoQCtgy.class)
    })
    protected List<Object> remarkOrPerfDescrOrBoQCtgy;
    /**
     * Positionsliste
     * 
     */
    @XmlElement(name = "Itemlist")
    protected TgItemlist itemlist;

    /**
     * Gets the value of the remarkOrPerfDescrOrBoQCtgy property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remarkOrPerfDescrOrBoQCtgy property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRemarkOrPerfDescrOrBoQCtgy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TgBoQCtgy }
     * {@link TgPerfDescr }
     * {@link TgRemark }
     * </p>
     * 
     * 
     * @return
     *     The value of the remarkOrPerfDescrOrBoQCtgy property.
     */
    public List<Object> getRemarkOrPerfDescrOrBoQCtgy() {
        if (remarkOrPerfDescrOrBoQCtgy == null) {
            remarkOrPerfDescrOrBoQCtgy = new ArrayList<>();
        }
        return this.remarkOrPerfDescrOrBoQCtgy;
    }

    /**
     * Positionsliste
     * 
     * @return
     *     possible object is
     *     {@link TgItemlist }
     *     
     */
    public TgItemlist getItemlist() {
        return itemlist;
    }

    /**
     * Legt den Wert der itemlist-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgItemlist }
     *     
     * @see #getItemlist()
     */
    public void setItemlist(TgItemlist value) {
        this.itemlist = value;
    }

}
