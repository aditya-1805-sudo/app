package com.webapp.app.Factory;

public class Client {
    public static void main(String[] args) {

        PizzaFactory pizzaFactory=new OrignalPizzaFactory();
        PizzaFactory pizzaFactory1=new NYPizzaFactory();
        Pizza p1=pizzaFactory.orderPizza("Margerita");
        System.out.println();
        Pizza p2=pizzaFactory1.orderPizza("mushroom");
    }
}
