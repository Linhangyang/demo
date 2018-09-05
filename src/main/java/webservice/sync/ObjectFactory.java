
package webservice.sync;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservice.sync package. 
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

    private final static QName _SoftSync_QNAME = new QName("http://softOrder.dsp.cma.dtdream.com/", "softSync");
    private final static QName _SoftSyncResponse_QNAME = new QName("http://softOrder.dsp.cma.dtdream.com/", "softSyncResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservice.sync
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SoftSyncResponse }
     * 
     */
    public SoftSyncResponse createSoftSyncResponse() {
        return new SoftSyncResponse();
    }

    /**
     * Create an instance of {@link SoftSyncResponse.Return }
     * 
     */
    public SoftSyncResponse.Return createSoftSyncResponseReturn() {
        return new SoftSyncResponse.Return();
    }

    /**
     * Create an instance of {@link SoftSync }
     * 
     */
    public SoftSync createSoftSync() {
        return new SoftSync();
    }

    /**
     * Create an instance of {@link SoftSyncParam }
     * 
     */
    public SoftSyncParam createSoftSyncParam() {
        return new SoftSyncParam();
    }

    /**
     * Create an instance of {@link SoftSyncResponse.Return.Entry }
     * 
     */
    public SoftSyncResponse.Return.Entry createSoftSyncResponseReturnEntry() {
        return new SoftSyncResponse.Return.Entry();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoftSync }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://softOrder.dsp.cma.dtdream.com/", name = "softSync")
    public JAXBElement<SoftSync> createSoftSync(SoftSync value) {
        return new JAXBElement<SoftSync>(_SoftSync_QNAME, SoftSync.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoftSyncResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://softOrder.dsp.cma.dtdream.com/", name = "softSyncResponse")
    public JAXBElement<SoftSyncResponse> createSoftSyncResponse(SoftSyncResponse value) {
        return new JAXBElement<SoftSyncResponse>(_SoftSyncResponse_QNAME, SoftSyncResponse.class, null, value);
    }

}
