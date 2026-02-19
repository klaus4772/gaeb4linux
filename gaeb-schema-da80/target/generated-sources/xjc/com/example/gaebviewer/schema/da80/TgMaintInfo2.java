//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v4.0.5 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
//


package com.example.gaebviewer.schema.da80;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Nur bei Instandhaltung: Informationen zur Instandhaltung
 * 
 * <p>Java-Klasse für tgMaintInfo complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="tgMaintInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MaintType">
 *           <simpleType>
 *             <restriction base="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString">
 *               <enumeration value="Maint"/>
 *               <enumeration value="Repair"/>
 *               <enumeration value="Modern"/>
 *               <enumeration value="Warr"/>
 *               <enumeration value="Cancelorder"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="ProcessType">
 *           <simpleType>
 *             <restriction base="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString">
 *               <enumeration value="StandCon"/>
 *               <enumeration value="InsurClaim"/>
 *               <enumeration value="InvoicToTen"/>
 *               <enumeration value="FinApartInsp"/>
 *               <enumeration value="ThirdPartyBill"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <sequence minOccurs="0">
 *           <element name="ContrTransDate" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgDate"/>
 *           <element name="ContrTransTime" type="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgTime" minOccurs="0"/>
 *         </sequence>
 *         <element name="ContrLaw" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString">
 *               <enumeration value="OwnForOwn"/>
 *               <enumeration value="OwnForThi"/>
 *               <enumeration value="ThiForThi"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="Deadline" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.gaeb.de/GAEB_DA_XML/DA80/3.3}tgNormalizedString">
 *               <enumeration value="Imm"/>
 *               <enumeration value="Rush"/>
 *               <enumeration value="AsArr"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgMaintInfo", propOrder = {
    "maintType",
    "processType",
    "contrTransDate",
    "contrTransTime",
    "contrLaw",
    "deadline"
})
public class TgMaintInfo2 {

    /**
     * Art der Instandhaltung
     * 
     */
    @XmlElement(name = "MaintType", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String maintType;
    /**
     * Art der Behandlung
     * 
     */
    @XmlElement(name = "ProcessType", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String processType;
    /**
     * Auftrags-Uebergabe-Datum
     * 
     */
    @XmlElement(name = "ContrTransDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar contrTransDate;
    /**
     * Auftrags-Uebergabe-Uhrzeit
     * 
     */
    @XmlElement(name = "ContrTransTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar contrTransTime;
    /**
     * Auftragsrecht
     * 
     */
    @XmlElement(name = "ContrLaw")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String contrLaw;
    /**
     * Terminierung
     * 
     */
    @XmlElement(name = "Deadline")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String deadline;

    /**
     * Art der Instandhaltung
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaintType() {
        return maintType;
    }

    /**
     * Legt den Wert der maintType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMaintType()
     */
    public void setMaintType(String value) {
        this.maintType = value;
    }

    /**
     * Art der Behandlung
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessType() {
        return processType;
    }

    /**
     * Legt den Wert der processType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getProcessType()
     */
    public void setProcessType(String value) {
        this.processType = value;
    }

    /**
     * Auftrags-Uebergabe-Datum
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getContrTransDate() {
        return contrTransDate;
    }

    /**
     * Legt den Wert der contrTransDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getContrTransDate()
     */
    public void setContrTransDate(XMLGregorianCalendar value) {
        this.contrTransDate = value;
    }

    /**
     * Auftrags-Uebergabe-Uhrzeit
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getContrTransTime() {
        return contrTransTime;
    }

    /**
     * Legt den Wert der contrTransTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getContrTransTime()
     */
    public void setContrTransTime(XMLGregorianCalendar value) {
        this.contrTransTime = value;
    }

    /**
     * Auftragsrecht
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContrLaw() {
        return contrLaw;
    }

    /**
     * Legt den Wert der contrLaw-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getContrLaw()
     */
    public void setContrLaw(String value) {
        this.contrLaw = value;
    }

    /**
     * Terminierung
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeadline() {
        return deadline;
    }

    /**
     * Legt den Wert der deadline-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDeadline()
     */
    public void setDeadline(String value) {
        this.deadline = value;
    }

}
