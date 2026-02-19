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
 *         <element name="HourItem" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgHourItem"/>
 *         <element name="MaterialItem" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgMaterialItem"/>
 *         <element name="MarkupItemOWN" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgMarkupItemOWN"/>
 *         <element name="MarkupItemCTR" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgMarkupItemCTR"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgMastAgrItems", propOrder = {
    "hourItemOrMaterialItemOrMarkupItemOWN"
})
public class TgMastAgrItems2 {

    @XmlElements({
        @XmlElement(name = "HourItem", type = TgHourItem2 .class),
        @XmlElement(name = "MaterialItem", type = TgMaterialItem2 .class),
        @XmlElement(name = "MarkupItemOWN", type = TgMarkupItemOWN2 .class),
        @XmlElement(name = "MarkupItemCTR", type = TgMarkupItemCTR2 .class)
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
     * {@link TgHourItem2 }
     * {@link TgMarkupItemCTR2 }
     * {@link TgMarkupItemOWN2 }
     * {@link TgMaterialItem2 }
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
