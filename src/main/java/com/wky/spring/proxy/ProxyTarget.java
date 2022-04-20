package com.wky.spring.proxy;

import java.util.Objects;

/**
 * @author: wangkunyang
 * @date 2022/04/09 17:36
 */
public class ProxyTarget implements Target {

    /**
     * 对目标对象的引用
     */
    private RealTarget realTarget;

    public ProxyTarget(RealTarget realTarget) {
        this.realTarget = realTarget;
    }

    @Override
    public void myRequest() {
        this.beforeRequest();
        if (Objects.isNull(realTarget)) {
            realTarget = new RealTarget();
        }
        realTarget.myRequest();
        this.afterRequest();
    }

    private void beforeRequest() {
        System.out.println("before request");
    }

    private void afterRequest() {
        System.out.println("after request");
    }

}
