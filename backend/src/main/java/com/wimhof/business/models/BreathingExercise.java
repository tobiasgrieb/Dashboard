package com.wimhof.business.models;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;
import java.util.UUID;

@Entity
public class BreathingExercise {
    @Id
    @GeneratedValue
    private UUID id;

    private int breathingRepetitions;

    @JsonFormat(pattern="yyyy-MM-dd")
    private Date date;

    public BreathingExercise() {}

    public BreathingExercise(Date date, int breathingRepetitions) {
        this.date = date;
        this.breathingRepetitions = breathingRepetitions;
    }

    public UUID getId() {
        return id;
    }

    public int getBreathingRepetitions() {
        return breathingRepetitions;
    }

    public void setBreathingRepetitions(int breathingRepetitions) {
        this.breathingRepetitions = breathingRepetitions;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
