package com.webapp.app.p;

import java.util.HashMap;

public class Registry {
    HashMap<ConfigType,Config> map;

    public Registry(){
        map=new HashMap<>();
    }
    public Config get(ConfigType configType){
        return map.get(configType);
    }
    public void put(ConfigType configType,Config config){
        map.put(configType,config);
    }
}
