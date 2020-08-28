package com.lhy.设计模式.B结构型模式.C过滤器模式.步骤3;

import com.lhy.设计模式.B结构型模式.C过滤器模式.步骤1.Person;
import com.lhy.设计模式.B结构型模式.C过滤器模式.步骤2.Criteria;

import java.util.List;

/**
 * @author hy.Li
 * @date 2020/8/25 13:20
 */
public class OrCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaItems = criteria.meetCriteria(persons);
        List<Person> otherCriteriaItems = otherCriteria.meetCriteria(persons);

        for (Person person : otherCriteriaItems) {
            if(!firstCriteriaItems.contains(person)){
                firstCriteriaItems.add(person);
            }
        }
        return firstCriteriaItems;
    }
}
