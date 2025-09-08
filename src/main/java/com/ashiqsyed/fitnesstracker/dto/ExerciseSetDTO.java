package com.ashiqsyed.fitnesstracker.dto;

import java.util.UUID;

public class ExerciseSetDTO {
    private UUID id;
    private int setNum;
    private int reps;
    private double weight;

    public ExerciseSetDTO() {

    }

    public ExerciseSetDTO(UUID id, int setNum, int reps, double weight) {
        this.id = id;
        this.setNum = setNum;
        this.reps = reps;
        this.weight = weight;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
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
}
