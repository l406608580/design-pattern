package com.lhy.设计模式.A创建型模式.E原型模式;

import com.lhy.设计模式.A创建型模式.E原型模式.步骤1.Shape;
import com.lhy.设计模式.A创建型模式.E原型模式.步骤3.ShapeCache;

/**
 * PrototypePatternDemo 使用 ShapeCache 类来获取存储在 Hashtable 中的形状的克隆
 *
 * @author hy.Li
 * @date 2020/8/25 13:01
 */
public class PrototypePatternDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());

        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());
    }
}
