package com.lhy.设计模式.A创建型模式.B抽象工厂模式.步骤6;

import com.lhy.设计模式.A创建型模式.B抽象工厂模式.步骤1.Shape;
import com.lhy.设计模式.A创建型模式.B抽象工厂模式.步骤2.Circle;
import com.lhy.设计模式.A创建型模式.B抽象工厂模式.步骤2.Rectangle;
import com.lhy.设计模式.A创建型模式.B抽象工厂模式.步骤2.Square;
import com.lhy.设计模式.A创建型模式.B抽象工厂模式.步骤3.Color;
import com.lhy.设计模式.A创建型模式.B抽象工厂模式.步骤5.AbstractFactory;

/**
 * 创建扩展了 AbstractFactory 的工厂类，基于给定的信息生成实体类的对象
 *
 * @author hy.Li
 * @date 2020/8/25 10:35
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
