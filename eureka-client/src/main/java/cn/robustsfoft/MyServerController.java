package cn.robustsfoft;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyServerController {

    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("/order")
    public String index() {
        String services = "Services: " + discoveryClient.getServices();
        System.out.println(services);
        return "订单服务返回订单号：1001";
    }

}
