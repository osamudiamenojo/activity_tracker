package dev.decagon.activity_tracker.repositories;

import dev.decagon.activity_tracker.dto.StudentSignUpDto;
import dev.decagon.activity_tracker.service.StudentService;
import dev.decagon.activity_tracker.service.TaskService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;
@DataJpaTest
@RunWith(SpringRunner.class)
class TaskRepositoryTest {
    @Autowired
    TaskRepository taskRepository;
    @Autowired
    StudentService studentService;
    @Autowired
    TaskService taskService;
    StudentSignUpDto studentSignUpRequest;
    @BeforeEach
    void setUp() {

        studentSignUpRequest=new StudentSignUpDto("Tester","test@g.com","password");
        }



    @AfterEach
    void tearDown() {
    }

    @Test
    void findTasksByStudent_IdAndStatus() {

    }

    @Test
    void findTasksByStudent_Id() {

    }
}