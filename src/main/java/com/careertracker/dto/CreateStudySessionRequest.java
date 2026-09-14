package com.careertracker.dto;

public class CreateStudySessionRequest {

    private String date;
    private String topic;
    private String category;
    private int durationMinutes;
    private String notes;

    public CreateStudySessionRequest() {
    }

    public CreateStudySessionRequest(
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

    public void setDate(String date) {
        this.date = date;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
