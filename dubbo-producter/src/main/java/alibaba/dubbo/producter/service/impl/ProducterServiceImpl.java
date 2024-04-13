package alibaba.dubbo.producter.service.impl;

import alibaba.dubbo.producter.service.ProducterService;
import org.springframework.stereotype.Service;


@Service
public class ProducterServiceImpl implements ProducterService {

    @Override
    public String product() {
        return "producter-1 product a service";
    }
}
