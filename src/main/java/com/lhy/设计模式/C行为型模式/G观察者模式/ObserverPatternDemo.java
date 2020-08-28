package com.lhy.设计模式.C行为型模式.G观察者模式;

import com.lhy.设计模式.C行为型模式.G观察者模式.步骤1.Subject;
import com.lhy.设计模式.C行为型模式.G观察者模式.步骤3.BinaryObserver;
import com.lhy.设计模式.C行为型模式.G观察者模式.步骤3.HexaObserver;
import com.lhy.设计模式.C行为型模式.G观察者模式.步骤3.OctalObserver;

/**
 * @author hy.Li
 * @date 2020/8/25 14:19
 */
public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
