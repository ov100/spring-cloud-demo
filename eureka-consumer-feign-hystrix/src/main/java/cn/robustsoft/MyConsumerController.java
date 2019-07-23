package cn.robustsoft;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyConsumerController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/consumer")
    public String consumer() {
        return orderService.consumer();
    }

}
