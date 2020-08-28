package com.lhy.设计模式.D_J2EE模式.E前端控制器模式.步骤3;

import com.lhy.设计模式.D_J2EE模式.E前端控制器模式.步骤2.Dispatcher;

/**
 * @author hy.Li
 * @date 2020/8/25 15:07
 */
public class FrontController {

    private Dispatcher dispatcher;

    public FrontController(){
        dispatcher = new Dispatcher();
    }

    private boolean isAuthenticUser(){
        System.out.println("User is authenticated successfully.");
        return true;
    }

    private void trackRequest(String request){
        System.out.println("Page requested: " + request);
    }

    public void dispatchRequest(String request){
        //记录每一个请求
        trackRequest(request);
        //对用户进行身份验证
        if(isAuthenticUser()){
            dispatcher.dispatch(request);
        }
    }
}
