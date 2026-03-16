package com.todo.todo.Controllers;

import org.springframework.web.bind.annotation.RestController;

import com.todo.todo.Models.Todo;
import com.todo.todo.Services.TodoService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@CrossOrigin
@RestController
@RequestMapping("/api/todos")
public class TodoController {
    TodoService todoService;

    TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping("/all")
    public ResponseEntity<String> getAll() {
        return ResponseEntity.ok("Hello");
    }

}
