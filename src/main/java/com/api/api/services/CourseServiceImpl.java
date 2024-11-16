package com.api.api.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired ;
import org.springframework.stereotype.Service;

import com.api.api.coursedao.CourseDao;
import com.api.api.entities.Course;
@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseDao courseDao ;
  /*  List<Course> list; 
    public CourseServiceImpl(){
     list= new ArrayList<>();
     list.add(new Course(10,"first api","learn to create first api"));
     list.add(new Course(11,"different layers in spring boot","understanding different layers in spring boot"));
     list.add(new Course(12,"connecting with database","getting on how to connect to a database in spring boot"));
    }*/
    @Override
    public List<Course> getCourses() {
        return courseDao.findAll();
}
    @Override
    public Course getcourse(long courseid) {
      /* Course c= null;
       for(Course course:list){
          if(course.getId()==courseid){
            c= course;
            break;
          }
       }*/
       return courseDao.getOne(courseid);
    }
    @Override
    public Course addcourse(Course course){
      //  list.add(course);
      courseDao.save(course);
        return course;
    }
    @Override
    public Course updatecourse (Course course){
      /* list.forEach(e -> {
        if(e.getId()==course.getId()){
            e.setTitle(course.getTitle());
            e.setDescription(course.getDescription());
          }
       });*/
       courseDao.save(course);
       return course;
    }

}