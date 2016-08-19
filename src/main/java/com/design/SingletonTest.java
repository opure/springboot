package com.design;

import ch.qos.logback.core.net.SyslogOutputStream;

/**
 * Created by USER on 2016/8/19.
 */
public class SingletonTest {
    private static SingletonTest instance = null;

    public static  SingletonTest getInstance() {
        if (instance == null) {
            instance = new SingletonTest();
        }
        return  instance;

    }

    public static void main(String[] args) {}
}
