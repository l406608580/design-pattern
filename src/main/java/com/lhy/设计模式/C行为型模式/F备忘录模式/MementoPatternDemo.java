package com.lhy.设计模式.C行为型模式.F备忘录模式;

import com.lhy.设计模式.C行为型模式.F备忘录模式.步骤2.Originator;
import com.lhy.设计模式.C行为型模式.F备忘录模式.步骤3.CareTaker;

/**
 * @author hy.Li
 * @date 2020/8/25 14:14
 */
public class MementoPatternDemo {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        originator.setState("State #1");
        originator.setState("State #2");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #3");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #4");

        System.out.println("Current State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First saved State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second saved State: " + originator.getState());
    }
}
