package com.webapp.app.Decorator;

public class VanillaCone implements IceCream{

    @Override
    public double getCost() {
        return 5;
    }

    @Override
    public String getDescription() {
        return "Vanilla Cone";
    }
}
