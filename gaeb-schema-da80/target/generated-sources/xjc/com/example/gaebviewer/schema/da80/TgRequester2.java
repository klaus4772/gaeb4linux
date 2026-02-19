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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Informationen zum Bedarfstraeger
 * 
 * <p>Java-Klasse für tgRequester complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgRequester">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Address" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgAddress" minOccurs="0"/>
 *         <element name="RequestIDNo" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString20" minOccurs="0"/>
 *         <element name="RequestName" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString60" minOccurs="0"/>
 *         <element name="AddText" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgAddText" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgRequester", propOrder = {
    "address",
    "requestIDNo",
    "requestName",
    "addText"
})
public class TgRequester2 {

    /**
     * Informationen zur Adresse des Bedarfstraegers
     * 
     */
    @XmlElement(name = "Address")
    protected TgAddress2 address;
    /**
     * Identifizierungs-Nummer des Bedarfstraegers
     * 
     */
    @XmlElement(name = "RequestIDNo")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String requestIDNo;
    /**
     * Name des Bedarfstraegers
     * 
     */
    @XmlElement(name = "RequestName")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String requestName;
    /**
     * Zusaetzlicher Text; Zusätzliche Textinformation können hier abgelegt werden.
     * 
     */
    @XmlElement(name = "AddText")
    protected List<TgAddText2> addText;

    /**
     * Informationen zur Adresse des Bedarfstraegers
     * 
     * @return
     *     possible object is
     *     {@link TgAddress2 }
     *     
     */
    public TgAddress2 getAddress() {
        return address;
    }

    /**
     * Legt den Wert der address-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgAddress2 }
     *     
     * @see #getAddress()
     */
    public void setAddress(TgAddress2 value) {
        this.address = value;
    }

    /**
     * Identifizierungs-Nummer des Bedarfstraegers
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestIDNo() {
        return requestIDNo;
    }

    /**
     * Legt den Wert der requestIDNo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRequestIDNo()
     */
    public void setRequestIDNo(String value) {
        this.requestIDNo = value;
    }

    /**
     * Name des Bedarfstraegers
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestName() {
        return requestName;
    }

    /**
     * Legt den Wert der requestName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRequestName()
     */
    public void setRequestName(String value) {
        this.requestName = value;
    }

    /**
     * Zusaetzlicher Text; Zusätzliche Textinformation können hier abgelegt werden.
     * 
     * Gets the value of the addText property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addText property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAddText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TgAddText2 }
     * </p>
     * 
     * 
     * @return
     *     The value of the addText property.
     */
    public List<TgAddText2> getAddText() {
        if (addText == null) {
            addText = new ArrayList<>();
        }
        return this.addText;
    }

}
