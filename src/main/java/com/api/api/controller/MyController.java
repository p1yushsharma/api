package com.api.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.api.entities.Course;
import com.api.api.services.CourseService;

@RestController
public class MyController {
    private final CourseService courseService;

    @Autowired
    public MyController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping("/")
    public String land() {
        return "You have landed on my website. Please navigate yourself through its segments.";
    }

    @GetMapping("/home")
    public String home() {
        return "This is the home page.";
    }

    @GetMapping("/courses")
    public List<Course> getAllCourses() {
        return this.courseService.getCourses();
    }

    @GetMapping("/courses/{courseid}")
    public Course getCourseById(@PathVariable long courseid) {
        return this.courseService.getcourse(courseid);
    }

    @PostMapping("/courses")
    public ResponseEntity<Course> createCourse(@RequestBody Course course) {
        Course savedCourse = this.courseService.addcourse(course);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedCourse);  
    }

    @PutMapping("/courses")
    public ResponseEntity<Course> updateCourse(@RequestBody Course course) {
        Course updatedCourse = this.courseService.updatecourse(course);
        if (updatedCourse != null) {
            return ResponseEntity.ok(updatedCourse);  
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();  
    }
}
