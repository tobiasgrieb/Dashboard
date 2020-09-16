package com.wimhof.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import persistence.BreathingExerciseModel;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Repository
public class BreathingExerciseAccessService implements BreathingExerciseDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public int insertExercise(BreathingExerciseModel exercise) {
        String sql = "INSERT INTO EXERCISES (id, date, breathingRepetitions) VALUES (?, ?, ?)";
        return jdbcTemplate.update(
            sql,
            exercise.setId(),
            exercise.getDate(),
            exercise.getBreathingRepetitions()
        );
    }

    @Override
    public List <BreathingExerciseModel> getAllExercises() {
        String sql = "SELECT * FROM EXERCISES";
        return jdbcTemplate.query(
            sql,
            (resultSet, i) -> {
                UUID id =  UUID.fromString(resultSet.getString("id"));
                Date date = resultSet.getDate("date");
                int breathingRepetitions = resultSet.getInt("breathingRepetitions");
                return new BreathingExerciseModel(id, date, breathingRepetitions);
            });
    }
}