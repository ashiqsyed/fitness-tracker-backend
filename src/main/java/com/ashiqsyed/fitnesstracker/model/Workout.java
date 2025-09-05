package com.ashiqsyed.fitnesstracker.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name="workouts")
public class Workout {
    @Id
    @GeneratedValue
    @Column(columnDefinition = "uuid", updatable = false, nullable = false)
    private UUID workoutId;

    private String type; //cardio, strength, flexibility
    private LocalDateTime workoutDateTime;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


    public Workout() {

    }

    public Workout(String type, LocalDateTime workoutDateTime) {
        this.type = type;
        this.workoutDateTime = workoutDateTime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDateTime getWorkoutDateTime() {
        return workoutDateTime;
    }

    public void setWorkoutDateTime(LocalDateTime workoutDateTime) {
        this.workoutDateTime = workoutDateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Workout workout = (Workout) o;
        return Objects.equals(workoutId, workout.workoutId) && Objects.equals(type, workout.type) && Objects.equals(workoutDateTime, workout.workoutDateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workoutId, type, workoutDateTime);
    }
}
