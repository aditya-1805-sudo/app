package com.webapp.app.Observer;

public class Client {
    public static void main(String[] args) {
        Subject subject=new WeatherData();
        Observer display1=new Display1();
        Observer display2=new Display2();
        subject.addObserver(display1);
        subject.addObserver(display2);
        subject.measurementsChanged();
    }
}
