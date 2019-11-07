package com.aop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by bxguo on 2019/10/28 22:44
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.aop")
public class AppConfig {

}
