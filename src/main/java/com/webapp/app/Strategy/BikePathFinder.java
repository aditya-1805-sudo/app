package com.webapp.app.Strategy;

public class BikePathFinder implements PathFinder{
    @Override
    public void getPath(String start, String end) {
        System.out.println("Finding bike Path from "+start
        +" to "+end);
    }
}
