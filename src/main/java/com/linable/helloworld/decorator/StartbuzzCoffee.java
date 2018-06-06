package com.linable.helloworld.decorator;

/**
 * @author HangYang.Lin
 *         on 2017/6/22.
 */
public class StartbuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println("进入咖啡馆");
        System.out.println(beverage);
        Beverage beverage2 = new Espresso();
        beverage2 = new Mocha(beverage2);
        System.out.println(beverage2.getDescription() + beverage2.cost());
    }
}
