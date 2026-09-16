package com.careertracker.model;

public class StudySession {

    private long id;
    private String date;
    private String topic;
    private String category;
    private int durationMinutes;
    private String notes;

    public StudySession(
            String date, String topic, String category,
            int durationMinutes, String notes
    ) {
        this.date = date;
        this.topic = topic;
        this.category = category;
        this.durationMinutes = durationMinutes;
        this.notes = notes;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return this.id;
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
