package com.learn.teacherstudentevaluationapp.controller;

import com.learn.teacherstudentevaluationapp.service.TeacherService;
import com.learn.teacherstudentevaluationapp.service.dto.AddTeacherRequest;
import com.learn.teacherstudentevaluationapp.service.dto.AddTeacherResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TeacherController {
    private final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @PostMapping("/add-teacher")
    public void addTeacher(@RequestBody AddTeacherRequest teacher){
        teacherService.addTeacher(teacher);
    }

    @GetMapping("/get_all_teacher")
    public List<AddTeacherResponse> getAllTeacher(){
        return teacherService.getAllTeacher();
    }


}
