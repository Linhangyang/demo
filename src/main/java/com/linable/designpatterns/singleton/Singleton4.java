package com.linable.designpatterns.singleton;

/**
 * @author HangYang.Lin
 *         on 2018-06-07.
 */
public class Singleton4 {

    private volatile static Singleton4 singleton = new Singleton4();

    private Singleton4() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton4();
                }
            }
        }
    }

    public static Singleton4 getSingleton() {
        return singleton;
    }

}
