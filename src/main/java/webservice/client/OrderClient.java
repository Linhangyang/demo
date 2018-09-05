package webservice.client;



import webservice.order.ISoftOrder;
import webservice.order.SoftOrderService;

/**
 * @author HangYang.Lin
 *         on 2018-08-07.
 */
public class OrderClient {
    public static void main(String[] args) {
        //1.实例化生成的服务类
        SoftOrderService ws = new SoftOrderService();
        //2.调用服务类的方法获取接口实例
        ISoftOrder soap = ws.getSoftOrderPort();
        //3.通过接口直接获取数据
        soap.softOrder(123, "districtCode", "customerNumber", "vinCode");
    }
}
