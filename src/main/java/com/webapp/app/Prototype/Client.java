package com.webapp.app.Prototype;

public class Client {
    public static void main(String[] args) {
        Registry registry=new Registry();
        Config config=registry.get(ConfigType.Config);
        Config config1=registry.get(ConfigType.SpecialConfig);
        Config copy1=config.copy();
        Config copy2=config1.copy();
        System.out.println();
    }
}
