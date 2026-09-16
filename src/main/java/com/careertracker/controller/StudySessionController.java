package com.careertracker.controller;

import com.careertracker.dto.CreateStudySessionRequest;
import com.careertracker.dto.StudySessionResponse;
import com.careertracker.service.StudySessionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/study-sessions")
public class StudySessionController {

    private final StudySessionService studySessionService;

    public StudySessionController(StudySessionService studySessionService) {
        this.studySessionService = studySessionService;
    }

    @PostMapping
    public ResponseEntity<StudySessionResponse> createStudySession(
            @RequestBody CreateStudySessionRequest createStudySessionRequest) {
        StudySessionResponse studySessionResponse = studySessionService.createStudySession(createStudySessionRequest);
        ResponseEntity<StudySessionResponse> responseEntity = new ResponseEntity<>(
                studySessionResponse,
                HttpStatus.CREATED
        );
        return responseEntity;
    }

    @GetMapping("/{id}")
    public ResponseEntity<StudySessionResponse> getSession(@PathVariable long id) {
        StudySessionResponse response =
                studySessionService.getStudySession(id);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
