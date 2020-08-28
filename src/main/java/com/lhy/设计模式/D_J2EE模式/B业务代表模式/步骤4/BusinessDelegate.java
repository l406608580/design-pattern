package com.lhy.设计模式.D_J2EE模式.B业务代表模式.步骤4;

import com.lhy.设计模式.D_J2EE模式.B业务代表模式.步骤1.BusinessService;
import com.lhy.设计模式.D_J2EE模式.B业务代表模式.步骤3.BusinessLookUp;

/**
 * @author hy.Li
 * @date 2020/8/25 14:55
 */
public class BusinessDelegate {
    private BusinessLookUp lookupService = new BusinessLookUp();
    private BusinessService businessService;
    private String serviceType;

    public void setServiceType(String serviceType){
        this.serviceType = serviceType;
    }

    public void doTask(){
        businessService = lookupService.getBusinessService(serviceType);
        businessService.doProcessing();
    }
}
