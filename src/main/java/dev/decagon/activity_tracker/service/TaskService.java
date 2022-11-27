package dev.decagon.activity_tracker.service;

import dev.decagon.activity_tracker.dto.TaskCreationDto;
import dev.decagon.activity_tracker.dto.TaskDto;
import dev.decagon.activity_tracker.entities.Task;
import dev.decagon.activity_tracker.util.TaskDtoMapper;

import java.util.List;
import java.util.Optional;

public interface TaskService {
    TaskDto createTask(TaskCreationDto taskDto, Long UserId);
    Task  updateTask(Long userId, Task task);
    Optional<Task> findTaskById(Long id);
    List<Task> findAllByUserId(Long UserId);
    List<Task> getAllPendingTask(Long UserId);
    List<Task> getAllDoneTask(Long UserId);
}
