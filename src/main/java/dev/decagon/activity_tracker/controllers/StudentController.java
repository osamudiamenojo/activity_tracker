package dev.decagon.activity_tracker.controllers;

import dev.decagon.activity_tracker.dto.StudentDto;
import dev.decagon.activity_tracker.dto.StudentSignUpDto;
import dev.decagon.activity_tracker.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
@AllArgsConstructor
public class StudentController {
    private StudentService studentService;
    public ResponseEntity<StudentDto> signUp(@RequestBody StudentSignUpDto studentSignUpDto){
        studentService.signUp(studentSignUpDto);

        return new ResponseEntity<>("sign up successfully", HttpStatus.CREATED);
    }


}
