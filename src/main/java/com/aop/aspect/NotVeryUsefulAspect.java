package com.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by bxguo on 2019/10/28 22:52
 */
@Component
@Aspect
public class NotVeryUsefulAspect {

    @Pointcut("execution(* com.aop.dao.*.*(..))") // the pointcut expression
    public void anyOldTransfer() {} // the pointcut signature

    @Before("anyOldTransfer()")
    public void beforeAdvice(){
        System.out.println("before");
    }

}
