package com.example.springboot.learnjpaandhibernate.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.springboot.learnjpaandhibernate.Course;

@Repository
public class CourseRepository {
    
    @Autowired
    private JdbcTemplate jdbcTemplate;

    private static String INSERT_QUERY = """
            insert into course(id,name)
            values(?,?);
            """;
    private static String DELETE_QUERY = """
            delete from course where id = ?
            """;

    private static String SEARCH_QUERY = """
            select * from course where id = ?
            """;

    public void insert(Course course){
            jdbcTemplate.update(INSERT_QUERY, course.getId(),course.getName());
    }

    public void delete(long id){
        jdbcTemplate.update(DELETE_QUERY, id);
    }

    public Course findById(long id){
        return jdbcTemplate.queryForObject(SEARCH_QUERY, new BeanPropertyRowMapper<>(Course.class),id);
    }
    
}
