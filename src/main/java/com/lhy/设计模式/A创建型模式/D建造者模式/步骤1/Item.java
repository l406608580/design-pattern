package com.lhy.设计模式.A创建型模式.D建造者模式.步骤1;

/**
 * 创建一个表示食物条目和食物包装的接口
 *
 * @author hy.Li
 * @date 2020/8/25 12:06
 */
public interface Item {
    public String name();
    public Packing packing();
    public float price();
}
