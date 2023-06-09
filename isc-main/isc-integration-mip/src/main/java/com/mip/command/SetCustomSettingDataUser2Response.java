
package com.mip.command;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &amp;lt;element name="SetCustomSettingDataUser2Result" type="{http://video.net/2/XProtectCSServerCommand}SetCustomSettingResultType" minOccurs="0"/&amp;gt;
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
    "setCustomSettingDataUser2Result"
})
@XmlRootElement(name = "SetCustomSettingDataUser2Response")
public class SetCustomSettingDataUser2Response {

    @XmlElement(name = "SetCustomSettingDataUser2Result")
    @XmlSchemaType(name = "string")
    protected SetCustomSettingResultType setCustomSettingDataUser2Result;

    /**
     * Gets the value of the setCustomSettingDataUser2Result property.
     * 
     * @return
     *     possible object is
     *     {@link SetCustomSettingResultType }
     *     
     */
    public SetCustomSettingResultType getSetCustomSettingDataUser2Result() {
        return setCustomSettingDataUser2Result;
    }

    /**
     * Sets the value of the setCustomSettingDataUser2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetCustomSettingResultType }
     *     
     */
    public void setSetCustomSettingDataUser2Result(SetCustomSettingResultType value) {
        this.setCustomSettingDataUser2Result = value;
    }

}
