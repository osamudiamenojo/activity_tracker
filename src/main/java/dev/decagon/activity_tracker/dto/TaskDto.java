package dev.decagon.activity_tracker.dto;

import dev.decagon.activity_tracker.enums.TaskStatus;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class TaskDto {
    private Long id;
    private String title;
    private String description;
    private TaskStatus status;
    private Date completedAt;
}
