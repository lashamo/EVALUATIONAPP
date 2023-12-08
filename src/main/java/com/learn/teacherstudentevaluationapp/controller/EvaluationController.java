package com.learn.teacherstudentevaluationapp.controller;

import com.learn.teacherstudentevaluationapp.service.EvaluationService;
import com.learn.teacherstudentevaluationapp.service.dto.AddEvaluationRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EvaluationController {
    public final EvaluationService evaluationService;

    public EvaluationController(EvaluationService evaluationService) {
        this.evaluationService = evaluationService;
    }

    @PostMapping("/add-evaluation")
    void addEvaluation(@RequestBody AddEvaluationRequest evaluationRequest){
        evaluationService.addEvaluation(evaluationRequest);
    }
}
