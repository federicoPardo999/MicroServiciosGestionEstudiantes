package com.microServices.courses.controller;

import com.microServices.courses.http.response.StudentsByCourseResponse;
import com.microServices.courses.model.Course;
import com.microServices.courses.service.ICourseService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/course")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE,makeFinal = true)
public class CourseController{
    ICourseService courseService;

    @PostMapping("/create")
    public ResponseEntity<?> createCourse(@RequestBody Course course){
        courseService.createCourse(course);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/getAll")
    public  ResponseEntity<?> getAll(){
        return new ResponseEntity<>(courseService.getAll(),HttpStatus.OK);
    }

    @GetMapping("get-course/{idCourse}")
    public ResponseEntity<Course> getCourse(@PathVariable Long idCourse){
        return new ResponseEntity<>(courseService.getCourse(idCourse),HttpStatus.OK);
    }

    @GetMapping("getStudentsByIdCourse/{idCourse}")
    public ResponseEntity<StudentsByCourseResponse> getStudentsByCourse(@PathVariable Long idCourse){
        return new ResponseEntity<>(courseService.findStudentsByCourse(idCourse),HttpStatus.OK);
    }

}
