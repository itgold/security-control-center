package com.mip.recorderCommand;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.3.6
 * 2021-11-02T20:25:04.646-07:00
 * Generated source version: 3.3.6
 *
 */
@WebServiceClient(name = "RecorderCommandService",
                  wsdlLocation = "file:/home/denis/Work/ISC/isc-web/isc-main/isc-integration-mip/src/main/resources/wsdl/RecorderCommandService.wsdl",
                  targetNamespace = "http://video.net/2/XProtectCSRecorderCommand")
public class RecorderCommandService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://video.net/2/XProtectCSRecorderCommand", "RecorderCommandService");
    public final static QName RecorderCommandServiceSoap12 = new QName("http://video.net/2/XProtectCSRecorderCommand", "RecorderCommandServiceSoap12");
    public final static QName RecorderCommandServiceSoap = new QName("http://video.net/2/XProtectCSRecorderCommand", "RecorderCommandServiceSoap");
    static {
        URL url = null;
        try {
            url = new URL("file:/home/denis/Work/ISC/isc-web/isc-main/isc-integration-mip/src/main/resources/wsdl/RecorderCommandService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(RecorderCommandService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/home/denis/Work/ISC/isc-web/isc-main/isc-integration-mip/src/main/resources/wsdl/RecorderCommandService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public RecorderCommandService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public RecorderCommandService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RecorderCommandService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public RecorderCommandService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public RecorderCommandService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public RecorderCommandService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns RecorderCommandServiceSoap
     */
    @WebEndpoint(name = "RecorderCommandServiceSoap12")
    public RecorderCommandServiceSoap getRecorderCommandServiceSoap12() {
        return super.getPort(RecorderCommandServiceSoap12, RecorderCommandServiceSoap.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RecorderCommandServiceSoap
     */
    @WebEndpoint(name = "RecorderCommandServiceSoap12")
    public RecorderCommandServiceSoap getRecorderCommandServiceSoap12(WebServiceFeature... features) {
        return super.getPort(RecorderCommandServiceSoap12, RecorderCommandServiceSoap.class, features);
    }


    /**
     *
     * @return
     *     returns RecorderCommandServiceSoap
     */
    @WebEndpoint(name = "RecorderCommandServiceSoap")
    public RecorderCommandServiceSoap getRecorderCommandServiceSoap() {
        return super.getPort(RecorderCommandServiceSoap, RecorderCommandServiceSoap.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RecorderCommandServiceSoap
     */
    @WebEndpoint(name = "RecorderCommandServiceSoap")
    public RecorderCommandServiceSoap getRecorderCommandServiceSoap(WebServiceFeature... features) {
        return super.getPort(RecorderCommandServiceSoap, RecorderCommandServiceSoap.class, features);
    }

}
