package com.lhy.设计模式.A创建型模式.B抽象工厂模式.步骤2;

import com.lhy.设计模式.A创建型模式.B抽象工厂模式.步骤1.Shape;

/**
 * 创建实现接口的实体类。
 *
 * @author hy.Li
 * @date 2020/8/25 10:32
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
