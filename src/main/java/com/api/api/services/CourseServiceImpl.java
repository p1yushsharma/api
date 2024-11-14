package com.api.api.services;
import java.util.ArrayList;
import java.util.List ;

import org.springframework.stereotype.Service;

import com.api.api.entities.Course;
@Service
public class CourseServiceImpl implements CourseService {
   List<Course> list;
    public CourseServiceImpl(){
     list= new ArrayList<>();
     list.add(new Course(10,"first api","learn to create first api"));
     list.add(new Course(11,"different layers in spring boot","understanding different layers in spring boot"));
     list.add(new Course(12,"connecting with database","getting on how to connect to a database in spring boot"));
    }
    @Override
    public List<Course> getCourses() {
        return list;
}
}