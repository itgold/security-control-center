
package com.mip.recorderCommand;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for MotionAreaInfos complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="MotionAreaInfos"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="Resolution" type="{http://video.net/2/XProtectCSRecorderCommand}Size"/&amp;gt;
 *         &amp;lt;element name="Areas" type="{http://video.net/2/XProtectCSRecorderCommand}ArrayOfMotionAreaInfo" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MotionAreaInfos", propOrder = {
    "resolution",
    "areas"
})
public class MotionAreaInfos {

    @XmlElement(name = "Resolution", required = true)
    protected Size resolution;
    @XmlElement(name = "Areas")
    protected ArrayOfMotionAreaInfo areas;

    /**
     * Gets the value of the resolution property.
     * 
     * @return
     *     possible object is
     *     {@link Size }
     *     
     */
    public Size getResolution() {
        return resolution;
    }

    /**
     * Sets the value of the resolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link Size }
     *     
     */
    public void setResolution(Size value) {
        this.resolution = value;
    }

    /**
     * Gets the value of the areas property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMotionAreaInfo }
     *     
     */
    public ArrayOfMotionAreaInfo getAreas() {
        return areas;
    }

    /**
     * Sets the value of the areas property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMotionAreaInfo }
     *     
     */
    public void setAreas(ArrayOfMotionAreaInfo value) {
        this.areas = value;
    }

}
