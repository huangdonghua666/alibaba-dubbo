package alibaba.dubbo.consumer.remote;

import alibaba.dubbo.api.service.ComsumerRemoteService;
import alibaba.dubbo.consumer.service.ConsumerService;
import org.apache.dubbo.config.annotation.Service;

import javax.annotation.Resource;

@Service
public class ComsumerRemoteServiceImpl implements ComsumerRemoteService {

    @Resource
    private ConsumerService consumerService;

    @Override
    public String consumerResult(String product) {
        return consumerService.consumerResult(product);
    }
}
