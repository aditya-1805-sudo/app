package com.webapp.app.p;

public class Client {


    public static void main(String[] args) {
        Config config=new Config("Bolt",5,90.2,"Ballie");
        Config config1=new SplConfig("Ollie",2,90.1,"Hockey","Bhotia");
        Registry registry=new Registry();
        registry.put(ConfigType.Config,config);
        registry.put(ConfigType.SplConfig,config1);
        Config config2=config.copy();
        Config config3=config1.copy();
        config3.session_name="Lakdi";
    }
}
