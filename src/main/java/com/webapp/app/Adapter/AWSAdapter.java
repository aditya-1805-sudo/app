package com.webapp.app.Adapter;

public class AWSAdapter implements CloudConnect{
    @Override
    public void createUser(Request request) {
        System.out.println("Creating aws user using "+request.getUsername()+" and "+request.getPwd());
    }

    @Override
    public void createVCN(Request request) {
        System.out.println("Creating aws vcn using "+request.getVcnName());
    }
}
