package com.ashiqsyed.fitnesstracker.dto;

import com.ashiqsyed.fitnesstracker.model.WorkoutType;

import java.time.LocalDateTime;
import java.util.UUID;

public class WorkoutDTO {
    private UUID id;
    private String workoutType;
    private LocalDateTime workoutDateTime;

    private StrengthWorkoutDTO strengthWorkout;
    private CardioWorkoutDTO cardioWorkout;
    private FlexibilityWorkoutDTO flexibilityWorkout;

    public WorkoutDTO() {

    }

    public WorkoutDTO(UUID id, String workoutType, LocalDateTime workoutDateTime) {
        this.id = id;
        this.workoutType = workoutType;
        this.workoutDateTime = workoutDateTime;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getWorkoutType() {
        return workoutType;
    }

    public void setWorkoutType(String workoutType) {
        this.workoutType = workoutType;
    }

    public LocalDateTime getWorkoutDateTime() {
        return workoutDateTime;
    }

    public void setWorkoutDateTime(LocalDateTime workoutDateTime) {
        this.workoutDateTime = workoutDateTime;
    }

    public StrengthWorkoutDTO getStrengthWorkout() {
        return strengthWorkout;
    }

    public void setStrengthWorkout(StrengthWorkoutDTO strengthWorkout) {
        this.strengthWorkout = strengthWorkout;
    }

    public CardioWorkoutDTO getCardioWorkout() {
        return cardioWorkout;
    }

    public void setCardioWorkout(CardioWorkoutDTO cardioWorkout) {
        this.cardioWorkout = cardioWorkout;
    }

    public FlexibilityWorkoutDTO getFlexibilityWorkout() {
        return flexibilityWorkout;
    }

    public void setFlexibilityWorkout(FlexibilityWorkoutDTO flexibilityWorkout) {
        this.flexibilityWorkout = flexibilityWorkout;
    }


}
