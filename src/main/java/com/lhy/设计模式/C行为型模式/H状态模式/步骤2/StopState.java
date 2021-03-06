package com.lhy.设计模式.C行为型模式.H状态模式.步骤2;

import com.lhy.设计模式.C行为型模式.H状态模式.步骤1.State;
import com.lhy.设计模式.C行为型模式.H状态模式.步骤3.Context;

/**
 * @author hy.Li
 * @date 2020/8/25 14:26
 */
public class StopState implements State {

    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    public String toString(){
        return "Stop State";
    }
}
