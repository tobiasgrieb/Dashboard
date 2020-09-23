package com.wimhof.business;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
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

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/api/v1/exercise").allowedOrigins("http://localhost:3000");
            }
        };
    }

}
