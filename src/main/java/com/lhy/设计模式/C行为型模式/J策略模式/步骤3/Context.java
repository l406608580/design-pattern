package com.lhy.设计模式.C行为型模式.J策略模式.步骤3;

import com.lhy.设计模式.C行为型模式.J策略模式.步骤1.Strategy;

/**
 * @author hy.Li
 * @date 2020/8/25 14:34
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}
