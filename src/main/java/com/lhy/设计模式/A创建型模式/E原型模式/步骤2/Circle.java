package com.lhy.设计模式.A创建型模式.E原型模式.步骤2;

import com.lhy.设计模式.A创建型模式.E原型模式.步骤1.Shape;

/**
 * @author hy.Li
 * @date 2020/8/25 12:59
 */
public class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
