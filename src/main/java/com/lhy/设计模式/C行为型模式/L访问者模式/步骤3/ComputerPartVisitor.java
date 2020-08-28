package com.lhy.设计模式.C行为型模式.L访问者模式.步骤3;

import com.lhy.设计模式.C行为型模式.L访问者模式.步骤2.Computer;
import com.lhy.设计模式.C行为型模式.L访问者模式.步骤2.Keyboard;
import com.lhy.设计模式.C行为型模式.L访问者模式.步骤2.Monitor;
import com.lhy.设计模式.C行为型模式.L访问者模式.步骤2.Mouse;

/**
 * @author hy.Li
 * @date 2020/8/25 14:43
 */
public interface ComputerPartVisitor {
    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
}
