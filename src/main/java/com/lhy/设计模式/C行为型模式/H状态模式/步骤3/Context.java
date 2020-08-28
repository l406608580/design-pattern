package com.lhy.设计模式.C行为型模式.H状态模式.步骤3;

import com.lhy.设计模式.C行为型模式.H状态模式.步骤1.State;

/**
 * @author hy.Li
 * @date 2020/8/25 14:24
 */
public class Context {
    private State state;

    public Context(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}
