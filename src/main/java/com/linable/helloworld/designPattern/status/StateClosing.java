package com.linable.helloworld.designPattern.status;

/**
 * @author HangYang.Lin
 *         on 2017/6/6.
 */
public class StateClosing extends LiftState {

    @Override
    public void open() {
        super.context.setLiftState(Context.STATE_OPENNING);
        //动作委托为CloseState来执行
        super.context.getLiftState().open();
    }

    @Override
    public void close() {
        System.out.println("电梯门关闭...");
    }

    @Override
    public void run() {
        super.context.setLiftState(Context.STATE_RUNNING); //设置为运行状态；
        super.context.getLiftState().run();
    }

    @Override
    public void stop() {
        super.context.setLiftState(Context.STATE_STOPING);
        super.context.getLiftState().stop();
    }
}
