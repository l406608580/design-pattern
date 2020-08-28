package com.lhy.设计模式.C行为型模式.K模板模式.步骤2;

import com.lhy.设计模式.C行为型模式.K模板模式.步骤1.Game;

/**
 * @author hy.Li
 * @date 2020/8/25 14:37
 */
public class Cricket extends Game {

    @Override
    public void endPlay() {
        System.out.println("Cricket Game Finished!");
    }

    @Override
    public void initialize() {
        System.out.println("Cricket Game Initialized! Start playing.");
    }

    @Override
    public void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }
}
