package cn.robustsoft;

import org.springframework.stereotype.Component;

@Component
public class OrderServiceFallback implements OrderService {

    @Override
    public String consumer() {
        return "fallback";
    }
}
