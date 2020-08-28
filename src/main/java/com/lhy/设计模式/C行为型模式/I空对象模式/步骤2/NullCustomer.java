package com.lhy.设计模式.C行为型模式.I空对象模式.步骤2;

import com.lhy.设计模式.C行为型模式.I空对象模式.步骤1.AbstractCustomer;

/**
 * @author hy.Li
 * @date 2020/8/25 14:29
 */
public class NullCustomer extends AbstractCustomer {

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }

    @Override
    public boolean isNil() {
        return true;
    }
}
