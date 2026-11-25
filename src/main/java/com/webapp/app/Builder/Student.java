package com.webapp.app.Builder;

import lombok.Getter;
@Getter
public class Student {
    private String name;
    private int age;
    private double psp;

    private Student(Builder builder){
        this.name= builder.name;
        this.age= builder.age;
        this.psp=builder.psp;
        validate();
    }

    static class Builder{
        private String name;
        private int age;
        private double psp;
        public Builder setName(String name){
            this.name=name;
            return this;
        }
        public Builder setAge(int age){
            this.age =age;
            return this;
        }
        public Builder setPsp(double psp){
            this.psp=psp;
            return this;
        }

        public Student build(){
            return new Student(this);
        }
    }
    public static Builder builder(){
        return new Builder();
    }
    public void validate(){
        if(age<18){
            throw new RuntimeException("Under age");
        }
    }
}
