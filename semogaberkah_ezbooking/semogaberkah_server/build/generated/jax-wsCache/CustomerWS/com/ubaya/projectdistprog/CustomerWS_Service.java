
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
@WebServiceClient(name = "CustomerWS", targetNamespace = "http://projectdistprog.ubaya.com/", wsdlLocation = "http://localhost:8080/EzBookingWebService/CustomerWS?wsdl")
public class CustomerWS_Service
    extends Service
{

    private final static URL CUSTOMERWS_WSDL_LOCATION;
    private final static WebServiceException CUSTOMERWS_EXCEPTION;
    private final static QName CUSTOMERWS_QNAME = new QName("http://projectdistprog.ubaya.com/", "CustomerWS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/EzBookingWebService/CustomerWS?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CUSTOMERWS_WSDL_LOCATION = url;
        CUSTOMERWS_EXCEPTION = e;
    }

    public CustomerWS_Service() {
        super(__getWsdlLocation(), CUSTOMERWS_QNAME);
    }

    public CustomerWS_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), CUSTOMERWS_QNAME, features);
    }

    public CustomerWS_Service(URL wsdlLocation) {
        super(wsdlLocation, CUSTOMERWS_QNAME);
    }

    public CustomerWS_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CUSTOMERWS_QNAME, features);
    }

    public CustomerWS_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CustomerWS_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CustomerWS
     */
    @WebEndpoint(name = "CustomerWSPort")
    public CustomerWS getCustomerWSPort() {
        return super.getPort(new QName("http://projectdistprog.ubaya.com/", "CustomerWSPort"), CustomerWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {&#064;link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the &lt;code&gt;features&lt;/code&gt; parameter will have their default values.
     * @return
     *     returns CustomerWS
     */
    @WebEndpoint(name = "CustomerWSPort")
    public CustomerWS getCustomerWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://projectdistprog.ubaya.com/", "CustomerWSPort"), CustomerWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CUSTOMERWS_EXCEPTION!= null) {
            throw CUSTOMERWS_EXCEPTION;
        }
        return CUSTOMERWS_WSDL_LOCATION;
    }

}