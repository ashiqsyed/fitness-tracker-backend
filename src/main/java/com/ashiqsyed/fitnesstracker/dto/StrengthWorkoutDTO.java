package com.ashiqsyed.fitnesstracker.dto;

import java.util.Set;
import java.util.UUID;

public class StrengthWorkoutDTO {
    private UUID id;
    private Set<ExerciseDTO> exercises;

    public StrengthWorkoutDTO() {

    }

    public StrengthWorkoutDTO(UUID id, Set<ExerciseDTO> exercises) {
        this.id = id;
        this.exercises = exercises;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Set<ExerciseDTO> getExercises() {
        return exercises;
    }

    public void setExercises(Set<ExerciseDTO> exercises) {
        this.exercises = exercises;
    }
}
