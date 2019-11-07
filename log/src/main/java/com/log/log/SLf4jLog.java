package com.log.log;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by bxguo on 2019/11/5 21:16
 */
public class SLf4jLog {
    public static void main(String[] args) {
        Logger log = LoggerFactory.getLogger("SLf4jLog");
        log.info("slf4j");
    }
}
