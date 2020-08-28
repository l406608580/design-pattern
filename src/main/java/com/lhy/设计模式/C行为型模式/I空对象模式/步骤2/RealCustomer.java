package com.lhy.设计模式.C行为型模式.I空对象模式.步骤2;

import com.lhy.设计模式.C行为型模式.I空对象模式.步骤1.AbstractCustomer;

/**
 * @author hy.Li
 * @date 2020/8/25 14:28
 */
public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isNil() {
        return false;
    }
}
