package dev.decagon.activity_tracker.controllers;

import dev.decagon.activity_tracker.dto.TaskCreationDto;
import dev.decagon.activity_tracker.dto.TaskDto;
import dev.decagon.activity_tracker.dto.TaskUpdateDto;
import dev.decagon.activity_tracker.enums.TaskStatus;
import dev.decagon.activity_tracker.service.TaskService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/tasks")
public class TaskController {

    private TaskService taskService;

    @PostMapping("/create-task")
    public ResponseEntity<TaskDto> create(@Valid @RequestBody TaskCreationDto taskCreationRequest){
        return new ResponseEntity<>(taskService.createTask(taskCreationRequest), HttpStatus.CREATED);
    }
    @PutMapping("/edit/{taskId}")
    public ResponseEntity<TaskDto> update(@Valid @RequestBody TaskUpdateDto taskUpdateRequest, @PathVariable Long taskId){
        return new ResponseEntity<>(taskService.updateTask(taskUpdateRequest, taskId), HttpStatus.OK);
    }
    @GetMapping("/student/{studentId}")
    public ResponseEntity<List<TaskDto>> getMyTasks(@PathVariable Long studentId){
        return new ResponseEntity<>(taskService.findAllByUserId(studentId),HttpStatus.OK);
    }
    @GetMapping("/{taskId}")
    public ResponseEntity<TaskDto> getATask(@PathVariable Long taskId){
        return new ResponseEntity<>(taskService.getTaskDto(taskId),HttpStatus.OK);
    }

    @GetMapping("/student/{status}/{studentId}")
    public ResponseEntity<List<TaskDto>> getTasksByStatus(@PathVariable TaskStatus status,  @PathVariable Long studentId){
        return new ResponseEntity<>(taskService.getTasksByStatus(status, studentId),HttpStatus.OK);
    }

    @PatchMapping("/change-status/{status}/{taskId}")
    public ResponseEntity<TaskDto> resetTaskStatus (@PathVariable TaskStatus status, @PathVariable Long taskId){
        return new ResponseEntity<>(taskService.resetStatus(status, taskId),HttpStatus.OK);
    }


    @DeleteMapping("/delete/{taskId}")
    public void deleteTask(@PathVariable Long taskId){
        taskService.delete(taskId);

    }
}
