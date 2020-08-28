package com.lhy.设计模式.A创建型模式.B抽象工厂模式.步骤7;

import com.lhy.设计模式.A创建型模式.B抽象工厂模式.步骤5.AbstractFactory;
import com.lhy.设计模式.A创建型模式.B抽象工厂模式.步骤6.ColorFactory;
import com.lhy.设计模式.A创建型模式.B抽象工厂模式.步骤6.ShapeFactory;

/**
 * 创建一个工厂创造器/生成器类，通过传递形状或颜色信息来获取工厂
 *
 * @author hy.Li
 * @date 2020/8/25 10:36
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        } else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}
