package com.ashiqsyed.fitnesstracker.dto;

import java.util.UUID;

public class FlexibilityWorkoutDTO {
    private UUID id;
    private String name;
    private String note;

    public FlexibilityWorkoutDTO() {

    }

    public FlexibilityWorkoutDTO(UUID id, String name, String note) {
        this.id = id;
        this.name = name;
        this.note = note;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
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

    public void setNote(String note) {
        this.note = note;
    }

}
