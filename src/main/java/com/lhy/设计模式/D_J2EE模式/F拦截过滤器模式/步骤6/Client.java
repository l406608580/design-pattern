package com.lhy.设计模式.D_J2EE模式.F拦截过滤器模式.步骤6;

import com.lhy.设计模式.D_J2EE模式.F拦截过滤器模式.步骤5.FilterManager;

/**
 * @author hy.Li
 * @date 2020/8/25 15:13
 */
public class Client {
    FilterManager filterManager;

    public void setFilterManager(FilterManager filterManager){
        this.filterManager = filterManager;
    }

    public void sendRequest(String request){
        filterManager.filterRequest(request);
    }
}
