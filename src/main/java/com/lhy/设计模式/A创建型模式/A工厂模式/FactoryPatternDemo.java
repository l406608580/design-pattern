package com.lhy.设计模式.A创建型模式.A工厂模式;

import com.lhy.设计模式.A创建型模式.A工厂模式.步骤1.Shape;
import com.lhy.设计模式.A创建型模式.A工厂模式.步骤3.ShapeFactory;

/**
 * 使用该工厂，通过传递类型信息来获取实体类的对象。
 *
 * @author hy.Li
 * @date 2020/8/24 17:25
 */
public class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        //获取 Circle 的对象，并调用它的 draw 方法
        Shape shape1 = shapeFactory.getShape("CIRCLE");

        //调用 Circle 的 draw 方法
        shape1.draw();

        //获取 Rectangle 的对象，并调用它的 draw 方法
        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        //调用 Rectangle 的 draw 方法
        shape2.draw();

        //获取 Square 的对象，并调用它的 draw 方法
        Shape shape3 = shapeFactory.getShape("SQUARE");

        //调用 Square 的 draw 方法
        shape3.draw();
    }
}
