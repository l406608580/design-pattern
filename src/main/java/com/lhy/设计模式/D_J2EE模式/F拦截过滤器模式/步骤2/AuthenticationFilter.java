package com.lhy.设计模式.D_J2EE模式.F拦截过滤器模式.步骤2;

import com.lhy.设计模式.D_J2EE模式.F拦截过滤器模式.步骤1.Filter;

/**
 * @author hy.Li
 * @date 2020/8/25 15:11
 */
public class AuthenticationFilter implements Filter {
    public void execute(String request){
        System.out.println("Authenticating request: " + request);
    }
}
