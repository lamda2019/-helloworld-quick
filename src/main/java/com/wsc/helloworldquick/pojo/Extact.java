package com.wsc.helloworldquick.pojo;

public class Extact {

    private final String name = "wsc2019ok";

    //抽取方法 Ctrl + Alt + M
    public void extractStr(String name){
        firstM(name);

        secondM(name);

        thirdM(name);
    }
    //生成的方法
    private void thirdM(String name) {
        getName(name);
        getName(name);
        getName(name);
    }

    private void secondM(String name) {
        getName(name);
        getName(name);
        getName(name);
    }

    private void firstM(String name) {
        getName(name);
        getName(name);
    }

    public void getName(String name){
    System.out.println(name);
}
}
