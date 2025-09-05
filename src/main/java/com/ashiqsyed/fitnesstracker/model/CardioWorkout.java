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

    private Double distance;
    private Integer duration;

    @OneToOne
    @JoinColumn(name = "workout_id")
    private Workout workout;

    public CardioWorkout() {

    }

    public CardioWorkout(Double distance, Integer duration) {
        this.distance = distance;
        this.duration = duration;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CardioWorkout that = (CardioWorkout) o;
        return Objects.equals(cardioWorkoutId, that.cardioWorkoutId) && Objects.equals(distance, that.distance) && Objects.equals(duration, that.duration) && Objects.equals(workout, that.workout);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardioWorkoutId, distance, duration, workout);
    }
}
