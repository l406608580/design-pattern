package com.lhy.设计模式.D_J2EE模式.G服务定位器模式.步骤3;

import com.lhy.设计模式.D_J2EE模式.G服务定位器模式.步骤2.Service1;
import com.lhy.设计模式.D_J2EE模式.G服务定位器模式.步骤2.Service2;

/**
 * @author hy.Li
 * @date 2020/8/25 15:17
 */
public class InitialContext {
    public Object lookup(String jndiName){
        if(jndiName.equalsIgnoreCase("SERVICE1")){
            System.out.println("Looking up and creating a new Service1 object");
            return new Service1();
        }else if (jndiName.equalsIgnoreCase("SERVICE2")){
            System.out.println("Looking up and creating a new Service2 object");
            return new Service2();
        }
        return null;
    }
}
