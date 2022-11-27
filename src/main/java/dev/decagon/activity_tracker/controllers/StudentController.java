package dev.decagon.activity_tracker.controllers;

import dev.decagon.activity_tracker.dto.StudentDto;
import dev.decagon.activity_tracker.dto.StudentSignUpDto;
import dev.decagon.activity_tracker.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@AllArgsConstructor
@RequestMapping("api/v1/students")
public class StudentController {
    private final StudentService studentService;

    @PostMapping("/new")
    public ResponseEntity<StudentDto> register(@Valid @RequestBody StudentSignUpDto signUpRequest){
        return new ResponseEntity<>(studentService.signUp(signUpRequest),HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<StudentDto> getStudent(@PathVariable Long id){
        return new ResponseEntity<>(studentService.getStudent(id),HttpStatus.ACCEPTED);
    }

}
