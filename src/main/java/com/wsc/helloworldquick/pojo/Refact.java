package com.wsc.helloworldquick.pojo;

public class Refact {

    //Shift + F6 重构属性
    public void getInfo(int age,String name){
        System.out.println("age:"+age);
        System.out.println("name"+name);


        //Ctrl+F6 重构方法
        getOther(age,name);

    }

   public String getOther(int age, String name){
        return "age"+age+"name"+name;
   }

   public void getName(String name){
       System.out.println(name);
   }


















}
