package com.microServices.courses.controller.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class StudentDTO {
    String name;
    String mail;
    Integer age;
    Long idCourse;
}
