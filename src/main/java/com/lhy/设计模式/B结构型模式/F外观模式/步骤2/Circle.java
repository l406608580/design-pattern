package com.lhy.设计模式.B结构型模式.F外观模式.步骤2;

import com.lhy.设计模式.B结构型模式.F外观模式.步骤1.Shape;

/**
 * @author hy.Li
 * @date 2020/8/25 13:35
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}
