package com.ashiqsyed.fitnesstracker.model;

import jakarta.persistence.*;

import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name="exercise_sets")
public class ExerciseSet {
    @Id
    @GeneratedValue
    @Column(columnDefinition = "uuid", updatable = false, nullable = false)
    private UUID exerciseSetId;

    @ManyToOne
    @JoinColumn(name="exercise_id", nullable = false)
    private Exercise exercise;

    private int setNum;
    private int reps;
    private double weight;

    public ExerciseSet() {

    }

    public ExerciseSet(Exercise exercise, int setNum, int reps, double weight) {
        this.exercise = exercise;
        this.setNum = setNum;
        this.reps = reps;
        this.weight = weight;
    }

    public Exercise getExercise() {
        return exercise;
    }

    public void setExercise(Exercise exercise) {
        this.exercise = exercise;
    }

    public int getSetNum() {
        return setNum;
    }

    public void setSetNum(int setNum) {
        this.setNum = setNum;
    }

    public int getReps() {
        return reps;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExerciseSet that = (ExerciseSet) o;
        return Objects.equals(exerciseSetId, that.exerciseSetId);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(exerciseSetId);
    }
}
