package com.webapp.app.Service;

import com.webapp.app.Models.FakeOrder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FakeOrderService {
    public FakeOrder getBiggestOrder(List<FakeOrder> list){
        FakeOrder res=null;
        int cost=0;
        for(FakeOrder order:list){
            if(order.getPrice()>cost){
                res=order;
            }
        }
        return res;
    }
}
