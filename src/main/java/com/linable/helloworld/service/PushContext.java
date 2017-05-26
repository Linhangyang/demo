package com.linable.helloworld.service;

import java.util.List;
import java.util.Map;

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
