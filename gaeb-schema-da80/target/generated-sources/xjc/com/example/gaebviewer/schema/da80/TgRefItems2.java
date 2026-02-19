//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v4.0.5 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
//


package com.example.gaebviewer.schema.da80;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * OZs, Ordnungszahlen
 * 
 * <p>Java-Klasse für tgRefItems complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgRefItems">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence maxOccurs="unbounded" minOccurs="0">
 *         <sequence minOccurs="0">
 *           <element name="Customer">
 *             <complexType>
 *               <simpleContent>
 *                 <extension base="<http://www.gaeb.de/GAEB_DA_XML/DA80/3.3>tgNormalizedString">
 *                 </extension>
 *               </simpleContent>
 *             </complexType>
 *           </element>
 *           <element name="CustomerSubNo" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString" minOccurs="0"/>
 *           <element name="CustomerCtlgAssign" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgCtlgAssign" maxOccurs="unbounded" minOccurs="0"/>
 *         </sequence>
 *         <sequence minOccurs="0">
 *           <element name="Supplier">
 *             <complexType>
 *               <simpleContent>
 *                 <extension base="<http://www.gaeb.de/GAEB_DA_XML/DA80/3.3>tgNormalizedString">
 *                 </extension>
 *               </simpleContent>
 *             </complexType>
 *           </element>
 *           <element name="SupplierSubNo" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString" minOccurs="0"/>
 *           <element name="SupplierCtlgAssign" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgCtlgAssign" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "tgRefItems", propOrder = {
    "customerAndCustomerSubNoAndCustomerCtlgAssign"
})
public class TgRefItems2 {

    @XmlElementRefs({
        @XmlElementRef(name = "Customer", namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CustomerSubNo", namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CustomerCtlgAssign", namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Supplier", namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SupplierSubNo", namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SupplierCtlgAssign", namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> customerAndCustomerSubNoAndCustomerCtlgAssign;

    /**
     * Gets the value of the customerAndCustomerSubNoAndCustomerCtlgAssign property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerAndCustomerSubNoAndCustomerCtlgAssign property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCustomerAndCustomerSubNoAndCustomerCtlgAssign().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link TgCtlgAssign2 }{@code >}
     * {@link JAXBElement }{@code <}{@link TgCtlgAssign2 }{@code >}
     * {@link JAXBElement }{@code <}{@link TgRefItems2 .Customer }{@code >}
     * {@link JAXBElement }{@code <}{@link TgRefItems2 .Supplier }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * </p>
     * 
     * 
     * @return
     *     The value of the customerAndCustomerSubNoAndCustomerCtlgAssign property.
     */
    public List<JAXBElement<?>> getCustomerAndCustomerSubNoAndCustomerCtlgAssign() {
        if (customerAndCustomerSubNoAndCustomerCtlgAssign == null) {
            customerAndCustomerSubNoAndCustomerCtlgAssign = new ArrayList<>();
        }
        return this.customerAndCustomerSubNoAndCustomerCtlgAssign;
    }


    /**
     * <p>Java-Klasse für anonymous complex type.</p>
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <simpleContent>
     *     <extension base="<http://www.gaeb.de/GAEB_DA_XML/DA80/3.3>tgNormalizedString">
     *     </extension>
     *   </simpleContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Customer {

        /**
         * Einzeilige Zeichenkette ohne Längenbegrenzung
         * 
         */
        @XmlValue
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        protected String value;

        /**
         * Einzeilige Zeichenkette ohne Längenbegrenzung
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Legt den Wert der value-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getValue()
         */
        public void setValue(String value) {
            this.value = value;
        }

    }


    /**
     * <p>Java-Klasse für anonymous complex type.</p>
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <simpleContent>
     *     <extension base="<http://www.gaeb.de/GAEB_DA_XML/DA80/3.3>tgNormalizedString">
     *     </extension>
     *   </simpleContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Supplier {

        /**
         * Einzeilige Zeichenkette ohne Längenbegrenzung
         * 
         */
        @XmlValue
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        protected String value;

        /**
         * Einzeilige Zeichenkette ohne Längenbegrenzung
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Legt den Wert der value-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getValue()
         */
        public void setValue(String value) {
            this.value = value;
        }

    }

}
