package com.wky.spring.dao.impl;

import com.wky.spring.bean.Student;
import com.wky.spring.dao.StudentDao;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author: wangkunyang
 * @date 2022/04/19 13:23
 */
public class StudentDaoImpl implements StudentDao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void saveStudent(Student student) {
        String sql = "insert into student(name, age) values(?, ?)";
        jdbcTemplate.update(sql, student.getName(), student.getAge());
    }

}
