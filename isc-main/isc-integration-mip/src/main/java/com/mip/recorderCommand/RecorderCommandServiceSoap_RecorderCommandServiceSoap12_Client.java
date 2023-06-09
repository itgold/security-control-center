
package com.mip.recorderCommand;

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
 * 2021-11-02T20:25:04.523-07:00
 * Generated source version: 3.3.6
 *
 */
public final class RecorderCommandServiceSoap_RecorderCommandServiceSoap12_Client {

    private static final QName SERVICE_NAME = new QName("http://video.net/2/XProtectCSRecorderCommand", "RecorderCommandService");

    private RecorderCommandServiceSoap_RecorderCommandServiceSoap12_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = RecorderCommandService.WSDL_LOCATION;
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

        RecorderCommandService ss = new RecorderCommandService(wsdlURL, SERVICE_NAME);
        RecorderCommandServiceSoap port = ss.getRecorderCommandServiceSoap12();

        {
        System.out.println("Invoking presetSet...");
        java.lang.String _presetSet_token = "";
        java.lang.String _presetSet_deviceId = "";
        java.lang.String _presetSet_presetName = "";
        port.presetSet(_presetSet_token, _presetSet_deviceId, _presetSet_presetName);


        }
        {
        System.out.println("Invoking ptzMoveAbsolute...");
        java.lang.String _ptzMoveAbsolute_token = "";
        java.lang.String _ptzMoveAbsolute_deviceId = "";
        com.mip.recorderCommand.PTZArgs _ptzMoveAbsolute_ptzArgs = null;
        port.ptzMoveAbsolute(_ptzMoveAbsolute_token, _ptzMoveAbsolute_deviceId, _ptzMoveAbsolute_ptzArgs);


        }
        {
        System.out.println("Invoking isManualRecording...");
        java.lang.String _isManualRecording_token = "";
        com.mip.recorderCommand.ArrayOfGuid _isManualRecording_deviceIds = null;
        com.mip.recorderCommand.ArrayOfManualRecordingInfo _isManualRecording__return = port.isManualRecording(_isManualRecording_token, _isManualRecording_deviceIds);
        System.out.println("isManualRecording.result=" + _isManualRecording__return);


        }
        {
        System.out.println("Invoking ptzReleaseSession...");
        java.lang.String _ptzReleaseSession_token = "";
        java.lang.String _ptzReleaseSession_deviceId = "";
        port.ptzReleaseSession(_ptzReleaseSession_token, _ptzReleaseSession_deviceId);


        }
        {
        System.out.println("Invoking outputTrigger...");
        java.lang.String _outputTrigger_token = "";
        java.lang.String _outputTrigger_deviceId = "";
        com.mip.recorderCommand.TimeDuration _outputTrigger_duration = null;
        port.outputTrigger(_outputTrigger_token, _outputTrigger_deviceId, _outputTrigger_duration);


        }
        {
        System.out.println("Invoking outputGetState...");
        java.lang.String _outputGetState_token = "";
        java.lang.String _outputGetState_deviceId = "";
        com.mip.recorderCommand.IOState _outputGetState__return = port.outputGetState(_outputGetState_token, _outputGetState_deviceId);
        System.out.println("outputGetState.result=" + _outputGetState__return);


        }
        {
        System.out.println("Invoking ptzMoveStop...");
        java.lang.String _ptzMoveStop_token = "";
        java.lang.String _ptzMoveStop_deviceId = "";
        port.ptzMoveStop(_ptzMoveStop_token, _ptzMoveStop_deviceId);


        }
        {
        System.out.println("Invoking smartSearchGetResult...");
        java.lang.String _smartSearchGetResult_token = "";
        java.lang.String _smartSearchGetResult_smartSearchId = "";
        boolean _smartSearchGetResult_continueSearch = false;
        com.mip.recorderCommand.SmartSearchResult _smartSearchGetResult__return = port.smartSearchGetResult(_smartSearchGetResult_token, _smartSearchGetResult_smartSearchId, _smartSearchGetResult_continueSearch);
        System.out.println("smartSearchGetResult.result=" + _smartSearchGetResult__return);


        }
        {
        System.out.println("Invoking multicastContinue...");
        java.lang.String _multicastContinue_token = "";
        com.mip.recorderCommand.ArrayOfGuid _multicastContinue_multicastSessionIds = null;
        port.multicastContinue(_multicastContinue_token, _multicastContinue_multicastSessionIds);


        }
        {
        System.out.println("Invoking startRecording...");
        java.lang.String _startRecording_token = "";
        java.lang.String _startRecording_deviceId = "";
        long _startRecording_recordingTimeMicroSeconds = 0;
        boolean _startRecording__return = port.startRecording(_startRecording_token, _startRecording_deviceId, _startRecording_recordingTimeMicroSeconds);
        System.out.println("startRecording.result=" + _startRecording__return);


        }
        {
        System.out.println("Invoking outputActivate...");
        java.lang.String _outputActivate_token = "";
        java.lang.String _outputActivate_deviceId = "";
        port.outputActivate(_outputActivate_token, _outputActivate_deviceId);


        }
        {
        System.out.println("Invoking jpegGetAtOrBefore...");
        java.lang.String _jpegGetAtOrBefore_token = "";
        java.lang.String _jpegGetAtOrBefore_deviceId = "";
        javax.xml.datatype.XMLGregorianCalendar _jpegGetAtOrBefore_time = null;
        com.mip.recorderCommand.JPEGData _jpegGetAtOrBefore__return = port.jpegGetAtOrBefore(_jpegGetAtOrBefore_token, _jpegGetAtOrBefore_deviceId, _jpegGetAtOrBefore_time);
        System.out.println("jpegGetAtOrBefore.result=" + _jpegGetAtOrBefore__return);


        }
        {
        System.out.println("Invoking startManualRecording...");
        java.lang.String _startManualRecording_token = "";
        com.mip.recorderCommand.ArrayOfGuid _startManualRecording_deviceIds = null;
        com.mip.recorderCommand.ArrayOfManualRecordingResult _startManualRecording__return = port.startManualRecording(_startManualRecording_token, _startManualRecording_deviceIds);
        System.out.println("startManualRecording.result=" + _startManualRecording__return);


        }
        {
        System.out.println("Invoking stopManualRecording...");
        java.lang.String _stopManualRecording_token = "";
        com.mip.recorderCommand.ArrayOfGuid _stopManualRecording_deviceIds = null;
        com.mip.recorderCommand.ArrayOfManualRecordingResult _stopManualRecording__return = port.stopManualRecording(_stopManualRecording_token, _stopManualRecording_deviceIds);
        System.out.println("stopManualRecording.result=" + _stopManualRecording__return);


        }
        {
        System.out.println("Invoking ptzGetSessionInfo...");
        java.lang.String _ptzGetSessionInfo_token = "";
        java.lang.String _ptzGetSessionInfo_deviceId = "";
        com.mip.recorderCommand.PtzSessionInfo _ptzGetSessionInfo__return = port.ptzGetSessionInfo(_ptzGetSessionInfo_token, _ptzGetSessionInfo_deviceId);
        System.out.println("ptzGetSessionInfo.result=" + _ptzGetSessionInfo__return);


        }
        {
        System.out.println("Invoking inputGetState...");
        java.lang.String _inputGetState_token = "";
        java.lang.String _inputGetState_deviceId = "";
        com.mip.recorderCommand.IOState _inputGetState__return = port.inputGetState(_inputGetState_token, _inputGetState_deviceId);
        System.out.println("inputGetState.result=" + _inputGetState__return);


        }
        {
        System.out.println("Invoking getRetentionTimeLimit...");
        java.lang.String _getRetentionTimeLimit_token = "";
        java.lang.String _getRetentionTimeLimit_deviceId = "";
        javax.xml.datatype.XMLGregorianCalendar _getRetentionTimeLimit__return = port.getRetentionTimeLimit(_getRetentionTimeLimit_token, _getRetentionTimeLimit_deviceId);
        System.out.println("getRetentionTimeLimit.result=" + _getRetentionTimeLimit__return);


        }
        {
        System.out.println("Invoking jpegGetLive...");
        java.lang.String _jpegGetLive_token = "";
        java.lang.String _jpegGetLive_deviceId = "";
        int _jpegGetLive_maxWidth = 0;
        int _jpegGetLive_maxHeight = 0;
        com.mip.recorderCommand.JPEGData _jpegGetLive__return = port.jpegGetLive(_jpegGetLive_token, _jpegGetLive_deviceId, _jpegGetLive_maxWidth, _jpegGetLive_maxHeight);
        System.out.println("jpegGetLive.result=" + _jpegGetLive__return);


        }
        {
        System.out.println("Invoking sequencesGet...");
        java.lang.String _sequencesGet_token = "";
        java.lang.String _sequencesGet_deviceId = "";
        java.lang.String _sequencesGet_sequenceType = "";
        javax.xml.datatype.XMLGregorianCalendar _sequencesGet_minTime = null;
        javax.xml.datatype.XMLGregorianCalendar _sequencesGet_maxTime = null;
        int _sequencesGet_maxCount = 0;
        com.mip.recorderCommand.ArrayOfSequenceEntry _sequencesGet__return = port.sequencesGet(_sequencesGet_token, _sequencesGet_deviceId, _sequencesGet_sequenceType, _sequencesGet_minTime, _sequencesGet_maxTime, _sequencesGet_maxCount);
        System.out.println("sequencesGet.result=" + _sequencesGet__return);


        }
        {
        System.out.println("Invoking jpegGetAtOrAfter...");
        java.lang.String _jpegGetAtOrAfter_token = "";
        java.lang.String _jpegGetAtOrAfter_deviceId = "";
        javax.xml.datatype.XMLGregorianCalendar _jpegGetAtOrAfter_time = null;
        com.mip.recorderCommand.JPEGData _jpegGetAtOrAfter__return = port.jpegGetAtOrAfter(_jpegGetAtOrAfter_token, _jpegGetAtOrAfter_deviceId, _jpegGetAtOrAfter_time);
        System.out.println("jpegGetAtOrAfter.result=" + _jpegGetAtOrAfter__return);


        }
        {
        System.out.println("Invoking presetMoveTo...");
        java.lang.String _presetMoveTo_token = "";
        java.lang.String _presetMoveTo_deviceId = "";
        java.lang.String _presetMoveTo_presetName = "";
        port.presetMoveTo(_presetMoveTo_token, _presetMoveTo_deviceId, _presetMoveTo_presetName);


        }
        {
        System.out.println("Invoking sendDriverCommandWithResponse...");
        java.lang.String _sendDriverCommandWithResponse_token = "";
        java.lang.String _sendDriverCommandWithResponse_deviceId = "";
        java.lang.String _sendDriverCommandWithResponse_command = "";
        java.lang.String _sendDriverCommandWithResponse_parameter = "";
        java.lang.String _sendDriverCommandWithResponse__return = port.sendDriverCommandWithResponse(_sendDriverCommandWithResponse_token, _sendDriverCommandWithResponse_deviceId, _sendDriverCommandWithResponse_command, _sendDriverCommandWithResponse_parameter);
        System.out.println("sendDriverCommandWithResponse.result=" + _sendDriverCommandWithResponse__return);


        }
        {
        System.out.println("Invoking multicastStop...");
        java.lang.String _multicastStop_token = "";
        com.mip.recorderCommand.ArrayOfGuid _multicastStop_multicastSessionIds = null;
        port.multicastStop(_multicastStop_token, _multicastStop_multicastSessionIds);


        }
        {
        System.out.println("Invoking ptzMoveHome...");
        java.lang.String _ptzMoveHome_token = "";
        java.lang.String _ptzMoveHome_deviceId = "";
        port.ptzMoveHome(_ptzMoveHome_token, _ptzMoveHome_deviceId);


        }
        {
        System.out.println("Invoking smartSearchGetStatus...");
        java.lang.String _smartSearchGetStatus_token = "";
        java.lang.String _smartSearchGetStatus_smartSearchId = "";
        com.mip.recorderCommand.SmartSearchStatus _smartSearchGetStatus__return = port.smartSearchGetStatus(_smartSearchGetStatus_token, _smartSearchGetStatus_smartSearchId);
        System.out.println("smartSearchGetStatus.result=" + _smartSearchGetStatus__return);


        }
        {
        System.out.println("Invoking ptzMoveStart...");
        java.lang.String _ptzMoveStart_token = "";
        java.lang.String _ptzMoveStart_deviceId = "";
        com.mip.recorderCommand.PTZArgs _ptzMoveStart_ptzArgs = null;
        port.ptzMoveStart(_ptzMoveStart_token, _ptzMoveStart_deviceId, _ptzMoveStart_ptzArgs);


        }
        {
        System.out.println("Invoking ptzCenter...");
        java.lang.String _ptzCenter_token = "";
        java.lang.String _ptzCenter_deviceId = "";
        double _ptzCenter_refWidth = 0.0;
        double _ptzCenter_refHeight = 0.0;
        double _ptzCenter_centerX = 0.0;
        double _ptzCenter_centerY = 0.0;
        double _ptzCenter_zoom = 0.0;
        port.ptzCenter(_ptzCenter_token, _ptzCenter_deviceId, _ptzCenter_refWidth, _ptzCenter_refHeight, _ptzCenter_centerX, _ptzCenter_centerY, _ptzCenter_zoom);


        }
        {
        System.out.println("Invoking timeLineInformationGet...");
        java.lang.String _timeLineInformationGet_token = "";
        java.lang.String _timeLineInformationGet_deviceId = "";
        com.mip.recorderCommand.ArrayOfGuid _timeLineInformationGet_timeLineInformationTypes = null;
        javax.xml.datatype.XMLGregorianCalendar _timeLineInformationGet_timeLineInformationBeginTime = null;
        com.mip.recorderCommand.TimeDuration _timeLineInformationGet_timeLineInformationInterval = null;
        int _timeLineInformationGet_timeLineInformationCount = 0;
        com.mip.recorderCommand.ArrayOfTimeLineInformationData _timeLineInformationGet__return = port.timeLineInformationGet(_timeLineInformationGet_token, _timeLineInformationGet_deviceId, _timeLineInformationGet_timeLineInformationTypes, _timeLineInformationGet_timeLineInformationBeginTime, _timeLineInformationGet_timeLineInformationInterval, _timeLineInformationGet_timeLineInformationCount);
        System.out.println("timeLineInformationGet.result=" + _timeLineInformationGet__return);


        }
        {
        System.out.println("Invoking smartSearchStart...");
        java.lang.String _smartSearchStart_token = "";
        java.lang.String _smartSearchStart_deviceId = "";
        javax.xml.datatype.XMLGregorianCalendar _smartSearchStart_searchBeginTime = null;
        javax.xml.datatype.XMLGregorianCalendar _smartSearchStart_searchEndTime = null;
        int _smartSearchStart_sensitivity = 0;
        com.mip.recorderCommand.TimeDuration _smartSearchStart_searchInterval = null;
        com.mip.recorderCommand.ImageMask _smartSearchStart_searchMask = null;
        boolean _smartSearchStart_ignoreInitialMotion = false;
        com.mip.recorderCommand.Size _smartSearchStart_resultMotionMaskSize = null;
        java.lang.String _smartSearchStart__return = port.smartSearchStart(_smartSearchStart_token, _smartSearchStart_deviceId, _smartSearchStart_searchBeginTime, _smartSearchStart_searchEndTime, _smartSearchStart_sensitivity, _smartSearchStart_searchInterval, _smartSearchStart_searchMask, _smartSearchStart_ignoreInitialMotion, _smartSearchStart_resultMotionMaskSize);
        System.out.println("smartSearchStart.result=" + _smartSearchStart__return);


        }
        {
        System.out.println("Invoking sendDriverCommand...");
        java.lang.String _sendDriverCommand_token = "";
        java.lang.String _sendDriverCommand_deviceId = "";
        java.lang.String _sendDriverCommand_command = "";
        port.sendDriverCommand(_sendDriverCommand_token, _sendDriverCommand_deviceId, _sendDriverCommand_command);


        }
        {
        System.out.println("Invoking outputDeactivate...");
        java.lang.String _outputDeactivate_token = "";
        java.lang.String _outputDeactivate_deviceId = "";
        port.outputDeactivate(_outputDeactivate_token, _outputDeactivate_deviceId);


        }
        {
        System.out.println("Invoking ptzReserveSession...");
        java.lang.String _ptzReserveSession_token = "";
        java.lang.String _ptzReserveSession_deviceId = "";
        port.ptzReserveSession(_ptzReserveSession_token, _ptzReserveSession_deviceId);


        }
        {
        System.out.println("Invoking sequencesGetAround...");
        java.lang.String _sequencesGetAround_token = "";
        java.lang.String _sequencesGetAround_deviceId = "";
        java.lang.String _sequencesGetAround_sequenceType = "";
        javax.xml.datatype.XMLGregorianCalendar _sequencesGetAround_centerTime = null;
        int _sequencesGetAround_maxCountBefore = 0;
        int _sequencesGetAround_maxCountAfter = 0;
        com.mip.recorderCommand.ArrayOfSequenceEntry _sequencesGetAround__return = port.sequencesGetAround(_sequencesGetAround_token, _sequencesGetAround_deviceId, _sequencesGetAround_sequenceType, _sequencesGetAround_centerTime, _sequencesGetAround_maxCountBefore, _sequencesGetAround_maxCountAfter);
        System.out.println("sequencesGetAround.result=" + _sequencesGetAround__return);


        }
        {
        System.out.println("Invoking sequencesGetAroundWithSpan...");
        java.lang.String _sequencesGetAroundWithSpan_token = "";
        java.lang.String _sequencesGetAroundWithSpan_deviceId = "";
        java.lang.String _sequencesGetAroundWithSpan_sequenceType = "";
        javax.xml.datatype.XMLGregorianCalendar _sequencesGetAroundWithSpan_centerTime = null;
        com.mip.recorderCommand.TimeDuration _sequencesGetAroundWithSpan_maxTimeBefore = null;
        int _sequencesGetAroundWithSpan_maxCountBefore = 0;
        com.mip.recorderCommand.TimeDuration _sequencesGetAroundWithSpan_maxTimeAfter = null;
        int _sequencesGetAroundWithSpan_maxCountAfter = 0;
        com.mip.recorderCommand.ArrayOfSequenceEntry _sequencesGetAroundWithSpan__return = port.sequencesGetAroundWithSpan(_sequencesGetAroundWithSpan_token, _sequencesGetAroundWithSpan_deviceId, _sequencesGetAroundWithSpan_sequenceType, _sequencesGetAroundWithSpan_centerTime, _sequencesGetAroundWithSpan_maxTimeBefore, _sequencesGetAroundWithSpan_maxCountBefore, _sequencesGetAroundWithSpan_maxTimeAfter, _sequencesGetAroundWithSpan_maxCountAfter);
        System.out.println("sequencesGetAroundWithSpan.result=" + _sequencesGetAroundWithSpan__return);


        }
        {
        System.out.println("Invoking ptzExtendedManualSession...");
        java.lang.String _ptzExtendedManualSession_token = "";
        java.lang.String _ptzExtendedManualSession_deviceId = "";
        port.ptzExtendedManualSession(_ptzExtendedManualSession_token, _ptzExtendedManualSession_deviceId);


        }
        {
        System.out.println("Invoking ptzGetAbsolutePosition...");
        java.lang.String _ptzGetAbsolutePosition_token = "";
        java.lang.String _ptzGetAbsolutePosition_deviceId = "";
        com.mip.recorderCommand.PTZArgs _ptzGetAbsolutePosition__return = port.ptzGetAbsolutePosition(_ptzGetAbsolutePosition_token, _ptzGetAbsolutePosition_deviceId);
        System.out.println("ptzGetAbsolutePosition.result=" + _ptzGetAbsolutePosition__return);


        }
        {
        System.out.println("Invoking ptzDeactivatePatrollingSchema...");
        java.lang.String _ptzDeactivatePatrollingSchema_token = "";
        java.lang.String _ptzDeactivatePatrollingSchema_deviceId = "";
        java.lang.String _ptzDeactivatePatrollingSchema_patrollingSchemaId = "";
        port.ptzDeactivatePatrollingSchema(_ptzDeactivatePatrollingSchema_token, _ptzDeactivatePatrollingSchema_deviceId, _ptzDeactivatePatrollingSchema_patrollingSchemaId);


        }
        {
        System.out.println("Invoking sequencesGetTypes...");
        java.lang.String _sequencesGetTypes_token = "";
        java.lang.String _sequencesGetTypes_deviceId = "";
        com.mip.recorderCommand.ArrayOfSequenceType _sequencesGetTypes__return = port.sequencesGetTypes(_sequencesGetTypes_token, _sequencesGetTypes_deviceId);
        System.out.println("sequencesGetTypes.result=" + _sequencesGetTypes__return);


        }
        {
        System.out.println("Invoking multicastStart...");
        java.lang.String _multicastStart_token = "";
        com.mip.recorderCommand.ArrayOfGuid _multicastStart_deviceIds = null;
        com.mip.recorderCommand.ClientCapabilities _multicastStart_clientCapabilities = null;
        com.mip.recorderCommand.ArrayOfMulticastInfo _multicastStart__return = port.multicastStart(_multicastStart_token, _multicastStart_deviceIds, _multicastStart_clientCapabilities);
        System.out.println("multicastStart.result=" + _multicastStart__return);


        }
        {
        System.out.println("Invoking getVersion...");
        int _getVersion__return = port.getVersion();
        System.out.println("getVersion.result=" + _getVersion__return);


        }
        {
        System.out.println("Invoking jpegGetAt...");
        java.lang.String _jpegGetAt_token = "";
        java.lang.String _jpegGetAt_deviceId = "";
        javax.xml.datatype.XMLGregorianCalendar _jpegGetAt_time = null;
        com.mip.recorderCommand.JPEGData _jpegGetAt__return = port.jpegGetAt(_jpegGetAt_token, _jpegGetAt_deviceId, _jpegGetAt_time);
        System.out.println("jpegGetAt.result=" + _jpegGetAt__return);


        }
        {
        System.out.println("Invoking ptzActivatePatrollingSchema...");
        java.lang.String _ptzActivatePatrollingSchema_token = "";
        java.lang.String _ptzActivatePatrollingSchema_deviceId = "";
        java.lang.String _ptzActivatePatrollingSchema_patrollingSchemaId = "";
        port.ptzActivatePatrollingSchema(_ptzActivatePatrollingSchema_token, _ptzActivatePatrollingSchema_deviceId, _ptzActivatePatrollingSchema_patrollingSchemaId);


        }
        {
        System.out.println("Invoking ptzMoveRelative...");
        java.lang.String _ptzMoveRelative_token = "";
        java.lang.String _ptzMoveRelative_deviceId = "";
        com.mip.recorderCommand.PTZArgs _ptzMoveRelative_ptzArgs = null;
        port.ptzMoveRelative(_ptzMoveRelative_token, _ptzMoveRelative_deviceId, _ptzMoveRelative_ptzArgs);


        }
        {
        System.out.println("Invoking smartSearchCancel...");
        java.lang.String _smartSearchCancel_token = "";
        java.lang.String _smartSearchCancel_smartSearchId = "";
        port.smartSearchCancel(_smartSearchCancel_token, _smartSearchCancel_smartSearchId);


        }
        {
        System.out.println("Invoking ptzRectangle...");
        java.lang.String _ptzRectangle_token = "";
        java.lang.String _ptzRectangle_deviceId = "";
        double _ptzRectangle_refWidth = 0.0;
        double _ptzRectangle_refHeight = 0.0;
        double _ptzRectangle_left = 0.0;
        double _ptzRectangle_top = 0.0;
        double _ptzRectangle_bottom = 0.0;
        double _ptzRectangle_right = 0.0;
        port.ptzRectangle(_ptzRectangle_token, _ptzRectangle_deviceId, _ptzRectangle_refWidth, _ptzRectangle_refHeight, _ptzRectangle_left, _ptzRectangle_top, _ptzRectangle_bottom, _ptzRectangle_right);


        }
        {
        System.out.println("Invoking presetGetList...");
        java.lang.String _presetGetList_token = "";
        java.lang.String _presetGetList_deviceId = "";
        com.mip.recorderCommand.ArrayOfString _presetGetList__return = port.presetGetList(_presetGetList_token, _presetGetList_deviceId);
        System.out.println("presetGetList.result=" + _presetGetList__return);


        }

        System.exit(0);
    }

}
