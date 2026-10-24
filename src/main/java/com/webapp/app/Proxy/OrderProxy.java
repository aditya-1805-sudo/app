package com.webapp.app.Proxy;

import com.webapp.app.Models.FakeOrder;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name="order",url="${getAllOrders.url}")
public interface OrderProxy {
    @GetMapping
    public List<FakeOrder> getAllOrders();
}
