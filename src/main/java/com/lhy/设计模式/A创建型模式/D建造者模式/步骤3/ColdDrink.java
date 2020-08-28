package com.lhy.设计模式.A创建型模式.D建造者模式.步骤3;

import com.lhy.设计模式.A创建型模式.D建造者模式.步骤1.Item;
import com.lhy.设计模式.A创建型模式.D建造者模式.步骤1.Packing;
import com.lhy.设计模式.A创建型模式.D建造者模式.步骤2.Bottle;

/**
 * 创建实现 Item 接口的抽象类，该类提供了默认的功能
 *
 * @author hy.Li
 * @date 2020/8/25 12:08
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
