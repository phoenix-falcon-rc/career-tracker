package com.careertracker.service;

import com.careertracker.dto.CreateStudySessionRequest;
import com.careertracker.dto.StudySessionResponse;
import com.careertracker.exception.StudySessionNotFoundException;
import com.careertracker.model.StudySession;
import com.careertracker.repository.StudySessionRepository;
import org.springframework.stereotype.Service;

@Service
public class StudySessionService {
    private final StudySessionRepository studySessionRepository;

    public StudySessionService(StudySessionRepository studySessionRepository) {
        this.studySessionRepository = studySessionRepository;
    }

    public StudySessionResponse createStudySession(CreateStudySessionRequest createStudySessionRequest) {

        StudySession studySession = new StudySession(
                createStudySessionRequest.getDate(), createStudySessionRequest.getTopic(),
                createStudySessionRequest.getCategory(), createStudySessionRequest.getDurationMinutes(),
                createStudySessionRequest.getNotes()
        );

        StudySession studySessionCreated = studySessionRepository.saveStudySession(studySession);

        return new StudySessionResponse(
                studySessionCreated.getId(), studySessionCreated.getDate(),
                studySessionCreated.getTopic(), studySessionCreated.getCategory(),
                studySessionCreated.getDurationMinutes(), studySessionCreated.getNotes()
        );
    }

    public StudySessionResponse getStudySession(long id) {
        StudySession studySessionRetrieved = studySessionRepository.findById(id).orElseThrow(
                () -> new StudySessionNotFoundException(String.format("Study session with %d not found", id))
        );
        return new StudySessionResponse(
                studySessionRetrieved.getId(), studySessionRetrieved.getDate(),
                studySessionRetrieved.getTopic(), studySessionRetrieved.getCategory(),
                studySessionRetrieved.getDurationMinutes(), studySessionRetrieved.getNotes()
        );
    }
}
