
package com.mip.recorderStatus;

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
 *         &amp;lt;element name="GetAudioDeviceStatisticsResult" type="{http://video.net/2/XProtectCSRecorderStatus2}ArrayOfAudioDeviceStatistics" minOccurs="0"/&amp;gt;
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
    "getAudioDeviceStatisticsResult"
})
@XmlRootElement(name = "GetAudioDeviceStatisticsResponse")
public class GetAudioDeviceStatisticsResponse {

    @XmlElement(name = "GetAudioDeviceStatisticsResult")
    protected ArrayOfAudioDeviceStatistics getAudioDeviceStatisticsResult;

    /**
     * Gets the value of the getAudioDeviceStatisticsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAudioDeviceStatistics }
     *     
     */
    public ArrayOfAudioDeviceStatistics getGetAudioDeviceStatisticsResult() {
        return getAudioDeviceStatisticsResult;
    }

    /**
     * Sets the value of the getAudioDeviceStatisticsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAudioDeviceStatistics }
     *     
     */
    public void setGetAudioDeviceStatisticsResult(ArrayOfAudioDeviceStatistics value) {
        this.getAudioDeviceStatisticsResult = value;
    }

}
