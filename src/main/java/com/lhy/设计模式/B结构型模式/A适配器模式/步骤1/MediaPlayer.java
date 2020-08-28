package com.lhy.设计模式.B结构型模式.A适配器模式.步骤1;

/**
 * 为媒体播放器和更高级的媒体播放器创建接口
 *
 * @author hy.Li
 * @date 2020/8/25 13:08
 */
public interface MediaPlayer {
    public void play(String audioType, String fileName);
}
