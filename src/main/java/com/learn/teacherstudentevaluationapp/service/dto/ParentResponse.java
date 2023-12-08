package com.learn.teacherstudentevaluationapp.service.dto;

import com.learn.teacherstudentevaluationapp.entiity.Evaluation;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ParentResponse {
    private String StudentFirstName;
    private String studentLastName;
    private String teacher;
    private String mark;
}
