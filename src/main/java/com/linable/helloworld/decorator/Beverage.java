package com.linable.helloworld.decorator;

/**
 * @author HangYang.Lin
 *         on 2017/6/22.
 */
public abstract class Beverage {

    protected String description = "不知道的类型";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

    @Override
    public String toString() {
        return description + " $ " + this.cost();
    }
}
