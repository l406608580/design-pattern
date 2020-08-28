package com.lhy.设计模式.B结构型模式.E装饰器模式.步骤3;

import com.lhy.设计模式.B结构型模式.E装饰器模式.步骤1.Shape;

/**
 * 创建实现了 Shape 接口的抽象装饰类
 *
 * @author hy.Li
 * @date 2020/8/25 13:29
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        decoratedShape.draw();
    }
}
