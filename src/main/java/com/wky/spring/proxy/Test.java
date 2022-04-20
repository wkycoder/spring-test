package com.wky.spring.proxy;

/**
 * @author: wangkunyang
 * @date 2022/04/09 18:13
 */
public class Test {


    public static void main(String[] args) {

        RealTarget realTarget = new RealTarget();
        ProxyTarget proxyTarget = new ProxyTarget(realTarget);
        proxyTarget.myRequest();

    }


}
