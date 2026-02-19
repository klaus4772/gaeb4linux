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
 *         <element name="Style" type="{}tgStyle" minOccurs="0"/>
 *         <choice maxOccurs="unbounded">
 *           <element name="Text" type="{}tgFTextTC" maxOccurs="unbounded" minOccurs="0"/>
 *           <element name="TextComplement" type="{}tgTextComplement" maxOccurs="unbounded" minOccurs="0"/>
 *           <element name="attachment" type="{}tgNormalizedString" maxOccurs="unbounded" minOccurs="0"/>
 *         </choice>
 *       </sequence>
 *       <attribute name="style" type="{}tgAttStyle" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgBoQText", namespace = "", propOrder = {
    "style",
    "textOrTextComplementOrAttachment"
})
public class TgBoQText {

    /**
     * Definitionen für styles
     * 
     */
    @XmlElement(name = "Style")
    protected TgStyle style;
    @XmlElementRefs({
        @XmlElementRef(name = "Text", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TextComplement", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "attachment", type = JAXBElement.class, required = false)
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
     *     {@link TgStyle }
     *     
     */
    public TgStyle getStyle() {
        return style;
    }

    /**
     * Legt den Wert der style-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgStyle }
     *     
     * @see #getStyle()
     */
    public void setStyle(TgStyle value) {
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
     * {@link JAXBElement }{@code <}{@link TgFTextTC }{@code >}
     * {@link JAXBElement }{@code <}{@link TgTextComplement }{@code >}
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
