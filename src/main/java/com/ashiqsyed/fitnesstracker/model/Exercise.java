package com.ashiqsyed.fitnesstracker.model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name="exercises")
public class Exercise {

    @Id
    @GeneratedValue
    @Column(columnDefinition = "uuid", updatable = false, nullable = false)
    private UUID exerciseId;

    @ManyToOne
    @JoinColumn(name="strength_workout_id")
    private StrengthWorkout strengthWorkout;

    @OneToMany(mappedBy = "exercise", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<ExerciseSet> exerciseSets = new HashSet<ExerciseSet>();

    private String exerciseName;

    public Exercise() {

    }

    public Exercise(String exerciseName, StrengthWorkout strengthWorkout) {
        this.exerciseName = exerciseName;
        this.strengthWorkout = strengthWorkout;
    }

    public String getExerciseName() {
        return exerciseName;
    }

    public void setExerciseName(String exerciseName) {
        this.exerciseName = exerciseName;
    }

    public StrengthWorkout getStrengthWorkout() {
        return strengthWorkout;
    }

    public void setStrengthWorkout(StrengthWorkout strengthWorkout) {
        this.strengthWorkout = strengthWorkout;
    }

    public Set<ExerciseSet> getExerciseSets() {
        return exerciseSets;
    }

    public void setExerciseSets(Set<ExerciseSet> exerciseSets) {
        this.exerciseSets = exerciseSets;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Exercise exercise = (Exercise) o;
        return Objects.equals(exerciseId, exercise.exerciseId) && Objects.equals(strengthWorkout, exercise.strengthWorkout) && Objects.equals(exerciseSets, exercise.exerciseSets) && Objects.equals(exerciseName, exercise.exerciseName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(exerciseId, strengthWorkout, exerciseSets, exerciseName);
    }
}
