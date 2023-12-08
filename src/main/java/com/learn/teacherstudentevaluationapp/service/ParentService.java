package com.learn.teacherstudentevaluationapp.service;

import com.learn.teacherstudentevaluationapp.service.dto.ParentResponse;

import java.time.LocalDateTime;
import java.util.List;

public interface ParentService {
    void addParent(String parentName);
    List<ParentResponse> getSonById(String sonId, LocalDateTime first, LocalDateTime second);
}
