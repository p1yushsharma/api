package com.api.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.api.entities.Course;
import com.api.api.services.CourseService;

@RestController
public class MyController{
   @Autowired
   public CourseService courseService;
  @GetMapping("/")
   public String land(){
      return "you have landed on my website please navigate yourself through its segments";
   }
   @GetMapping("/home")
   public String home(){
    return "this is home page";
   }
   @GetMapping("/courses")
   public List<Course> getCourses()
   {
    return this.courseService.getCourses();
   }
   @GetMapping("/courses/{courseid}")
   public Course getcourse(@PathVariable long courseid){ 
      return this.courseService.getcourse(courseid);
   }
   @PostMapping("/courses")
   public Course addcourses(@RequestBody Course course){
        return this.courseService.addcourse(course);
   }
   @PutMapping("/courses")
   public Course  updatecourses(@RequestBody Course course){
      return this.courseService.updatecourse(course);
   }
   }
     