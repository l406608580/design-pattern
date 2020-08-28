package com.lhy.设计模式.B结构型模式.B桥接模式.步骤3;

import com.lhy.设计模式.B结构型模式.B桥接模式.步骤1.DrawAPI;

/**
 * 使用 DrawAPI 接口创建抽象类 Shape
 *
 * @author hy.Li
 * @date 2020/8/25 13:14
 */
public abstract class Shape {
    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}
