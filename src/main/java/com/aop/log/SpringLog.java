package com.aop.log;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Created by bxguo on 2019/11/5 21:16
 */
public class SpringLog {
    public static void main(String[] args) {
        Log log = LogFactory.getLog("spring");
        log.info("spring");
    }
}
