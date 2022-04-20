package com.wky.spring.aop;

import java.lang.reflect.Proxy;

/**
 * jdk动态代理案例
 * @author: wangkunyang
 * @date 2022/03/27 16:37
 */
public class JdkDynamicProxyDemo {


    public static void main(String[] args) {
        MyService target = new MyServiceImpl();
        // 在生成代理实例的时候，必须指定一个handler，由它去进行增强以及执行目标类的方法
        MyService proxyObject = (MyService) Proxy.newProxyInstance(MyServiceImpl.class.getClassLoader(),
                new Class[] {MyService.class}, new MyInvocationHandler(target));
        // 代理实例
        proxyObject.test();

    }

}
