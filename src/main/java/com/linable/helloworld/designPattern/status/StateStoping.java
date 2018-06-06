package com.linable.helloworld.designPattern.status;

/**
 * @author HangYang.Lin
 *         on 2017/6/6.
 */
public class StateStoping extends LiftState{

    @Override
    public void open() {
        super.context.setLiftState(Context.STATE_OPENNING);
        super.context.open();
    }

    @Override
    public void close() {
    }

    @Override
    public void run() {
        super.context.setLiftState(Context.STATE_RUNNING);
        super.context.run();
    }

    @Override
    public void stop() {
        System.out.println("停止");
    }
}
