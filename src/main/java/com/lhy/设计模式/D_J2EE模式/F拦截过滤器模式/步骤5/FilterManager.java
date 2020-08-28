package com.lhy.设计模式.D_J2EE模式.F拦截过滤器模式.步骤5;

import com.lhy.设计模式.D_J2EE模式.F拦截过滤器模式.步骤1.Filter;
import com.lhy.设计模式.D_J2EE模式.F拦截过滤器模式.步骤3.Target;
import com.lhy.设计模式.D_J2EE模式.F拦截过滤器模式.步骤4.FilterChain;

/**
 * @author hy.Li
 * @date 2020/8/25 15:13
 */
public class FilterManager {
    FilterChain filterChain;

    public FilterManager(Target target){
        filterChain = new FilterChain();
        filterChain.setTarget(target);
    }
    public void setFilter(Filter filter){
        filterChain.addFilter(filter);
    }

    public void filterRequest(String request){
        filterChain.execute(request);
    }
}
