package com.todo.todo.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.todo.todo.Enums.TodoStatus;
import com.todo.todo.Models.Todo;
import com.todo.todo.Repositories.TodoRepo;

@Service
public class TodoService {

    TodoRepo todoRepo;

    TodoService(TodoRepo todoRepo) {
        this.todoRepo = todoRepo;
    }

    public List<Todo> getTodos() {
        return todoRepo.findAll();
    }

    public void addTodo(String text) {
        Todo todo = new Todo();
        todo.setText(text);
        todo.setTodoStatus(TodoStatus.NONE);
        todoRepo.save(todo);
    }
}
