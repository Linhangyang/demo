package com.linable.helloworld.decorator;

import javax.management.Descriptor;

/**
 * @author HangYang.Lin
 *         on 2017/6/22.
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "浓咖啡";
    }

    @Override
    public double cost() {
        return 18;
    }
}
