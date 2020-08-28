package com.lhy.设计模式.D_J2EE模式.G服务定位器模式.步骤2;

import com.lhy.设计模式.D_J2EE模式.G服务定位器模式.步骤1.Service;

/**
 * @author hy.Li
 * @date 2020/8/25 15:17
 */
public class Service2 implements Service {
    public void execute(){
        System.out.println("Executing Service2");
    }

    @Override
    public String getName() {
        return "Service2";
    }
}
