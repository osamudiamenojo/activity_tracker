package dev.decagon.activity_tracker.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TaskCreationDto {
    private String title;
    private String description;
}
