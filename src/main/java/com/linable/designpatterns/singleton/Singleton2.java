package com.linable.designpatterns.singleton;

/**
 * @author HangYang.Lin
 *         on 2018-06-07.
 */
public class Singleton2 {

    private static Singleton2 singleton;

    private Singleton2() {

    }

    public static synchronized Singleton2 getSingleton() {
        if (singleton == null) {
            singleton = new Singleton2();
        }
        return singleton;
    }

}
