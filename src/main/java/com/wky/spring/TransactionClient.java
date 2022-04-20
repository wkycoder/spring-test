package com.wky.spring;

import com.wky.spring.bean.Student;
import com.wky.spring.service.StudentService;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * @author: wangkunyang
 * @date 2022/04/20 09:01
 */
public class TransactionClient {

    public static void main(String[] args) {
        Resource resource = new ClassPathResource("applicationContext-tx.xml");
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory);
        beanDefinitionReader.loadBeanDefinitions(resource);
        StudentService studentService = (StudentService) beanFactory.getBean("studentServiceProxy");
        Student student = new Student();
        student.setName("zhangsan");
        student.setAge(18);
        studentService.saveStudent(student);
    }

}
