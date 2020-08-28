package com.lhy.设计模式.C行为型模式.G观察者模式.步骤3;

import com.lhy.设计模式.C行为型模式.G观察者模式.步骤1.Subject;
import com.lhy.设计模式.C行为型模式.G观察者模式.步骤2.Observer;

/**
 * @author hy.Li
 * @date 2020/8/25 14:18
 */
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Binary String: "
                + Integer.toBinaryString( subject.getState() ) );
    }
}
