
package com.mip.recorderStatus;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for MediaStreamDeviceStatusBase complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="MediaStreamDeviceStatusBase"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://video.net/2/XProtectCSRecorderStatus2}DeviceStatusBase"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="Recording" type="{http://www.w3.org/2001/XMLSchema}boolean"/&amp;gt;
 *         &amp;lt;element name="DbMoveInProgress" type="{http://www.w3.org/2001/XMLSchema}boolean"/&amp;gt;
 *         &amp;lt;element name="ErrorOverflow" type="{http://www.w3.org/2001/XMLSchema}boolean"/&amp;gt;
 *         &amp;lt;element name="ErrorWritingGop" type="{http://www.w3.org/2001/XMLSchema}boolean"/&amp;gt;
 *         &amp;lt;element name="DbRepairInProgress" type="{http://www.w3.org/2001/XMLSchema}boolean"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MediaStreamDeviceStatusBase", propOrder = {
    "recording",
    "dbMoveInProgress",
    "errorOverflow",
    "errorWritingGop",
    "dbRepairInProgress"
})
@XmlSeeAlso({
    CameraDeviceStatus.class,
    MetadataDeviceStatus.class,
    SpeakerDeviceStatus.class,
    MicrophoneDeviceStatus.class
})
public class MediaStreamDeviceStatusBase
    extends DeviceStatusBase
{

    @XmlElement(name = "Recording")
    protected boolean recording;
    @XmlElement(name = "DbMoveInProgress")
    protected boolean dbMoveInProgress;
    @XmlElement(name = "ErrorOverflow")
    protected boolean errorOverflow;
    @XmlElement(name = "ErrorWritingGop")
    protected boolean errorWritingGop;
    @XmlElement(name = "DbRepairInProgress")
    protected boolean dbRepairInProgress;

    /**
     * Gets the value of the recording property.
     * 
     */
    public boolean isRecording() {
        return recording;
    }

    /**
     * Sets the value of the recording property.
     * 
     */
    public void setRecording(boolean value) {
        this.recording = value;
    }

    /**
     * Gets the value of the dbMoveInProgress property.
     * 
     */
    public boolean isDbMoveInProgress() {
        return dbMoveInProgress;
    }

    /**
     * Sets the value of the dbMoveInProgress property.
     * 
     */
    public void setDbMoveInProgress(boolean value) {
        this.dbMoveInProgress = value;
    }

    /**
     * Gets the value of the errorOverflow property.
     * 
     */
    public boolean isErrorOverflow() {
        return errorOverflow;
    }

    /**
     * Sets the value of the errorOverflow property.
     * 
     */
    public void setErrorOverflow(boolean value) {
        this.errorOverflow = value;
    }

    /**
     * Gets the value of the errorWritingGop property.
     * 
     */
    public boolean isErrorWritingGop() {
        return errorWritingGop;
    }

    /**
     * Sets the value of the errorWritingGop property.
     * 
     */
    public void setErrorWritingGop(boolean value) {
        this.errorWritingGop = value;
    }

    /**
     * Gets the value of the dbRepairInProgress property.
     * 
     */
    public boolean isDbRepairInProgress() {
        return dbRepairInProgress;
    }

    /**
     * Sets the value of the dbRepairInProgress property.
     * 
     */
    public void setDbRepairInProgress(boolean value) {
        this.dbRepairInProgress = value;
    }

}
