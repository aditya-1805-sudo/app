package com.webapp.app.Factory;

import lombok.Getter;

import java.util.List;

@Getter
public class Pizza {
    private String name;
    private String base;
    private String sauce;
    private List<String> toppings;
    public Pizza(String name,String base,String sauce,List<String> toppings){
        this.name=name;
        this.base=base;
        this.sauce=sauce;
        this.toppings=toppings;
    }

    public void CreatingBase(){
        System.out.println("Creating base:"+base);
    }
    public void sauce(){
        System.out.println("Adding sauce:"+sauce);
    }
    public void toppings(){
        for(String s:toppings){
            System.out.println("Adding:"+s);
        }
    }
}
