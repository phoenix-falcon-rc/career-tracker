package com.careertracker.dto;

public class StudySessionResponse {

    private final String date;
    private final String topic;
    private final String category;
    private final int durationMinutes;
    private final String notes;

    public StudySessionResponse(
            String date, String topic, String category,
            int durationMinutes, String notes
    ) {
        this.date = date;
        this.topic = topic;
        this.category = category;
        this.durationMinutes = durationMinutes;
        this.notes = notes;
    }

    public String getDate() {
        return this.date;
    }

    public String getTopic() {
        return this.topic;
    }

    public String getCategory() {
        return this.category;
    }

    public int getDurationMinutes() {
        return this.durationMinutes;
    }

    public String getNotes() {
        return this.notes;
    }
}
