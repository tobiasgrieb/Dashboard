package persistence;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

public class BreathingExerciseModel {
    private UUID id;
    private int breathingRepetitions;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date date;

    public BreathingExerciseModel(UUID id, Date date, int breathingRepetitions) {
        this.id = id;
        this.date = date;
        this.breathingRepetitions = breathingRepetitions;
    }

    public UUID getId() {
        return UUID.randomUUID();
    }

    public Object setId() {
        return UUID.randomUUID();
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
