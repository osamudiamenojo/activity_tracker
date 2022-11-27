package dev.decagon.activity_tracker.util;

import dev.decagon.activity_tracker.dto.TaskDto;
import dev.decagon.activity_tracker.entities.Task;

public class TaskDtoMapper {
    public static TaskDto taskToTaskDto(Task task){
        return TaskDto.builder()
                .id(task.getId())
                .title(task.getTitle())
                .description(task.getDescription())
                .status(task.getStatus())
                .build();
    }
}
