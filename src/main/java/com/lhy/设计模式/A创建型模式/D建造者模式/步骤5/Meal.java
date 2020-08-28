package com.lhy.设计模式.A创建型模式.D建造者模式.步骤5;

/**
 * 创建一个 Meal 类，带有上面定义的 Item 对象
 *
 * @author hy.Li
 * @date 2020/8/25 12:10
 */
import com.lhy.设计模式.A创建型模式.D建造者模式.步骤1.Item;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems(){
        for (Item item : items) {
            System.out.print("Item : "+item.name());
            System.out.print(", Packing : "+item.packing().pack());
            System.out.println(", Price : "+item.price());
        }
    }
}
