package com.lhy.设计模式.C行为型模式.L访问者模式.步骤2;

import com.lhy.设计模式.C行为型模式.L访问者模式.步骤1.ComputerPart;
import com.lhy.设计模式.C行为型模式.L访问者模式.步骤3.ComputerPartVisitor;

/**
 * @author hy.Li
 * @date 2020/8/25 14:43
 */
public class Computer implements ComputerPart {

    ComputerPart[] parts;

    public Computer(){
        parts = new ComputerPart[] {new Mouse(), new Keyboard(), new Monitor()};
    }


    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
