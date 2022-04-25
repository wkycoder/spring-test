package com.wky.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author: wangkunyang
 * @date 2022/04/23 10:06
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.wky.spring")
public class MainConfig {

}
