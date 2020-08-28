package com.lhy.设计模式.B结构型模式.G享元模式.步骤3;

import com.lhy.设计模式.B结构型模式.G享元模式.步骤1.Shape;
import com.lhy.设计模式.B结构型模式.G享元模式.步骤2.Circle;

import java.util.HashMap;

/**
 * @author hy.Li
 * @date 2020/8/25 13:40
 */
public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle)circleMap.get(color);

        if(circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}
