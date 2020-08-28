package com.lhy.设计模式.D_J2EE模式.G服务定位器模式;

import com.lhy.设计模式.D_J2EE模式.G服务定位器模式.步骤1.Service;
import com.lhy.设计模式.D_J2EE模式.G服务定位器模式.步骤5.ServiceLocator;

/**
 * @author hy.Li
 * @date 2020/8/25 15:18
 */
public class ServiceLocatorPatternDemo {
    public static void main(String[] args) {
        Service service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
        service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
    }
}
