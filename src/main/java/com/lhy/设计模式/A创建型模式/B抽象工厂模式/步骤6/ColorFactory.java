package com.lhy.设计模式.A创建型模式.B抽象工厂模式.步骤6;

import com.lhy.设计模式.A创建型模式.B抽象工厂模式.步骤1.Shape;
import com.lhy.设计模式.A创建型模式.B抽象工厂模式.步骤3.Color;
import com.lhy.设计模式.A创建型模式.B抽象工厂模式.步骤4.Blue;
import com.lhy.设计模式.A创建型模式.B抽象工厂模式.步骤4.Green;
import com.lhy.设计模式.A创建型模式.B抽象工厂模式.步骤4.Red;
import com.lhy.设计模式.A创建型模式.B抽象工厂模式.步骤5.AbstractFactory;

/**
 * 创建扩展了 AbstractFactory 的工厂类，基于给定的信息生成实体类的对象
 *
 * @author hy.Li
 * @date 2020/8/25 10:35
 */
public class ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType){
        return null;
    }

    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        } else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }
}
