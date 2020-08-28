package com.lhy.设计模式.A创建型模式.D建造者模式.步骤4;

import com.lhy.设计模式.A创建型模式.D建造者模式.步骤3.Burger;

/**
 * @author hy.Li
 * @date 2020/8/25 12:09
 */
public class VegBurger extends Burger {

    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}
