package com.ashiqsyed.fitnesstracker.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name="flexibility_workouts")
public class FlexibilityWorkout {
    @Id
    @GeneratedValue
    @Column(columnDefinition="uuid", updatable = false, nullable = false)
    private UUID flexibilityWorkoutId;

    @Column(nullable = false)
    private String name;


    private String note; //optional note

    @OneToOne
    @JoinColumn(name="workout_id", updatable = false, nullable = false)
    private Workout workout;

    public FlexibilityWorkout() {

    }

    public FlexibilityWorkout(String name, String note, Workout workout) {
        this.name = name;
        this.note = note;
        this.workout = workout;
    }

    public UUID getFlexibilityWorkoutId() {
        return flexibilityWorkoutId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNote() {
        return note;
    }

    public void setNotes(String note) {
        this.note = note;
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
        FlexibilityWorkout that = (FlexibilityWorkout) o;
        return Objects.equals(flexibilityWorkoutId, that.flexibilityWorkoutId);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(flexibilityWorkoutId);
    }
}
