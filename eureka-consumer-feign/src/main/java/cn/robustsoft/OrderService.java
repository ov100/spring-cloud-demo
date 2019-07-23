package cn.robustsoft;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("eureka-client")
public interface OrderService {

    @GetMapping("/order")
    String consumer();

}
