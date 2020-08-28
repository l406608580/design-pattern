package com.lhy.设计模式.B结构型模式.C过滤器模式;

import com.lhy.设计模式.B结构型模式.C过滤器模式.步骤1.Person;
import com.lhy.设计模式.B结构型模式.C过滤器模式.步骤2.Criteria;
import com.lhy.设计模式.B结构型模式.C过滤器模式.步骤3.AndCriteria;
import com.lhy.设计模式.B结构型模式.C过滤器模式.步骤3.CriteriaFemale;
import com.lhy.设计模式.B结构型模式.C过滤器模式.步骤3.CriteriaMale;
import com.lhy.设计模式.B结构型模式.C过滤器模式.步骤3.CriteriaSingle;
import com.lhy.设计模式.B结构型模式.C过滤器模式.步骤3.OrCriteria;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hy.Li
 * @date 2020/8/25 13:21
 */
public class CriteriaPatternDemo {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();

        persons.add(new Person("Robert","Male", "Single"));
        persons.add(new Person("John","Male", "Married"));
        persons.add(new Person("Laura","Female", "Married"));
        persons.add(new Person("Diana","Female", "Single"));
        persons.add(new Person("Mike","Male", "Single"));
        persons.add(new Person("Bobby","Male", "Single"));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(single, male);
        Criteria singleOrFemale = new OrCriteria(single, female);

        System.out.println("Males: ");
        printPersons(male.meetCriteria(persons));

        System.out.println("\nFemales: ");
        printPersons(female.meetCriteria(persons));

        System.out.println("\nSingle Males: ");
        printPersons(singleMale.meetCriteria(persons));

        System.out.println("\nSingle Or Females: ");
        printPersons(singleOrFemale.meetCriteria(persons));
    }

    public static void printPersons(List<Person> persons){
        for (Person person : persons) {
            System.out.println("Person : [ Name : " + person.getName()
                    +", Gender : " + person.getGender()
                    +", Marital Status : " + person.getMaritalStatus()
                    +" ]");
        }
    }
}
