
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

    private final static QName _DisplayMenuRestoran_QNAME = new QName("http://projectdistprog.ubaya.com/", "DisplayMenuRestoran");
    private final static QName _DisplayMenuRestoranResponse_QNAME = new QName("http://projectdistprog.ubaya.com/", "DisplayMenuRestoranResponse");
    private final static QName _TambahMenu_QNAME = new QName("http://projectdistprog.ubaya.com/", "TambahMenu");
    private final static QName _TambahMenuResponse_QNAME = new QName("http://projectdistprog.ubaya.com/", "TambahMenuResponse");
    private final static QName _Hello_QNAME = new QName("http://projectdistprog.ubaya.com/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://projectdistprog.ubaya.com/", "helloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ubaya.projectdistprog
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DisplayMenuRestoran }
     * 
     */
    public DisplayMenuRestoran createDisplayMenuRestoran() {
        return new DisplayMenuRestoran();
    }

    /**
     * Create an instance of {@link DisplayMenuRestoranResponse }
     * 
     */
    public DisplayMenuRestoranResponse createDisplayMenuRestoranResponse() {
        return new DisplayMenuRestoranResponse();
    }

    /**
     * Create an instance of {@link TambahMenu }
     * 
     */
    public TambahMenu createTambahMenu() {
        return new TambahMenu();
    }

    /**
     * Create an instance of {@link TambahMenuResponse }
     * 
     */
    public TambahMenuResponse createTambahMenuResponse() {
        return new TambahMenuResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link DisplayMenuRestoran }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DisplayMenuRestoran }{@code >}
     */
    @XmlElementDecl(namespace = "http://projectdistprog.ubaya.com/", name = "DisplayMenuRestoran")
    public JAXBElement<DisplayMenuRestoran> createDisplayMenuRestoran(DisplayMenuRestoran value) {
        return new JAXBElement<DisplayMenuRestoran>(_DisplayMenuRestoran_QNAME, DisplayMenuRestoran.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisplayMenuRestoranResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DisplayMenuRestoranResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://projectdistprog.ubaya.com/", name = "DisplayMenuRestoranResponse")
    public JAXBElement<DisplayMenuRestoranResponse> createDisplayMenuRestoranResponse(DisplayMenuRestoranResponse value) {
        return new JAXBElement<DisplayMenuRestoranResponse>(_DisplayMenuRestoranResponse_QNAME, DisplayMenuRestoranResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TambahMenu }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TambahMenu }{@code >}
     */
    @XmlElementDecl(namespace = "http://projectdistprog.ubaya.com/", name = "TambahMenu")
    public JAXBElement<TambahMenu> createTambahMenu(TambahMenu value) {
        return new JAXBElement<TambahMenu>(_TambahMenu_QNAME, TambahMenu.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TambahMenuResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TambahMenuResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://projectdistprog.ubaya.com/", name = "TambahMenuResponse")
    public JAXBElement<TambahMenuResponse> createTambahMenuResponse(TambahMenuResponse value) {
        return new JAXBElement<TambahMenuResponse>(_TambahMenuResponse_QNAME, TambahMenuResponse.class, null, value);
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
