package com.lhy.设计模式.A创建型模式.E原型模式.步骤2;

import com.lhy.设计模式.A创建型模式.E原型模式.步骤1.Shape;

/**
 * 创建扩展了上面抽象类的实体类
 *
 * @author hy.Li
 * @date 2020/8/25 12:58
 */
public class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
