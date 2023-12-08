package com.learn.teacherstudentevaluationapp.service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AddStudentRequest {
    private String firstName;
    private String lastName;
    private String className;
}
