package com.linable.helloworld.decorator;

/**
 * @author HangYang.Lin
 *         on 2017/6/22.
 */
public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return 5 + beverage.cost();
    }
}
