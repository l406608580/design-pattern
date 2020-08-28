package com.lhy.设计模式.C行为型模式.I空对象模式.步骤3;

import com.lhy.设计模式.C行为型模式.I空对象模式.步骤1.AbstractCustomer;
import com.lhy.设计模式.C行为型模式.I空对象模式.步骤2.NullCustomer;
import com.lhy.设计模式.C行为型模式.I空对象模式.步骤2.RealCustomer;

/**
 * @author hy.Li
 * @date 2020/8/25 14:29
 */
public class CustomerFactory {

    public static final String[] names = {"Rob", "Joe", "Julie"};

    public static AbstractCustomer getCustomer(String name){
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name)){
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}
