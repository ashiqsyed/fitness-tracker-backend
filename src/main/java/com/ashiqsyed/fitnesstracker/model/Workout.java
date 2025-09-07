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

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private WorkoutType type;

    @Column(nullable = false)
    private LocalDateTime workoutDateTime;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    public Workout() {

    }

    public Workout(WorkoutType type, LocalDateTime workoutDateTime, User user) {
        this.type = type;
        this.workoutDateTime = workoutDateTime;
        this.user = user;
    }

    public UUID getWorkoutId() {
        return workoutId;
    }

    public WorkoutType getType() {
        return type;
    }

    public void setType(WorkoutType type) {
        this.type = type;
    }

    public LocalDateTime getWorkoutDateTime() {
        return workoutDateTime;
    }

    public void setWorkoutDateTime(LocalDateTime workoutDateTime) {
        this.workoutDateTime = workoutDateTime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Workout workout = (Workout) o;
        return Objects.equals(workoutId, workout.workoutId);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(workoutId);
    }
}
