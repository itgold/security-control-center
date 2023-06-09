
package com.mip.recorderCommand;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &amp;lt;element name="SmartSearchStartResult" type="{http://microsoft.com/wsdl/types/}guid"/&amp;gt;
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
    "smartSearchStartResult"
})
@XmlRootElement(name = "SmartSearchStartResponse")
public class SmartSearchStartResponse {

    @XmlElement(name = "SmartSearchStartResult", required = true)
    protected String smartSearchStartResult;

    /**
     * Gets the value of the smartSearchStartResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmartSearchStartResult() {
        return smartSearchStartResult;
    }

    /**
     * Sets the value of the smartSearchStartResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmartSearchStartResult(String value) {
        this.smartSearchStartResult = value;
    }

}
