package com.lhy.设计模式.B结构型模式.G享元模式;

import com.lhy.设计模式.B结构型模式.G享元模式.步骤2.Circle;
import com.lhy.设计模式.B结构型模式.G享元模式.步骤3.ShapeFactory;

/**
 * @author hy.Li
 * @date 2020/8/25 13:40
 */
public class FlyweightPatternDemo {
    private static final String colors[] =
            { "Red", "Green", "Blue", "White", "Black" };
    public static void main(String[] args) {

        for(int i=0; i < 20; ++i) {
            Circle circle =
                    (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }
    private static String getRandomColor() {
        return colors[(int)(Math.random()*colors.length)];
    }
    private static int getRandomX() {
        return (int)(Math.random()*100 );
    }
    private static int getRandomY() {
        return (int)(Math.random()*100);
    }
}
