package com.linable.helloworld.designPattern.status;

/**
 * @author HangYang.Lin
 *         on 2017/6/6.
 */
public class Context {

    //定义出所有的电梯状态
    public final static StateOpening STATE_OPENNING = new StateOpening();
    public final static StateClosing STATE_CLOSING = new StateClosing();
    public final static StateRunning STATE_RUNNING = new StateRunning();
    public final static StateStoping STATE_STOPING = new StateStoping();

    //定一个当前电梯状态
    private LiftState liftState;

    public LiftState getLiftState() {
        return liftState;
    }

    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
        //把当前的环境通知到各个实现类中
        this.liftState.setContext(this);
    }

    public void open() {
        liftState.open();
    }

    public void close() {
        liftState.close();
    }

    public void run() {
        liftState.run();
    }

    public void stop() {
        liftState.stop();
    }

}
