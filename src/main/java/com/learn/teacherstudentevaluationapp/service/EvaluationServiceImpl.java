package com.learn.teacherstudentevaluationapp.service;

import com.learn.teacherstudentevaluationapp.entiity.Evaluation;
import com.learn.teacherstudentevaluationapp.repo.EvaluationRepo;
import com.learn.teacherstudentevaluationapp.service.dto.AddEvaluationRequest;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class EvaluationServiceImpl implements EvaluationService{
    public final EvaluationRepo evaluationRepo;

    public EvaluationServiceImpl(EvaluationRepo evaluationRepo) {
        this.evaluationRepo = evaluationRepo;
    }

    @Override
    public void addEvaluation(AddEvaluationRequest addEvaluationRequest) {
     evaluationRepo.save(mapAddEvaluationRequestToEvaluation(addEvaluationRequest));
    }

    public Evaluation mapAddEvaluationRequestToEvaluation(AddEvaluationRequest addEvaluationRequest){
        Evaluation evaluation = new Evaluation();
        evaluation.getTeacher().setId(addEvaluationRequest.getTeacherId());
        evaluation.getStudent().setId(addEvaluationRequest.getStudentId());
        evaluation.setComments(addEvaluationRequest.getComment());
        evaluation.setLocalDateTime(LocalDateTime.now());
        return evaluation;


    }
}
