package com.careertracker.repository;

import com.careertracker.model.StudySession;

import java.util.List;
import java.util.Optional;

public interface StudySessionRepository {

    public StudySession saveStudySession(StudySession studySession);

    public List<StudySession> findAllStudySessions();

    public Optional<StudySession> findById(long id);
}
