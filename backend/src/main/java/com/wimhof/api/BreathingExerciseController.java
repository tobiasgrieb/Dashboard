package com.wimhof.api;

import com.wimhof.business.BreathingExerciseService;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;
import com.wimhof.business.models.BreathingExercise;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.validation.Valid;
import java.util.List;

@RequestMapping("api/v1/breathing-exercise")
@RestController
public class BreathingExerciseController {

    private final BreathingExerciseService exerciseService;

    public BreathingExerciseController(BreathingExerciseService exerciseService) {
        this.exerciseService = exerciseService;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping
    public List<BreathingExercise> getAllExercises() {
        return exerciseService.getAll();
    }

    @PostMapping
    public void addExercise(@Valid @NonNull @RequestBody BreathingExercise breathingExercise) {
        exerciseService.add(breathingExercise);
    }

}
