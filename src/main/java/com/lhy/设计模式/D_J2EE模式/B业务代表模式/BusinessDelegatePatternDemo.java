package com.lhy.设计模式.D_J2EE模式.B业务代表模式;

import com.lhy.设计模式.D_J2EE模式.B业务代表模式.步骤4.BusinessDelegate;
import com.lhy.设计模式.D_J2EE模式.B业务代表模式.步骤5.Client;

/**
 * @author hy.Li
 * @date 2020/8/25 14:55
 */
public class BusinessDelegatePatternDemo {

    public static void main(String[] args) {

        BusinessDelegate businessDelegate = new BusinessDelegate();
        businessDelegate.setServiceType("EJB");

        Client client = new Client(businessDelegate);
        client.doTask();

        businessDelegate.setServiceType("JMS");
        client.doTask();
    }
}
