package com.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Log {
    private static final Logger logger = LoggerFactory.getLogger(Log.class);
    public void printLog(){
        System.out.println("打印日志！@！@！@！");
    }
}
