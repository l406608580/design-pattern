package com.lhy.设计模式.B结构型模式.G享元模式.步骤2;

import com.lhy.设计模式.B结构型模式.G享元模式.步骤1.Shape;

/**
 * @author hy.Li
 * @date 2020/8/25 13:39
 */
public class Circle implements Shape {
    private String color;
    private int x;
    private int y;
    private int radius;

    public Circle(String color){
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle: Draw() [Color : " + color
                +", x : " + x +", y :" + y +", radius :" + radius);
    }
}
