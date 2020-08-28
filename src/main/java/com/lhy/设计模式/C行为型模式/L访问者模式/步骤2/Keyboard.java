package com.lhy.设计模式.C行为型模式.L访问者模式.步骤2;

import com.lhy.设计模式.C行为型模式.L访问者模式.步骤1.ComputerPart;
import com.lhy.设计模式.C行为型模式.L访问者模式.步骤3.ComputerPartVisitor;

/**
 * @author hy.Li
 * @date 2020/8/25 14:42
 */
public class Keyboard  implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
