package com.api.api.coursedao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.api.entities.Course;

public interface CourseDao  extends JpaRepository<Course,Long>{

}

