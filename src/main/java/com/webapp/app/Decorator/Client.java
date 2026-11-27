package com.webapp.app.Decorator;

public class Client {
    public static void main(String[] args) {
        IceCream iceCream=new ChocolateCone();
        iceCream=new ChocolateScoop(iceCream);
        iceCream=new StrawberryScoop(iceCream);
        iceCream=new VanillaScoop(iceCream);
        iceCream=new VanillaScoop(iceCream);
        System.out.println("Cost:"+iceCream.getCost());
        System.out.println("Description:"+iceCream.getDescription());
    }
}
