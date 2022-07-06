
package com.ubaya.projectdistprog;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ubaya.projectdistprog package. 
 * &lt;p&gt;An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CheckLoginAdministrator_QNAME = new QName("http://projectdistprog.ubaya.com/", "CheckLoginAdministrator");
    private final static QName _CheckLoginAdministratorResponse_QNAME = new QName("http://projectdistprog.ubaya.com/", "CheckLoginAdministratorResponse");
    private final static QName _DisplayCustomer_QNAME = new QName("http://projectdistprog.ubaya.com/", "DisplayCustomer");
    private final static QName _DisplayCustomerResponse_QNAME = new QName("http://projectdistprog.ubaya.com/", "DisplayCustomerResponse");
    private final static QName _Hello_QNAME = new QName("http://projectdistprog.ubaya.com/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://projectdistprog.ubaya.com/", "helloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ubaya.projectdistprog
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CheckLoginAdministrator }
     * 
     */
    public CheckLoginAdministrator createCheckLoginAdministrator() {
        return new CheckLoginAdministrator();
    }

    /**
     * Create an instance of {@link CheckLoginAdministratorResponse }
     * 
     */
    public CheckLoginAdministratorResponse createCheckLoginAdministratorResponse() {
        return new CheckLoginAdministratorResponse();
    }

    /**
     * Create an instance of {@link DisplayCustomer }
     * 
     */
    public DisplayCustomer createDisplayCustomer() {
        return new DisplayCustomer();
    }

    /**
     * Create an instance of {@link DisplayCustomerResponse }
     * 
     */
    public DisplayCustomerResponse createDisplayCustomerResponse() {
        return new DisplayCustomerResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckLoginAdministrator }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CheckLoginAdministrator }{@code >}
     */
    @XmlElementDecl(namespace = "http://projectdistprog.ubaya.com/", name = "CheckLoginAdministrator")
    public JAXBElement<CheckLoginAdministrator> createCheckLoginAdministrator(CheckLoginAdministrator value) {
        return new JAXBElement<CheckLoginAdministrator>(_CheckLoginAdministrator_QNAME, CheckLoginAdministrator.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckLoginAdministratorResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CheckLoginAdministratorResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://projectdistprog.ubaya.com/", name = "CheckLoginAdministratorResponse")
    public JAXBElement<CheckLoginAdministratorResponse> createCheckLoginAdministratorResponse(CheckLoginAdministratorResponse value) {
        return new JAXBElement<CheckLoginAdministratorResponse>(_CheckLoginAdministratorResponse_QNAME, CheckLoginAdministratorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisplayCustomer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DisplayCustomer }{@code >}
     */
    @XmlElementDecl(namespace = "http://projectdistprog.ubaya.com/", name = "DisplayCustomer")
    public JAXBElement<DisplayCustomer> createDisplayCustomer(DisplayCustomer value) {
        return new JAXBElement<DisplayCustomer>(_DisplayCustomer_QNAME, DisplayCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisplayCustomerResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DisplayCustomerResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://projectdistprog.ubaya.com/", name = "DisplayCustomerResponse")
    public JAXBElement<DisplayCustomerResponse> createDisplayCustomerResponse(DisplayCustomerResponse value) {
        return new JAXBElement<DisplayCustomerResponse>(_DisplayCustomerResponse_QNAME, DisplayCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     */
    @XmlElementDecl(namespace = "http://projectdistprog.ubaya.com/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://projectdistprog.ubaya.com/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

}
