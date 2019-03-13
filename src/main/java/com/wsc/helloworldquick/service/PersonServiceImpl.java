package com.wsc.helloworldquick.service;

import java.util.Date;

public class PersonServiceImpl implements PersonService {
    @Override
    public void showName() {
        System.out.println("userName is wsc");
        //导包
        new Date();
    }
}
