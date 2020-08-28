package com.lhy.设计模式.D_J2EE模式.F拦截过滤器模式.步骤3;

/**
 * @author hy.Li
 * @date 2020/8/25 15:12
 */
public class Target {
    public void execute(String request){
        System.out.println("Executing request: " + request);
    }
}
