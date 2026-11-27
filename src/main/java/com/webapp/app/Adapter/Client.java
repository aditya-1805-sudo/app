package com.webapp.app.Adapter;

public class Client {
    public static void main(String[] args) {
        Request request=new Request();
        request.setUsername("Aditya");
        request.setPwd("bolt");
        request.setToken("Ollie");
        request.setGcpName("GCPVCN");
        request.setVcnName("AWSVCN");
        CloudConnect awsConnect=new AWSAdapter();
        awsConnect.createVCN(request);
        CloudConnect gcpConnect=new GCPAdapter();
        gcpConnect.createUser(request);
    }
}
