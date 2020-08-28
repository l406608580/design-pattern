package com.lhy.设计模式.D_J2EE模式.C组合实体模式.步骤4;

import com.lhy.设计模式.D_J2EE模式.C组合实体模式.步骤3.CompositeEntity;

/**
 * @author hy.Li
 * @date 2020/8/25 14:58
 */
public class Client {
    private CompositeEntity compositeEntity = new CompositeEntity();

    public void printData(){
        for (int i = 0; i < compositeEntity.getData().length; i++) {
            System.out.println("Data: " + compositeEntity.getData()[i]);
        }
    }

    public void setData(String data1, String data2){
        compositeEntity.setData(data1, data2);
    }
}
