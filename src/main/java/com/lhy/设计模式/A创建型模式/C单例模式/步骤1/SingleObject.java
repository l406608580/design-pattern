package com.lhy.设计模式.A创建型模式.C单例模式.步骤1;

/**
 * 创建一个 Singleton 类。
 *
 * @author hy.Li
 * @date 2020/8/25 11:39
 */
public class SingleObject {

    //创建 SingleObject 的一个对象
    private static SingleObject instance = new SingleObject();

    //让构造函数为 private，这样该类就不会被实例化
    private SingleObject(){}

    //获取唯一可用的对象
    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}
