package com.wsc.helloworldquick.pojo;

import java.util.ArrayList;
import java.util.List;

public class AltEnt {
    //1 自动创建函数, 函数中可以自动创建新函数，类中不可以
    public static void main(String[] args){
        showName();
    }

    private static void showName() {
    }


    //2 list replace,重构时使用
public void testListReplace(){
    List<String> list=new ArrayList<>();

    for (String item : list) {
    }
}

   // 3  快速格式化字符串
    public void formatAndBuild(){
        String name="wsc";
        int age=18;

        String format= String.format("name= %s,age:%d", name, age);

        String build= new StringBuilder().append("name= ").append(name).append(",")
                .append("age:").append(age).toString();

    }


}






















