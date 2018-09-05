package com.linable.designpatterns.command;

/**
 * @author HangYang.Lin
 *         on 2018-06-08.
 */
public class SimpleRemoteControl {

    Command slot;

    public SimpleRemoteControl() {
    }

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }

}
