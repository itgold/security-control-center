
package com.mip.config;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.3.6
 * 2021-11-02T20:25:02.535-07:00
 * Generated source version: 3.3.6
 */

@WebFault(name = "ServerExceptionFault", targetNamespace = "http://schemas.datacontract.org/2004/07/VideoOS.ConfigurationAPI.ConfigurationFaultException")
public class IConfigurationServiceHasChildItemsServerExceptionFaultFaultFaultMessage extends Exception {

    private com.mip.config.ServerExceptionFault serverExceptionFault;

    public IConfigurationServiceHasChildItemsServerExceptionFaultFaultFaultMessage() {
        super();
    }

    public IConfigurationServiceHasChildItemsServerExceptionFaultFaultFaultMessage(String message) {
        super(message);
    }

    public IConfigurationServiceHasChildItemsServerExceptionFaultFaultFaultMessage(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public IConfigurationServiceHasChildItemsServerExceptionFaultFaultFaultMessage(String message, com.mip.config.ServerExceptionFault serverExceptionFault) {
        super(message);
        this.serverExceptionFault = serverExceptionFault;
    }

    public IConfigurationServiceHasChildItemsServerExceptionFaultFaultFaultMessage(String message, com.mip.config.ServerExceptionFault serverExceptionFault, java.lang.Throwable cause) {
        super(message, cause);
        this.serverExceptionFault = serverExceptionFault;
    }

    public com.mip.config.ServerExceptionFault getFaultInfo() {
        return this.serverExceptionFault;
    }
}
