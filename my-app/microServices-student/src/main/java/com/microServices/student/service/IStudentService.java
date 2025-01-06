package com.microServices.student.service;

import com.microServices.student.model.Student;

import java.util.List;

public interface IStudentService {
    public void createStudent(Student student);
    public List<Student> getAll();
    public Student getStudent(Long idStudent);
    public List<Student> getStudentsByCourse(Long idCourse);
}
