package com.learn.teacherstudentevaluationapp.service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AddEvaluationRequest {
    private Long teacherId;
    private Long studentId;
    private String comment;
}
