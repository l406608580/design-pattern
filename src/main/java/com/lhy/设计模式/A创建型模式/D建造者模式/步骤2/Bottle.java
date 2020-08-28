package com.lhy.设计模式.A创建型模式.D建造者模式.步骤2;

import com.lhy.设计模式.A创建型模式.D建造者模式.步骤1.Packing;

/**
 * 创建实现 Packing 接口的实体类
 *
 * @author hy.Li
 * @date 2020/8/25 12:07
 */
public class Bottle implements Packing {

    @Override
    public String pack() {
        return "Bottle";
    }
}
