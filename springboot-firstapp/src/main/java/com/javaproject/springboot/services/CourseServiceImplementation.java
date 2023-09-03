package com.javaproject.springboot.services;


import com.javaproject.springboot.entities.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImplementation implements CourseService {

    List<Course> list;

    public CourseServiceImplementation()
    {
        list =new ArrayList<>();
        list.add(new Course(10,"Cloud Computing","RestApi Using Spring Boot"));
        list.add(new Course(20,"Advance Computer Networks","Acn networks "));
    }

    @Override
    public List<Course> getCourses()
    {
        return list;
    }

    @Override

    public Course getCourse(long courseId)
    {
        Course c=null;
        for(Course course:list)
        {
            if(course.getCid()==courseId)
            {
                c=course;
                break;
            }
        }
        return c;
    }

    @Override
    public Course addCourse(Course course) {
        list.add(course);
        return course;
    }

    @Override
    public Course deleteCourse(long courseId) {
        for(Course course:list)
        {
            if(course.getCid()==courseId)
            {
                //c=course;
                list.remove(course);
            }
        }
        return null;
    }

    @Override
    public void deleteAllCourses() {
        list.clear();

       // return null;
    }

    @Override
    public void updateCourseDescription(long courseId,String description) {
        for(Course c:list)
        {
            if(c.getCid()==courseId)
            {
               c.setDescription(description);
            }
        }
    }


}