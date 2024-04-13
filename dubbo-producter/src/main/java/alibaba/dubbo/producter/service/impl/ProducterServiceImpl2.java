package alibaba.dubbo.producter.service.impl;

import alibaba.dubbo.api.service.ProducterService2;
import org.apache.dubbo.config.annotation.Service;


@Service
public class ProducterServiceImpl2 implements ProducterService2 {

    @Override
    public String product() {
        return "producter-2 product a service";
    }
}
