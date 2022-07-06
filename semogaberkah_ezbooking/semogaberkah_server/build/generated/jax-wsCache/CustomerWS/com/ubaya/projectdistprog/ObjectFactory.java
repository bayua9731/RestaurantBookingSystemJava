
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

    private final static QName _AmbilDataCustomer_QNAME = new QName("http://projectdistprog.ubaya.com/", "AmbilDataCustomer");
    private final static QName _AmbilDataCustomerResponse_QNAME = new QName("http://projectdistprog.ubaya.com/", "AmbilDataCustomerResponse");
    private final static QName _CheckLoginCustomer_QNAME = new QName("http://projectdistprog.ubaya.com/", "CheckLoginCustomer");
    private final static QName _CheckLoginCustomerResponse_QNAME = new QName("http://projectdistprog.ubaya.com/", "CheckLoginCustomerResponse");
    private final static QName _CheckRegisterCustomer_QNAME = new QName("http://projectdistprog.ubaya.com/", "CheckRegisterCustomer");
    private final static QName _CheckRegisterCustomerResponse_QNAME = new QName("http://projectdistprog.ubaya.com/", "CheckRegisterCustomerResponse");
    private final static QName _Display_QNAME = new QName("http://projectdistprog.ubaya.com/", "Display");
    private final static QName _DisplayCusCari_QNAME = new QName("http://projectdistprog.ubaya.com/", "DisplayCusCari");
    private final static QName _DisplayCusCariResponse_QNAME = new QName("http://projectdistprog.ubaya.com/", "DisplayCusCariResponse");
    private final static QName _DisplayResponse_QNAME = new QName("http://projectdistprog.ubaya.com/", "DisplayResponse");
    private final static QName _Hello_QNAME = new QName("http://projectdistprog.ubaya.com/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://projectdistprog.ubaya.com/", "helloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ubaya.projectdistprog
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AmbilDataCustomer }
     * 
     */
    public AmbilDataCustomer createAmbilDataCustomer() {
        return new AmbilDataCustomer();
    }

    /**
     * Create an instance of {@link AmbilDataCustomerResponse }
     * 
     */
    public AmbilDataCustomerResponse createAmbilDataCustomerResponse() {
        return new AmbilDataCustomerResponse();
    }

    /**
     * Create an instance of {@link CheckLoginCustomer }
     * 
     */
    public CheckLoginCustomer createCheckLoginCustomer() {
        return new CheckLoginCustomer();
    }

    /**
     * Create an instance of {@link CheckLoginCustomerResponse }
     * 
     */
    public CheckLoginCustomerResponse createCheckLoginCustomerResponse() {
        return new CheckLoginCustomerResponse();
    }

    /**
     * Create an instance of {@link CheckRegisterCustomer }
     * 
     */
    public CheckRegisterCustomer createCheckRegisterCustomer() {
        return new CheckRegisterCustomer();
    }

    /**
     * Create an instance of {@link CheckRegisterCustomerResponse }
     * 
     */
    public CheckRegisterCustomerResponse createCheckRegisterCustomerResponse() {
        return new CheckRegisterCustomerResponse();
    }

    /**
     * Create an instance of {@link Display }
     * 
     */
    public Display createDisplay() {
        return new Display();
    }

    /**
     * Create an instance of {@link DisplayCusCari }
     * 
     */
    public DisplayCusCari createDisplayCusCari() {
        return new DisplayCusCari();
    }

    /**
     * Create an instance of {@link DisplayCusCariResponse }
     * 
     */
    public DisplayCusCariResponse createDisplayCusCariResponse() {
        return new DisplayCusCariResponse();
    }

    /**
     * Create an instance of {@link DisplayResponse }
     * 
     */
    public DisplayResponse createDisplayResponse() {
        return new DisplayResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AmbilDataCustomer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AmbilDataCustomer }{@code >}
     */
    @XmlElementDecl(namespace = "http://projectdistprog.ubaya.com/", name = "AmbilDataCustomer")
    public JAXBElement<AmbilDataCustomer> createAmbilDataCustomer(AmbilDataCustomer value) {
        return new JAXBElement<AmbilDataCustomer>(_AmbilDataCustomer_QNAME, AmbilDataCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmbilDataCustomerResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AmbilDataCustomerResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://projectdistprog.ubaya.com/", name = "AmbilDataCustomerResponse")
    public JAXBElement<AmbilDataCustomerResponse> createAmbilDataCustomerResponse(AmbilDataCustomerResponse value) {
        return new JAXBElement<AmbilDataCustomerResponse>(_AmbilDataCustomerResponse_QNAME, AmbilDataCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckLoginCustomer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CheckLoginCustomer }{@code >}
     */
    @XmlElementDecl(namespace = "http://projectdistprog.ubaya.com/", name = "CheckLoginCustomer")
    public JAXBElement<CheckLoginCustomer> createCheckLoginCustomer(CheckLoginCustomer value) {
        return new JAXBElement<CheckLoginCustomer>(_CheckLoginCustomer_QNAME, CheckLoginCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckLoginCustomerResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CheckLoginCustomerResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://projectdistprog.ubaya.com/", name = "CheckLoginCustomerResponse")
    public JAXBElement<CheckLoginCustomerResponse> createCheckLoginCustomerResponse(CheckLoginCustomerResponse value) {
        return new JAXBElement<CheckLoginCustomerResponse>(_CheckLoginCustomerResponse_QNAME, CheckLoginCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckRegisterCustomer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CheckRegisterCustomer }{@code >}
     */
    @XmlElementDecl(namespace = "http://projectdistprog.ubaya.com/", name = "CheckRegisterCustomer")
    public JAXBElement<CheckRegisterCustomer> createCheckRegisterCustomer(CheckRegisterCustomer value) {
        return new JAXBElement<CheckRegisterCustomer>(_CheckRegisterCustomer_QNAME, CheckRegisterCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckRegisterCustomerResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CheckRegisterCustomerResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://projectdistprog.ubaya.com/", name = "CheckRegisterCustomerResponse")
    public JAXBElement<CheckRegisterCustomerResponse> createCheckRegisterCustomerResponse(CheckRegisterCustomerResponse value) {
        return new JAXBElement<CheckRegisterCustomerResponse>(_CheckRegisterCustomerResponse_QNAME, CheckRegisterCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Display }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Display }{@code >}
     */
    @XmlElementDecl(namespace = "http://projectdistprog.ubaya.com/", name = "Display")
    public JAXBElement<Display> createDisplay(Display value) {
        return new JAXBElement<Display>(_Display_QNAME, Display.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisplayCusCari }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DisplayCusCari }{@code >}
     */
    @XmlElementDecl(namespace = "http://projectdistprog.ubaya.com/", name = "DisplayCusCari")
    public JAXBElement<DisplayCusCari> createDisplayCusCari(DisplayCusCari value) {
        return new JAXBElement<DisplayCusCari>(_DisplayCusCari_QNAME, DisplayCusCari.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisplayCusCariResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DisplayCusCariResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://projectdistprog.ubaya.com/", name = "DisplayCusCariResponse")
    public JAXBElement<DisplayCusCariResponse> createDisplayCusCariResponse(DisplayCusCariResponse value) {
        return new JAXBElement<DisplayCusCariResponse>(_DisplayCusCariResponse_QNAME, DisplayCusCariResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisplayResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DisplayResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://projectdistprog.ubaya.com/", name = "DisplayResponse")
    public JAXBElement<DisplayResponse> createDisplayResponse(DisplayResponse value) {
        return new JAXBElement<DisplayResponse>(_DisplayResponse_QNAME, DisplayResponse.class, null, value);
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
