package com.lhy.设计模式.D_J2EE模式.G服务定位器模式.步骤4;

import com.lhy.设计模式.D_J2EE模式.G服务定位器模式.步骤1.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hy.Li
 * @date 2020/8/25 15:17
 */
public class Cache {

    private List<Service> services;

    public Cache(){
        services = new ArrayList<Service>();
    }

    public Service getService(String serviceName){
        for (Service service : services) {
            if(service.getName().equalsIgnoreCase(serviceName)){
                System.out.println("Returning cached  "+serviceName+" object");
                return service;
            }
        }
        return null;
    }

    public void addService(Service newService){
        boolean exists = false;
        for (Service service : services) {
            if(service.getName().equalsIgnoreCase(newService.getName())){
                exists = true;
            }
        }
        if(!exists){
            services.add(newService);
        }
    }
}
