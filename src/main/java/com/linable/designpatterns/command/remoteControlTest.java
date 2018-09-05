package com.linable.designpatterns.command;

/**
 * @author HangYang.Lin
 *         on 2018-06-08.
 */
public class remoteControlTest {

    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);
        remote.setCommand(lightOn);
        remote.buttonWasPressed();
    }
}