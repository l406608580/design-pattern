package com.lhy.设计模式.C行为型模式.H状态模式;

import com.lhy.设计模式.C行为型模式.H状态模式.步骤2.StartState;
import com.lhy.设计模式.C行为型模式.H状态模式.步骤2.StopState;
import com.lhy.设计模式.C行为型模式.H状态模式.步骤3.Context;

/**
 * @author hy.Li
 * @date 2020/8/25 14:26
 */
public class StatePatternDemo {
    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}
