package com.wky.spring;

import com.wky.spring.aop.MyService;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * @author: wangkunyang
 * @date 2021/08/02 16:21
 */
public class Client {


    public static void main(String[] args) {
//        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
//        ((ClassPathXmlApplicationContext) ac).refresh();
        Resource resource = new ClassPathResource("applicationContext.xml");
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory);
        beanDefinitionReader.loadBeanDefinitions(resource);
        MyService myAop = (MyService) beanFactory.getBean("myAop");
        myAop.test();
        System.out.println("xxxxx");
        System.out.println(myAop.getClass().getSuperclass());

    }

}
