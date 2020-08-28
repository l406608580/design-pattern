package com.lhy.设计模式.B结构型模式.H代理模式.步骤2;

import com.lhy.设计模式.B结构型模式.H代理模式.步骤1.Image;

/**
 * @author hy.Li
 * @date 2020/8/25 13:44
 */
public class ProxyImage implements Image {

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
