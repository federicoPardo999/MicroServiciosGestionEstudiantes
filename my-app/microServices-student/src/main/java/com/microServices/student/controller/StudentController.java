package com.microServices.student.controller;

import com.microServices.student.model.Student;
import com.microServices.student.service.IStudentService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api/student")
@FieldDefaults(level = AccessLevel.PRIVATE,makeFinal = true)
public class StudentController {
    IStudentService studentService;

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody Student student){
        studentService.createStudent(student);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/get-all")
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(studentService.getAll());
    }

    @GetMapping("/get-student/{idStudent}")
    public ResponseEntity<Student> getStudent(@PathVariable Long idStudent){
        return  ResponseEntity.ok(studentService.getStudent(idStudent));
    }

    @GetMapping("/getStudentsByCourse/{idCourse}")
    public ResponseEntity<List<Student>> getStudentsByCourse(@PathVariable Long idCourse){
        return ResponseEntity.ok(studentService.getStudentsByCourse(idCourse));
    }
}
