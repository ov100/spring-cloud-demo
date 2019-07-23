package cn.robustsoft;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "eureka-client", fallback = OrderServiceFallback.class)
public interface OrderService {

    @GetMapping("/order")
    String consumer();

}
