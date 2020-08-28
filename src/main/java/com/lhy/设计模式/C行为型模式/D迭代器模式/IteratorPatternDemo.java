package com.lhy.设计模式.C行为型模式.D迭代器模式;

import com.lhy.设计模式.C行为型模式.D迭代器模式.步骤1.Iterator;
import com.lhy.设计模式.C行为型模式.D迭代器模式.步骤2.NameRepository;

/**
 * @author hy.Li
 * @date 2020/8/25 14:05
 */
public class IteratorPatternDemo {

    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
