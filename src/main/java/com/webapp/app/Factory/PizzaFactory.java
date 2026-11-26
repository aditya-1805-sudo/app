package com.webapp.app.Factory;


public abstract class PizzaFactory {

    Pizza orderPizza(String type){
        Pizza pizza=createPizza(type);
        System.out.println("Creating:"+pizza.getName());
        pizza.CreatingBase();
        pizza.sauce();
        pizza.toppings();
        return pizza;
    }
    protected abstract Pizza createPizza(String type);
}
