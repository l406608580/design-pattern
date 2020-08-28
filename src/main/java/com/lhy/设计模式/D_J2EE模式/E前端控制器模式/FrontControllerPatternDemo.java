package com.lhy.设计模式.D_J2EE模式.E前端控制器模式;

import com.lhy.设计模式.D_J2EE模式.E前端控制器模式.步骤3.FrontController;

/**
 * @author hy.Li
 * @date 2020/8/25 15:08
 */
public class FrontControllerPatternDemo {
    public static void main(String[] args) {
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("HOME");
        frontController.dispatchRequest("STUDENT");
    }
}
