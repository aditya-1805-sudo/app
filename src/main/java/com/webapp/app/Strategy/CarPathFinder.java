package com.webapp.app.Strategy;

public class CarPathFinder implements PathFinder{
    @Override
    public void getPath(String start,String end) {
        System.out.println("Finding Car Path "+start
                +" to "+end);
    }
}
