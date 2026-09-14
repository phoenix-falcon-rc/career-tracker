package com.careertracker.controller;

import com.careertracker.dto.CreateStudySessionRequest;
import com.careertracker.dto.StudySessionResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/study-sessions")
public class StudySessionController {

    @PostMapping
    public ResponseEntity<StudySessionResponse> createStudySession(@RequestBody CreateStudySessionRequest createStudySessionRequest) {
        StudySessionResponse studySessionResponse = new StudySessionResponse(
                createStudySessionRequest.getDate(), createStudySessionRequest.getTopic(),
                createStudySessionRequest.getCategory(), createStudySessionRequest.getDurationMinutes(),
                createStudySessionRequest.getNotes()
        );
        ResponseEntity<StudySessionResponse> responseEntity = new ResponseEntity<>(
                studySessionResponse,
                HttpStatus.CREATED
        );
        return responseEntity;
    }
}
