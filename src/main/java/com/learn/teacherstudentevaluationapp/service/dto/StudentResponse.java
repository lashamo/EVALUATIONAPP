package com.learn.teacherstudentevaluationapp.service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentResponse {
    private Long id;
    private String firstName;
    private String lastName;
    private String className;
}
