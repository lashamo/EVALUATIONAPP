package com.learn.teacherstudentevaluationapp.repo;

import com.learn.teacherstudentevaluationapp.entiity.Teacher;
import org.springframework.data.repository.CrudRepository;

public interface TeacherRepo extends CrudRepository<Teacher, Long> {
}
