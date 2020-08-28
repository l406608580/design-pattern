package com.lhy.设计模式.B结构型模式.A适配器模式;

import com.lhy.设计模式.B结构型模式.A适配器模式.步骤4.AudioPlayer;

/**
 * 使用 AudioPlayer 来播放不同类型的音频格式
 *
 * @author hy.Li
 * @date 2020/8/25 13:10
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}
