package com.lhy.设计模式.D_J2EE模式.A_MVC模式.步骤3;

import com.lhy.设计模式.D_J2EE模式.A_MVC模式.步骤1.Student;
import com.lhy.设计模式.D_J2EE模式.A_MVC模式.步骤2.StudentView;

/**
 * @author hy.Li
 * @date 2020/8/25 14:50
 */
public class StudentController {
    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view){
        this.model = model;
        this.view = view;
    }

    public void setStudentName(String name){
        model.setName(name);
    }

    public String getStudentName(){
        return model.getName();
    }

    public void setStudentRollNo(String rollNo){
        model.setRollNo(rollNo);
    }

    public String getStudentRollNo(){
        return model.getRollNo();
    }

    public void updateView(){
        view.printStudentDetails(model.getName(), model.getRollNo());
    }
}
