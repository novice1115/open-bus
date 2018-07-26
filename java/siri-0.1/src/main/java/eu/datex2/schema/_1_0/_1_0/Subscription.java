//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.11.14 at 03:28:36 PM PST 
//


package eu.datex2.schema._1_0._1_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This item contains all information relating to a customer subscription.
 * 
 * <p>Java class for Subscription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Subscription">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deleteSubscription" type="{http://datex2.eu/schema/1_0/1_0}Boolean" minOccurs="0"/>
 *         &lt;element name="deliveryInterval" type="{http://datex2.eu/schema/1_0/1_0}Seconds" minOccurs="0"/>
 *         &lt;element name="operatingMode" type="{http://datex2.eu/schema/1_0/1_0}OperatingModeEnum"/>
 *         &lt;element name="subscriptionStartTime" type="{http://datex2.eu/schema/1_0/1_0}DateTime"/>
 *         &lt;element name="subscriptionState" type="{http://datex2.eu/schema/1_0/1_0}SubscriptionStateEnum"/>
 *         &lt;element name="subscriptionStopTime" type="{http://datex2.eu/schema/1_0/1_0}DateTime" minOccurs="0"/>
 *         &lt;element name="updateMethod" type="{http://datex2.eu/schema/1_0/1_0}UpdateMethodEnum"/>
 *         &lt;element name="target" type="{http://datex2.eu/schema/1_0/1_0}Target" maxOccurs="unbounded"/>
 *         &lt;element name="filterReference" type="{http://datex2.eu/schema/1_0/1_0}FilterReference" minOccurs="0"/>
 *         &lt;element name="catalogueReference" type="{http://datex2.eu/schema/1_0/1_0}CatalogueReference" minOccurs="0"/>
 *         &lt;element name="subscriptionExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Subscription", propOrder = {
    "deleteSubscription",
    "deliveryInterval",
    "operatingMode",
    "subscriptionStartTime",
    "subscriptionState",
    "subscriptionStopTime",
    "updateMethod",
    "target",
    "filterReference",
    "catalogueReference",
    "subscriptionExtension"
})
public class Subscription {

    protected Boolean deleteSubscription;
    protected Float deliveryInterval;
    @XmlElement(required = true)
    protected OperatingModeEnum operatingMode;
    @XmlElement(required = true)
    protected DateTime subscriptionStartTime;
    @XmlElement(required = true)
    protected SubscriptionStateEnum subscriptionState;
    protected DateTime subscriptionStopTime;
    @XmlElement(required = true)
    protected UpdateMethodEnum updateMethod;
    @XmlElement(required = true)
    protected List<Target> target;
    protected FilterReference filterReference;
    protected CatalogueReference catalogueReference;
    protected ExtensionType subscriptionExtension;

    /**
     * Gets the value of the deleteSubscription property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeleteSubscription() {
        return deleteSubscription;
    }

    /**
     * Sets the value of the deleteSubscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeleteSubscription(Boolean value) {
        this.deleteSubscription = value;
    }

    /**
     * Gets the value of the deliveryInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDeliveryInterval() {
        return deliveryInterval;
    }

    /**
     * Sets the value of the deliveryInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDeliveryInterval(Float value) {
        this.deliveryInterval = value;
    }

    /**
     * Gets the value of the operatingMode property.
     * 
     * @return
     *     possible object is
     *     {@link OperatingModeEnum }
     *     
     */
    public OperatingModeEnum getOperatingMode() {
        return operatingMode;
    }

    /**
     * Sets the value of the operatingMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatingModeEnum }
     *     
     */
    public void setOperatingMode(OperatingModeEnum value) {
        this.operatingMode = value;
    }

    /**
     * Gets the value of the subscriptionStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getSubscriptionStartTime() {
        return subscriptionStartTime;
    }

    /**
     * Sets the value of the subscriptionStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setSubscriptionStartTime(DateTime value) {
        this.subscriptionStartTime = value;
    }

    /**
     * Gets the value of the subscriptionState property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionStateEnum }
     *     
     */
    public SubscriptionStateEnum getSubscriptionState() {
        return subscriptionState;
    }

    /**
     * Sets the value of the subscriptionState property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionStateEnum }
     *     
     */
    public void setSubscriptionState(SubscriptionStateEnum value) {
        this.subscriptionState = value;
    }

    /**
     * Gets the value of the subscriptionStopTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getSubscriptionStopTime() {
        return subscriptionStopTime;
    }

    /**
     * Sets the value of the subscriptionStopTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setSubscriptionStopTime(DateTime value) {
        this.subscriptionStopTime = value;
    }

    /**
     * Gets the value of the updateMethod property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateMethodEnum }
     *     
     */
    public UpdateMethodEnum getUpdateMethod() {
        return updateMethod;
    }

    /**
     * Sets the value of the updateMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateMethodEnum }
     *     
     */
    public void setUpdateMethod(UpdateMethodEnum value) {
        this.updateMethod = value;
    }

    /**
     * Gets the value of the target property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the target property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTarget().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Target }
     * 
     * 
     */
    public List<Target> getTarget() {
        if (target == null) {
            target = new ArrayList<Target>();
        }
        return this.target;
    }

    /**
     * Gets the value of the filterReference property.
     * 
     * @return
     *     possible object is
     *     {@link FilterReference }
     *     
     */
    public FilterReference getFilterReference() {
        return filterReference;
    }

    /**
     * Sets the value of the filterReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterReference }
     *     
     */
    public void setFilterReference(FilterReference value) {
        this.filterReference = value;
    }

    /**
     * Gets the value of the catalogueReference property.
     * 
     * @return
     *     possible object is
     *     {@link CatalogueReference }
     *     
     */
    public CatalogueReference getCatalogueReference() {
        return catalogueReference;
    }

    /**
     * Sets the value of the catalogueReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CatalogueReference }
     *     
     */
    public void setCatalogueReference(CatalogueReference value) {
        this.catalogueReference = value;
    }

    /**
     * Gets the value of the subscriptionExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getSubscriptionExtension() {
        return subscriptionExtension;
    }

    /**
     * Sets the value of the subscriptionExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setSubscriptionExtension(ExtensionType value) {
        this.subscriptionExtension = value;
    }

}