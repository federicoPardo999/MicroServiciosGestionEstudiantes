package com.microServices.student.service;

import com.microServices.student.model.Student;
import com.microServices.student.repository.IStudentRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE,makeFinal = true)
public class StudentServiceImpl implements IStudentService{
    IStudentRepository studentRepository;

    @Override
    public void createStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudent(Long idStudent) {
        return studentRepository.findById(idStudent).orElseThrow();
    }

    @Override
    public List<Student> getStudentsByCourse(Long idCourse) {
        return studentRepository.findStudentsByCourse(idCourse);
    }
}
