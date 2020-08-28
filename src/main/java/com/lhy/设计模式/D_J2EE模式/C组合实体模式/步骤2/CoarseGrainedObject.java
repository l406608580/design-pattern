package com.lhy.设计模式.D_J2EE模式.C组合实体模式.步骤2;

import com.lhy.设计模式.D_J2EE模式.C组合实体模式.步骤1.DependentObject1;
import com.lhy.设计模式.D_J2EE模式.C组合实体模式.步骤1.DependentObject2;

/**
 * @author hy.Li
 * @date 2020/8/25 14:58
 */
public class CoarseGrainedObject {
    DependentObject1 do1 = new DependentObject1();
    DependentObject2 do2 = new DependentObject2();

    public void setData(String data1, String data2){
        do1.setData(data1);
        do2.setData(data2);
    }

    public String[] getData(){
        return new String[] {do1.getData(),do2.getData()};
    }
}
