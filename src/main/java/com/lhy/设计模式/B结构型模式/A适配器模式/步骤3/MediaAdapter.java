package com.lhy.设计模式.B结构型模式.A适配器模式.步骤3;

import com.lhy.设计模式.B结构型模式.A适配器模式.步骤1.AdvancedMediaPlayer;
import com.lhy.设计模式.B结构型模式.A适配器模式.步骤1.MediaPlayer;
import com.lhy.设计模式.B结构型模式.A适配器模式.步骤2.Mp4Player;
import com.lhy.设计模式.B结构型模式.A适配器模式.步骤2.VlcPlayer;

/**
 * 创建实现了 MediaPlayer 接口的适配器类
 *
 * @author hy.Li
 * @date 2020/8/25 13:09
 */
public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("vlc") ){
            advancedMusicPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMusicPlayer.playVlc(fileName);
        }else if(audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer.playMp4(fileName);
        }
    }
}
