package com.lhy.设计模式.A创建型模式.E原型模式.步骤1;

/**
 * 创建一个实现了 Cloneable 接口的抽象类
 *
 * @author hy.Li
 * @date 2020/8/25 12:58
 */
public abstract class Shape implements Cloneable {

    private String id;
    protected String type;

    protected abstract void draw();

    public String getType(){
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
