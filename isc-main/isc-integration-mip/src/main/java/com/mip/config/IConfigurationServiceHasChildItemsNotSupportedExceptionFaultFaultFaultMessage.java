
package com.mip.config;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.3.6
 * 2021-11-02T20:25:02.540-07:00
 * Generated source version: 3.3.6
 */

@WebFault(name = "NotSupportedExceptionFault", targetNamespace = "http://schemas.datacontract.org/2004/07/VideoOS.ConfigurationAPI.ConfigurationFaultException")
public class IConfigurationServiceHasChildItemsNotSupportedExceptionFaultFaultFaultMessage extends Exception {

    private com.mip.config.NotSupportedExceptionFault notSupportedExceptionFault;

    public IConfigurationServiceHasChildItemsNotSupportedExceptionFaultFaultFaultMessage() {
        super();
    }

    public IConfigurationServiceHasChildItemsNotSupportedExceptionFaultFaultFaultMessage(String message) {
        super(message);
    }

    public IConfigurationServiceHasChildItemsNotSupportedExceptionFaultFaultFaultMessage(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public IConfigurationServiceHasChildItemsNotSupportedExceptionFaultFaultFaultMessage(String message, com.mip.config.NotSupportedExceptionFault notSupportedExceptionFault) {
        super(message);
        this.notSupportedExceptionFault = notSupportedExceptionFault;
    }

    public IConfigurationServiceHasChildItemsNotSupportedExceptionFaultFaultFaultMessage(String message, com.mip.config.NotSupportedExceptionFault notSupportedExceptionFault, java.lang.Throwable cause) {
        super(message, cause);
        this.notSupportedExceptionFault = notSupportedExceptionFault;
    }

    public com.mip.config.NotSupportedExceptionFault getFaultInfo() {
        return this.notSupportedExceptionFault;
    }
}