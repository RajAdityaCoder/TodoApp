package com.todo.todo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.todo.todo.model.TodoModel;

@Service
public class TodoService {
    
    private List<TodoModel> todoList = new ArrayList<>();

    public TodoModel createTodo(TodoModel todo) {
        todoList.add(todo);
        return todo;
    }

    
    public List<TodoModel> getList() {
        return todoList;
    }

    public TodoModel updateTodo(TodoModel todo) {
        for (int i = 0; i < todoList.size(); i++) {
            if (todoList.get(i).getId().equals(todo.getId())) {
                todoList.set(i, todo);
                return todo;
            }
        }
        return null;
    }

    public void deleteTodo(Long id) {
        todoList.removeIf(t -> t.getId().equals(id));
    }

    public List<TodoModel> createBulkTodos(List<TodoModel> todo){
        todoList.addAll(todo);
        return todoList;
    }
    public List<TodoModel> updateBulkTodos(List<TodoModel> todo){
        for (TodoModel todoModel : todo) {
            updateTodo(todoModel);
        }
        return todo;
    }
    public void deleteBulkTodos(List<TodoModel> todo){
        todoList.removeIf(t -> todo.contains(t));
    }

}
