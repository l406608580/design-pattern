package com.lhy.设计模式.C行为型模式.E中介者模式;

import com.lhy.设计模式.C行为型模式.E中介者模式.步骤2.User;

/**
 * @author hy.Li
 * @date 2020/8/25 14:10
 */
public class MediatorPatternDemo {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
