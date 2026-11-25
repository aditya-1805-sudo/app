package com.webapp.app.Singleton;

public class ConcurrentSingleton {
    private static ConcurrentSingleton instance=null;
    private ConcurrentSingleton(){
        ;
    }
    public static ConcurrentSingleton getInstance(){

        if(instance==null){
            synchronized(ConcurrentSingleton.class){
                if(instance==null){
                    instance=new ConcurrentSingleton();
                }
            }
        }
        return  instance;
    }
}
