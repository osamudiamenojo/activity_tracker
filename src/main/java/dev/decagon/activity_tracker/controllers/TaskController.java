package dev.decagon.activity_tracker.controllers;

import dev.decagon.activity_tracker.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

    @Autowired
    private  TaskService taskService;




}
