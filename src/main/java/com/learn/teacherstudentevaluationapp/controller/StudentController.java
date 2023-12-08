package com.learn.teacherstudentevaluationapp.controller;

import com.learn.teacherstudentevaluationapp.service.StudentService;
import com.learn.teacherstudentevaluationapp.service.dto.AddStudentRequest;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    public final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    @PostMapping("/add-student")
    public void addStudent(@RequestBody AddStudentRequest request){
    studentService.addStudent(request);
    }

}
