package com.lhy.设计模式.B结构型模式.A适配器模式.步骤2;

import com.lhy.设计模式.B结构型模式.A适配器模式.步骤1.AdvancedMediaPlayer;

/**
 * 创建实现了 AdvancedMediaPlayer 接口的实体类
 *
 * @author hy.Li
 * @date 2020/8/25 13:08
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //什么也不做
    }
}
