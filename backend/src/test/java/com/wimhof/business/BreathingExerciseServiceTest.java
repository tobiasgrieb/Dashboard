package com.wimhof.business;

import com.wimhof.business.exceptions.NoExerciseDataException;
import com.wimhof.business.models.BreathingExercise;
import com.wimhof.persistence.BreathingExerciseRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Arrays;
import java.util.Collections;
import java.util.Date;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@SpringBootTest
class BreathingExerciseServiceTest {

    @MockBean
    private BreathingExerciseRepository repositoryMock;

    @Autowired
    private BreathingExerciseService testee;

    @Test
    void getBestExerciseReturnsHighestRepetitions() throws NoExerciseDataException {
        when(repositoryMock.findAll())
            .thenReturn(Arrays.asList(
                new BreathingExercise(new Date(), 60),
                new BreathingExercise(new Date(), 30),
                new BreathingExercise(new Date(), 50)
                )
            );

        BreathingExercise result = testee.getBestExercise();
        assertThat(result.getBreathingRepetitions()).isEqualTo(60);
    }

    @Test
    void throwsExceptionWhenRepositoryEmpty() {
        when(repositoryMock.findAll())
            .thenReturn(Collections.emptyList());

        assertThatThrownBy(() -> testee.getBestExercise()).isExactlyInstanceOf(NoExerciseDataException.class);
    }

    @Test
    void whenAddExercise_ThenCallSaveOnRepository() {
        BreathingExercise exercise = new BreathingExercise(new Date(), 40);
        testee.add(exercise);

        verify(repositoryMock).save(exercise);
    }
}