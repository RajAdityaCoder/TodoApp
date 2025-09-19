package com.todo.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todo.todo.model.TodoModel;


public interface TodoRepository extends JpaRepository<TodoModel, String> {

}
