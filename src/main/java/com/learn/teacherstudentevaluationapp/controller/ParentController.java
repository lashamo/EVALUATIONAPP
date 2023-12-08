package com.learn.teacherstudentevaluationapp.controller;

import com.learn.teacherstudentevaluationapp.repo.EvaluationRepo;
import com.learn.teacherstudentevaluationapp.service.ParentService;
import com.learn.teacherstudentevaluationapp.service.dto.AddTeacherResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
public class ParentController {
    public final ParentService parentService;
    public final EvaluationRepo evaluationRepo;


    public ParentController(ParentService parentService, EvaluationRepo evaluationRepo) {
        this.parentService = parentService;
        this.evaluationRepo = evaluationRepo;
    }



    @PostMapping("/add-parent")
    void addParent(@RequestParam String name){
        parentService.addParent(name);
    }



}
