package com.webapp.app.Decorator;

public class OrangeCone implements IceCream{

    @Override
    public double getCost() {
        return 15;
    }

    @Override
    public String getDescription() {
        return "Orange Cone";
    }
}
