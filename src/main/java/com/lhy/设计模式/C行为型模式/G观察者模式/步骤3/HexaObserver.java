package com.lhy.设计模式.C行为型模式.G观察者模式.步骤3;

import com.lhy.设计模式.C行为型模式.G观察者模式.步骤1.Subject;
import com.lhy.设计模式.C行为型模式.G观察者模式.步骤2.Observer;

/**
 * @author hy.Li
 * @date 2020/8/25 14:19
 */
public class HexaObserver extends Observer {

    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Hex String: "
                + Integer.toHexString( subject.getState() ).toUpperCase() );
    }
}
