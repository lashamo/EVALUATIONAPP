package com.learn.teacherstudentevaluationapp.service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AddTeacherResponse {
    private Long id;
    private String name;
    private String subjectType;
}
