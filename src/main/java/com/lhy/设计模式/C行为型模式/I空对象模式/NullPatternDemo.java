package com.lhy.设计模式.C行为型模式.I空对象模式;

import com.lhy.设计模式.C行为型模式.I空对象模式.步骤1.AbstractCustomer;
import com.lhy.设计模式.C行为型模式.I空对象模式.步骤3.CustomerFactory;

/**
 * @author hy.Li
 * @date 2020/8/25 14:29
 */
public class NullPatternDemo {
    public static void main(String[] args) {

        AbstractCustomer customer1 = CustomerFactory.getCustomer("Rob");
        AbstractCustomer customer2 = CustomerFactory.getCustomer("Bob");
        AbstractCustomer customer3 = CustomerFactory.getCustomer("Julie");
        AbstractCustomer customer4 = CustomerFactory.getCustomer("Laura");

        System.out.println("Customers");
        System.out.println(customer1.getName());
        System.out.println(customer2.getName());
        System.out.println(customer3.getName());
        System.out.println(customer4.getName());
    }
}
