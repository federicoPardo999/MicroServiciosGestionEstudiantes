package com.microServices.student.repository;

import com.microServices.student.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface IStudentRepository extends JpaRepository<Student,Long> {

    @Query("SELECT s FROM Student s WHERE s.idCourse = :idCourse")
    List<Student> findStudentsByCourse(Long idCourse);
}
