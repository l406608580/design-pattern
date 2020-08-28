package com.lhy.设计模式.C行为型模式.A责任链模式;

import com.lhy.设计模式.C行为型模式.A责任链模式.步骤1.AbstractLogger;
import com.lhy.设计模式.C行为型模式.A责任链模式.步骤2.ConsoleLogger;
import com.lhy.设计模式.C行为型模式.A责任链模式.步骤2.ErrorLogger;
import com.lhy.设计模式.C行为型模式.A责任链模式.步骤2.FileLogger;

/**
 * @author hy.Li
 * @date 2020/8/25 13:49
 */
public class ChainPatternDemo {

    private static AbstractLogger getChainOfLoggers(){

        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");

        loggerChain.logMessage(AbstractLogger.DEBUG,
                "This is a debug level information.");

        loggerChain.logMessage(AbstractLogger.ERROR,
                "This is an error information.");
    }
}
