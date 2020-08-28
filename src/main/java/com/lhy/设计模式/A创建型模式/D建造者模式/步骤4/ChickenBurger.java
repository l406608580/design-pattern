package com.lhy.设计模式.A创建型模式.D建造者模式.步骤4;

import com.lhy.设计模式.A创建型模式.D建造者模式.步骤3.Burger;

/**
 * 创建扩展了 Burger 和 ColdDrink 的实体类
 *
 * @author hy.Li
 * @date 2020/8/25 12:09
 */
public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}
