package com.lhy.设计模式.D_J2EE模式.A_MVC模式;

import com.lhy.设计模式.D_J2EE模式.A_MVC模式.步骤1.Student;
import com.lhy.设计模式.D_J2EE模式.A_MVC模式.步骤2.StudentView;
import com.lhy.设计模式.D_J2EE模式.A_MVC模式.步骤3.StudentController;

/**
 * @author hy.Li
 * @date 2020/8/25 14:51
 */
public class MVCPatternDemo {
    public static void main(String[] args) {

        //从数据库获取学生记录
        Student model  = retrieveStudentFromDatabase();

        //创建一个视图：把学生详细信息输出到控制台
        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        controller.updateView();

        //更新模型数据
        controller.setStudentName("John");

        controller.updateView();
    }

    private static Student retrieveStudentFromDatabase(){
        Student student = new Student();
        student.setName("Robert");
        student.setRollNo("10");
        return student;
    }
}
