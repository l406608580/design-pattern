package com.lhy.设计模式.C行为型模式.L访问者模式.步骤4;

import com.lhy.设计模式.C行为型模式.L访问者模式.步骤2.Computer;
import com.lhy.设计模式.C行为型模式.L访问者模式.步骤2.Keyboard;
import com.lhy.设计模式.C行为型模式.L访问者模式.步骤2.Monitor;
import com.lhy.设计模式.C行为型模式.L访问者模式.步骤2.Mouse;
import com.lhy.设计模式.C行为型模式.L访问者模式.步骤3.ComputerPartVisitor;

/**
 * @author hy.Li
 * @date 2020/8/25 14:43
 */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

    @Override
    public void visit(Computer computer) {
        System.out.println("Displaying Computer.");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Displaying Mouse.");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Displaying Keyboard.");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Displaying Monitor.");
    }
}
