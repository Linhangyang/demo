
package webservice.order;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ISoftOrder", targetNamespace = "http://softOrder.dsp.cma.dtdream.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ISoftOrder {


    /**
     * 
     * @param vinCode
     * @param districtCode
     * @param softwarePartNo
     * @param customerNumber
     * @return
     *     returns webservice.order.SoftOrderBean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "softOrder", targetNamespace = "http://softOrder.dsp.cma.dtdream.com/", className = "webservice.order.SoftOrder")
    @ResponseWrapper(localName = "softOrderResponse", targetNamespace = "http://softOrder.dsp.cma.dtdream.com/", className = "webservice.order.SoftOrderResponse")
    public SoftOrderBean softOrder(
        @WebParam(name = "softwarePartNo", targetNamespace = "")
        int softwarePartNo,
        @WebParam(name = "districtCode", targetNamespace = "")
        String districtCode,
        @WebParam(name = "customerNumber", targetNamespace = "")
        String customerNumber,
        @WebParam(name = "vinCode", targetNamespace = "")
        String vinCode);

}
