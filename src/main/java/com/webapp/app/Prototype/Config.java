package com.webapp.app.Prototype;

public class Config {
    private String user;
    private int age;
    private double psp;
    public String sessions_name;
    public String account;
    public Config(String user,int age,double psp,String sessions_name,String account){
        this.user=user;
        this.age=age;
        this.psp=psp;
        this.sessions_name=sessions_name;
        this.account=account;
    }
    public Config(Config config){
        this.user=config.user;
        this.age=config.age;
        this.psp=config.psp;
        this.sessions_name=config.sessions_name;
        this.account=config.account;
    }


    public Config copy(){
        return new Config(this);
    }
}
