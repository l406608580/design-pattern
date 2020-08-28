package com.lhy.设计模式.C行为型模式.J策略模式;

import com.lhy.设计模式.C行为型模式.J策略模式.步骤2.OperationAdd;
import com.lhy.设计模式.C行为型模式.J策略模式.步骤2.OperationMultiply;
import com.lhy.设计模式.C行为型模式.J策略模式.步骤2.OperationSubtract;
import com.lhy.设计模式.C行为型模式.J策略模式.步骤3.Context;

/**
 * @author hy.Li
 * @date 2020/8/25 14:34
 */
public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubtract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}
