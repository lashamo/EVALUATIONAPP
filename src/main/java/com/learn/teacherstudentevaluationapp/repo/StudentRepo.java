package com.learn.teacherstudentevaluationapp.repo;

import com.learn.teacherstudentevaluationapp.entiity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface StudentRepo extends CrudRepository<Student, Long> {
}
