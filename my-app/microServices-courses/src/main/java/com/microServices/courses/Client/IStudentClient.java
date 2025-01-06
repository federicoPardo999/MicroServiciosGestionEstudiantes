package com.microServices.courses.Client;

import com.microServices.courses.controller.dto.StudentDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "msvc-student",url = "localhost:8080/api/student")
public interface IStudentClient {

    @GetMapping("/getStudentsByCourse/{idCourse}")
    List<StudentDTO> getStudentsByCourse(@PathVariable Long idCourse);

}