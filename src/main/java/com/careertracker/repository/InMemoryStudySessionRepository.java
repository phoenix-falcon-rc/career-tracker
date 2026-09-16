package com.careertracker.repository;

import com.careertracker.model.StudySession;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class InMemoryStudySessionRepository implements StudySessionRepository {
    List<StudySession> studySessionList = new ArrayList<>();

    public StudySession saveStudySession(StudySession studySession) {

        // Generate an Id
        long id = generateId(findAllStudySessions());
        // update Id
        studySession.setId(id);
        // Study session
        studySessionList.add(studySession);
        System.out.println("Save Study Session");
        return studySession;
    }

    public List<StudySession> findAllStudySessions() {
        return studySessionList;
    }

    private long generateId(List<StudySession> sessionList) {
        int size = sessionList.size();
        return 100 + size;
    }

    public Optional<StudySession> findById(long id) {
        List<StudySession> sessionList = findAllStudySessions();
        for(StudySession s: sessionList) {
            if (s.getId() == id) {
                return Optional.of(s);
            }
        }
        return Optional.empty();
    }
}
