package com.wimhof.business;

import persistence.BreathingExerciseModel;

import java.util.List;

public interface BreathingExerciseDao {

    int insertExercise(BreathingExerciseModel exercise);

    List<BreathingExerciseModel> getAllExercises();
}
