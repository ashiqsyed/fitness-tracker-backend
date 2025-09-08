package com.ashiqsyed.fitnesstracker.dto;

import java.util.UUID;

public class CardioWorkoutDTO {
    private UUID id;
    private double distance;
    private int duration;

    public CardioWorkoutDTO() {

    }

    public CardioWorkoutDTO(UUID id, double distance, int duration) {
        this.id = id;
        this.distance = distance;
        this.duration = duration;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }


}
