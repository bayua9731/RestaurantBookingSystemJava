
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
@WebServiceClient(name = "RestaurantWS", targetNamespace = "http://projectdistprog.ubaya.com/", wsdlLocation = "http://localhost:8080/EzBookingWebService/RestaurantWS?wsdl")
public class RestaurantWS_Service
    extends Service
{

    private final static URL RESTAURANTWS_WSDL_LOCATION;
    private final static WebServiceException RESTAURANTWS_EXCEPTION;
    private final static QName RESTAURANTWS_QNAME = new QName("http://projectdistprog.ubaya.com/", "RestaurantWS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/EzBookingWebService/RestaurantWS?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        RESTAURANTWS_WSDL_LOCATION = url;
        RESTAURANTWS_EXCEPTION = e;
    }

    public RestaurantWS_Service() {
        super(__getWsdlLocation(), RESTAURANTWS_QNAME);
    }

    public RestaurantWS_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), RESTAURANTWS_QNAME, features);
    }

    public RestaurantWS_Service(URL wsdlLocation) {
        super(wsdlLocation, RESTAURANTWS_QNAME);
    }

    public RestaurantWS_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, RESTAURANTWS_QNAME, features);
    }

    public RestaurantWS_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RestaurantWS_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns RestaurantWS
     */
    @WebEndpoint(name = "RestaurantWSPort")
    public RestaurantWS getRestaurantWSPort() {
        return super.getPort(new QName("http://projectdistprog.ubaya.com/", "RestaurantWSPort"), RestaurantWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {&#064;link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the &lt;code&gt;features&lt;/code&gt; parameter will have their default values.
     * @return
     *     returns RestaurantWS
     */
    @WebEndpoint(name = "RestaurantWSPort")
    public RestaurantWS getRestaurantWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://projectdistprog.ubaya.com/", "RestaurantWSPort"), RestaurantWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (RESTAURANTWS_EXCEPTION!= null) {
            throw RESTAURANTWS_EXCEPTION;
        }
        return RESTAURANTWS_WSDL_LOCATION;
    }

}