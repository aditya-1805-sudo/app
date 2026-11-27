package com.webapp.app.p;

public class Config {
    private String user;
    private int age;
    private double psp;
    public String session_name;
    public Config(String user,int age,double psp, String session_name){
        this.user=user;
        this.age=age;
        this.psp=psp;
        this.session_name=session_name;
    }
    public Config(Config config){
        this.user=config.user;
        this.age=config.age;
        this.psp=config.psp;
        this.session_name=config.session_name;
    }


    public Config copy(){
        return new Config(this);
    }
}
