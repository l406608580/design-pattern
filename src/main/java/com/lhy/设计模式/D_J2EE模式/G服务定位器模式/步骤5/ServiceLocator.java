package com.lhy.设计模式.D_J2EE模式.G服务定位器模式.步骤5;

import com.lhy.设计模式.D_J2EE模式.G服务定位器模式.步骤1.Service;
import com.lhy.设计模式.D_J2EE模式.G服务定位器模式.步骤3.InitialContext;
import com.lhy.设计模式.D_J2EE模式.G服务定位器模式.步骤4.Cache;

/**
 * @author hy.Li
 * @date 2020/8/25 15:18
 */
public class ServiceLocator {
    private static Cache cache;

    static {
        cache = new Cache();
    }

    public static Service getService(String jndiName){

        Service service = cache.getService(jndiName);

        if(service != null){
            return service;
        }

        InitialContext context = new InitialContext();
        Service service1 = (Service)context.lookup(jndiName);
        cache.addService(service1);
        return service1;
    }
}
