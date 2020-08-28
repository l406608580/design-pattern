package com.lhy.设计模式.C行为型模式.K模板模式.步骤1;

/**
 * @author hy.Li
 * @date 2020/8/25 14:37
 */
public abstract class Game {
    protected abstract void initialize();
    protected abstract void startPlay();
    protected abstract void endPlay();

    //模板
    public final void play(){

        //初始化游戏
        initialize();

        //开始游戏
        startPlay();

        //结束游戏
        endPlay();
    }
}
