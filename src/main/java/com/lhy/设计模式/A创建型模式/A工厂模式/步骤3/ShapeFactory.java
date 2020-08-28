package com.lhy.设计模式.A创建型模式.A工厂模式.步骤3;

import com.lhy.设计模式.A创建型模式.A工厂模式.步骤1.Shape;
import com.lhy.设计模式.A创建型模式.A工厂模式.步骤2.Circle;
import com.lhy.设计模式.A创建型模式.A工厂模式.步骤2.Rectangle;
import com.lhy.设计模式.A创建型模式.A工厂模式.步骤2.Square;

/**
 * 创建一个工厂，生成基于给定信息的实体类的对象。
 * @author hy.Li
 * @date 2020/8/24 17:25
 */
public class ShapeFactory {

    //使用 getShape 方法获取形状类型的对象
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
}
