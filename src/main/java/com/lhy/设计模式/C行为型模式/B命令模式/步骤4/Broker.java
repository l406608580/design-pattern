package com.lhy.设计模式.C行为型模式.B命令模式.步骤4;

import com.lhy.设计模式.C行为型模式.B命令模式.步骤1.Order;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hy.Li
 * @date 2020/8/25 13:55
 */
public class Broker {
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
