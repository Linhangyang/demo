package webservice.client;



import webservice.sync.ISoftSync;
import webservice.sync.SoftSyncParam;
import webservice.sync.SoftSyncService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author HangYang.Lin
 *         on 2018-08-07.
 */
public class SyncClient {
    public static void main(String[] args) {
        //1.实例化生成的服务类
        SoftSyncService ws = new SoftSyncService();
        //2.调用服务类的方法获取接口实例
        ISoftSync soap = ws.getSoftSyncPort();
        //3.通过接口直接获取数据
        List<SoftSyncParam> list = new ArrayList<>();
        soap.softSync(list);
    }
}
