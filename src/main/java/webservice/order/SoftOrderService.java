
package webservice.order;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "SoftOrderService", targetNamespace = "http://softOrder.dsp.cma.dtdream.com/", wsdlLocation = "http://localhost:8080/softStock/softOrder?wsdl")
public class SoftOrderService
    extends Service
{

    private final static URL SOFTORDERSERVICE_WSDL_LOCATION;
    private final static WebServiceException SOFTORDERSERVICE_EXCEPTION;
    private final static QName SOFTORDERSERVICE_QNAME = new QName("http://softOrder.dsp.cma.dtdream.com/", "SoftOrderService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/softStock/softOrder?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SOFTORDERSERVICE_WSDL_LOCATION = url;
        SOFTORDERSERVICE_EXCEPTION = e;
    }

    public SoftOrderService() {
        super(__getWsdlLocation(), SOFTORDERSERVICE_QNAME);
    }

    public SoftOrderService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SOFTORDERSERVICE_QNAME, features);
    }

    public SoftOrderService(URL wsdlLocation) {
        super(wsdlLocation, SOFTORDERSERVICE_QNAME);
    }

    public SoftOrderService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SOFTORDERSERVICE_QNAME, features);
    }

    public SoftOrderService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SoftOrderService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ISoftOrder
     */
    @WebEndpoint(name = "SoftOrderPort")
    public ISoftOrder getSoftOrderPort() {
        return super.getPort(new QName("http://softOrder.dsp.cma.dtdream.com/", "SoftOrderPort"), ISoftOrder.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ISoftOrder
     */
    @WebEndpoint(name = "SoftOrderPort")
    public ISoftOrder getSoftOrderPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://softOrder.dsp.cma.dtdream.com/", "SoftOrderPort"), ISoftOrder.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SOFTORDERSERVICE_EXCEPTION!= null) {
            throw SOFTORDERSERVICE_EXCEPTION;
        }
        return SOFTORDERSERVICE_WSDL_LOCATION;
    }

}