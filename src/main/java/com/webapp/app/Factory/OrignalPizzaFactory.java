package com.webapp.app.Factory;

import java.util.List;

public class OrignalPizzaFactory extends PizzaFactory{
    @Override
    protected Pizza createPizza(String type) {
        return new Pizza("Margerita","thin","tomato", List.of("onion","tomato"));
    }
}
