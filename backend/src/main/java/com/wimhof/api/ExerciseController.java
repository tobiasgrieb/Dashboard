package com.wimhof.api;

import com.wimhof.business.BreathingExerciseService;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;
import persistence.BreathingExerciseModel;

import javax.validation.Valid;
import java.util.List;

@RequestMapping("api/v1/exercise")
@RestController
public class ExerciseController {

    private final BreathingExerciseService exerciseService;

    public ExerciseController(BreathingExerciseService exerciseService) {
        this.exerciseService = exerciseService;
    }

    @GetMapping
    public List<BreathingExerciseModel> getAllExercises() {
        return exerciseService.getAllExercises();
    }

    @PostMapping
    public void addExercise(@Valid @NonNull @RequestBody BreathingExerciseModel exerciseModel) {
        exerciseService.addExercise(exerciseModel);
    }


}