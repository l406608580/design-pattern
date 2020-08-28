package com.lhy.设计模式.C行为型模式.C解释器模式;

import com.lhy.设计模式.C行为型模式.C解释器模式.步骤1.Expression;
import com.lhy.设计模式.C行为型模式.C解释器模式.步骤2.AndExpression;
import com.lhy.设计模式.C行为型模式.C解释器模式.步骤2.OrExpression;
import com.lhy.设计模式.C行为型模式.C解释器模式.步骤2.TerminalExpression;

/**
 * @author hy.Li
 * @date 2020/8/25 14:00
 */
public class InterpreterPatternDemo {

    //规则：Robert 和 John 是男性
    public static Expression getMaleExpression(){
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    //规则：Julie 是一个已婚的女性
    public static Expression getMarriedWomanExpression(){
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }

    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        System.out.println("John is male? " + isMale.interpret("John"));
        System.out.println("Julie is a married women? "
                + isMarriedWoman.interpret("Married Julie"));
    }
}
