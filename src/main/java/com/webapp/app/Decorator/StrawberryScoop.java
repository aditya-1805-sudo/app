package com.webapp.app.Decorator;

public class StrawberryScoop implements IceCream{
    IceCream iceCream;

    public StrawberryScoop(IceCream iceCream){
        this.iceCream=iceCream;
    }

    @Override
    public double getCost() {
        return iceCream.getCost()+40;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription()+",Vanilla Scoop";
    }
}
