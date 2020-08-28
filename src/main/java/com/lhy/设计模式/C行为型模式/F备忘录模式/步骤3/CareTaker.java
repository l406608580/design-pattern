package com.lhy.设计模式.C行为型模式.F备忘录模式.步骤3;

import com.lhy.设计模式.C行为型模式.F备忘录模式.步骤1.Memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hy.Li
 * @date 2020/8/25 14:14
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}
