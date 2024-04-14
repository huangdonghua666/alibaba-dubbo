package alibaba.dubbo.consumer.service.impl;

import alibaba.dubbo.api.service.ProducterRemote;
import alibaba.dubbo.api.service.ProducterService2;
import alibaba.dubbo.consumer.service.ConsumerService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

@Service
public class ConsumerServiceImpl implements ConsumerService {

    /**
     * 方式-：另外抽出一个 remote 远程接口暴露出去
     * todo： 注意url中的端口为 dubbo通信端口
     */
    @Reference(url = "127.0.0.1:30882",check = false)
    private ProducterRemote producterRemote;


    /**
     * 方式二：直接将业务service的接口暴露出去
     * todo： 注意url中的端口为 dubbo通信端口
     */
    @Reference(url = "127.0.0.1:40882",check = false)
    private ProducterService2 producterService2;

    @Override
    public String consumer() {
        String res1 = producterRemote.product();
        String res2 = producterService2.product();
        return "消费端： " + res1 + " && " + res2;
    }

    @Override
    public String consumerResult(String product) {
        return "消费端消费：" + product + " 已经结束";
    }
}
