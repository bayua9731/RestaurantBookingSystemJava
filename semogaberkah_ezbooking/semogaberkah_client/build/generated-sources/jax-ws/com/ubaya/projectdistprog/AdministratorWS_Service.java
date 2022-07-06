
package com.ubaya.projectdistprog;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.3
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "AdministratorWS", targetNamespace = "http://projectdistprog.ubaya.com/", wsdlLocation = "http://localhost:8080/EzBookingWebService/AdministratorWS?wsdl")
public class AdministratorWS_Service
    extends Service
{

    private final static URL ADMINISTRATORWS_WSDL_LOCATION;
    private final static WebServiceException ADMINISTRATORWS_EXCEPTION;
    private final static QName ADMINISTRATORWS_QNAME = new QName("http://projectdistprog.ubaya.com/", "AdministratorWS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/EzBookingWebService/AdministratorWS?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ADMINISTRATORWS_WSDL_LOCATION = url;
        ADMINISTRATORWS_EXCEPTION = e;
    }

    public AdministratorWS_Service() {
        super(__getWsdlLocation(), ADMINISTRATORWS_QNAME);
    }

    public AdministratorWS_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), ADMINISTRATORWS_QNAME, features);
    }

    public AdministratorWS_Service(URL wsdlLocation) {
        super(wsdlLocation, ADMINISTRATORWS_QNAME);
    }

    public AdministratorWS_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ADMINISTRATORWS_QNAME, features);
    }

    public AdministratorWS_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AdministratorWS_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns AdministratorWS
     */
    @WebEndpoint(name = "AdministratorWSPort")
    public AdministratorWS getAdministratorWSPort() {
        return super.getPort(new QName("http://projectdistprog.ubaya.com/", "AdministratorWSPort"), AdministratorWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {&#064;link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the &lt;code&gt;features&lt;/code&gt; parameter will have their default values.
     * @return
     *     returns AdministratorWS
     */
    @WebEndpoint(name = "AdministratorWSPort")
    public AdministratorWS getAdministratorWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://projectdistprog.ubaya.com/", "AdministratorWSPort"), AdministratorWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ADMINISTRATORWS_EXCEPTION!= null) {
            throw ADMINISTRATORWS_EXCEPTION;
        }
        return ADMINISTRATORWS_WSDL_LOCATION;
    }

}