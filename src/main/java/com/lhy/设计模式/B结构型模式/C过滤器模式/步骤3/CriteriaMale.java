package com.lhy.设计模式.B结构型模式.C过滤器模式.步骤3;

import com.lhy.设计模式.B结构型模式.C过滤器模式.步骤1.Person;
import com.lhy.设计模式.B结构型模式.C过滤器模式.步骤2.Criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建实现了 Criteria 接口的实体类
 *
 * @author hy.Li
 * @date 2020/8/25 13:19
 */
public class CriteriaMale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("MALE")){
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
