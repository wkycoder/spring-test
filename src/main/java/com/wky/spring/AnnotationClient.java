package com.wky.spring;

import com.wky.spring.aop.MyService;
import com.wky.spring.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: wangkunyang
 * @date 2022/04/23 10:05
 */
public class AnnotationClient {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        MyService myService = (MyService) applicationContext.getBean("myServiceImpl");
        myService.test();
    }

}
