package alibaba.dubbo.producter.service.impl;

import alibaba.dubbo.api.service.ComsumerRemoteService;
import alibaba.dubbo.producter.service.ProducterService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;


@Service
public class ProducterServiceImpl implements ProducterService {

    @Reference(url = "127.0.0.1:20882",check = false)
    private ComsumerRemoteService comsumerRemoteService;


    @Override
    public String product() {
        return "producter-1 product a service !!!" + comsumerRemoteService.consumerResult("product1");
    }
}
