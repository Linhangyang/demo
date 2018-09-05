package com.linable.designpatterns.singleton;

/**
 * @author HangYang.Lin
 *         on 2018-06-07.
 */
public class Singleton {

    private static Singleton singleton;

    private Singleton() {

    }

    public static Singleton getSingleton() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

}
