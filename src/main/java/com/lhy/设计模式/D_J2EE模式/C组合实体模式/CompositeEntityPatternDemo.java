package com.lhy.设计模式.D_J2EE模式.C组合实体模式;

import com.lhy.设计模式.D_J2EE模式.C组合实体模式.步骤4.Client;

/**
 * @author hy.Li
 * @date 2020/8/25 14:59
 */
public class CompositeEntityPatternDemo {
    public static void main(String[] args) {
        Client client = new Client();
        client.setData("Test", "Data");
        client.printData();
        client.setData("Second Test", "Data1");
        client.printData();
    }
}
