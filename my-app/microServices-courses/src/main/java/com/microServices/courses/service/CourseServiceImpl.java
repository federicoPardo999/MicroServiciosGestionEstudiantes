package com.microServices.courses.service;

import com.microServices.courses.Client.IStudentClient;
import com.microServices.courses.controller.dto.StudentDTO;
import com.microServices.courses.http.response.StudentsByCourseResponse;
import com.microServices.courses.model.Course;
import com.microServices.courses.repository.ICourseRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE,makeFinal = true)
public class CourseServiceImpl implements ICourseService {
    ICourseRepository courseRepository;
    IStudentClient studentClient;

    @Override
    public void createCourse(Course course) {
        courseRepository.save(course);
    }

    @Override
    public List<Course> getAll() {
        return courseRepository.findAll();
    }

    @Override
    public Course getCourse(Long idCourse) {
        return courseRepository.findById(idCourse).orElseThrow();
    }

    @Override
    public StudentsByCourseResponse findStudentsByCourse(Long idCourse) {
        Course course = this.getCourse(idCourse);

        List<StudentDTO> students = studentClient.getStudentsByCourse(course.getId());

        return StudentsByCourseResponse
                .builder()
                .students(students)
                .name(course.getNameCourse())
                .teach(course.getTeachName())
                .build();
    }
}
