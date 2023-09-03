package com.javaproject.springboot.services;

import java.util.List;

import com.javaproject.springboot.entities.Course;

public interface CourseService {
    public List<Course> getCourses();

    public Course getCourse(long courseId);

    public Course addCourse(Course course);

    public Course deleteCourse(long courseId);

    public void deleteAllCourses();

    public void updateCourseDescription(long courseId,String description);

}
