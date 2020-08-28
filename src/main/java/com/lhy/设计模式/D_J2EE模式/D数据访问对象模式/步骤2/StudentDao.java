package com.lhy.设计模式.D_J2EE模式.D数据访问对象模式.步骤2;

import com.lhy.设计模式.D_J2EE模式.D数据访问对象模式.步骤1.Student;

import java.util.List;

/**
 * @author hy.Li
 * @date 2020/8/25 15:02
 */
public interface StudentDao {
    public List<Student> getAllStudents();
    public Student getStudent(int rollNo);
    public void updateStudent(Student student);
    public void deleteStudent(Student student);
}
