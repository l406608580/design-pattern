package com.lhy.设计模式.C行为型模式.E中介者模式.步骤2;

import com.lhy.设计模式.C行为型模式.E中介者模式.步骤1.ChatRoom;

/**
 * @author hy.Li
 * @date 2020/8/25 14:09
 */
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name){
        this.name  = name;
    }

    public void sendMessage(String message){
        ChatRoom.showMessage(this,message);
    }
}
