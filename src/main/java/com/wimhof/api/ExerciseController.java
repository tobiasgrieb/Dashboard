package com.wimhof.api;

import com.wimhof.business.ExerciseService;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;
import persistence.ExerciseModel;

import javax.validation.Valid;
import java.util.List;

@RequestMapping("api/v1/exercise")
@RestController
public class ExerciseController {

    private final ExerciseService exerciseService;

    public ExerciseController(ExerciseService exerciseService) {
        this.exerciseService = exerciseService;
    }

    @GetMapping
    public List<ExerciseModel> getAllExercises() {
        return exerciseService.getAllExercises();
    }

    @PostMapping
    public void addExercise(@Valid @NonNull @RequestBody ExerciseModel exerciseModel) {
        exerciseService.addExercise(exerciseModel);
    }


}
