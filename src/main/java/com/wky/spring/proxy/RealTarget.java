package com.wky.spring.proxy;

/**
 * @author: wangkunyang
 * @date 2022/04/09 17:35
 */
public class RealTarget implements Target {

    @Override
    public void myRequest() {
        System.out.println("my request");
    }
}
