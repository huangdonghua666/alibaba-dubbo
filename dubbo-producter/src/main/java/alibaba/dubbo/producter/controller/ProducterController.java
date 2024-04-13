package alibaba.dubbo.producter.controller;

import alibaba.dubbo.api.service.ProducterService2;
import alibaba.dubbo.producter.service.ProducterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/dubbo")
public class ProducterController {


    @Autowired
    private ProducterService producterService;

    @Resource
    private ProducterService2 producterService2;


    @GetMapping("/product")
    public String product(){
        return  "提供端: " + producterService.product() + " && " + producterService2.product();
    }
}
