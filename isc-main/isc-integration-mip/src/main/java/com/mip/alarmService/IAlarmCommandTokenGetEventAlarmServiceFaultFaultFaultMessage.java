
package com.mip.alarmService;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.3.6
 * 2021-11-02T20:25:08.593-07:00
 * Generated source version: 3.3.6
 */

@WebFault(name = "AlarmServiceFault", targetNamespace = "http://schemas.datacontract.org/2004/07/VideoOS.Platform.Proxy.Alarm")
public class IAlarmCommandTokenGetEventAlarmServiceFaultFaultFaultMessage extends Exception {

    private com.mip.alarmService.AlarmServiceFault alarmServiceFault;

    public IAlarmCommandTokenGetEventAlarmServiceFaultFaultFaultMessage() {
        super();
    }

    public IAlarmCommandTokenGetEventAlarmServiceFaultFaultFaultMessage(String message) {
        super(message);
    }

    public IAlarmCommandTokenGetEventAlarmServiceFaultFaultFaultMessage(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public IAlarmCommandTokenGetEventAlarmServiceFaultFaultFaultMessage(String message, com.mip.alarmService.AlarmServiceFault alarmServiceFault) {
        super(message);
        this.alarmServiceFault = alarmServiceFault;
    }

    public IAlarmCommandTokenGetEventAlarmServiceFaultFaultFaultMessage(String message, com.mip.alarmService.AlarmServiceFault alarmServiceFault, java.lang.Throwable cause) {
        super(message, cause);
        this.alarmServiceFault = alarmServiceFault;
    }

    public com.mip.alarmService.AlarmServiceFault getFaultInfo() {
        return this.alarmServiceFault;
    }
}
