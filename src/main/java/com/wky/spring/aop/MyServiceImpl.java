package com.wky.spring.aop;

/**
 * 目标类实现类
 * @author: wangkunyang
 * @date 2022/03/27 16:39
 */
//@Service
public class MyServiceImpl implements MyService {

    public void test() {
        System.out.println("test jdk dynamic proxy");
    }

}
