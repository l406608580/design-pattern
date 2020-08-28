package com.lhy.设计模式.C行为型模式.E中介者模式.步骤1;

import com.lhy.设计模式.C行为型模式.E中介者模式.步骤2.User;

import java.util.Date;

/**
 * @author hy.Li
 * @date 2020/8/25 14:09
 */
public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString()
                + " [" + user.getName() +"] : " + message);
    }
}
