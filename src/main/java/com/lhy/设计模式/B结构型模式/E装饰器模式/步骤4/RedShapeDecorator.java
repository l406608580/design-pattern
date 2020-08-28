package com.lhy.设计模式.B结构型模式.E装饰器模式.步骤4;

import com.lhy.设计模式.B结构型模式.E装饰器模式.步骤1.Shape;
import com.lhy.设计模式.B结构型模式.E装饰器模式.步骤3.ShapeDecorator;

/**
 * 创建扩展了 ShapeDecorator 类的实体装饰类
 *
 * @author hy.Li
 * @date 2020/8/25 13:29
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }
}
