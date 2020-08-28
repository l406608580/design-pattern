package com.lhy.设计模式.D_J2EE模式.H传输对象模式;

import com.lhy.设计模式.D_J2EE模式.H传输对象模式.步骤1.StudentVO;
import com.lhy.设计模式.D_J2EE模式.H传输对象模式.步骤2.StudentBO;

/**
 * @author hy.Li
 * @date 2020/8/25 15:21
 */
public class TransferObjectPatternDemo {
    public static void main(String[] args) {
        StudentBO studentBusinessObject = new StudentBO();

        //输出所有的学生
        for (StudentVO student : studentBusinessObject.getAllStudents()) {
            System.out.println("Student: [RollNo : "
                    +student.getRollNo()+", Name : "+student.getName()+" ]");
        }

        //更新学生
        StudentVO student =studentBusinessObject.getAllStudents().get(0);
        student.setName("Michael");
        studentBusinessObject.updateStudent(student);

        //获取学生
        studentBusinessObject.getStudent(0);
        System.out.println("Student: [RollNo : "
                +student.getRollNo()+", Name : "+student.getName()+" ]");
    }
}
