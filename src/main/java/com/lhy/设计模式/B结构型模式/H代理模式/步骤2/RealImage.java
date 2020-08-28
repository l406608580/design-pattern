package com.lhy.设计模式.B结构型模式.H代理模式.步骤2;

import com.lhy.设计模式.B结构型模式.H代理模式.步骤1.Image;

/**
 * @author hy.Li
 * @date 2020/8/25 13:44
 */
public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading " + fileName);
    }
}
