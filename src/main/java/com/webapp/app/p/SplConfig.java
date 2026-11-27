package com.webapp.app.p;

public class SplConfig extends Config{

    private String token;
    public SplConfig(String user, int age, double psp, String session_name,String token) {
        super(user, age, psp, session_name);
        this.token=token;
    }

    public SplConfig(SplConfig splConfig){
        super(splConfig);
        this.token=splConfig.token;
    }
    @Override
    public Config copy(){
        return new SplConfig(this);
    }

}
