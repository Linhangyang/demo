package com.linable.helloworld.designPattern.status;

/**
 * @author HangYang.Lin
 *         on 2017/6/6.
 */
public class Client {

    public static void main(String[] args) {
        Context context = new Context();
        context.setLiftState(new StateClosing());
        context.open();
        context.close();
        context.run();
        context.stop();
    }
}
