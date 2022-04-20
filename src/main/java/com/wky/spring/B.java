package com.wky.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author: wangkunyang
 * @date 2021/08/02 16:25
 */
@Component
public class B {

    @Autowired
    private A a;


}
