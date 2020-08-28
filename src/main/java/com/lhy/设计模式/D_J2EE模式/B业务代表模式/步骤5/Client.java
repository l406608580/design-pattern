package com.lhy.设计模式.D_J2EE模式.B业务代表模式.步骤5;

import com.lhy.设计模式.D_J2EE模式.B业务代表模式.步骤4.BusinessDelegate;

/**
 * @author hy.Li
 * @date 2020/8/25 14:55
 */
public class Client {

    BusinessDelegate businessService;

    public Client(BusinessDelegate businessService){
        this.businessService  = businessService;
    }

    public void doTask(){
        businessService.doTask();
    }
}
