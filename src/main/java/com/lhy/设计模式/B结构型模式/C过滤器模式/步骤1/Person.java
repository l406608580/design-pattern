package com.lhy.设计模式.B结构型模式.C过滤器模式.步骤1;

/**
 * 创建一个类，在该类上应用标准
 *
 * @author hy.Li
 * @date 2020/8/25 13:18
 */
public class Person {

    private String name;
    private String gender;
    private String maritalStatus;

    public Person(String name,String gender,String maritalStatus){
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }

    public String getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }
    public String getMaritalStatus() {
        return maritalStatus;
    }
}
