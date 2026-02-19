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


/**
 * Schluessel STLB-Bau
 * 
 * <p>Java-Klasse für tgSTLBBau complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgSTLBBau">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="STLBBauCtlg" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgSTLBBauCtlg"/>
 *         <element name="STLBBauID" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgSTLBBauID" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgSTLBBau", propOrder = {
    "stlbBauCtlg",
    "stlbBauID"
})
public class TgSTLBBau2 {

    /**
     * Schluessel fuer Katalog und Gruppe der Leistung (STLB-Bau)
     * 
     */
    @XmlElement(name = "STLBBauCtlg", required = true)
    protected TgSTLBBauCtlg2 stlbBauCtlg;
    /**
     * Schlüssel einer Ausprägung (STLB-Bau Identifier)
     * 
     */
    @XmlElement(name = "STLBBauID")
    protected List<TgSTLBBauID2> stlbBauID;

    /**
     * Schluessel fuer Katalog und Gruppe der Leistung (STLB-Bau)
     * 
     * @return
     *     possible object is
     *     {@link TgSTLBBauCtlg2 }
     *     
     */
    public TgSTLBBauCtlg2 getSTLBBauCtlg() {
        return stlbBauCtlg;
    }

    /**
     * Legt den Wert der stlbBauCtlg-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgSTLBBauCtlg2 }
     *     
     * @see #getSTLBBauCtlg()
     */
    public void setSTLBBauCtlg(TgSTLBBauCtlg2 value) {
        this.stlbBauCtlg = value;
    }

    /**
     * Schlüssel einer Ausprägung (STLB-Bau Identifier)
     * 
     * Gets the value of the stlbBauID property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stlbBauID property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSTLBBauID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TgSTLBBauID2 }
     * </p>
     * 
     * 
     * @return
     *     The value of the stlbBauID property.
     */
    public List<TgSTLBBauID2> getSTLBBauID() {
        if (stlbBauID == null) {
            stlbBauID = new ArrayList<>();
        }
        return this.stlbBauID;
    }

}
