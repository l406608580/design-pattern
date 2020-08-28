package com.lhy.设计模式.C行为型模式.B命令模式.步骤3;

import com.lhy.设计模式.C行为型模式.B命令模式.步骤1.Order;
import com.lhy.设计模式.C行为型模式.B命令模式.步骤2.Stock;

/**
 * @author hy.Li
 * @date 2020/8/25 13:55
 */
public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }
}
