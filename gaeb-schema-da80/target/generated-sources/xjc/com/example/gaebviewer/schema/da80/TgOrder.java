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
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Bestellung
 * 
 * <p>Java-Klasse für tgOrder complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgOrder">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DP">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *               <enumeration value="93"/>
 *               <enumeration value="94"/>
 *               <enumeration value="96"/>
 *               <enumeration value="97"/>
 *               <enumeration value="98"/>
 *               <enumeration value="99"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="OrderInfo" type="{}tgOrderInfo" minOccurs="0"/>
 *         <element name="SupplierInfo" type="{}tgSupplierInfo" minOccurs="0"/>
 *         <element name="CustomerInfo" type="{}tgCustomerInfo" minOccurs="0"/>
 *         <element name="DeliveryPlaceInfo" type="{}tgDeliveryPlaceInfo" minOccurs="0"/>
 *         <element name="PlannerInfo" type="{}tgPlannerInfo" minOccurs="0"/>
 *         <element name="InvoiceInfo" type="{}tgInvoiceInfo" minOccurs="0"/>
 *         <element name="OrderItem" type="{}tgOrderItem" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgOrder", namespace = "", propOrder = {
    "dp",
    "orderInfo",
    "supplierInfo",
    "customerInfo",
    "deliveryPlaceInfo",
    "plannerInfo",
    "invoiceInfo",
    "orderItem"
})
public class TgOrder {

    /**
     * GAEB-Datenaustauschphase
     * 
     */
    @XmlElement(name = "DP", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String dp;
    /**
     * Informationen zur Bestellung
     * 
     */
    @XmlElement(name = "OrderInfo")
    protected TgOrderInfo orderInfo;
    @XmlElement(name = "SupplierInfo")
    protected TgSupplierInfo supplierInfo;
    @XmlElement(name = "CustomerInfo")
    protected TgCustomerInfo customerInfo;
    @XmlElement(name = "DeliveryPlaceInfo")
    protected TgDeliveryPlaceInfo deliveryPlaceInfo;
    @XmlElement(name = "PlannerInfo")
    protected TgPlannerInfo plannerInfo;
    @XmlElement(name = "InvoiceInfo")
    protected TgInvoiceInfo invoiceInfo;
    @XmlElement(name = "OrderItem")
    protected List<TgOrderItem> orderItem;

    /**
     * GAEB-Datenaustauschphase
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDP() {
        return dp;
    }

    /**
     * Legt den Wert der dp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDP()
     */
    public void setDP(String value) {
        this.dp = value;
    }

    /**
     * Informationen zur Bestellung
     * 
     * @return
     *     possible object is
     *     {@link TgOrderInfo }
     *     
     */
    public TgOrderInfo getOrderInfo() {
        return orderInfo;
    }

    /**
     * Legt den Wert der orderInfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgOrderInfo }
     *     
     * @see #getOrderInfo()
     */
    public void setOrderInfo(TgOrderInfo value) {
        this.orderInfo = value;
    }

    /**
     * Ruft den Wert der supplierInfo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TgSupplierInfo }
     *     
     */
    public TgSupplierInfo getSupplierInfo() {
        return supplierInfo;
    }

    /**
     * Legt den Wert der supplierInfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgSupplierInfo }
     *     
     */
    public void setSupplierInfo(TgSupplierInfo value) {
        this.supplierInfo = value;
    }

    /**
     * Ruft den Wert der customerInfo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TgCustomerInfo }
     *     
     */
    public TgCustomerInfo getCustomerInfo() {
        return customerInfo;
    }

    /**
     * Legt den Wert der customerInfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgCustomerInfo }
     *     
     */
    public void setCustomerInfo(TgCustomerInfo value) {
        this.customerInfo = value;
    }

    /**
     * Ruft den Wert der deliveryPlaceInfo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TgDeliveryPlaceInfo }
     *     
     */
    public TgDeliveryPlaceInfo getDeliveryPlaceInfo() {
        return deliveryPlaceInfo;
    }

    /**
     * Legt den Wert der deliveryPlaceInfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgDeliveryPlaceInfo }
     *     
     */
    public void setDeliveryPlaceInfo(TgDeliveryPlaceInfo value) {
        this.deliveryPlaceInfo = value;
    }

    /**
     * Ruft den Wert der plannerInfo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TgPlannerInfo }
     *     
     */
    public TgPlannerInfo getPlannerInfo() {
        return plannerInfo;
    }

    /**
     * Legt den Wert der plannerInfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgPlannerInfo }
     *     
     */
    public void setPlannerInfo(TgPlannerInfo value) {
        this.plannerInfo = value;
    }

    /**
     * Ruft den Wert der invoiceInfo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TgInvoiceInfo }
     *     
     */
    public TgInvoiceInfo getInvoiceInfo() {
        return invoiceInfo;
    }

    /**
     * Legt den Wert der invoiceInfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgInvoiceInfo }
     *     
     */
    public void setInvoiceInfo(TgInvoiceInfo value) {
        this.invoiceInfo = value;
    }

    /**
     * Gets the value of the orderItem property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderItem property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOrderItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TgOrderItem }
     * </p>
     * 
     * 
     * @return
     *     The value of the orderItem property.
     */
    public List<TgOrderItem> getOrderItem() {
        if (orderItem == null) {
            orderItem = new ArrayList<>();
        }
        return this.orderItem;
    }

}
