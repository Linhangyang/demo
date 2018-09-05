
package webservice.order;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservice.order package. 
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

    private final static QName _SoftOrder_QNAME = new QName("http://softOrder.dsp.cma.dtdream.com/", "softOrder");
    private final static QName _SoftOrderResponse_QNAME = new QName("http://softOrder.dsp.cma.dtdream.com/", "softOrderResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservice.order
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SoftOrder }
     * 
     */
    public SoftOrder createSoftOrder() {
        return new SoftOrder();
    }

    /**
     * Create an instance of {@link SoftOrderResponse }
     * 
     */
    public SoftOrderResponse createSoftOrderResponse() {
        return new SoftOrderResponse();
    }

    /**
     * Create an instance of {@link SoftOrderBean }
     * 
     */
    public SoftOrderBean createSoftOrderBean() {
        return new SoftOrderBean();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoftOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://softOrder.dsp.cma.dtdream.com/", name = "softOrder")
    public JAXBElement<SoftOrder> createSoftOrder(SoftOrder value) {
        return new JAXBElement<SoftOrder>(_SoftOrder_QNAME, SoftOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoftOrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://softOrder.dsp.cma.dtdream.com/", name = "softOrderResponse")
    public JAXBElement<SoftOrderResponse> createSoftOrderResponse(SoftOrderResponse value) {
        return new JAXBElement<SoftOrderResponse>(_SoftOrderResponse_QNAME, SoftOrderResponse.class, null, value);
    }

}
