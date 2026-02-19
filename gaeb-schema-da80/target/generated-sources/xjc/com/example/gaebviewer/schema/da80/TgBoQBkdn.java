//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v4.0.5 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
//


package com.example.gaebviewer.schema.da80;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Informationen zur Gliederung des LV
 * 
 * <p>Java-Klasse für tgBoQBkdn complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgBoQBkdn">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Type" type="{}tgBoQBkdnType"/>
 *         <element name="LblBoQBkdn" type="{}tgNormalizedString40" minOccurs="0"/>
 *         <element name="Length" type="{}tgBoQBkdnLength"/>
 *         <element name="Num" type="{}tgYesNo"/>
 *         <element name="Alignment" type="{}tgLeftRight" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgBoQBkdn", namespace = "", propOrder = {
    "type",
    "lblBoQBkdn",
    "length",
    "num",
    "alignment"
})
public class TgBoQBkdn {

    /**
     * Ebene des Teilschluessels
     * 
     */
    @XmlElement(name = "Type", required = true)
    @XmlSchemaType(name = "normalizedString")
    protected TgBoQBkdnType type;
    /**
     * Bezeichnung der LVStufe
     * 
     */
    @XmlElement(name = "LblBoQBkdn")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String lblBoQBkdn;
    /**
     * Laenge des Teilschluessels
     * 
     */
    @XmlElement(name = "Length")
    @XmlSchemaType(name = "positiveInteger")
    protected int length;
    /**
     * Dieses Element sollte immer vorhanden sein. Ist dieses Element "Yes", dann ist die TeilOZ in dieser Ebene als numerische OZ zu interpretieren. In der TeilOZ sind dann nur Ziffern erlaubt. Fuehrende Nullen sind dann fuer die Interpretation nicht relevant. Ist dieses Attribut "No", dann ist die TeilOZ in dieser Ebene als alphanumerisch zu interpretieren. In der TeilOZ sind dann Ziffern und Buchstaben in beliebiger Reihenfolge erlaubt. Alle Stellen sind relevant.
     * 
     */
    @XmlElement(name = "Num", required = true)
    @XmlSchemaType(name = "normalizedString")
    protected TgYesNo num;
    /**
     * Dieses Element dokumentiert die Absicht des Senders, wie alphanumerische TeilOZs innerhalb des zur Verfuegung stehenden Platzes auszurichten sind. Ist das Attribut Num="Yes", dann hat dieses Element keine Bedeutung und es wird immer rechts ausgerichtet. Ist das Element Num="No", dann soll die Ausrichtung in Abhaengigkeit von diesem Element erfolgen.
     * 
     */
    @XmlElement(name = "Alignment")
    @XmlSchemaType(name = "normalizedString")
    protected TgLeftRight alignment;

    /**
     * Ebene des Teilschluessels
     * 
     * @return
     *     possible object is
     *     {@link TgBoQBkdnType }
     *     
     */
    public TgBoQBkdnType getType() {
        return type;
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgBoQBkdnType }
     *     
     * @see #getType()
     */
    public void setType(TgBoQBkdnType value) {
        this.type = value;
    }

    /**
     * Bezeichnung der LVStufe
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLblBoQBkdn() {
        return lblBoQBkdn;
    }

    /**
     * Legt den Wert der lblBoQBkdn-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getLblBoQBkdn()
     */
    public void setLblBoQBkdn(String value) {
        this.lblBoQBkdn = value;
    }

    /**
     * Laenge des Teilschluessels
     * 
     */
    public int getLength() {
        return length;
    }

    /**
     * Legt den Wert der length-Eigenschaft fest.
     * 
     */
    public void setLength(int value) {
        this.length = value;
    }

    /**
     * Dieses Element sollte immer vorhanden sein. Ist dieses Element "Yes", dann ist die TeilOZ in dieser Ebene als numerische OZ zu interpretieren. In der TeilOZ sind dann nur Ziffern erlaubt. Fuehrende Nullen sind dann fuer die Interpretation nicht relevant. Ist dieses Attribut "No", dann ist die TeilOZ in dieser Ebene als alphanumerisch zu interpretieren. In der TeilOZ sind dann Ziffern und Buchstaben in beliebiger Reihenfolge erlaubt. Alle Stellen sind relevant.
     * 
     * @return
     *     possible object is
     *     {@link TgYesNo }
     *     
     */
    public TgYesNo getNum() {
        return num;
    }

    /**
     * Legt den Wert der num-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgYesNo }
     *     
     * @see #getNum()
     */
    public void setNum(TgYesNo value) {
        this.num = value;
    }

    /**
     * Dieses Element dokumentiert die Absicht des Senders, wie alphanumerische TeilOZs innerhalb des zur Verfuegung stehenden Platzes auszurichten sind. Ist das Attribut Num="Yes", dann hat dieses Element keine Bedeutung und es wird immer rechts ausgerichtet. Ist das Element Num="No", dann soll die Ausrichtung in Abhaengigkeit von diesem Element erfolgen.
     * 
     * @return
     *     possible object is
     *     {@link TgLeftRight }
     *     
     */
    public TgLeftRight getAlignment() {
        return alignment;
    }

    /**
     * Legt den Wert der alignment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgLeftRight }
     *     
     * @see #getAlignment()
     */
    public void setAlignment(TgLeftRight value) {
        this.alignment = value;
    }

}
