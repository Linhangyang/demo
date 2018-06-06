package com.linable.designpatterns.methodFactory;

import com.linable.designpatterns.simplefactory.CheesePizza;
import com.linable.designpatterns.simplefactory.Pizza;

/**
 * @author HangYang.Lin
 *         on 2018-05-31.
 */
public class CheesePizzaFactory implements PizzaFatory {

    /**
     * 工厂方法
     *
     * @return
     */
    @Override
    public Pizza createPizza() {
        return new CheesePizza();
    }

}
