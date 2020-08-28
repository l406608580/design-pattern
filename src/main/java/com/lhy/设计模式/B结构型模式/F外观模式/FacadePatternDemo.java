package com.lhy.设计模式.B结构型模式.F外观模式;

import com.lhy.设计模式.B结构型模式.F外观模式.步骤3.ShapeMaker;

/**
 * @author hy.Li
 * @date 2020/8/25 13:36
 */
public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
