package dev.decagon.activity_tracker.service;

import dev.decagon.activity_tracker.dto.StudentDto;
import dev.decagon.activity_tracker.dto.StudentSignUpDto;

public interface StudentService {

    StudentDto login(String email, String password);
    StudentDto signUp(StudentSignUpDto request);
    StudentDto getStudent(Long studentId);


}
