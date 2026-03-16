package com.todo.todo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.todo.todo.Models.Todo;

@Repository
public interface TodoRepo extends JpaRepository<Todo, Long> {

}