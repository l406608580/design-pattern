package com.lhy.设计模式.B结构型模式.B桥接模式;

import com.lhy.设计模式.B结构型模式.B桥接模式.步骤2.GreenCircle;
import com.lhy.设计模式.B结构型模式.B桥接模式.步骤2.RedCircle;
import com.lhy.设计模式.B结构型模式.B桥接模式.步骤3.Shape;
import com.lhy.设计模式.B结构型模式.B桥接模式.步骤4.Circle;

/**
 * 使用 Shape 和 DrawAPI 类画出不同颜色的圆
 *
 * @author hy.Li
 * @date 2020/8/25 13:15
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
