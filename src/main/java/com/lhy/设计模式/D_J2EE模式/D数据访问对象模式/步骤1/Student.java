package com.lhy.设计模式.D_J2EE模式.D数据访问对象模式.步骤1;

/**
 * @author hy.Li
 * @date 2020/8/25 15:02
 */
public class Student {
    private String name;
    private int rollNo;

    public Student(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}
