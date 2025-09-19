package com.todo.todo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todo.todo.model.TodoModel;
import com.todo.todo.service.TodoService;



@RestController
@RequestMapping("/todo")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @PostMapping
    public TodoModel createTodo(@RequestBody TodoModel todo){
    return todoService.createTodo(todo);
    }
    @GetMapping("/getAll")
    public List<TodoModel> getAllTodos() {
        return todoService.getList();
    }

    @PutMapping
    public TodoModel updateTodo(@RequestBody TodoModel todo){
        return todoService.updateTodo(todo);
    }

    @DeleteMapping("/{id}")
    public String deleteTodo(@PathVariable Long id){
        todoService.deleteTodo(id.toString());
        return "Todo Deleted Successfully";
    }

    @PostMapping("/bulk")
    public List<TodoModel> createBulkTodos(@RequestBody List<TodoModel> todo){
        return todoService.createBulkTodos(todo);
    }
    
    @PutMapping("/bulk")
    public List<TodoModel> updateBulkTodos(@RequestBody List<TodoModel> todo){
        return todoService.updateBulkTodos(todo);
    }

    @DeleteMapping("/bulkDelete")
    public String deleteBulkTodos(@RequestBody List<TodoModel> todo){
        todoService.deleteBulkTodos(todo);
        return "Todos Bulk Deleted Successfully";
    }

}
