package com.linable.helloworld.service;

/**
 * @author HangYang.Lin
 *         on 2017/5/23.
 */
public class PushContext {

    private Push push;

    public PushContext(Push push) {
        this.push = push;
    }

    public Boolean push() {
        return push.push();
    }



}
