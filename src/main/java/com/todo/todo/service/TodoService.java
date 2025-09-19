package com.todo.todo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.todo.model.TodoModel;
import com.todo.todo.repository.TodoRepository;

@Service
public class TodoService {
    
    @Autowired
    private TodoRepository todoRepository;

    public TodoModel createTodo(TodoModel todo) {
        return todoRepository.save(todo);
    }

    
    public List<TodoModel> getList() {
        return todoRepository.findAll();
    }

    public TodoModel updateTodo(TodoModel todo) {
        return todoRepository.save(todo);
    }

    public void deleteTodo(Long id) {
        todoRepository.deleteById(id);
    }

    public List<TodoModel> createBulkTodos(List<TodoModel> todo){
        todoRepository.saveAll(todo);
        return todo;
    }
    public List<TodoModel> updateBulkTodos(List<TodoModel> todo){
        for (TodoModel todoModel : todo) {
            updateTodo(todoModel);
        }
        return todo;
    }
    public void deleteBulkTodos(List<TodoModel> todo){
        todoRepository.deleteAll(todo);
    }

}
