package com.learn.teacherstudentevaluationapp.service;

import com.learn.teacherstudentevaluationapp.service.dto.AddTeacherRequest;
import com.learn.teacherstudentevaluationapp.service.dto.AddTeacherResponse;

import java.util.List;

public interface TeacherService {
    void addTeacher(AddTeacherRequest addTeacherRequest);
    List<AddTeacherResponse> getAllTeacher();



}
