package com.learn.teacherstudentevaluationapp.service;

import com.learn.teacherstudentevaluationapp.entiity.Evaluation;
import com.learn.teacherstudentevaluationapp.entiity.Parent;
import com.learn.teacherstudentevaluationapp.repo.EvaluationRepo;
import com.learn.teacherstudentevaluationapp.repo.ParentRepo;
import com.learn.teacherstudentevaluationapp.service.dto.ParentResponse;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class ParentServiceImpl implements ParentService{
    public final ParentRepo parentRepo;
    public final EvaluationRepo evaluationRepo;

    public ParentServiceImpl(ParentRepo parentRepo, EvaluationRepo evaluationRepo) {
        this.parentRepo = parentRepo;
        this.evaluationRepo = evaluationRepo;
    }


    @Override
    public void addParent(String parentName) {
        Parent parent =new Parent();
        parent.setName(parentName);
        parentRepo.save(parent);
    }

    @Override
    public List<ParentResponse> getSonById(String sonId, LocalDateTime first, LocalDateTime second) {
        List<ParentResponse> parentResponses = new ArrayList<>();
        List<Evaluation> evaluations = evaluationRepo.getAllByStudent_Id(sonId);
        for (Evaluation evaluation : evaluations){
            parentResponses.add(mapEvaluationToParentResponse(evaluation));
        }

        return null;
    }

    private ParentResponse mapEvaluationToParentResponse(Evaluation evaluation){
        ParentResponse parentResponse = new ParentResponse();
        parentResponse.setStudentFirstName(String.valueOf(evaluation.getStudent().getFirstName()));
        parentResponse.setStudentLastName(String.valueOf(evaluation.getStudent().getLastName()));
        parentResponse.setTeacher(String.valueOf(evaluation.getTeacher()));
        parentResponse.setMark(evaluation.getComments());
        return parentResponse;
    }
}
