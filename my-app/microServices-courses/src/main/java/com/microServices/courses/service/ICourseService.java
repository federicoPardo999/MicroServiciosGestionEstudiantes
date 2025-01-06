package com.microServices.courses.service;

import com.microServices.courses.http.response.StudentsByCourseResponse;
import com.microServices.courses.model.Course;

import java.util.List;

public interface ICourseService {
    public void createCourse(Course course);
    public List<Course> getAll();
    public Course getCourse(Long idCourse);
    StudentsByCourseResponse findStudentsByCourse(Long idCourse);
}
