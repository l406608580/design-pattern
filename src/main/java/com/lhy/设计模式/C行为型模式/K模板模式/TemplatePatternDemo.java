package com.lhy.设计模式.C行为型模式.K模板模式;

import com.lhy.设计模式.C行为型模式.K模板模式.步骤1.Game;
import com.lhy.设计模式.C行为型模式.K模板模式.步骤2.Cricket;
import com.lhy.设计模式.C行为型模式.K模板模式.步骤2.Football;

/**
 * @author hy.Li
 * @date 2020/8/25 14:37
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {

        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
