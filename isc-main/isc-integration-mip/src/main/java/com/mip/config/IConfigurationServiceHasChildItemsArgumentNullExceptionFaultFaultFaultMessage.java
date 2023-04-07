
package com.mip.config;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.3.6
 * 2021-11-02T20:25:02.530-07:00
 * Generated source version: 3.3.6
 */

@WebFault(name = "ArgumentNullExceptionFault", targetNamespace = "http://schemas.datacontract.org/2004/07/VideoOS.ConfigurationAPI.ConfigurationFaultException")
public class IConfigurationServiceHasChildItemsArgumentNullExceptionFaultFaultFaultMessage extends Exception {

    private com.mip.config.ArgumentNullExceptionFault argumentNullExceptionFault;

    public IConfigurationServiceHasChildItemsArgumentNullExceptionFaultFaultFaultMessage() {
        super();
    }

    public IConfigurationServiceHasChildItemsArgumentNullExceptionFaultFaultFaultMessage(String message) {
        super(message);
    }

    public IConfigurationServiceHasChildItemsArgumentNullExceptionFaultFaultFaultMessage(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public IConfigurationServiceHasChildItemsArgumentNullExceptionFaultFaultFaultMessage(String message, com.mip.config.ArgumentNullExceptionFault argumentNullExceptionFault) {
        super(message);
        this.argumentNullExceptionFault = argumentNullExceptionFault;
    }

    public IConfigurationServiceHasChildItemsArgumentNullExceptionFaultFaultFaultMessage(String message, com.mip.config.ArgumentNullExceptionFault argumentNullExceptionFault, java.lang.Throwable cause) {
        super(message, cause);
        this.argumentNullExceptionFault = argumentNullExceptionFault;
    }

    public com.mip.config.ArgumentNullExceptionFault getFaultInfo() {
        return this.argumentNullExceptionFault;
    }
}