package dev.decagon.activity_tracker.service.implementation;

import dev.decagon.activity_tracker.dto.StudentDto;
import dev.decagon.activity_tracker.dto.StudentSignUpDto;
import dev.decagon.activity_tracker.entities.Student;
import dev.decagon.activity_tracker.exception.BadRequestException;
import dev.decagon.activity_tracker.repositories.StudentRepository;
import dev.decagon.activity_tracker.service.StudentService;
import dev.decagon.activity_tracker.util.StudentDtoMapper;
import lombok.AllArgsConstructor;

import java.util.Optional;
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    @Override
    public StudentDto login(String email, String password) {
        Student student = studentRepository.findByEmailAndPassword(email, password)
                .orElseThrow(()-> new BadRequestException("user not found"+ "input a valid email and password"));
        return StudentDtoMapper.studentToStudentDto(student);
    }
    @Override
    public StudentDto signUp(StudentSignUpDto request) {
        return StudentDtoMapper.studentToStudentDto(studentRepository.save(
                Student.builder()
                    .name(request.getName())
                    .email(request.getEmail())
                    .password(request.getPassword())
                    .build()
        ));
    }
}
