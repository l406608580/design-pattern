package com.lhy.设计模式.D_J2EE模式.C组合实体模式.步骤3;

import com.lhy.设计模式.D_J2EE模式.C组合实体模式.步骤2.CoarseGrainedObject;

/**
 * @author hy.Li
 * @date 2020/8/25 14:58
 */
public class CompositeEntity {
    private CoarseGrainedObject cgo = new CoarseGrainedObject();

    public void setData(String data1, String data2){
        cgo.setData(data1, data2);
    }

    public String[] getData(){
        return cgo.getData();
    }
}
