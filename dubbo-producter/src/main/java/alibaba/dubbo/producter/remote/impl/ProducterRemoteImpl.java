package alibaba.dubbo.producter.remote.impl;

import alibaba.dubbo.api.service.ProducterRemote;
import alibaba.dubbo.producter.service.ProducterService;
import org.apache.dubbo.config.annotation.Service;


import javax.annotation.Resource;


@Service
public class ProducterRemoteImpl implements ProducterRemote {

    @Resource
    private ProducterService producterService;

    @Override
    public String product(){
        return producterService.product();
    }

}
