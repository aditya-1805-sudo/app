package com.webapp.app.Strategy;

import java.nio.file.Path;
import java.util.HashMap;

public class Registry {
    HashMap <TransportType,PathFinder> map;
    public Registry(){
        map=new HashMap<>();
        map.put(TransportType.Bike,new BikePathFinder());
        map.put(TransportType.Car,new CarPathFinder());
    }
    public PathFinder get(TransportType transportType){
        return map.get(transportType);
    }
}
