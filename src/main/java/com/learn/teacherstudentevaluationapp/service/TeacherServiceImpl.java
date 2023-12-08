package com.learn.teacherstudentevaluationapp.service;

import com.learn.teacherstudentevaluationapp.entiity.SubjectType;
import com.learn.teacherstudentevaluationapp.entiity.Teacher;
import com.learn.teacherstudentevaluationapp.repo.TeacherRepo;
import com.learn.teacherstudentevaluationapp.service.dto.AddTeacherRequest;
import com.learn.teacherstudentevaluationapp.service.dto.AddTeacherResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService{
    private final TeacherRepo teacherRepo;

    public TeacherServiceImpl(TeacherRepo teacherRepo) {
        this.teacherRepo = teacherRepo;
    }

    @Override
    public void addTeacher(AddTeacherRequest addTeacherRequest) {
        teacherRepo.save(mapTeacherToAddTeacherRequest(addTeacherRequest));
    }

    @Override
    public List<AddTeacherResponse> getAllTeacher() {
        Iterable<Teacher> iterable = teacherRepo.findAll();
        List<AddTeacherResponse> addTeacherResponses = new ArrayList<>();
        iterable.forEach(teacher -> addTeacherResponses.add(mapTeachertoAddTeacherResponse(teacher)));
        return null;
    }
    private AddTeacherResponse mapTeachertoAddTeacherResponse (Teacher teacher){
        AddTeacherResponse addTeacherResponse = new AddTeacherResponse();
        addTeacherResponse.setId(teacher.getId());
        addTeacherResponse.setName(teacher.getName());
        addTeacherResponse.setSubjectType(String.valueOf(teacher.getSubjectType()));
        return addTeacherResponse;
    }


    private Teacher mapTeacherToAddTeacherRequest(AddTeacherRequest addTeacherRequest){
        Teacher teacher = new Teacher();
        teacher.setName(addTeacherRequest.getName());
        try {
            teacher.setSubjectType(SubjectType.valueOf(addTeacherRequest.getSubjectType()));
        }catch (IllegalArgumentException ex){
            throw new AppException(String.format("Teacher type[%s] is not available", addTeacherRequest.getSubjectType()));
        }
        return teacher;
    }
}
