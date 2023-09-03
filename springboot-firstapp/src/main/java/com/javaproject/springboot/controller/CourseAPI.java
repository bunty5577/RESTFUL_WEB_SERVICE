
//its a controller
package com.javaproject.springboot.controller;


import com.javaproject.springboot.entities.Course;
import com.javaproject.springboot.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class CourseAPI {


    @Autowired
    private CourseService courseService;

    @GetMapping("/courses")
    public List<Course> getCourses()
    {
        return this.courseService.getCourses();
    }

    @GetMapping("/courses/{courseId}")
    public Course getCourse(@PathVariable String courseId)
    {
        return this.courseService.getCourse(Long.parseLong(courseId));
    }

   //  @PostMapping("/course/create");

    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course)
    {
        return this.courseService.addCourse(course);
    }

    @PutMapping("/courses/{courseId}")
    public ResponseEntity<Void> updateCourseDescription(@PathVariable String courseId, RequestEntity<String> request)
    {
        //request.getBody();

        this.courseService.updateCourseDescription(Long.parseLong(courseId),request.getBody());
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/courses/{courseId}")
    public Course deleteCourse(@PathVariable String courseId)
    {
        return this.courseService.deleteCourse(Long.parseLong(courseId));
    }

    @DeleteMapping("/courses")
    public ResponseEntity<Void> deleteAllCourses()
    {
        this.courseService.deleteAllCourses();
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
