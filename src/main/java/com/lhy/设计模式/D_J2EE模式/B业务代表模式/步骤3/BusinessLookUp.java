package com.lhy.设计模式.D_J2EE模式.B业务代表模式.步骤3;

import com.lhy.设计模式.D_J2EE模式.B业务代表模式.步骤1.BusinessService;
import com.lhy.设计模式.D_J2EE模式.B业务代表模式.步骤2.EJBService;
import com.lhy.设计模式.D_J2EE模式.B业务代表模式.步骤2.JMSService;

/**
 * @author hy.Li
 * @date 2020/8/25 14:55
 */
public class BusinessLookUp {
    public BusinessService getBusinessService(String serviceType){
        if(serviceType.equalsIgnoreCase("EJB")){
            return new EJBService();
        }else {
            return new JMSService();
        }
    }
}
