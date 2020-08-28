package com.lhy.设计模式.C行为型模式.B命令模式;

import com.lhy.设计模式.C行为型模式.B命令模式.步骤2.Stock;
import com.lhy.设计模式.C行为型模式.B命令模式.步骤3.BuyStock;
import com.lhy.设计模式.C行为型模式.B命令模式.步骤3.SellStock;
import com.lhy.设计模式.C行为型模式.B命令模式.步骤4.Broker;

/**
 * @author hy.Li
 * @date 2020/8/25 13:55
 */
public class CommandPatternDemo {
    public static void main(String[] args) {
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}
