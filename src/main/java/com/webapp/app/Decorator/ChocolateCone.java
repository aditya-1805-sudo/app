package com.webapp.app.Decorator;

public class ChocolateCone implements IceCream{
    private String description="Chocolate Cone";

    @Override
    public double getCost() {
        return 10;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
