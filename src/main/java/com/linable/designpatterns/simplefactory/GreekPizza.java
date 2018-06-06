package com.linable.designpatterns.simplefactory;

/**
 * @author HangYang.Lin
 *         on 2018-05-31.
 */
public class GreekPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("准备" + "GreekPizza");
    }

    @Override
    public void bake() {
        System.out.println("烤" + "GreekPizza");
    }

    @Override
    public void cut() {
        System.out.println("切" + "GreekPizza");
    }

    @Override
    public void box() {
        System.out.println("打包" + "GreekPizza");
    }
}
