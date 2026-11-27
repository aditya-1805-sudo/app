package com.webapp.app.Adapter;

public class GCPAdapter implements CloudConnect{
    @Override
    public void createUser(Request request) {
        System.out.println("Creating GCP user using "+request.getToken());
    }

    @Override
    public void createVCN(Request request) {
        System.out.println("Creating GCP VCN using "+request.getGcpName());
    }
}
