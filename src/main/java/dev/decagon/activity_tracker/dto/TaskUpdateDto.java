package dev.decagon.activity_tracker.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class TaskUpdateDto {

    private String title;
    @NotNull(message = "Task description cannot be empty")
    private String description;
    //private Long studentId;
}
