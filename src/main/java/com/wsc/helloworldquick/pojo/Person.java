package com.wsc.helloworldquick.pojo;


import java.util.Date;

public class Person {

    private final String name;

    public Person(String name){
        this.name = name;
    }

    public void showTime(){
        System.out.println(new Date());

    }

    public Date getDate(){
        return new Date();
    }

    public void valid(Person person){
        if (person != null) {

        }
    }


}
