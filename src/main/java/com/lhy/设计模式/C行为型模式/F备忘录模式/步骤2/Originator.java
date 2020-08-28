package com.lhy.设计模式.C行为型模式.F备忘录模式.步骤2;

import com.lhy.设计模式.C行为型模式.F备忘录模式.步骤1.Memento;

/**
 * @author hy.Li
 * @date 2020/8/25 14:13
 */
public class Originator {
    private String state;

    public void setState(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }

    public Memento saveStateToMemento(){
        return new Memento(state);
    }

    public void getStateFromMemento(Memento Memento){
        state = Memento.getState();
    }
}
