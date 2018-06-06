package com.linable.helloworld.decorator;

/**
 * @author HangYang.Lin
 *         on 2017/6/22.
 */
public class HouseBlend extends Beverage{

    public HouseBlend() {
        description = "HouseBlend咖啡";
    }

    @Override
    public double cost() {
        return 15;
    }

}
