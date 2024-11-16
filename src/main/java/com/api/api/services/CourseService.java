package com.api.api.services;
import java.util.List ;

import com.api.api.entities.Course;

public interface CourseService {

    public List<Course> getCourses();
    public Course getcourse(long courseid); 
    public Course addcourse(Course course);
    public Course updatecourse(Course course);
}
   