
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
 *         &amp;lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="deviceId" type="{http://microsoft.com/wsdl/types/}guid"/&amp;gt;
 *         &amp;lt;element name="refWidth" type="{http://www.w3.org/2001/XMLSchema}double"/&amp;gt;
 *         &amp;lt;element name="refHeight" type="{http://www.w3.org/2001/XMLSchema}double"/&amp;gt;
 *         &amp;lt;element name="left" type="{http://www.w3.org/2001/XMLSchema}double"/&amp;gt;
 *         &amp;lt;element name="top" type="{http://www.w3.org/2001/XMLSchema}double"/&amp;gt;
 *         &amp;lt;element name="bottom" type="{http://www.w3.org/2001/XMLSchema}double"/&amp;gt;
 *         &amp;lt;element name="right" type="{http://www.w3.org/2001/XMLSchema}double"/&amp;gt;
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
    "deviceId",
    "refWidth",
    "refHeight",
    "left",
    "top",
    "bottom",
    "right"
})
@XmlRootElement(name = "PTZRectangle")
public class PTZRectangle {

    protected String token;
    @XmlElement(required = true)
    protected String deviceId;
    protected double refWidth;
    protected double refHeight;
    protected double left;
    protected double top;
    protected double bottom;
    protected double right;

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
     * Gets the value of the deviceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * Sets the value of the deviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceId(String value) {
        this.deviceId = value;
    }

    /**
     * Gets the value of the refWidth property.
     * 
     */
    public double getRefWidth() {
        return refWidth;
    }

    /**
     * Sets the value of the refWidth property.
     * 
     */
    public void setRefWidth(double value) {
        this.refWidth = value;
    }

    /**
     * Gets the value of the refHeight property.
     * 
     */
    public double getRefHeight() {
        return refHeight;
    }

    /**
     * Sets the value of the refHeight property.
     * 
     */
    public void setRefHeight(double value) {
        this.refHeight = value;
    }

    /**
     * Gets the value of the left property.
     * 
     */
    public double getLeft() {
        return left;
    }

    /**
     * Sets the value of the left property.
     * 
     */
    public void setLeft(double value) {
        this.left = value;
    }

    /**
     * Gets the value of the top property.
     * 
     */
    public double getTop() {
        return top;
    }

    /**
     * Sets the value of the top property.
     * 
     */
    public void setTop(double value) {
        this.top = value;
    }

    /**
     * Gets the value of the bottom property.
     * 
     */
    public double getBottom() {
        return bottom;
    }

    /**
     * Sets the value of the bottom property.
     * 
     */
    public void setBottom(double value) {
        this.bottom = value;
    }

    /**
     * Gets the value of the right property.
     * 
     */
    public double getRight() {
        return right;
    }

    /**
     * Sets the value of the right property.
     * 
     */
    public void setRight(double value) {
        this.right = value;
    }

}
