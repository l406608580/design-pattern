package com.lhy.设计模式.D_J2EE模式.F拦截过滤器模式;

import com.lhy.设计模式.D_J2EE模式.F拦截过滤器模式.步骤2.AuthenticationFilter;
import com.lhy.设计模式.D_J2EE模式.F拦截过滤器模式.步骤2.DebugFilter;
import com.lhy.设计模式.D_J2EE模式.F拦截过滤器模式.步骤3.Target;
import com.lhy.设计模式.D_J2EE模式.F拦截过滤器模式.步骤5.FilterManager;
import com.lhy.设计模式.D_J2EE模式.F拦截过滤器模式.步骤6.Client;

/**
 * @author hy.Li
 * @date 2020/8/25 15:13
 */
public class InterceptingFilterDemo {
    public static void main(String[] args) {
        FilterManager filterManager = new FilterManager(new Target());
        filterManager.setFilter(new AuthenticationFilter());
        filterManager.setFilter(new DebugFilter());

        Client client = new Client();
        client.setFilterManager(filterManager);
        client.sendRequest("HOME");
    }
}
