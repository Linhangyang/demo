package webservice.cn.com.webxml.client;


import webservice.cn.com.webxml.MobileCodeWS;
import webservice.cn.com.webxml.MobileCodeWSSoap;

/**
 * 第一个WebService客户端演示
 * 根据手机号查询手机归属地
 * http://ws.webxml.com.cn/WebServices/MobileCodeWS.asmx?wsdl
 *
 * @author dongyang
 *         <p>
 *         WebService的三要素是：(面试)
 *            SOAP (Simple Object Access Protocol)：简易对象访问协议，soap用来描述传递信息的格式。
 *            WSDL (WebServices Description Language)：Web服务描述语言，用来描述如何访问具体的接口。
 *            UDDI (Universal Description Discovery and Integration)：通用描述、发现及整合，用来管理、分发、查询webService。
 */

public class PhoneAddressClient {

    public static void main(String[] args) {
        System.out.println(getPhoneAddress("15000814726"));
    }

    public static String getPhoneAddress(String phone) {
        //1.实例化生成的服务类
        MobileCodeWS ws = new MobileCodeWS();
        //2.调用服务类的方法获取接口实例
        MobileCodeWSSoap soap = ws.getMobileCodeWSSoap();
        //3.通过接口直接获取数据
        return soap.getMobileCodeInfo(phone, "");
    }
}