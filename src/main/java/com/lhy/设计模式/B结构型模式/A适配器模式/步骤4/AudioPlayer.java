package com.lhy.设计模式.B结构型模式.A适配器模式.步骤4;

import com.lhy.设计模式.B结构型模式.A适配器模式.步骤1.MediaPlayer;
import com.lhy.设计模式.B结构型模式.A适配器模式.步骤3.MediaAdapter;

/**
 * 创建实现了 MediaPlayer 接口的实体类
 *
 * @author hy.Li
 * @date 2020/8/25 13:09
 */
public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {

        //播放 mp3 音乐文件的内置支持
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file. Name: "+ fileName);
        }
        //mediaAdapter 提供了播放其他文件格式的支持
        else if(audioType.equalsIgnoreCase("vlc")
                || audioType.equalsIgnoreCase("mp4")){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }
        else{
            System.out.println("Invalid media. "+
                    audioType + " format not supported");
        }
    }
}
