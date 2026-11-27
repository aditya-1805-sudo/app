package com.webapp.app.Decorator;

public class VanillaScoop implements IceCream{

    IceCream iceCream;
    public VanillaScoop(IceCream iceCream){
        this.iceCream=iceCream;
    }
    @Override
    public double getCost() {
        return iceCream.getCost()+30;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription()+",VanillaScoop";
    }
}
