package com.learn.teacherstudentevaluationapp.repo;

import com.learn.teacherstudentevaluationapp.entiity.Evaluation;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EvaluationRepo extends CrudRepository<Evaluation, Long> {
 List<Evaluation> getAllByStudent_Id(String sonId);


}
