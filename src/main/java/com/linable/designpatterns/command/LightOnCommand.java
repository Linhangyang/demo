package com.linable.designpatterns.command;

/**
 * @author HangYang.Lin
 *         on 2018-06-08.
 */
public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

}
