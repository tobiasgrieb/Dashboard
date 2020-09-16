package com.wimhof.business;

import org.springframework.stereotype.Service;
import persistence.BreathingExerciseModel;

import java.util.List;

@Service
public class BreathingExerciseService {
    private final BreathingExerciseDao exerciseDao;

    public BreathingExerciseService(BreathingExerciseDao exerciseDao) {
        this.exerciseDao = exerciseDao;
    }

    public int addExercise(BreathingExerciseModel exercise) {
        return exerciseDao.insertExercise(exercise);
    }

    public List<BreathingExerciseModel> getAllExercises() {
        return exerciseDao.getAllExercises();
    }

}
