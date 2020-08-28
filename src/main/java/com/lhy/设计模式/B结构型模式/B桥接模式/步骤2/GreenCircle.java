package com.lhy.设计模式.B结构型模式.B桥接模式.步骤2;

import com.lhy.设计模式.B结构型模式.B桥接模式.步骤1.DrawAPI;

/**
 * @author hy.Li
 * @date 2020/8/25 13:14
 */
public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
