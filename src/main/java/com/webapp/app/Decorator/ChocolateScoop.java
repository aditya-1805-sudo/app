package com.webapp.app.Decorator;

public class ChocolateScoop implements IceCream{
    IceCream iceCream;
    public ChocolateScoop(IceCream iceCream)
    {
        this.iceCream=iceCream;
    }

    @Override
    public double getCost() {
        return iceCream.getCost()+20;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription()+",Chocolate Scoop";
    }
}
