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
 * Positionsliste
 * 
 * <p>Java-Klasse für tgItemlist complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgItemlist">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice maxOccurs="unbounded" minOccurs="0">
 *         <element name="Remark" type="{}tgRemark"/>
 *         <element name="PerfDescr" type="{}tgPerfDescr"/>
 *         <element name="Item" type="{}tgItem"/>
 *         <element name="MarkupItem" type="{}tgMarkupItem"/>
 *         <element name="MastAgrItems" type="{}tgMastAgrItems"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgItemlist", namespace = "", propOrder = {
    "remarkOrPerfDescrOrItem"
})
public class TgItemlist {

    @XmlElements({
        @XmlElement(name = "Remark", type = TgRemark.class),
        @XmlElement(name = "PerfDescr", type = TgPerfDescr.class),
        @XmlElement(name = "Item", type = TgItem.class),
        @XmlElement(name = "MarkupItem", type = TgMarkupItem.class),
        @XmlElement(name = "MastAgrItems", type = TgMastAgrItems.class)
    })
    protected List<Object> remarkOrPerfDescrOrItem;

    /**
     * Gets the value of the remarkOrPerfDescrOrItem property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remarkOrPerfDescrOrItem property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRemarkOrPerfDescrOrItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TgItem }
     * {@link TgMarkupItem }
     * {@link TgMastAgrItems }
     * {@link TgPerfDescr }
     * {@link TgRemark }
     * </p>
     * 
     * 
     * @return
     *     The value of the remarkOrPerfDescrOrItem property.
     */
    public List<Object> getRemarkOrPerfDescrOrItem() {
        if (remarkOrPerfDescrOrItem == null) {
            remarkOrPerfDescrOrItem = new ArrayList<>();
        }
        return this.remarkOrPerfDescrOrItem;
    }

}
