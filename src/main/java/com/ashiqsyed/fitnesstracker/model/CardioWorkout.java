package com.ashiqsyed.fitnesstracker.model;

import jakarta.persistence.*;

import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name="cardio_workouts")
public class CardioWorkout {
    @Id
    @GeneratedValue
    @Column(columnDefinition="uuid", updatable = false, nullable = false)
    private UUID cardioWorkoutId;

    @Column(nullable = false)
    private Double distance;

    @Column(nullable = false)
    private Integer duration;

    @OneToOne
    @JoinColumn(name = "workout_id", nullable = false, unique = true)
    private Workout workout;

    public CardioWorkout() {

    }

    public CardioWorkout(Double distance, Integer duration, Workout workout) {
        this.distance = distance;
        this.duration = duration;
        this.workout = workout;
    }

    public UUID getCardioWorkoutId() {
        return cardioWorkoutId;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Workout getWorkout() {
        return workout;
    }

    public void setWorkout(Workout workout) {
        this.workout = workout;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CardioWorkout that = (CardioWorkout) o;
        return Objects.equals(cardioWorkoutId, that.cardioWorkoutId);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cardioWorkoutId);
    }
}
