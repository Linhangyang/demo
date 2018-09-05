package com.linable.designpatterns.singleton;

/**
 * @author HangYang.Lin
 *         on 2018-06-07.
 */
public class Singleton3 {

    private static Singleton3 singleton = new Singleton3();

    private Singleton3() {

    }

    public static Singleton3 getSingleton() {
        return singleton;
    }

}
