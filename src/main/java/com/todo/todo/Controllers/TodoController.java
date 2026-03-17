package com.todo.todo.Controllers;

import org.springframework.web.bind.annotation.RestController;

import com.todo.todo.Dtos.AddTodoDto;
import com.todo.todo.Models.Todo;
import com.todo.todo.Services.TodoService;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@CrossOrigin
@RestController
@RequestMapping("/api/todos")
public class TodoController {
    TodoService todoService;

    TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Todo>> getAll() {
        List<Todo> todos = todoService.getTodos();
        return ResponseEntity.ok(todos);
    }

    @PostMapping("/add")
    public void addTodo(@RequestBody AddTodoDto todo) {
        todoService.addTodo(todo.getText());
    }

    @GetMapping("/{id}")
    public void changeStatus(@PathVariable Long id) {
        todoService.changeStatus(id);
    }

    @DeleteMapping("/{id}")
    public void addTodo(@PathVariable Long id) {
        todoService.deleteTodo(id);
    }
}
