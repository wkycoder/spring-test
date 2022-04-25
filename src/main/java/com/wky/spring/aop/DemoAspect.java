package com.wky.spring.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author: wangkunyang
 * @date 2022/04/22 16:16
 */
@Aspect
@Component
public class DemoAspect {


    @Before("execution(* com.wky.spring..*.*(..))")
    public void before() {
        System.out.println("before...");
    }

    @After("execution(* com.wky.spring.service.*.*(..))")
    public void after() {
        System.out.println("after...");
    }


}
