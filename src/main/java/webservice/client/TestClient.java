package webservice.client;



import com.dtdream.cma.dsp.softorder.ISoftPrice;
import com.dtdream.cma.dsp.softorder.SoftPriceBean;
import com.dtdream.cma.dsp.softorder.SoftPriceService;

import java.net.MalformedURLException;

/**
 * 自定义WebService服务端的客户端调用演示
 *
 * @author dongyang
 */
public class TestClient {

    public static void main(String[] args) throws MalformedURLException {

        //        //TODO 也可以按照入门案例PhoneAddressClient那样调用，但是这样是不是更好呢？更具灵活性
        //
        //        //FisrtWebServiceImplService是自动生成的接口，不是服务端的实现类
        //        Service service =
        //            Service.create(new URL("http://localhost:8080/softStock/softOrder?wsdl"), new QName("http://impl.server.webservice
        // .remote.ssm.com/",
        //                "FisrtWebServiceImplService"));
        //        SoftPriceService impl = service.getPort(SoftPriceService.class);
        //        System.out.println(impl.getSoftPricePort());
        SoftPriceBean bean = getPhoneAddress("01", "01");
        System.out.println(bean.getCurrencyCode());
    }

    public static SoftPriceBean getPhoneAddress(String softwarePartNo, String customerNumber) {
        //1.实例化生成的服务类
        SoftPriceService ws = new SoftPriceService();
        //2.调用服务类的方法获取接口实例
        ISoftPrice soap = ws.getSoftPricePort();
        //3.通过接口直接获取数据
        return soap.softPrice(softwarePartNo, customerNumber);
    }

}
