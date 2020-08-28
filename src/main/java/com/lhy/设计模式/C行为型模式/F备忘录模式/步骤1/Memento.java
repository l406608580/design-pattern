package com.lhy.设计模式.C行为型模式.F备忘录模式.步骤1;

/**
 * @author hy.Li
 * @date 2020/8/25 14:13
 */
public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}
