package com.lhy.设计模式.A创建型模式.B抽象工厂模式.步骤4;

import com.lhy.设计模式.A创建型模式.B抽象工厂模式.步骤3.Color;

/**
 * 创建实现接口的实体类。
 *
 * @author hy.Li
 * @date 2020/8/25 10:33
 */
public class Green implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
