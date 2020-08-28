package com.lhy.设计模式.C行为型模式.L访问者模式;

import com.lhy.设计模式.C行为型模式.L访问者模式.步骤1.ComputerPart;
import com.lhy.设计模式.C行为型模式.L访问者模式.步骤2.Computer;
import com.lhy.设计模式.C行为型模式.L访问者模式.步骤4.ComputerPartDisplayVisitor;

/**
 * @author hy.Li
 * @date 2020/8/25 14:44
 */
public class VisitorPatternDemo {
    public static void main(String[] args) {

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
