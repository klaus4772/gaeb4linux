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
 * Informationen zum Ausfuehrungsort
 * 
 * <p>Java-Klasse für tgCnstSite complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgCnstSite">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Address" type="{}tgAddress" minOccurs="0"/>
 *         <element name="CnstSiteIDNo" type="{}tgNormalizedString20" minOccurs="0"/>
 *         <element name="CnstSiteName" type="{}tgNormalizedString60" minOccurs="0"/>
 *         <element name="AddText" type="{}tgAddText" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgCnstSite", namespace = "", propOrder = {
    "address",
    "cnstSiteIDNo",
    "cnstSiteName",
    "addText"
})
public class TgCnstSite {

    /**
     * Informationen zur Adresse des Ausfuehrungsortes
     * 
     */
    @XmlElement(name = "Address")
    protected TgAddress address;
    /**
     * Identifizierungs-Nummer Ausfuehrungsort
     * 
     */
    @XmlElement(name = "CnstSiteIDNo")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String cnstSiteIDNo;
    /**
     * Name Ausfuehrungsort (LiegenschaftsVerzeichnis)
     * 
     */
    @XmlElement(name = "CnstSiteName")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String cnstSiteName;
    /**
     * Zusaetzlicher Text; Zusätzliche Textinformation können hier abgelegt werden.
     * 
     */
    @XmlElement(name = "AddText")
    protected List<TgAddText> addText;

    /**
     * Informationen zur Adresse des Ausfuehrungsortes
     * 
     * @return
     *     possible object is
     *     {@link TgAddress }
     *     
     */
    public TgAddress getAddress() {
        return address;
    }

    /**
     * Legt den Wert der address-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TgAddress }
     *     
     * @see #getAddress()
     */
    public void setAddress(TgAddress value) {
        this.address = value;
    }

    /**
     * Identifizierungs-Nummer Ausfuehrungsort
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnstSiteIDNo() {
        return cnstSiteIDNo;
    }

    /**
     * Legt den Wert der cnstSiteIDNo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCnstSiteIDNo()
     */
    public void setCnstSiteIDNo(String value) {
        this.cnstSiteIDNo = value;
    }

    /**
     * Name Ausfuehrungsort (LiegenschaftsVerzeichnis)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnstSiteName() {
        return cnstSiteName;
    }

    /**
     * Legt den Wert der cnstSiteName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCnstSiteName()
     */
    public void setCnstSiteName(String value) {
        this.cnstSiteName = value;
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
     * {@link TgAddText }
     * </p>
     * 
     * 
     * @return
     *     The value of the addText property.
     */
    public List<TgAddText> getAddText() {
        if (addText == null) {
            addText = new ArrayList<>();
        }
        return this.addText;
    }

}
