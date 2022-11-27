package dev.decagon.activity_tracker.dto;

import dev.decagon.activity_tracker.entities.Task;
import dev.decagon.activity_tracker.enums.TaskStatus;
import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Data
@Builder
public class TaskDto {
    private Long id;
    private String title;
    private String description;
    private Timestamp createdAt;
    private TaskStatus status;
    private Timestamp updatedAt;
    private Date completedAt;
}
