package com.wimhof.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import persistence.ExerciseModel;

import java.util.List;
import java.util.UUID;

@Repository
public class ExerciseAccessService implements ExerciseDao{
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public int insertExercise(ExerciseModel exercise) {
        String sql = "INSERT INTO EXERCISES (id, exercise) VALUES (?, ?)";
        return jdbcTemplate.update(
            sql,
            exercise.setId(),
            exercise.getExercise()
        );
    }

    @Override
    public List <ExerciseModel> selectAllExercises() {
        String sql = "SELECT * FROM EXERCISES";
        return jdbcTemplate.query(
            sql,
            (resultSet, i) -> {
                UUID id =  UUID.fromString(resultSet.getString("id"));
                String exercise = resultSet.getString("exercise");
                return new ExerciseModel(id, exercise);
            });
    }
}