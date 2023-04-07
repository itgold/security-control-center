
package com.mip.config;

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
 *         &amp;lt;element name="GetTranslationsResult" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfstringstring" minOccurs="0"/&amp;gt;
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
    "getTranslationsResult"
})
@XmlRootElement(name = "GetTranslationsResponse")
public class GetTranslationsResponse {

    @XmlElement(name = "GetTranslationsResult", nillable = true)
    protected ArrayOfKeyValueOfstringstring getTranslationsResult;

    /**
     * Gets the value of the getTranslationsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeyValueOfstringstring }
     *     
     */
    public ArrayOfKeyValueOfstringstring getGetTranslationsResult() {
        return getTranslationsResult;
    }

    /**
     * Sets the value of the getTranslationsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeyValueOfstringstring }
     *     
     */
    public void setGetTranslationsResult(ArrayOfKeyValueOfstringstring value) {
        this.getTranslationsResult = value;
    }

}