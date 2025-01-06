package com.microServices.courses.http.response;

import com.microServices.courses.controller.dto.StudentDTO;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class StudentsByCourseResponse {
    String name;
    String teach;
    List<StudentDTO> students;
}
