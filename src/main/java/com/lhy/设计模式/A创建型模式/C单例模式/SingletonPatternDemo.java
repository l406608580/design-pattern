package com.lhy.设计模式.A创建型模式.C单例模式;

import com.lhy.设计模式.A创建型模式.C单例模式.步骤1.SingleObject;

/**
 * 从 singleton 类获取唯一的对象
 * @author hy.Li
 * @date 2020/8/25 11:40
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {

        //不合法的构造函数
        //编译时错误：构造函数 SingleObject() 是不可见的
        //SingleObject object = new SingleObject();

        //获取唯一可用的对象
        SingleObject object = SingleObject.getInstance();

        //显示消息
        object.showMessage();
    }
}
