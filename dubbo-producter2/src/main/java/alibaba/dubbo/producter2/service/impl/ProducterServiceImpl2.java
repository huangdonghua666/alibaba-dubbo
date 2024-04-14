package alibaba.dubbo.producter2.service.impl;

import alibaba.dubbo.api.service.ComsumerRemoteService;
import alibaba.dubbo.api.service.ProducterService2;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;


@Service
public class ProducterServiceImpl2 implements ProducterService2 {

    @Reference(url = "127.0.0.1:20882",check = false)
    private ComsumerRemoteService comsumerRemoteService;

    @Override
    public String product() {
        return "producter-2 product a service !!!" + comsumerRemoteService.consumerResult("product2");
    }
}
