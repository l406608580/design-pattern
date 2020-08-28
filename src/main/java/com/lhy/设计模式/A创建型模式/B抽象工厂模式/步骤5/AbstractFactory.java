package com.lhy.设计模式.A创建型模式.B抽象工厂模式.步骤5;

import com.lhy.设计模式.A创建型模式.B抽象工厂模式.步骤1.Shape;
import com.lhy.设计模式.A创建型模式.B抽象工厂模式.步骤3.Color;

/**
 * 为 Color 和 Shape 对象创建抽象类来获取工厂
 *
 * @author hy.Li
 * @date 2020/8/25 10:34
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape) ;
}
