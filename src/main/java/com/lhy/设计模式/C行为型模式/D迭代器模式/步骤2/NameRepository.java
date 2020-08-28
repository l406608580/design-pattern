package com.lhy.设计模式.C行为型模式.D迭代器模式.步骤2;

import com.lhy.设计模式.C行为型模式.D迭代器模式.步骤1.Container;
import com.lhy.设计模式.C行为型模式.D迭代器模式.步骤1.Iterator;

/**
 * @author hy.Li
 * @date 2020/8/25 14:04
 */
public class NameRepository implements Container {
    public String names[] = {"Robert" , "John" ,"Julie" , "Lora"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {
            if(index < names.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return names[index++];
            }
            return null;
        }
    }
}
