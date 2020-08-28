package com.lhy.设计模式.B结构型模式.F外观模式.步骤3;

import com.lhy.设计模式.B结构型模式.F外观模式.步骤1.Shape;
import com.lhy.设计模式.B结构型模式.F外观模式.步骤2.Circle;
import com.lhy.设计模式.B结构型模式.F外观模式.步骤2.Rectangle;
import com.lhy.设计模式.B结构型模式.F外观模式.步骤2.Square;

/**
 * @author hy.Li
 * @date 2020/8/25 13:35
 */
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
}
