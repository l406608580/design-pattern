package com.lhy.设计模式.D_J2EE模式.F拦截过滤器模式.步骤4;

import com.lhy.设计模式.D_J2EE模式.F拦截过滤器模式.步骤1.Filter;
import com.lhy.设计模式.D_J2EE模式.F拦截过滤器模式.步骤3.Target;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hy.Li
 * @date 2020/8/25 15:12
 */
public class FilterChain {
    private List<Filter> filters = new ArrayList<Filter>();
    private Target target;

    public void addFilter(Filter filter){
        filters.add(filter);
    }

    public void execute(String request){
        for (Filter filter : filters) {
            filter.execute(request);
        }
        target.execute(request);
    }

    public void setTarget(Target target){
        this.target = target;
    }
}
