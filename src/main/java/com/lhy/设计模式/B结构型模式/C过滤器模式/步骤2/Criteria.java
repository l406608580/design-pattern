package com.lhy.设计模式.B结构型模式.C过滤器模式.步骤2;

import com.lhy.设计模式.B结构型模式.C过滤器模式.步骤1.Person;

import java.util.List;

/**
 * 为标准（Criteria）创建一个接口
 *
 * @author hy.Li
 * @date 2020/8/25 13:18
 */
public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
