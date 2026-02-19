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
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Kurztext
 * 
 * <p>Java-Klasse für tgOutlTxt complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgOutlTxt">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Style" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgStyle" minOccurs="0"/>
 *         <choice maxOccurs="unbounded">
 *           <element name="TextOutlTxt" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgMLText" maxOccurs="unbounded" minOccurs="0"/>
 *           <element name="TextComplement" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgTextComplement" maxOccurs="unbounded" minOccurs="0"/>
 *         </choice>
 *       </sequence>
 *       <attribute name="style" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgAttStyle" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgOutlTxt", propOrder = {
    "style",
    "textOutlTxtOrTextComplement"
})
public class TgOutlTxt2 {

    /**
     * Definitionen für styles
     * 
     */
    @XmlElement(name = "Style")
    protected TgStyle2 style;
    @XmlElements({
        @XmlElement(name = "TextOutlTxt", type = TgMLText2 .class),
        @XmlElement(name = "TextComplement", type = TgTextComplement2 .class)
    })
    protected List<Object> textOutlTxtOrTextComplement;
    @XmlAttribute(name = "style")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String styleAttr;

    /**
     * Definitionen für styles
     * 
     * @return
     *     possible object is
     *     {@link TgStyle2 }
     *     
     */
    public TgStyle2 getStyle() {
        return style;
    }

    /**
     * Legt den Wert der style-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgStyle2 }
     *     
     * @see #getStyle()
     */
    public void setStyle(TgStyle2 value) {
        this.style = value;
    }

    /**
     * Gets the value of the textOutlTxtOrTextComplement property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the textOutlTxtOrTextComplement property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTextOutlTxtOrTextComplement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TgMLText2 }
     * {@link TgTextComplement2 }
     * </p>
     * 
     * 
     * @return
     *     The value of the textOutlTxtOrTextComplement property.
     */
    public List<Object> getTextOutlTxtOrTextComplement() {
        if (textOutlTxtOrTextComplement == null) {
            textOutlTxtOrTextComplement = new ArrayList<>();
        }
        return this.textOutlTxtOrTextComplement;
    }

    /**
     * Ruft den Wert der styleAttr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStyleAttr() {
        return styleAttr;
    }

    /**
     * Legt den Wert der styleAttr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStyleAttr(String value) {
        this.styleAttr = value;
    }

}
