
package com.mip.recorderStatus;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.3.6
 * 2021-11-02T20:25:06.235-07:00
 * Generated source version: 3.3.6
 *
 */
public final class RecorderStatusService2Soap_RecorderStatusService2Soap12_Client {

    private static final QName SERVICE_NAME = new QName("http://video.net/2/XProtectCSRecorderStatus2", "RecorderStatusService2");

    private RecorderStatusService2Soap_RecorderStatusService2Soap12_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = RecorderStatusService2.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) {
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

        RecorderStatusService2 ss = new RecorderStatusService2(wsdlURL, SERVICE_NAME);
        RecorderStatusService2Soap port = ss.getRecorderStatusService2Soap12();

        {
        System.out.println("Invoking subscribeDeviceStatus...");
        java.lang.String _subscribeDeviceStatus_token = "";
        java.lang.String _subscribeDeviceStatus_statusSessionId = "";
        com.mip.recorderStatus.ArrayOfGuid _subscribeDeviceStatus_deviceIds = null;
        port.subscribeDeviceStatus(_subscribeDeviceStatus_token, _subscribeDeviceStatus_statusSessionId, _subscribeDeviceStatus_deviceIds);


        }
        {
        System.out.println("Invoking stopStatusSession...");
        java.lang.String _stopStatusSession_token = "";
        java.lang.String _stopStatusSession_statusSessionId = "";
        port.stopStatusSession(_stopStatusSession_token, _stopStatusSession_statusSessionId);


        }
        {
        System.out.println("Invoking getArchiveStorageStatus...");
        java.lang.String _getArchiveStorageStatus_token = "";
        com.mip.recorderStatus.ArrayOfStorageStatus _getArchiveStorageStatus__return = port.getArchiveStorageStatus(_getArchiveStorageStatus_token);
        System.out.println("getArchiveStorageStatus.result=" + _getArchiveStorageStatus__return);


        }
        {
        System.out.println("Invoking subscribeEventStatus...");
        java.lang.String _subscribeEventStatus_token = "";
        java.lang.String _subscribeEventStatus_statusSessionId = "";
        com.mip.recorderStatus.ArrayOfGuid _subscribeEventStatus_eventIds = null;
        port.subscribeEventStatus(_subscribeEventStatus_token, _subscribeEventStatus_statusSessionId, _subscribeEventStatus_eventIds);


        }
        {
        System.out.println("Invoking getVersion...");
        int _getVersion__return = port.getVersion();
        System.out.println("getVersion.result=" + _getVersion__return);


        }
        {
        System.out.println("Invoking getCurrentDeviceStatus...");
        java.lang.String _getCurrentDeviceStatus_token = "";
        com.mip.recorderStatus.ArrayOfGuid _getCurrentDeviceStatus_deviceIds = null;
        com.mip.recorderStatus.Status _getCurrentDeviceStatus__return = port.getCurrentDeviceStatus(_getCurrentDeviceStatus_token, _getCurrentDeviceStatus_deviceIds);
        System.out.println("getCurrentDeviceStatus.result=" + _getCurrentDeviceStatus__return);


        }
        {
        System.out.println("Invoking getVideoDeviceStatistics...");
        java.lang.String _getVideoDeviceStatistics_token = "";
        com.mip.recorderStatus.ArrayOfGuid _getVideoDeviceStatistics_deviceIds = null;
        com.mip.recorderStatus.ArrayOfVideoDeviceStatistics _getVideoDeviceStatistics__return = port.getVideoDeviceStatistics(_getVideoDeviceStatistics_token, _getVideoDeviceStatistics_deviceIds);
        System.out.println("getVideoDeviceStatistics.result=" + _getVideoDeviceStatistics__return);


        }
        {
        System.out.println("Invoking startStatusSession...");
        java.lang.String _startStatusSession_token = "";
        java.lang.String _startStatusSession__return = port.startStatusSession(_startStatusSession_token);
        System.out.println("startStatusSession.result=" + _startStatusSession__return);


        }
        {
        System.out.println("Invoking subscribeHardwareStatus...");
        java.lang.String _subscribeHardwareStatus_token = "";
        java.lang.String _subscribeHardwareStatus_statusSessionId = "";
        com.mip.recorderStatus.ArrayOfGuid _subscribeHardwareStatus_hardwareIds = null;
        port.subscribeHardwareStatus(_subscribeHardwareStatus_token, _subscribeHardwareStatus_statusSessionId, _subscribeHardwareStatus_hardwareIds);


        }
        {
        System.out.println("Invoking getCurrentHardwareStatus...");
        java.lang.String _getCurrentHardwareStatus_token = "";
        com.mip.recorderStatus.ArrayOfGuid _getCurrentHardwareStatus_hardwareIds = null;
        com.mip.recorderStatus.Status _getCurrentHardwareStatus__return = port.getCurrentHardwareStatus(_getCurrentHardwareStatus_token, _getCurrentHardwareStatus_hardwareIds);
        System.out.println("getCurrentHardwareStatus.result=" + _getCurrentHardwareStatus__return);


        }
        {
        System.out.println("Invoking getStatus...");
        java.lang.String _getStatus_token = "";
        java.lang.String _getStatus_statusSessionId = "";
        int _getStatus_millisecondsTimeout = 0;
        com.mip.recorderStatus.Status _getStatus__return = port.getStatus(_getStatus_token, _getStatus_statusSessionId, _getStatus_millisecondsTimeout);
        System.out.println("getStatus.result=" + _getStatus__return);


        }
        {
        System.out.println("Invoking getRecordingStorageStatus...");
        java.lang.String _getRecordingStorageStatus_token = "";
        com.mip.recorderStatus.ArrayOfStorageStatus _getRecordingStorageStatus__return = port.getRecordingStorageStatus(_getRecordingStorageStatus_token);
        System.out.println("getRecordingStorageStatus.result=" + _getRecordingStorageStatus__return);


        }
        {
        System.out.println("Invoking getMetadataDeviceStatistics...");
        java.lang.String _getMetadataDeviceStatistics_token = "";
        com.mip.recorderStatus.ArrayOfGuid _getMetadataDeviceStatistics_deviceIds = null;
        com.mip.recorderStatus.ArrayOfMetadataDeviceStatistics _getMetadataDeviceStatistics__return = port.getMetadataDeviceStatistics(_getMetadataDeviceStatistics_token, _getMetadataDeviceStatistics_deviceIds);
        System.out.println("getMetadataDeviceStatistics.result=" + _getMetadataDeviceStatistics__return);


        }
        {
        System.out.println("Invoking subscribeConfigurationStatus...");
        java.lang.String _subscribeConfigurationStatus_token = "";
        java.lang.String _subscribeConfigurationStatus_statusSessionId = "";
        boolean _subscribeConfigurationStatus_subscribe = false;
        port.subscribeConfigurationStatus(_subscribeConfigurationStatus_token, _subscribeConfigurationStatus_statusSessionId, _subscribeConfigurationStatus_subscribe);


        }
        {
        System.out.println("Invoking getRecorderStatus...");
        java.lang.String _getRecorderStatus_token = "";
        com.mip.recorderStatus.AttachAndConnectionState _getRecorderStatus__return = port.getRecorderStatus(_getRecorderStatus_token);
        System.out.println("getRecorderStatus.result=" + _getRecorderStatus__return);


        }
        {
        System.out.println("Invoking getAudioDeviceStatistics...");
        java.lang.String _getAudioDeviceStatistics_token = "";
        com.mip.recorderStatus.ArrayOfGuid _getAudioDeviceStatistics_deviceIds = null;
        com.mip.recorderStatus.ArrayOfAudioDeviceStatistics _getAudioDeviceStatistics__return = port.getAudioDeviceStatistics(_getAudioDeviceStatistics_token, _getAudioDeviceStatistics_deviceIds);
        System.out.println("getAudioDeviceStatistics.result=" + _getAudioDeviceStatistics__return);


        }

        System.exit(0);
    }

}