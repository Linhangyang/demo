
package com.dtdream.cma.dsp.softorder;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.dtdream.cma.dsp.softorder package. 
 * <p>An ObjectFactory allows you to programatically 
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

    private final static QName _SoftPrice_QNAME = new QName("http://softOrder.dsp.cma.dtdream.com/", "softPrice");
    private final static QName _SoftPriceResponse_QNAME = new QName("http://softOrder.dsp.cma.dtdream.com/", "softPriceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.dtdream.cma.dsp.softorder
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SoftPrice }
     * 
     */
    public SoftPrice createSoftPrice() {
        return new SoftPrice();
    }

    /**
     * Create an instance of {@link SoftPriceResponse }
     * 
     */
    public SoftPriceResponse createSoftPriceResponse() {
        return new SoftPriceResponse();
    }

    /**
     * Create an instance of {@link SoftPriceBean }
     * 
     */
    public SoftPriceBean createSoftPriceBean() {
        return new SoftPriceBean();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoftPrice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://softOrder.dsp.cma.dtdream.com/", name = "softPrice")
    public JAXBElement<SoftPrice> createSoftPrice(SoftPrice value) {
        return new JAXBElement<SoftPrice>(_SoftPrice_QNAME, SoftPrice.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoftPriceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://softOrder.dsp.cma.dtdream.com/", name = "softPriceResponse")
    public JAXBElement<SoftPriceResponse> createSoftPriceResponse(SoftPriceResponse value) {
        return new JAXBElement<SoftPriceResponse>(_SoftPriceResponse_QNAME, SoftPriceResponse.class, null, value);
    }

}
