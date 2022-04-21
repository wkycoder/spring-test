package com.wky.spring.service.impl;

import com.wky.spring.bean.Student;
import com.wky.spring.dao.StudentDao;
import com.wky.spring.service.StudentService;

/**
 * @author: wangkunyang
 * @date 2022/04/19 13:24
 */
public class StudentServiceImpl implements StudentService {

    private StudentDao studentDao;

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public void saveStudent(Student student) {
        studentDao.saveStudent(student);
//        int i = 1 / 0;
    }
}
