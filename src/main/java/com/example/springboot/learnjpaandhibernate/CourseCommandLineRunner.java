package com.example.springboot.learnjpaandhibernate;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//import com.example.springboot.learnjpaandhibernate.jdbc.CourseRepository;
import com.example.springboot.learnjpaandhibernate.jpa.CourseJPARepository;
import com.example.springboot.learnjpaandhibernate.springjpa.CourseSpringDataJPARepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

    // @Autowired
    // private CourseRepository courseRepository;

    // @Autowired
    // private CourseJPARepository repository;

    @Autowired
    private CourseSpringDataJPARepository repository;

    @Override
    public void run(String... args) throws Exception {
        
        // courseRepository.insert(new Course(1,"Spring"));
        // courseRepository.insert(new Course(2,"springboot"));
        // courseRepository.insert(new Course(3,"Spring JDBC"));

        // courseRepository.delete(2);
        // System.out.println(courseRepository.findById(1));

        // repository.insert(new Course(2,"springboot"));
        // System.out.println(repository.findById(3));
        // repository.deleteById(2);

        repository.save(new Course(1,"AWS"));
        repository.save(new Course(2,"Azure"));
        repository.save(new Course(3,"GCP"));

        System.out.println(repository.findById(3l));
        repository.deleteById(2l);
        System.out.println(repository.findAll());

    }
    
}
