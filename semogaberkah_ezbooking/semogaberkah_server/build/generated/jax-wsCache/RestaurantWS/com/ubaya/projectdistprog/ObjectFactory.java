
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

    private final static QName _AmbilDataById_QNAME = new QName("http://projectdistprog.ubaya.com/", "AmbilDataById");
    private final static QName _AmbilDataByIdResponse_QNAME = new QName("http://projectdistprog.ubaya.com/", "AmbilDataByIdResponse");
    private final static QName _AmbilDataByUsername_QNAME = new QName("http://projectdistprog.ubaya.com/", "AmbilDataByUsername");
    private final static QName _AmbilDataByUsernameResponse_QNAME = new QName("http://projectdistprog.ubaya.com/", "AmbilDataByUsernameResponse");
    private final static QName _CheckLogin_QNAME = new QName("http://projectdistprog.ubaya.com/", "CheckLogin");
    private final static QName _CheckLoginResponse_QNAME = new QName("http://projectdistprog.ubaya.com/", "CheckLoginResponse");
    private final static QName _CheckRegister_QNAME = new QName("http://projectdistprog.ubaya.com/", "CheckRegister");
    private final static QName _CheckRegisterResponse_QNAME = new QName("http://projectdistprog.ubaya.com/", "CheckRegisterResponse");
    private final static QName _DisplayRes_QNAME = new QName("http://projectdistprog.ubaya.com/", "DisplayRes");
    private final static QName _DisplayResCari_QNAME = new QName("http://projectdistprog.ubaya.com/", "DisplayResCari");
    private final static QName _DisplayResCariResponse_QNAME = new QName("http://projectdistprog.ubaya.com/", "DisplayResCariResponse");
    private final static QName _DisplayResResponse_QNAME = new QName("http://projectdistprog.ubaya.com/", "DisplayResResponse");
    private final static QName _Hello_QNAME = new QName("http://projectdistprog.ubaya.com/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://projectdistprog.ubaya.com/", "helloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ubaya.projectdistprog
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AmbilDataById }
     * 
     */
    public AmbilDataById createAmbilDataById() {
        return new AmbilDataById();
    }

    /**
     * Create an instance of {@link AmbilDataByIdResponse }
     * 
     */
    public AmbilDataByIdResponse createAmbilDataByIdResponse() {
        return new AmbilDataByIdResponse();
    }

    /**
     * Create an instance of {@link AmbilDataByUsername }
     * 
     */
    public AmbilDataByUsername createAmbilDataByUsername() {
        return new AmbilDataByUsername();
    }

    /**
     * Create an instance of {@link AmbilDataByUsernameResponse }
     * 
     */
    public AmbilDataByUsernameResponse createAmbilDataByUsernameResponse() {
        return new AmbilDataByUsernameResponse();
    }

    /**
     * Create an instance of {@link CheckLogin }
     * 
     */
    public CheckLogin createCheckLogin() {
        return new CheckLogin();
    }

    /**
     * Create an instance of {@link CheckLoginResponse }
     * 
     */
    public CheckLoginResponse createCheckLoginResponse() {
        return new CheckLoginResponse();
    }

    /**
     * Create an instance of {@link CheckRegister }
     * 
     */
    public CheckRegister createCheckRegister() {
        return new CheckRegister();
    }

    /**
     * Create an instance of {@link CheckRegisterResponse }
     * 
     */
    public CheckRegisterResponse createCheckRegisterResponse() {
        return new CheckRegisterResponse();
    }

    /**
     * Create an instance of {@link DisplayRes }
     * 
     */
    public DisplayRes createDisplayRes() {
        return new DisplayRes();
    }

    /**
     * Create an instance of {@link DisplayResCari }
     * 
     */
    public DisplayResCari createDisplayResCari() {
        return new DisplayResCari();
    }

    /**
     * Create an instance of {@link DisplayResCariResponse }
     * 
     */
    public DisplayResCariResponse createDisplayResCariResponse() {
        return new DisplayResCariResponse();
    }

    /**
     * Create an instance of {@link DisplayResResponse }
     * 
     */
    public DisplayResResponse createDisplayResResponse() {
        return new DisplayResResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AmbilDataById }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AmbilDataById }{@code >}
     */
    @XmlElementDecl(namespace = "http://projectdistprog.ubaya.com/", name = "AmbilDataById")
    public JAXBElement<AmbilDataById> createAmbilDataById(AmbilDataById value) {
        return new JAXBElement<AmbilDataById>(_AmbilDataById_QNAME, AmbilDataById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmbilDataByIdResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AmbilDataByIdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://projectdistprog.ubaya.com/", name = "AmbilDataByIdResponse")
    public JAXBElement<AmbilDataByIdResponse> createAmbilDataByIdResponse(AmbilDataByIdResponse value) {
        return new JAXBElement<AmbilDataByIdResponse>(_AmbilDataByIdResponse_QNAME, AmbilDataByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmbilDataByUsername }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AmbilDataByUsername }{@code >}
     */
    @XmlElementDecl(namespace = "http://projectdistprog.ubaya.com/", name = "AmbilDataByUsername")
    public JAXBElement<AmbilDataByUsername> createAmbilDataByUsername(AmbilDataByUsername value) {
        return new JAXBElement<AmbilDataByUsername>(_AmbilDataByUsername_QNAME, AmbilDataByUsername.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmbilDataByUsernameResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AmbilDataByUsernameResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://projectdistprog.ubaya.com/", name = "AmbilDataByUsernameResponse")
    public JAXBElement<AmbilDataByUsernameResponse> createAmbilDataByUsernameResponse(AmbilDataByUsernameResponse value) {
        return new JAXBElement<AmbilDataByUsernameResponse>(_AmbilDataByUsernameResponse_QNAME, AmbilDataByUsernameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckLogin }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CheckLogin }{@code >}
     */
    @XmlElementDecl(namespace = "http://projectdistprog.ubaya.com/", name = "CheckLogin")
    public JAXBElement<CheckLogin> createCheckLogin(CheckLogin value) {
        return new JAXBElement<CheckLogin>(_CheckLogin_QNAME, CheckLogin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckLoginResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CheckLoginResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://projectdistprog.ubaya.com/", name = "CheckLoginResponse")
    public JAXBElement<CheckLoginResponse> createCheckLoginResponse(CheckLoginResponse value) {
        return new JAXBElement<CheckLoginResponse>(_CheckLoginResponse_QNAME, CheckLoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckRegister }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CheckRegister }{@code >}
     */
    @XmlElementDecl(namespace = "http://projectdistprog.ubaya.com/", name = "CheckRegister")
    public JAXBElement<CheckRegister> createCheckRegister(CheckRegister value) {
        return new JAXBElement<CheckRegister>(_CheckRegister_QNAME, CheckRegister.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckRegisterResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CheckRegisterResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://projectdistprog.ubaya.com/", name = "CheckRegisterResponse")
    public JAXBElement<CheckRegisterResponse> createCheckRegisterResponse(CheckRegisterResponse value) {
        return new JAXBElement<CheckRegisterResponse>(_CheckRegisterResponse_QNAME, CheckRegisterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisplayRes }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DisplayRes }{@code >}
     */
    @XmlElementDecl(namespace = "http://projectdistprog.ubaya.com/", name = "DisplayRes")
    public JAXBElement<DisplayRes> createDisplayRes(DisplayRes value) {
        return new JAXBElement<DisplayRes>(_DisplayRes_QNAME, DisplayRes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisplayResCari }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DisplayResCari }{@code >}
     */
    @XmlElementDecl(namespace = "http://projectdistprog.ubaya.com/", name = "DisplayResCari")
    public JAXBElement<DisplayResCari> createDisplayResCari(DisplayResCari value) {
        return new JAXBElement<DisplayResCari>(_DisplayResCari_QNAME, DisplayResCari.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisplayResCariResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DisplayResCariResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://projectdistprog.ubaya.com/", name = "DisplayResCariResponse")
    public JAXBElement<DisplayResCariResponse> createDisplayResCariResponse(DisplayResCariResponse value) {
        return new JAXBElement<DisplayResCariResponse>(_DisplayResCariResponse_QNAME, DisplayResCariResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisplayResResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DisplayResResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://projectdistprog.ubaya.com/", name = "DisplayResResponse")
    public JAXBElement<DisplayResResponse> createDisplayResResponse(DisplayResResponse value) {
        return new JAXBElement<DisplayResResponse>(_DisplayResResponse_QNAME, DisplayResResponse.class, null, value);
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
