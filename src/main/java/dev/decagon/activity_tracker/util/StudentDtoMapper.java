package dev.decagon.activity_tracker.util;

import dev.decagon.activity_tracker.dto.StudentDto;
import dev.decagon.activity_tracker.entities.Student;
import lombok.Builder;
import org.springframework.context.annotation.Bean;


public class StudentDtoMapper {
    public static StudentDto studentToStudentDto(Student student){
        return StudentDto.builder()
                .id(student.getId())
                .name(student.getName())
                .email(student.getEmail())
                .build();
    }
}
