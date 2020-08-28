package com.lhy.设计模式.C行为型模式.A责任链模式.步骤2;

import com.lhy.设计模式.C行为型模式.A责任链模式.步骤1.AbstractLogger;

/**
 * @author hy.Li
 * @date 2020/8/25 13:49
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
