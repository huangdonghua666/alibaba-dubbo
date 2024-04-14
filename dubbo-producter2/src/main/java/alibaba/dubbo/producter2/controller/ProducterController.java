package alibaba.dubbo.producter2.controller;

import alibaba.dubbo.api.service.ProducterService2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/dubbo")
public class ProducterController {



    @Resource
    private ProducterService2 producterService2;


    @GetMapping("/product2")
    public String product(){
        return  "提供端: " + producterService2.product();
    }
}
