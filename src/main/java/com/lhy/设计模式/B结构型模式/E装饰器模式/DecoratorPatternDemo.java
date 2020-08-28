package com.lhy.设计模式.B结构型模式.E装饰器模式;

import com.lhy.设计模式.B结构型模式.E装饰器模式.步骤1.Shape;
import com.lhy.设计模式.B结构型模式.E装饰器模式.步骤2.Circle;
import com.lhy.设计模式.B结构型模式.E装饰器模式.步骤2.Rectangle;
import com.lhy.设计模式.B结构型模式.E装饰器模式.步骤3.ShapeDecorator;
import com.lhy.设计模式.B结构型模式.E装饰器模式.步骤4.RedShapeDecorator;

/**
 * 使用 RedShapeDecorator 来装饰 Shape 对象
 *
 * @author hy.Li
 * @date 2020/8/25 13:30
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {

        Shape circle = new Circle();
        ShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        ShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());
        //Shape redCircle = new RedShapeDecorator(new Circle());
        //Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
