package com.lhy.设计模式.C行为型模式.C解释器模式.步骤2;

import com.lhy.设计模式.C行为型模式.C解释器模式.步骤1.Expression;

/**
 * @author hy.Li
 * @date 2020/8/25 13:59
 */
public class OrExpression implements Expression {

    private Expression expr1 = null;
    private Expression expr2 = null;

    public OrExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpret(String context) {
        return expr1.interpret(context) || expr2.interpret(context);
    }
}
