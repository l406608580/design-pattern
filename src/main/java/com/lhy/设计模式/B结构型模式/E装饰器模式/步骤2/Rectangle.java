package com.lhy.设计模式.B结构型模式.E装饰器模式.步骤2;

import com.lhy.设计模式.B结构型模式.E装饰器模式.步骤1.Shape;

/**
 * 创建实现接口的实体类
 *
 * @author hy.Li
 * @date 2020/8/25 13:28
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
