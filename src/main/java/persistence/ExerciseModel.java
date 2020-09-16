package persistence;

import java.util.UUID;

public class ExerciseModel {
    private UUID id;
    private String exercise;

    public ExerciseModel() {}

    public ExerciseModel(UUID id, String exercise) {
        this.id = id;
        this.exercise = exercise;
    }

    public UUID getId() {
        return UUID.randomUUID();
    }

    public Object setId() {
        return UUID.randomUUID();
    }

    public String getExercise() {
        return exercise;
    }

    public void setExercise(String exercise) {
        this.exercise = exercise;
    }
}
