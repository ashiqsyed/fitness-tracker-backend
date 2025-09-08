package com.ashiqsyed.fitnesstracker.dto;

import java.util.Set;
import java.util.UUID;

public class ExerciseDTO {
    private UUID id;
    private Set<ExerciseSetDTO> sets;
    private String exerciseName;

    public ExerciseDTO() {

    }

    public ExerciseDTO(UUID id, Set<ExerciseSetDTO> sets, String exerciseName) {
        this.id = id;
        this.sets = sets;
        this.exerciseName = exerciseName;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Set<ExerciseSetDTO> getSets() {
        return sets;
    }

    public void setSets(Set<ExerciseSetDTO> sets) {
        this.sets = sets;
    }

    public String getExerciseName() {
        return exerciseName;
    }

    public void setExerciseName(String exerciseName) {
        this.exerciseName = exerciseName;
    }
}
