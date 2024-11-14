package com.api.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.api.entities.Course;
import com.api.api.services.CourseService;

@RestController
public class MyController{
   @Autowired
   public CourseService courseService;
   @GetMapping("/home")
   public String home(){
    return "this is home page";
   }
   public List<Course> getCourses()
   {
    return this.courseService.getCourses();
   }
   }
