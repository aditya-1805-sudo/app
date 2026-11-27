package com.webapp.app.Strategy;

public class Client {
    public static void main(String[] args) {
        Registry registry=new Registry();
        PathFinder pathFinder=registry.get(TransportType.Car);
        pathFinder.getPath("haridwar","rishikesh");
    }
}
