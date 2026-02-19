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
 * <p>Java-Klasse für tgQtyDeterm complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgQtyDeterm">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Qty" type="{}tgDecimal_11_3" minOccurs="0"/>
 *         <element name="QDetermItem" type="{}tgQDetermItem" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgQtyDeterm", namespace = "", propOrder = {
    "qty",
    "qDetermItem"
})
public class TgQtyDeterm {

    /**
     * Aufmassmenge
     * 
     */
    @XmlElement(name = "Qty")
    protected BigDecimal qty;
    /**
     * Liste der Mengenermittlungszeilen
     * 
     */
    @XmlElement(name = "QDetermItem")
    protected List<TgQDetermItem> qDetermItem;

    /**
     * Aufmassmenge
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQty() {
        return qty;
    }

    /**
     * Legt den Wert der qty-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getQty()
     */
    public void setQty(BigDecimal value) {
        this.qty = value;
    }

    /**
     * Liste der Mengenermittlungszeilen
     * 
     * Gets the value of the qDetermItem property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qDetermItem property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getQDetermItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TgQDetermItem }
     * </p>
     * 
     * 
     * @return
     *     The value of the qDetermItem property.
     */
    public List<TgQDetermItem> getQDetermItem() {
        if (qDetermItem == null) {
            qDetermItem = new ArrayList<>();
        }
        return this.qDetermItem;
    }

}
