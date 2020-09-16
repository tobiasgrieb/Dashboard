package com.wimhof.business;

import org.springframework.stereotype.Service;
import persistence.ExerciseModel;

import java.util.List;

@Service
public class ExerciseService {
    private final ExerciseDao exerciseDao;

    public ExerciseService(ExerciseDao exerciseDao) {
        this.exerciseDao = exerciseDao;
    }

    public int addExercise(ExerciseModel exercise) {
        return exerciseDao.insertExercise(exercise);
    }

    public List<ExerciseModel> getAllExercises() {
        return exerciseDao.selectAllExercises();
    }

}
