package com.webapp.app.Factory;

import java.util.List;

public class NYPizzaFactory extends PizzaFactory{
    @Override
    protected Pizza createPizza(String type) {
        if(type.equals("cheese")){
            return new Pizza("cheese","thick","tomato", List.of("onion","tomato"));
        }
        else if(type.equals("mushroom")){
            return new Pizza("mushroom","thin","tomato", List.of("onion","tomato"));
        }
        else {
            return new Pizza("NY","thin","tomato", List.of("onion","tomato"));
        }
    }
}
