package com.wimhof.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.wimhof.business.models.BreathingExercise;

import java.util.UUID;

@Repository
public interface BreathingExerciseRepository extends CrudRepository<BreathingExercise, UUID> {}
