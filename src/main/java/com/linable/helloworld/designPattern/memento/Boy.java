package com.linable.helloworld.designPattern.memento;

/**
 * @author HangYang.Lin
 *         on 2017/6/13.
 */
public class Boy {

    private String state;

    public void changeState(){
        this.state = "心情可能很不好";
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    //保留一个备份
    public Memento createMemento(){
        return new Memento(this.state);
    }
    //恢复一个备份
    public void restoreMemento(Memento _memento){
        this.setState(_memento.getState());
    }

}
