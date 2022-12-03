package dev.decagon.activity_tracker.service;

import dev.decagon.activity_tracker.dto.TaskCreationDto;
import dev.decagon.activity_tracker.dto.TaskDto;
import dev.decagon.activity_tracker.dto.TaskUpdateDto;
import dev.decagon.activity_tracker.entities.Task;
import dev.decagon.activity_tracker.enums.TaskStatus;

import java.util.List;

public interface TaskService {

    TaskDto createTask(TaskCreationDto taskDto);
    TaskDto  updateTask(TaskUpdateDto taskUpdateRequest, Long taskId);

    Task getTask(Long id);
    TaskDto getTaskDto(Long id);
    List<TaskDto> findAllByUserId(Long UserId);
    List<TaskDto> getTasksByStatus(TaskStatus status, Long studentId);
    TaskDto resetStatus(TaskStatus status, Long taskId);
    void delete(Long taskId);

}
