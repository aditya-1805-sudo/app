package com.webapp.app.Observer;

public class Display2 implements Observer{
    int temp;
    int humidity;
    @Override
    public void update(int temp, int humidity) {
        this.temp=temp;
        this.humidity=humidity;
        print();
    }

    @Override
    public void print() {
        System.out.println("Display2:"+ temp+" "+humidity);
    }
}
