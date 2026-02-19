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
 * Erweiterung für Rahmenverträge
 * 
 * <p>Java-Klasse für tgMastAgrItems complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgMastAgrItems">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice maxOccurs="unbounded" minOccurs="0">
 *         <element name="HourItem" type="{}tgHourItem"/>
 *         <element name="MaterialItem" type="{}tgMaterialItem"/>
 *         <element name="MarkupItemOWN" type="{}tgMarkupItemOWN"/>
 *         <element name="MarkupItemCTR" type="{}tgMarkupItemCTR"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgMastAgrItems", namespace = "", propOrder = {
    "hourItemOrMaterialItemOrMarkupItemOWN"
})
public class TgMastAgrItems {

    @XmlElements({
        @XmlElement(name = "HourItem", type = TgHourItem.class),
        @XmlElement(name = "MaterialItem", type = TgMaterialItem.class),
        @XmlElement(name = "MarkupItemOWN", type = TgMarkupItemOWN.class),
        @XmlElement(name = "MarkupItemCTR", type = TgMarkupItemCTR.class)
    })
    protected List<Object> hourItemOrMaterialItemOrMarkupItemOWN;

    /**
     * Gets the value of the hourItemOrMaterialItemOrMarkupItemOWN property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hourItemOrMaterialItemOrMarkupItemOWN property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getHourItemOrMaterialItemOrMarkupItemOWN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TgHourItem }
     * {@link TgMarkupItemCTR }
     * {@link TgMarkupItemOWN }
     * {@link TgMaterialItem }
     * </p>
     * 
     * 
     * @return
     *     The value of the hourItemOrMaterialItemOrMarkupItemOWN property.
     */
    public List<Object> getHourItemOrMaterialItemOrMarkupItemOWN() {
        if (hourItemOrMaterialItemOrMarkupItemOWN == null) {
            hourItemOrMaterialItemOrMarkupItemOWN = new ArrayList<>();
        }
        return this.hourItemOrMaterialItemOrMarkupItemOWN;
    }

}
