package com.lhy.设计模式.A创建型模式.D建造者模式;

import com.lhy.设计模式.A创建型模式.D建造者模式.步骤5.Meal;
import com.lhy.设计模式.A创建型模式.D建造者模式.步骤6.MealBuilder;

/**
 * BuiderPatternDemo 使用 MealBuider 来演示建造者模式（Builder Pattern）
 *
 * @author hy.Li
 * @date 2020/8/25 12:11
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " +vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " +nonVegMeal.getCost());
    }
}
