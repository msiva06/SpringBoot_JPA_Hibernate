package com.example.springboot.learnjpaandhibernate.springjpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot.learnjpaandhibernate.Course;
import java.util.List;


public interface CourseSpringDataJPARepository extends JpaRepository<Course,Long>{
    List<Course> findByName(String name);

}
