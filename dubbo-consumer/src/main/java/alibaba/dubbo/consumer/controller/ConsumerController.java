package alibaba.dubbo.consumer.controller;

import alibaba.dubbo.consumer.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dubbo")
public class ConsumerController {


    @Autowired
    private ConsumerService consumerService;


    @GetMapping("/consumer")
    public String product(){
        return  consumerService.consumer();
    }
}
