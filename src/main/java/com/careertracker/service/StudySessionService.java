package com.careertracker.service;

import com.careertracker.dto.CreateStudySessionRequest;
import com.careertracker.dto.StudySessionResponse;
import org.springframework.stereotype.Service;

@Service
public class StudySessionService {

    public StudySessionResponse createStudySession(CreateStudySessionRequest createStudySessionRequest) {

        StudySessionResponse studySessionResponse = new StudySessionResponse(
                createStudySessionRequest.getDate(), createStudySessionRequest.getTopic(),
                createStudySessionRequest.getCategory(), createStudySessionRequest.getDurationMinutes(),
                createStudySessionRequest.getNotes()
        );

        return studySessionResponse;
    }
}
