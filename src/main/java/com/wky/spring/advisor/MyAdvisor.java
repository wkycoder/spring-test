package com.wky.spring.advisor;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @author: wangkunyang
 * @date 2022/03/27 19:27
 */
//@Component
public class MyAdvisor implements MethodInterceptor {

    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("before myAdvisor");
        Object result = invocation.proceed();
        System.out.println("after myAdvisor");
        return result;
    }
}
