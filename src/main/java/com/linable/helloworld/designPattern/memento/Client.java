package com.linable.helloworld.designPattern.memento;

/**
 * @author HangYang.Lin
 *         on 2017/6/13.
 */
public class Client {

    public static void main(String[] args) {
        Boy boy = new Boy();
        boy.setState("心情很好");
        System.out.println(boy.getState());
        Memento memento = boy.createMemento();
        boy.changeState();
        System.out.println(boy.getState());
        Memento memento2 = boy.createMemento();
        boy.restoreMemento(memento);
        System.out.println(boy.getState());
        boy.restoreMemento(memento2);
        System.out.println(boy.getState());
    }
}
