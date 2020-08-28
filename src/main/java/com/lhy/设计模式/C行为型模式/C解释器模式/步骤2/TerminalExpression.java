package com.lhy.设计模式.C行为型模式.C解释器模式.步骤2;

import com.lhy.设计模式.C行为型模式.C解释器模式.步骤1.Expression;

/**
 * @author hy.Li
 * @date 2020/8/25 13:59
 */
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data){
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if(context.contains(data)){
            return true;
        }
        return false;
    }
}
