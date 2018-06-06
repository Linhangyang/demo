package com.linable.helloworld.designPattern.factory;

/**
 * @author HangYang.Lin
 *         on 2017/7/12.
 */
public class Test {

    public static void main(String[] args) {
        orderPizza("cheese");
    }

    public static Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = new CheesePizze();
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

}
