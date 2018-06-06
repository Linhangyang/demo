package com.linable.helloworld.designPattern.memento;

/**
 * @author HangYang.Lin
 *         on 2017/6/13.
 */
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
