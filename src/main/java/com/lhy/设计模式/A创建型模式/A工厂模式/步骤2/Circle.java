package com.lhy.设计模式.A创建型模式.A工厂模式.步骤2;

import com.lhy.设计模式.A创建型模式.A工厂模式.步骤1.Shape;

/**
 * 创建实现接口的实体类。
 * @author hy.Li
 * @date 2020/8/24 17:24
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
