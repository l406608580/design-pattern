package com.lhy.设计模式.A创建型模式.D建造者模式.步骤6;

import com.lhy.设计模式.A创建型模式.D建造者模式.步骤4.ChickenBurger;
import com.lhy.设计模式.A创建型模式.D建造者模式.步骤4.Coke;
import com.lhy.设计模式.A创建型模式.D建造者模式.步骤4.Pepsi;
import com.lhy.设计模式.A创建型模式.D建造者模式.步骤4.VegBurger;
import com.lhy.设计模式.A创建型模式.D建造者模式.步骤5.Meal;

/**
 * 创建一个 MealBuilder 类，实际的 builder 类负责创建 Meal 对象
 *
 * @author hy.Li
 * @date 2020/8/25 12:11
 */
public class MealBuilder {

    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
