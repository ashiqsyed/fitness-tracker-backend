package com.ashiqsyed.fitnesstracker.model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name="strength_workouts")
public class StrengthWorkout {
    @Id
    @GeneratedValue
    @Column(columnDefinition = "uuid", updatable = false, nullable = false)
    private UUID strengthWorkoutId;

    @OneToOne
    @JoinColumn(name="workout_id", updatable = false, nullable = false)
    private Workout workout;

    @OneToMany(mappedBy = "strengthWorkout", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Exercise> exercises = new HashSet<>();

    public StrengthWorkout() {

    }

    public StrengthWorkout(Workout workout, Set<Exercise> exercises) {
        this.workout = workout;
        this.exercises = exercises;
    }

    public UUID getStrengthWorkoutId() {
        return strengthWorkoutId;
    }

    public Workout getWorkout() {
        return workout;
    }

    public void setWorkout(Workout workout) {
        this.workout = workout;
    }

    public Set<Exercise> getExercises() {
        return exercises;
    }

    public void setExercises(Set<Exercise> exercises) {
        this.exercises = exercises;
    }

    public void addExercise(Exercise exercise) {
        exercises.add(exercise);
        exercise.setStrengthWorkout(this);
    }

    public void removeExercise(Exercise exercise) {
        exercises.remove(exercise);
        exercise.setStrengthWorkout(null);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StrengthWorkout that = (StrengthWorkout) o;
        return Objects.equals(strengthWorkoutId, that.strengthWorkoutId);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(strengthWorkoutId);
    }
}
