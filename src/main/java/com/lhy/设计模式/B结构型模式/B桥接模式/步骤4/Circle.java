package com.lhy.设计模式.B结构型模式.B桥接模式.步骤4;

import com.lhy.设计模式.B结构型模式.B桥接模式.步骤1.DrawAPI;
import com.lhy.设计模式.B结构型模式.B桥接模式.步骤3.Shape;

/**
 * 创建实现了 Shape 接口的实体类
 *
 * @author hy.Li
 * @date 2020/8/25 13:15
 */
public class Circle extends Shape {
    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void draw() {
        drawAPI.drawCircle(radius,x,y);
    }
}
