package com.lhy.设计模式.B结构型模式.H代理模式;

import com.lhy.设计模式.B结构型模式.H代理模式.步骤1.Image;
import com.lhy.设计模式.B结构型模式.H代理模式.步骤2.ProxyImage;

/**
 * @author hy.Li
 * @date 2020/8/25 13:45
 */
public class ProxyPatternDemo {

    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        // 图像将从磁盘加载
        image.display();
        System.out.println("");
        // 图像不需要从磁盘加载
        image.display();
    }
}
