package com.linable.designpatterns.methodFactory;

import com.linable.designpatterns.simplefactory.Pizza;

/**
 * @author HangYang.Lin
 *         on 2018-05-31.
 */
public interface PizzaFatory {

    /**
     * 工厂方法
     *
     * @return
     */
    Pizza createPizza();

}
