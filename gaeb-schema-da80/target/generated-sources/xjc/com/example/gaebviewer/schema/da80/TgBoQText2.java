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
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Langtext
 * 
 * <p>Java-Klasse für tgBoQText complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgBoQText">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Style" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgStyle" minOccurs="0"/>
 *         <choice maxOccurs="unbounded">
 *           <element name="Text" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgFTextTC" maxOccurs="unbounded" minOccurs="0"/>
 *           <element name="TextComplement" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgTextComplement" maxOccurs="unbounded" minOccurs="0"/>
 *           <element name="attachment" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "tgBoQText", propOrder = {
    "style",
    "textOrTextComplementOrAttachment"
})
public class TgBoQText2 {

    /**
     * Definitionen für styles
     * 
     */
    @XmlElement(name = "Style")
    protected TgStyle2 style;
    @XmlElementRefs({
        @XmlElementRef(name = "Text", namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TextComplement", namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "attachment", namespace = "http://www.gaeb.de/GAEB_DA_XML/DA80/3.3", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> textOrTextComplementOrAttachment;
    /**
     * Oberster Style für den Langtext
     * 
     */
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
     * Gets the value of the textOrTextComplementOrAttachment property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the textOrTextComplementOrAttachment property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTextOrTextComplementOrAttachment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link TgFTextTC2 }{@code >}
     * {@link JAXBElement }{@code <}{@link TgTextComplement2 }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * </p>
     * 
     * 
     * @return
     *     The value of the textOrTextComplementOrAttachment property.
     */
    public List<JAXBElement<?>> getTextOrTextComplementOrAttachment() {
        if (textOrTextComplementOrAttachment == null) {
            textOrTextComplementOrAttachment = new ArrayList<>();
        }
        return this.textOrTextComplementOrAttachment;
    }

    /**
     * Oberster Style für den Langtext
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
     * @see #getStyleAttr()
     */
    public void setStyleAttr(String value) {
        this.styleAttr = value;
    }

}
