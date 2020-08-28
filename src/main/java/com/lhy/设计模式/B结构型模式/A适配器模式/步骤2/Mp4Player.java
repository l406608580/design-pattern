package com.lhy.设计模式.B结构型模式.A适配器模式.步骤2;

import com.lhy.设计模式.B结构型模式.A适配器模式.步骤1.AdvancedMediaPlayer;

/**
 * @author hy.Li
 * @date 2020/8/25 13:08
 */
public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        //什么也不做
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
