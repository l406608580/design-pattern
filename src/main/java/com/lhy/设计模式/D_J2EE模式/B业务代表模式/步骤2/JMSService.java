package com.lhy.设计模式.D_J2EE模式.B业务代表模式.步骤2;

import com.lhy.设计模式.D_J2EE模式.B业务代表模式.步骤1.BusinessService;

/**
 * @author hy.Li
 * @date 2020/8/25 14:54
 */
public class JMSService implements BusinessService {

    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking JMS Service");
    }
}
