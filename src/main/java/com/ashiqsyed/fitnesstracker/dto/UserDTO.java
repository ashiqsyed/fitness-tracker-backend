package com.ashiqsyed.fitnesstracker.dto;

import java.util.List;
import java.util.UUID;

public class UserDTO {
    private UUID id;
    private String username;
    private String email;
    private List<WorkoutDTO> workouts;

    public UserDTO() {

    }

    public UserDTO(UUID id, String username, String email, List<WorkoutDTO> workouts) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.workouts = workouts;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<WorkoutDTO> getWorkouts() {
        return workouts;
    }

    public void setWorkouts(List<WorkoutDTO> workouts) {
        this.workouts = workouts;
    }


}
