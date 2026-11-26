package com.webapp.app.Prototype;


public class SpecialConfig extends Config{

    String splToken;

    public SpecialConfig(String user, int age, double psp, String sessions_name, String account,String splToken) {
        super(user, age, psp, sessions_name, account);
        this.splToken=splToken;
    }
    public SpecialConfig(SpecialConfig config){
        super(config);
        this.splToken=config.splToken;
    }

    @Override
    public Config copy(){
        return new SpecialConfig(this);
    }
}
