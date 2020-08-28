package com.lhy.设计模式.D_J2EE模式.E前端控制器模式.步骤2;

import com.lhy.设计模式.D_J2EE模式.E前端控制器模式.步骤1.HomeView;
import com.lhy.设计模式.D_J2EE模式.E前端控制器模式.步骤1.StudentView;

/**
 * @author hy.Li
 * @date 2020/8/25 15:07
 */
public class Dispatcher {
    private StudentView studentView;
    private HomeView homeView;
    public Dispatcher(){
        studentView = new StudentView();
        homeView = new HomeView();
    }

    public void dispatch(String request){
        if(request.equalsIgnoreCase("STUDENT")){
            studentView.show();
        }else{
            homeView.show();
        }
    }
}
