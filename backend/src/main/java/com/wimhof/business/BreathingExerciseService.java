package com.wimhof.business;

import com.wimhof.business.exceptions.NoExerciseDataException;
import com.wimhof.business.models.BreathingExercise;
import com.wimhof.persistence.BreathingExerciseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class BreathingExerciseService {

    @Autowired
    private BreathingExerciseRepository repository;

    public void add(BreathingExercise exercise) {
        repository.save(exercise);
    }

    public List<BreathingExercise> getAll() {
        ArrayList<BreathingExercise> allBreathingExercises = new ArrayList<>();
        repository.findAll().forEach(allBreathingExercises::add);
        return allBreathingExercises;
    }

    public BreathingExercise getBestExercise() throws NoExerciseDataException {
        List<BreathingExercise> allBreathingExercises = getAll();

        try {
            return allBreathingExercises
                .stream()
                .max(Comparator.comparing(BreathingExercise::getBreathingRepetitions))
                .orElseThrow(NoSuchElementException::new);
        } catch (NoSuchElementException e) {
            throw new NoExerciseDataException("No data for breathing exercises available");
        }
    }
}
