package com.lhy.设计模式.A创建型模式.E原型模式.步骤3;

/**
 * @author hy.Li
 * @date 2020/8/25 13:00
 */
import com.lhy.设计模式.A创建型模式.E原型模式.步骤1.Shape;
import com.lhy.设计模式.A创建型模式.E原型模式.步骤2.Circle;
import com.lhy.设计模式.A创建型模式.E原型模式.步骤2.Rectangle;
import com.lhy.设计模式.A创建型模式.E原型模式.步骤2.Square;

import java.util.Hashtable;

public class ShapeCache {

    private static Hashtable<String, Shape> shapeMap
            = new Hashtable<String, Shape>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    // 对每种形状都运行数据库查询，并创建该形状
    // shapeMap.put(shapeKey, shape);
    // 例如，我们要添加三种形状
    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(),rectangle);
    }
}
