package dev.decagon.activity_tracker.util;

import dev.decagon.activity_tracker.dto.StudentDto;
import dev.decagon.activity_tracker.dto.TaskDto;
import dev.decagon.activity_tracker.entities.Student;
import dev.decagon.activity_tracker.entities.Task;


public class Mapper {
    public static StudentDto studentToStudentDto(Student student){
        return StudentDto.builder()
                .id(student.getId())
                .name(student.getName())
                .email(student.getEmail())
                .build();
    }
    public static TaskDto taskToTaskDto(Task task){
        return TaskDto.builder()
                .id(task.getId())
                .title(task.getTitle())
                .description(task.getDescription())
                .status(task.getStatus())
                .build();
    }
}
