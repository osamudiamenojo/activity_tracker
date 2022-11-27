package dev.decagon.activity_tracker.service.implementation;

import dev.decagon.activity_tracker.dto.StudentDto;
import dev.decagon.activity_tracker.dto.StudentSignUpDto;
import dev.decagon.activity_tracker.entities.Student;
import dev.decagon.activity_tracker.exception.BadRequestException;
import dev.decagon.activity_tracker.exception.EntityNotFoundException;
import dev.decagon.activity_tracker.repositories.StudentRepository;
import dev.decagon.activity_tracker.service.StudentService;
import dev.decagon.activity_tracker.util.Mapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    @Override
    public StudentDto login(String email, String password) {
        Student student = studentRepository.findByEmailAndPassword(email, password)
                .orElseThrow(()-> new BadRequestException("user not found"+ "input a valid email and password"));
        return Mapper.studentToStudentDto(student);
    }
    @Override
    public StudentDto signUp(StudentSignUpDto request) {
        return Mapper.studentToStudentDto(studentRepository.save(
                Student.builder()
                    .name(request.getName())
                    .email(request.getEmail())
                    .password(request.getPassword())
                    .build()
        ));
    }
    @Override
    public StudentDto getStudent(Long id) {
        return Mapper.studentToStudentDto (studentRepository.findById(id).orElseThrow(
                ()->new EntityNotFoundException("User not Found","Provide valid user id")));
    }
}
