package com.lhy.设计模式.C行为型模式.J策略模式.步骤2;

import com.lhy.设计模式.C行为型模式.J策略模式.步骤1.Strategy;

/**
 * @author hy.Li
 * @date 2020/8/25 14:33
 */
public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
