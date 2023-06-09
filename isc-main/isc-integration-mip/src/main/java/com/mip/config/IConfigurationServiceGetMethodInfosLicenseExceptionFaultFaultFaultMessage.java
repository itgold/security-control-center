
package com.mip.config;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.3.6
 * 2021-11-02T20:25:02.688-07:00
 * Generated source version: 3.3.6
 */

@WebFault(name = "LicenseExceptionFault", targetNamespace = "http://schemas.datacontract.org/2004/07/VideoOS.ConfigurationAPI.ConfigurationFaultException")
public class IConfigurationServiceGetMethodInfosLicenseExceptionFaultFaultFaultMessage extends Exception {

    private com.mip.config.LicenseExceptionFault licenseExceptionFault;

    public IConfigurationServiceGetMethodInfosLicenseExceptionFaultFaultFaultMessage() {
        super();
    }

    public IConfigurationServiceGetMethodInfosLicenseExceptionFaultFaultFaultMessage(String message) {
        super(message);
    }

    public IConfigurationServiceGetMethodInfosLicenseExceptionFaultFaultFaultMessage(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public IConfigurationServiceGetMethodInfosLicenseExceptionFaultFaultFaultMessage(String message, com.mip.config.LicenseExceptionFault licenseExceptionFault) {
        super(message);
        this.licenseExceptionFault = licenseExceptionFault;
    }

    public IConfigurationServiceGetMethodInfosLicenseExceptionFaultFaultFaultMessage(String message, com.mip.config.LicenseExceptionFault licenseExceptionFault, java.lang.Throwable cause) {
        super(message, cause);
        this.licenseExceptionFault = licenseExceptionFault;
    }

    public com.mip.config.LicenseExceptionFault getFaultInfo() {
        return this.licenseExceptionFault;
    }
}
