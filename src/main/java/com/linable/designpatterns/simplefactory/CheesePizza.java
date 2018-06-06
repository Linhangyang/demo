package com.linable.designpatterns.simplefactory;

/**
 * @author HangYang.Lin
 *         on 2018-05-31.
 */
public class CheesePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("准备" + "CheesePizza");
    }

    @Override
    public void bake() {
        System.out.println("烤" + "CheesePizza");
    }

    @Override
    public void cut() {
        System.out.println("切" + "CheesePizza");
    }

    @Override
    public void box() {
        System.out.println("打包" + "CheesePizza");
    }
}
