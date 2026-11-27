package com.webapp.app.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
    int temp;
    int humidity;
    List<Observer> weatherList=new ArrayList<>();
    @Override
    public void addObserver(Observer observer) {
        weatherList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        weatherList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer o:weatherList){
            o.update(temp,humidity);
        }
    }
    public void measurementsChanged(){
        temp=(int)(Math.random()*100);
        humidity=(int)(Math.random()*100);
        notifyObserver();
    }
}
