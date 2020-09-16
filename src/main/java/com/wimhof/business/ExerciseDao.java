package com.wimhof.business;

import persistence.ExerciseModel;

import java.util.List;

public interface ExerciseDao {

    int insertExercise(ExerciseModel exercise);

    List<ExerciseModel> selectAllExercises();
}
