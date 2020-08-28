package com.lhy.设计模式.D_J2EE模式.D数据访问对象模式;

import com.lhy.设计模式.D_J2EE模式.D数据访问对象模式.步骤1.Student;
import com.lhy.设计模式.D_J2EE模式.D数据访问对象模式.步骤2.StudentDao;
import com.lhy.设计模式.D_J2EE模式.D数据访问对象模式.步骤3.StudentDaoImpl;

/**
 * @author hy.Li
 * @date 2020/8/25 15:03
 */
public class DaoPatternDemo {
    public static void main(String[] args) {
        StudentDao studentDao = new StudentDaoImpl();

        //输出所有的学生
        for (Student student : studentDao.getAllStudents()) {
            System.out.println("Student: [RollNo : "
                    +student.getRollNo()+", Name : "+student.getName()+" ]");
        }


        //更新学生
        Student student =studentDao.getAllStudents().get(0);
        student.setName("Michael");
        studentDao.updateStudent(student);

        //获取学生
        studentDao.getStudent(0);
        System.out.println("Student: [RollNo : "
                +student.getRollNo()+", Name : "+student.getName()+" ]");
    }
}
