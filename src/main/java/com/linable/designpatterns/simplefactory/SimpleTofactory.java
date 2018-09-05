package com.linable.designpatterns.simplefactory;

/**
 * @author HangYang.Lin
 *         on 2018-05-31.
 */
public class SimpleTofactory {

    public static void main(String[] args) {
        Pizza pizza = CreatePizza("cheese");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }

    private static Pizza CreatePizza(String orderType) {
        Pizza pizza = null;
        try {

            if ("cheese".equals(orderType))
                pizza = new CheesePizza();
            if ("greek".equals(orderType))
                pizza = new GreekPizza();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return pizza;

    }

}
