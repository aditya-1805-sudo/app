package com.webapp.app.Builder.Const;

import lombok.Getter;

@Getter
public class Student {
    private String name;
    private int age;
    private double psp;
    public Student(StudentData studentData){
        this.age=studentData.getAge();
        this.name=studentData.getName();
        this.psp=studentData.getPsp();
        validate();
    }
    public void validate(){
        if(age<18){
            throw new RuntimeException("Under age");
        }
    }
}
