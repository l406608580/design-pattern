package com.lhy.设计模式.C行为型模式.B命令模式.步骤2;

/**
 * @author hy.Li
 * @date 2020/8/25 13:54
 */
public class Stock {

    private String name = "ABC";
    private int quantity = 10;

    public void buy(){
        System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] bought");
    }
    public void sell(){
        System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] sold");
    }
}
