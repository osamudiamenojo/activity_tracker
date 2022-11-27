package dev.decagon.activity_tracker.service.implementation;

import dev.decagon.activity_tracker.dto.TaskCreationDto;
import dev.decagon.activity_tracker.dto.TaskDto;
import dev.decagon.activity_tracker.entities.Student;
import dev.decagon.activity_tracker.entities.Task;
import dev.decagon.activity_tracker.enums.TaskStatus;
import dev.decagon.activity_tracker.exception.BadRequestException;
import dev.decagon.activity_tracker.repositories.StudentRepository;
import dev.decagon.activity_tracker.repositories.TaskRepository;
import dev.decagon.activity_tracker.service.TaskService;
import dev.decagon.activity_tracker.util.TaskDtoMapper;
import org.springframework.stereotype.Service;
import lombok.AllArgsConstructor;


import java.util.List;
import java.util.Optional;
@AllArgsConstructor
@Service
public class TaskServiceImpl implements TaskService {
    private final TaskRepository taskRepository;
    private final StudentRepository studentRepository;
    Service studentService;

    @Override
    public TaskDto createTask(TaskCreationDto taskCreationDto, Long studentId) {
        return TaskDtoMapper.taskToTaskDto(taskRepository.save(
                Task.builder()
                        .title(taskCreationDto.getTitle())
                        .description(taskCreationDto.getDescription())
                        .status(TaskStatus.PENDING)
                        .student(studentRepository.findById(studentId).orElseThrow(()->new BadRequestException("student not available")))
                        .build()
        ));
    }

    @Override
    public Task updateTask(Long userId, Task task) {

        return null;
    }
    @Override
    public Optional<Task> findTaskById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Task> findAllByUserId(Long UserId) {
        return null;
    }

    @Override
    public List<Task> getAllPendingTask(Long UserId) {
        return null;
    }

    @Override
    public List<Task> getAllDoneTask(Long UserId) {
        return null;
    }
}
