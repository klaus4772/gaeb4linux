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
 *         <element name="Type" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgBoQBkdnType"/>
 *         <element name="LblBoQBkdn" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString40" minOccurs="0"/>
 *         <element name="Length" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgBoQBkdnLength"/>
 *         <element name="Num" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgYesNo"/>
 *         <element name="Alignment" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgLeftRight" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgBoQBkdn", propOrder = {
    "type",
    "lblBoQBkdn",
    "length",
    "num",
    "alignment"
})
public class TgBoQBkdn2 {

    /**
     * Ebene des Teilschluessels
     * 
     */
    @XmlElement(name = "Type", required = true)
    @XmlSchemaType(name = "normalizedString")
    protected TgBoQBkdnType2 type;
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
    protected TgYesNo2 num;
    /**
     * Dieses Element dokumentiert die Absicht des Senders, wie alphanumerische TeilOZs innerhalb des zur Verfuegung stehenden Platzes auszurichten sind. Ist das Attribut Num="Yes", dann hat dieses Element keine Bedeutung und es wird immer rechts ausgerichtet. Ist das Element Num="No", dann soll die Ausrichtung in Abhaengigkeit von diesem Element erfolgen.
     * 
     */
    @XmlElement(name = "Alignment")
    @XmlSchemaType(name = "normalizedString")
    protected TgLeftRight2 alignment;

    /**
     * Ebene des Teilschluessels
     * 
     * @return
     *     possible object is
     *     {@link TgBoQBkdnType2 }
     *     
     */
    public TgBoQBkdnType2 getType() {
        return type;
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgBoQBkdnType2 }
     *     
     * @see #getType()
     */
    public void setType(TgBoQBkdnType2 value) {
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
     *     {@link TgYesNo2 }
     *     
     */
    public TgYesNo2 getNum() {
        return num;
    }

    /**
     * Legt den Wert der num-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgYesNo2 }
     *     
     * @see #getNum()
     */
    public void setNum(TgYesNo2 value) {
        this.num = value;
    }

    /**
     * Dieses Element dokumentiert die Absicht des Senders, wie alphanumerische TeilOZs innerhalb des zur Verfuegung stehenden Platzes auszurichten sind. Ist das Attribut Num="Yes", dann hat dieses Element keine Bedeutung und es wird immer rechts ausgerichtet. Ist das Element Num="No", dann soll die Ausrichtung in Abhaengigkeit von diesem Element erfolgen.
     * 
     * @return
     *     possible object is
     *     {@link TgLeftRight2 }
     *     
     */
    public TgLeftRight2 getAlignment() {
        return alignment;
    }

    /**
     * Legt den Wert der alignment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgLeftRight2 }
     *     
     * @see #getAlignment()
     */
    public void setAlignment(TgLeftRight2 value) {
        this.alignment = value;
    }

}
