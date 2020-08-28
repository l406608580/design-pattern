package com.lhy.设计模式.B结构型模式.C过滤器模式.步骤3;

import com.lhy.设计模式.B结构型模式.C过滤器模式.步骤1.Person;
import com.lhy.设计模式.B结构型模式.C过滤器模式.步骤2.Criteria;

import java.util.List;

/**
 * @author hy.Li
 * @date 2020/8/25 13:20
 */
public class AndCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
        return otherCriteria.meetCriteria(firstCriteriaPersons);
    }
}
