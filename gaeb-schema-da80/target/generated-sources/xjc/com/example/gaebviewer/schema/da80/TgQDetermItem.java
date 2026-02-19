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
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Liste der Mengenermittlungszeilen in x80 bis x89
 * 
 * <p>Java-Klasse für tgQDetermItem complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgQDetermItem">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="QTakeoff">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <attribute name="Row" use="required" type="{}tgQTakeoffRow" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="CtlgAssign" type="{}tgCtlgAssign" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgQDetermItem", namespace = "", propOrder = {
    "qTakeoff",
    "ctlgAssign"
})
public class TgQDetermItem {

    /**
     * Aufmasszeile
     * 
     */
    @XmlElement(name = "QTakeoff", required = true)
    protected TgQDetermItem.QTakeoff qTakeoff;
    /**
     * Katalogzuordnung
     * 
     */
    @XmlElement(name = "CtlgAssign")
    protected List<TgCtlgAssign> ctlgAssign;

    /**
     * Aufmasszeile
     * 
     * @return
     *     possible object is
     *     {@link TgQDetermItem.QTakeoff }
     *     
     */
    public TgQDetermItem.QTakeoff getQTakeoff() {
        return qTakeoff;
    }

    /**
     * Legt den Wert der qTakeoff-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgQDetermItem.QTakeoff }
     *     
     * @see #getQTakeoff()
     */
    public void setQTakeoff(TgQDetermItem.QTakeoff value) {
        this.qTakeoff = value;
    }

    /**
     * Katalogzuordnung
     * 
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
     * {@link TgCtlgAssign }
     * </p>
     * 
     * 
     * @return
     *     The value of the ctlgAssign property.
     */
    public List<TgCtlgAssign> getCtlgAssign() {
        if (ctlgAssign == null) {
            ctlgAssign = new ArrayList<>();
        }
        return this.ctlgAssign;
    }


    /**
     * <p>Java-Klasse für anonymous complex type.</p>
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <attribute name="Row" use="required" type="{}tgQTakeoffRow" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class QTakeoff {

        /**
         * Aufmasszeile
         * 
         */
        @XmlAttribute(name = "Row", required = true)
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        protected String row;

        /**
         * Aufmasszeile
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRow() {
            return row;
        }

        /**
         * Legt den Wert der row-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getRow()
         */
        public void setRow(String value) {
            this.row = value;
        }

    }

}
