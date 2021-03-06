//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.11.14 at 03:28:36 PM PST 
//


package eu.datex2.schema._1_0._1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A collection of lists of enumeration values used throughout the DATEX II model.
 * 
 * <p>Java class for PayloadEnumerations complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PayloadEnumerations">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="locationEnumerations" type="{http://datex2.eu/schema/1_0/1_0}LocationEnumerations" minOccurs="0"/>
 *         &lt;element name="payloadEnumerationsExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayloadEnumerations", propOrder = {
    "locationEnumerations",
    "payloadEnumerationsExtension"
})
public abstract class PayloadEnumerations {

    protected LocationEnumerations locationEnumerations;
    protected ExtensionType payloadEnumerationsExtension;

    /**
     * Gets the value of the locationEnumerations property.
     * 
     * @return
     *     possible object is
     *     {@link LocationEnumerations }
     *     
     */
    public LocationEnumerations getLocationEnumerations() {
        return locationEnumerations;
    }

    /**
     * Sets the value of the locationEnumerations property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationEnumerations }
     *     
     */
    public void setLocationEnumerations(LocationEnumerations value) {
        this.locationEnumerations = value;
    }

    /**
     * Gets the value of the payloadEnumerationsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getPayloadEnumerationsExtension() {
        return payloadEnumerationsExtension;
    }

    /**
     * Sets the value of the payloadEnumerationsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setPayloadEnumerationsExtension(ExtensionType value) {
        this.payloadEnumerationsExtension = value;
    }

}
