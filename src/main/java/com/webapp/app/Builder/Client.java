package com.webapp.app.Builder;

public class Client {
    public static void main(String args[]){

        Student student= Student.builder()
                .setName("Aditya")
                .setAge(19)
                .setPsp(90.2)
                .build();
        System.out.println("Name:"+student.getName()+"\nAge:"+student.getAge()+"\nPsp:"+student.getPsp());
    }
}
