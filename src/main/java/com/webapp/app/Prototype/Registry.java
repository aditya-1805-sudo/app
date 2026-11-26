package com.webapp.app.Prototype;

import java.util.HashMap;

public class Registry {
    private HashMap<ConfigType,Config> map;
    public Registry(){
        this.map=new HashMap<>();
        Config config=new Config("Bolt",5,92,"Ballie","BoltZee");
        SpecialConfig specialConfig=new SpecialConfig("Ollie",2,91,"Hockey","BoltZee","Bhotia");
        map.put(ConfigType.Config,config);
        map.put(ConfigType.SpecialConfig,specialConfig);
    }
    public Config get(ConfigType configType){
        return map.get(configType);
    }
    public void put(ConfigType configType,Config config){
        map.put(configType,config);
    }
}
