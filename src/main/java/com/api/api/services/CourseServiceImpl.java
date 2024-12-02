package com.api.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.api.coursedao.CourseDao;
import com.api.api.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseDao courseDao;

    @Override
    public List<Course> getCourses() {
        return (List<Course>) courseDao.findAll();
    }

    @Override
    public Course getcourse(long courseid) {
        return courseDao.findById(courseid)
                .orElseThrow(() -> new RuntimeException("Course not found with id: " + courseid));
    }

    @Override
    public Course addcourse(Course course) {
        return courseDao.save(course);  // This will insert the course
    }

    @Override
    public Course updatecourse(Course course) {
        if (courseDao.existsById(course.getId())) {
            return courseDao.save(course);  // This will update the existing course
        }
        return null;  // Or throw an exception if needed
    }
}
