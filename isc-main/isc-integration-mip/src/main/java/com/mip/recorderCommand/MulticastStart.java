
package com.mip.recorderCommand;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for anonymous complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="deviceIds" type="{http://video.net/2/XProtectCSRecorderCommand}ArrayOfGuid" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="clientCapabilities" type="{http://video.net/2/XProtectCSRecorderCommand}ClientCapabilities" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "token",
    "deviceIds",
    "clientCapabilities"
})
@XmlRootElement(name = "MulticastStart")
public class MulticastStart {

    protected String token;
    protected ArrayOfGuid deviceIds;
    protected ClientCapabilities clientCapabilities;

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * Gets the value of the deviceIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGuid }
     *     
     */
    public ArrayOfGuid getDeviceIds() {
        return deviceIds;
    }

    /**
     * Sets the value of the deviceIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGuid }
     *     
     */
    public void setDeviceIds(ArrayOfGuid value) {
        this.deviceIds = value;
    }

    /**
     * Gets the value of the clientCapabilities property.
     * 
     * @return
     *     possible object is
     *     {@link ClientCapabilities }
     *     
     */
    public ClientCapabilities getClientCapabilities() {
        return clientCapabilities;
    }

    /**
     * Sets the value of the clientCapabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientCapabilities }
     *     
     */
    public void setClientCapabilities(ClientCapabilities value) {
        this.clientCapabilities = value;
    }

}
