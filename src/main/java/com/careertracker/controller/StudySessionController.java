package com.careertracker.controller;

import com.careertracker.dto.CreateStudySessionRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/study-sessions")
public class StudySessionController {

    @PostMapping
    public String createStudySession(@RequestBody CreateStudySessionRequest createStudySessionRequest) {
        return "Created study session: " + createStudySessionRequest.getTopic();
    }
}
