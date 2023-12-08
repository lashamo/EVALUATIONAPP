package com.learn.teacherstudentevaluationapp.service;

import com.learn.teacherstudentevaluationapp.entiity.Student;
import com.learn.teacherstudentevaluationapp.repo.StudentRepo;
import com.learn.teacherstudentevaluationapp.service.dto.AddStudentRequest;
import com.learn.teacherstudentevaluationapp.service.dto.StudentResponse;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    public final StudentRepo studentRepo;

    public StudentServiceImpl(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    @Override
    public void addStudent(AddStudentRequest addStudentRequest) {
        studentRepo.save(mapStudentToAddStudentRequest(addStudentRequest));
    }

    public Student mapStudentToAddStudentRequest(AddStudentRequest addStudentRequest){
        Student student = new Student();
        student.setFirstName(addStudentRequest.getFirstName());
        student.setLastName(addStudentRequest.getLastName());
        student.setClassName(addStudentRequest.getClassName());
        return student;
    }
}
