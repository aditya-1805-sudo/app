package com.webapp.app.Factory;

public class Client {
    public static void main(String[] args) {

        PizzaFactory pizzaFactory=new OrignalPizzaFactory();
        PizzaFactory pizzaFactory1=new NYPizzaFactory();
        pizzaFactory.orderPizza("Margerita");
        System.out.println();
        pizzaFactory1.orderPizza("mushroom");

    }
}
