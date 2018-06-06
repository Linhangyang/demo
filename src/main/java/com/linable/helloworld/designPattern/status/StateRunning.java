package com.linable.helloworld.designPattern.status;

/**
 * @author HangYang.Lin
 *         on 2017/6/6.
 */
public class StateRunning extends LiftState{

    @Override
    public void open() {
    }

    @Override
    public void close() {
    }

    @Override
    public void run() {
        System.out.println("电梯上下跑...");
    }

    @Override
    public void stop() {
        super.context.setLiftState(Context.STATE_STOPING);
        super.context.stop();
    }
}
